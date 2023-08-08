package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.cursoradapter.widget.c */
public abstract class C18522c extends C18517a {

    /* renamed from: X */
    public int f47305X;

    /* renamed from: Y */
    public LayoutInflater f47306Y;

    /* renamed from: z */
    public int f47307z;

    @Deprecated
    public C18522c(Context context, int i, Cursor cursor) {
        super(context, cursor);
        this.f47305X = i;
        this.f47307z = i;
        this.f47306Y = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: i */
    public View mo53391i(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f47306Y.inflate(this.f47305X, viewGroup, false);
    }

    /* renamed from: j */
    public View mo3288j(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f47306Y.inflate(this.f47307z, viewGroup, false);
    }

    /* renamed from: n */
    public void mo53402n(int i) {
        this.f47305X = i;
    }

    /* renamed from: o */
    public void mo53403o(int i) {
        this.f47307z = i;
    }

    @Deprecated
    public C18522c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f47305X = i;
        this.f47307z = i;
        this.f47306Y = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public C18522c(Context context, int i, Cursor cursor, int i2) {
        super(context, cursor, i2);
        this.f47305X = i;
        this.f47307z = i;
        this.f47306Y = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
