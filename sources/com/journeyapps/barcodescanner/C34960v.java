package com.journeyapps.barcodescanner;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import com.google.zxing.C34756h;
import com.google.zxing.C34762l;
import java.io.ByteArrayOutputStream;

/* renamed from: com.journeyapps.barcodescanner.v */
public class C34960v {

    /* renamed from: a */
    public C34955r f85048a;

    /* renamed from: b */
    public int f85049b;

    /* renamed from: c */
    public int f85050c;

    /* renamed from: d */
    public Rect f85051d;

    /* renamed from: e */
    public int f85052e = 1;

    /* renamed from: f */
    public boolean f85053f;

    public C34960v(byte[] bArr, int i, int i2, int i3, int i4) {
        this.f85048a = new C34955r(bArr, i, i2);
        this.f85050c = i4;
        this.f85049b = i3;
        if (i * i2 > bArr.length) {
            throw new IllegalArgumentException("Image data does not match the resolution. " + i + "x" + i2 + " > " + bArr.length);
        }
    }

    /* renamed from: a */
    public C34756h mo103560a() {
        C34955r a = this.f85048a.mo103546h(this.f85050c).mo103542a(this.f85051d, this.f85052e);
        return new C34756h(a.mo103543b(), a.mo103545d(), a.mo103544c(), 0, 0, a.mo103545d(), a.mo103544c(), false);
    }

    /* renamed from: b */
    public Bitmap mo103561b() {
        return mo103562c(1);
    }

    /* renamed from: c */
    public Bitmap mo103562c(int i) {
        return mo103563d(this.f85051d, i);
    }

    /* renamed from: d */
    public Bitmap mo103563d(Rect rect, int i) {
        if (rect == null) {
            rect = new Rect(0, 0, this.f85048a.mo103545d(), this.f85048a.mo103544c());
        } else if (mo103571l()) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        }
        YuvImage yuvImage = new YuvImage(this.f85048a.mo103543b(), this.f85049b, this.f85048a.mo103545d(), this.f85048a.mo103544c(), (int[]) null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        if (this.f85050c == 0) {
            return decodeByteArray;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate((float) this.f85050c);
        return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
    }

    /* renamed from: e */
    public Rect mo103564e() {
        return this.f85051d;
    }

    /* renamed from: f */
    public byte[] mo103565f() {
        return this.f85048a.mo103543b();
    }

    /* renamed from: g */
    public int mo103566g() {
        return this.f85048a.mo103544c();
    }

    /* renamed from: h */
    public int mo103567h() {
        return this.f85048a.mo103545d();
    }

    /* renamed from: i */
    public int mo103568i() {
        return this.f85049b;
    }

    /* renamed from: j */
    public int mo103569j() {
        return this.f85052e;
    }

    /* renamed from: k */
    public boolean mo103570k() {
        return this.f85053f;
    }

    /* renamed from: l */
    public boolean mo103571l() {
        return this.f85050c % 180 != 0;
    }

    /* renamed from: m */
    public void mo103572m(Rect rect) {
        this.f85051d = rect;
    }

    /* renamed from: n */
    public void mo103573n(boolean z) {
        this.f85053f = z;
    }

    /* renamed from: o */
    public void mo103574o(int i) {
        this.f85052e = i;
    }

    /* renamed from: p */
    public C34762l mo103575p(C34762l lVar) {
        float c = (lVar.mo102883c() * ((float) this.f85052e)) + ((float) this.f85051d.left);
        float d = (lVar.mo102884d() * ((float) this.f85052e)) + ((float) this.f85051d.top);
        if (this.f85053f) {
            c = ((float) this.f85048a.mo103545d()) - c;
        }
        return new C34762l(c, d);
    }
}
