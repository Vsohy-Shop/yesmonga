package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.C0329d0;
import androidx.navigation.ActivityNavigator;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.C11283a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C19691a0
/* renamed from: androidx.navigation.c */
public final class C19694c extends C19853z<ActivityNavigator.C19667b> {
    @C12579k

    /* renamed from: h */
    public Context f50484h;
    @C12580l

    /* renamed from: i */
    public String f50485i;
    @C12580l

    /* renamed from: j */
    public C11494d<? extends Activity> f50486j;
    @C12580l

    /* renamed from: k */
    public String f50487k;
    @C12580l

    /* renamed from: l */
    public Uri f50488l;
    @C12580l

    /* renamed from: m */
    public String f50489m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11395k(message = "Use routes to create your ActivityNavigatorDestinationBuilder instead", replaceWith = @C11587t0(expression = "ActivityNavigatorDestinationBuilder(navigator, route = id.toString())", imports = {}))
    public C19694c(@C12579k ActivityNavigator activityNavigator, @C0329d0 int i) {
        super(activityNavigator, i);
        Intrinsics.checkNotNullParameter(activityNavigator, "navigator");
        this.f50484h = activityNavigator.mo58036n();
    }

    @C12579k
    /* renamed from: k */
    public ActivityNavigator.C19667b mo58331c() {
        ActivityNavigator.C19667b bVar = (ActivityNavigator.C19667b) super.mo58331c();
        bVar.mo58051R0(this.f50485i);
        C11494d<? extends Activity> dVar = this.f50486j;
        if (dVar != null) {
            bVar.mo58047M0(new ComponentName(this.f50484h, C11283a.m43409e(dVar)));
        }
        bVar.mo58046L0(this.f50487k);
        bVar.mo58048N0(this.f50488l);
        bVar.mo58049O0(this.f50489m);
        return bVar;
    }

    @C12580l
    /* renamed from: l */
    public final String mo58333l() {
        return this.f50487k;
    }

    @C12580l
    /* renamed from: m */
    public final C11494d<? extends Activity> mo58334m() {
        return this.f50486j;
    }

    @C12580l
    /* renamed from: n */
    public final Uri mo58335n() {
        return this.f50488l;
    }

    @C12580l
    /* renamed from: o */
    public final String mo58336o() {
        return this.f50489m;
    }

    @C12580l
    /* renamed from: p */
    public final String mo58337p() {
        return this.f50485i;
    }

    /* renamed from: q */
    public final void mo58338q(@C12580l String str) {
        this.f50487k = str;
    }

    /* renamed from: r */
    public final void mo58339r(@C12580l C11494d<? extends Activity> dVar) {
        this.f50486j = dVar;
    }

    /* renamed from: s */
    public final void mo58340s(@C12580l Uri uri) {
        this.f50488l = uri;
    }

    /* renamed from: t */
    public final void mo58341t(@C12580l String str) {
        this.f50489m = str;
    }

    /* renamed from: u */
    public final void mo58342u(@C12580l String str) {
        this.f50485i = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19694c(@C12579k ActivityNavigator activityNavigator, @C12579k String str) {
        super(activityNavigator, str);
        Intrinsics.checkNotNullParameter(activityNavigator, "navigator");
        Intrinsics.checkNotNullParameter(str, "route");
        this.f50484h = activityNavigator.mo58036n();
    }
}
