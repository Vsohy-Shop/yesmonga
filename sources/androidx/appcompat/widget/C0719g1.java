package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0359n0;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.g1 */
public class C0719g1 extends C0815x0 {

    /* renamed from: b */
    public final WeakReference<Context> f2387b;

    public C0719g1(@C0359n0 Context context, @C0359n0 Resources resources) {
        super(resources);
        this.f2387b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable a = mo3758a(i);
        Context context = this.f2387b.get();
        if (!(a == null || context == null)) {
            C0806w0.m3884h().mo3754x(context, i, a);
        }
        return a;
    }
}
