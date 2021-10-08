package com.example.kim_081021_lab_05_02;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView myvideoPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myvideoPlayer = (VideoView)findViewById(R.id.videoView);
        Uri myVideoUri= Uri.parse( "android.resource://" +
        getPackageName() + "/" + R.raw.videoplayback);
        myvideoPlayer.setVideoURI(myVideoUri);
        MediaController mediaController = new MediaController(this);
        myvideoPlayer.setMediaController(mediaController);
        mediaController.setMediaPlayer(myvideoPlayer);

    }

    public void onStartClick(View view)
    {
        myvideoPlayer.start();
    }
    public void onPauseClick(View view)
    {
        myvideoPlayer.pause();
    }
    public void onStopClick(View view)
    {
        myvideoPlayer.stopPlayback();
        myvideoPlayer.resume();
    }



}