package com.example.admin.afinaltestapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import net.tsz.afinal.FinalBitmap;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.download_tv)
    TextView downloadTv;
    @Bind(R.id.download_iv)
    ImageView downloadIv;

    String URL="http://p2.so.qhimg.com/sdr/512_768_/t01c874049c88235c8c.jpg";
    private FinalBitmap finalBitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.download_tv)
    public void onClick() {
        finalBitmap = FinalBitmap.create(this);
        finalBitmap.configLoadingImage(R.drawable.girl3);
        finalBitmap.display(downloadIv,URL);
    }
}
