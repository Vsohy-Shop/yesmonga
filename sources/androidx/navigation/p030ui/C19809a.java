package androidx.navigation.p030ui;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.C0324b1;
import androidx.annotation.RestrictTo;
import androidx.appcompat.graphics.drawable.C0522d;
import androidx.customview.widget.C18552c;
import androidx.navigation.C19751g;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.p030ui.C19834s;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfigurableFragment;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.navigation.ui.a */
public abstract class C19809a implements NavController.C19676b {
    @C12579k

    /* renamed from: a */
    public final Context f50669a;
    @C12579k

    /* renamed from: b */
    public final Set<Integer> f50670b;
    @C12580l

    /* renamed from: c */
    public final WeakReference<C18552c> f50671c;
    @C12580l

    /* renamed from: d */
    public C0522d f50672d;
    @C12580l

    /* renamed from: e */
    public ValueAnimator f50673e;

    public C19809a(@C12579k Context context, @C12579k C19812d dVar) {
        WeakReference<C18552c> weakReference;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(dVar, BannerConfigurableFragment.f27258E0);
        this.f50669a = context;
        this.f50670b = dVar.mo58604d();
        C18552c c = dVar.mo58603c();
        if (c == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(c);
        }
        this.f50671c = weakReference;
    }

    /* renamed from: a */
    public void mo58177a(@C12579k NavController navController, @C12579k NavDestination navDestination, @C12580l Bundle bundle) {
        C18552c cVar;
        Intrinsics.checkNotNullParameter(navController, "controller");
        Intrinsics.checkNotNullParameter(navDestination, FirebaseAnalytics.C32532b.f78977z);
        if (!(navDestination instanceof C19751g)) {
            WeakReference<C18552c> weakReference = this.f50671c;
            if (weakReference == null) {
                cVar = null;
            } else {
                cVar = weakReference.get();
            }
            if (this.f50671c == null || cVar != null) {
                CharSequence h0 = navDestination.mo58240h0();
                boolean z = true;
                if (h0 != null) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(h0);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle == null || !bundle.containsKey(group)) {
                            throw new IllegalArgumentException("Could not find \"" + group + "\" in " + bundle + " to fill label \"" + h0 + '\"');
                        }
                        matcher.appendReplacement(stringBuffer, "");
                        stringBuffer.append(String.valueOf(bundle.get(group)));
                    }
                    matcher.appendTail(stringBuffer);
                    mo58600d(stringBuffer);
                }
                boolean i = C19827p.m92168i(navDestination, this.f50670b);
                if (cVar != null || !i) {
                    if (cVar == null || !i) {
                        z = false;
                    }
                    mo58598b(z);
                    return;
                }
                mo58599c((Drawable) null, 0);
                return;
            }
            navController.mo58100G0(this);
        }
    }

    @SuppressLint({"ObjectAnimatorBinding"})
    /* renamed from: b */
    public final void mo58598b(boolean z) {
        Pair pair;
        int i;
        float f;
        C0522d dVar = this.f50672d;
        if (dVar == null) {
            pair = null;
        } else {
            pair = C11078d1.m42659a(dVar, Boolean.TRUE);
        }
        if (pair == null) {
            C0522d dVar2 = new C0522d(this.f50669a);
            this.f50672d = dVar2;
            pair = C11078d1.m42659a(dVar2, Boolean.FALSE);
        }
        C0522d dVar3 = (C0522d) pair.mo21846a();
        boolean booleanValue = ((Boolean) pair.mo21847b()).booleanValue();
        if (z) {
            i = C19834s.C19838d.nav_app_bar_open_drawer_description;
        } else {
            i = C19834s.C19838d.nav_app_bar_navigate_up_description;
        }
        mo58599c(dVar3, i);
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        if (booleanValue) {
            float i2 = dVar3.mo1719i();
            ValueAnimator valueAnimator = this.f50673e;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dVar3, "progress", new float[]{i2, f});
            this.f50673e = ofFloat;
            if (ofFloat != null) {
                ofFloat.start();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.animation.ObjectAnimator");
        }
        dVar3.setProgress(f);
    }

    /* renamed from: c */
    public abstract void mo58599c(@C12580l Drawable drawable, @C0324b1 int i);

    /* renamed from: d */
    public abstract void mo58600d(@C12580l CharSequence charSequence);
}
