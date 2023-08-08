package com.google.zxing.client.android;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Vibrator;
import com.google.zxing.client.android.C34661l;
import java.io.IOException;

/* renamed from: com.google.zxing.client.android.e */
public final class C34651e {

    /* renamed from: d */
    public static final String f83829d = "e";

    /* renamed from: e */
    public static final float f83830e = 0.1f;

    /* renamed from: f */
    public static final long f83831f = 200;

    /* renamed from: a */
    public final Context f83832a;

    /* renamed from: b */
    public boolean f83833b = true;

    /* renamed from: c */
    public boolean f83834c = false;

    public C34651e(Activity activity) {
        activity.setVolumeControlStream(3);
        this.f83832a = activity.getApplicationContext();
    }

    /* renamed from: e */
    public static /* synthetic */ void m141342e(MediaPlayer mediaPlayer) {
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
    }

    /* renamed from: f */
    public static /* synthetic */ boolean m141343f(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to beep ");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
        return true;
    }

    /* renamed from: c */
    public boolean mo102500c() {
        return this.f83833b;
    }

    /* renamed from: d */
    public boolean mo102501d() {
        return this.f83834c;
    }

    /* renamed from: g */
    public MediaPlayer mo102502g() {
        AssetFileDescriptor openRawResourceFd;
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
        mediaPlayer.setOnCompletionListener(new C34648c());
        mediaPlayer.setOnErrorListener(new C34650d());
        try {
            openRawResourceFd = this.f83832a.getResources().openRawResourceFd(C34661l.C34669h.zxing_beep);
            mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
            openRawResourceFd.close();
            mediaPlayer.setVolume(0.1f, 0.1f);
            mediaPlayer.prepare();
            mediaPlayer.start();
            return mediaPlayer;
        } catch (IOException unused) {
            mediaPlayer.reset();
            mediaPlayer.release();
            return null;
        } catch (Throwable th) {
            openRawResourceFd.close();
            throw th;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: h */
    public synchronized void mo102503h() {
        Vibrator vibrator;
        if (this.f83833b) {
            mo102502g();
        }
        if (this.f83834c && (vibrator = (Vibrator) this.f83832a.getSystemService("vibrator")) != null) {
            vibrator.vibrate(200);
        }
    }

    /* renamed from: i */
    public void mo102504i(boolean z) {
        this.f83833b = z;
    }

    /* renamed from: j */
    public void mo102505j(boolean z) {
        this.f83834c = z;
    }
}
