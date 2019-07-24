package com.example.image_attachment;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ImageAttachmentActivity extends AppCompatActivity implements Imageutils.ImageAttachmentListener {


    ImageView iv_attachment;

    //For Image Attachment

    private Bitmap bitmap;
    private String file_name;

    Imageutils imageutils;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_attachment);

        imageutils =new Imageutils(this);

        iv_attachment= findViewById(R.id.imageView);

        iv_attachment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageutils.imagepicker(1);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        imageutils.onActivityResult(requestCode, resultCode, data);

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        imageutils.request_permission_result(requestCode, permissions, grantResults);
    }

    @Override
    public void image_attachment(int from, String filename, Bitmap file, Uri uri) {
        this.bitmap=file;
        this.file_name=filename;
        iv_attachment.setImageBitmap(file);

        String path =  Environment.getExternalStorageDirectory() + File.separator + "ImageAttach" + File.separator;
        imageutils.createImage(file,filename,path,false);

    }
}
