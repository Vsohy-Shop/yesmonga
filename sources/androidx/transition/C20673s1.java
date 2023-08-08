package androidx.transition;

import android.view.View;
import android.view.WindowId;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;

@C0376v0(18)
/* renamed from: androidx.transition.s1 */
public class C20673s1 implements C20676t1 {

    /* renamed from: a */
    public final WindowId f53337a;

    public C20673s1(@C0359n0 View view) {
        this.f53337a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C20673s1) && ((C20673s1) obj).f53337a.equals(this.f53337a);
    }

    public int hashCode() {
        return this.f53337a.hashCode();
    }
}
