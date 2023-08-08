package com.urbanairship.android.layout.model;

import com.urbanairship.android.layout.environment.C35608o;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"Landroid/view/View;", "Lcom/urbanairship/android/layout/widget/n;", "T", "Lcom/urbanairship/android/layout/environment/o$d;", "state", "a", "(Lcom/urbanairship/android/layout/environment/o$d;)Lcom/urbanairship/android/layout/environment/o$d;"}, mo22517k = 3, mo22518mv = {1, 7, 1})
public final class ButtonModel$handlePagerNext$2 extends Lambda implements C11300l<C35608o.C35612d, C35608o.C35612d> {

    /* renamed from: f */
    public static final ButtonModel$handlePagerNext$2 f88308f = new ButtonModel$handlePagerNext$2();

    public ButtonModel$handlePagerNext$2() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final C35608o.C35612d invoke(@C12579k C35608o.C35612d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "state");
        return dVar.mo106729i(Integer.min(dVar.mo106735o() + 1, dVar.mo106736p().size() - 1));
    }
}
