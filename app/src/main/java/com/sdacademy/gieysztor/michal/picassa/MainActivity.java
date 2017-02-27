package com.sdacademy.gieysztor.michal.picassa;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.wrong_url_picture)
    ImageView mWrongUrlPicture;

    @BindView(R.id.network_picture)
    ImageView mNetworkPicture;

    @BindView(R.id.drawable_picture)
    ImageView mDrawablePicture;

    @BindView(R.id.file_picture)
    ImageView mFilePicture;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
//        ImageView mDrawablePicture = (ImageView) findViewById(R.id.drawable_picture);


//        Picasso.with(this)
//                .load(R.drawable.san_francisco) // Z folderu drawable
//                .error(R.drawable.error) // Obrazek w razie błędu
//                .into(mDrawablePicture);
//
//
//        Picasso.with(this)
//                .load("https://goo.gl/JfEm9H") // Z sieci
//                .error(R.drawable.error) // Obrazek w razie błędu
//                .into(mNetworkPicture);
//
//        Picasso.with(this)
//                .load("https://goo.gl/JfEsadfsdm9H") // Z sieci
//                .resize(100,100)
//                .error(R.drawable.error) // Obrazek w razie błędu
//                .into(mWrongUrlPicture);


        Picasso.with(this)
                .load("https://goo.gl/JfEm9H") // Z sieci
                .error(R.drawable.error) // Obrazek w razie błędu
                .centerCrop()
                .fit()
                .into(mNetworkPicture);

        Picasso.with(this)
                .load("https://goo.gl/JfEm9H") // Z sieci
                .error(R.drawable.error) // Obrazek w razie błędu
                .centerInside()
                .fit()
                .into(mDrawablePicture);


        Picasso.with(this)
                .load("https://goo.gl/JfEm9H") // Z sieci
                .error(R.drawable.error) // Obrazek w razie błędu
                .into(mWrongUrlPicture);

        Picasso.with(this)
                .load("https://goo.gl/JfEm9H") // Z sieci
                .error(R.drawable.error) // Obrazek w razie błędu
                .into(mFilePicture);

    }

}
