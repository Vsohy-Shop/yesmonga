package androidx.constraintlayout.motion.utils;

import android.view.View;

/* renamed from: androidx.constraintlayout.motion.utils.e */
public class C16847e {

    /* renamed from: a */
    public float f43179a;

    /* renamed from: b */
    public int f43180b;

    /* renamed from: c */
    public int f43181c;

    /* renamed from: d */
    public int f43182d;

    /* renamed from: e */
    public int f43183e;

    /* renamed from: a */
    public void mo49943a(View view) {
        this.f43180b = view.getLeft();
        this.f43181c = view.getTop();
        this.f43182d = view.getRight();
        this.f43183e = view.getBottom();
        this.f43179a = view.getRotation();
    }

    /* renamed from: b */
    public int mo49944b() {
        return this.f43183e - this.f43181c;
    }

    /* renamed from: c */
    public int mo49945c() {
        return this.f43182d - this.f43180b;
    }
}
