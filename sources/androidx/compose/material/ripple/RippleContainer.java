package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.p004ui.C8776o;
import com.urbanairship.iam.events.C9175a;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.C10994x;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0014J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0014J\n\u0010\b\u001a\u00020\u000f*\u00020\u000eJ\n\u0010\u0010\u001a\u00020\t*\u00020\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002XD¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011¨\u0006\""}, mo22516d2 = {"Landroidx/compose/material/ripple/RippleContainer;", "Landroid/view/ViewGroup;", "", "changed", "", "l", "t", "r", "b", "Lkotlin/d2;", "onLayout", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroidx/compose/material/ripple/AndroidRippleIndicationInstance;", "Landroidx/compose/material/ripple/RippleHostView;", "a", "I", "MaxRippleHosts", "", "Ljava/util/List;", "rippleHosts", "c", "unusedRippleHosts", "Landroidx/compose/material/ripple/g;", "d", "Landroidx/compose/material/ripple/g;", "rippleHostMap", "e", "nextHostIndex", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "material-ripple_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nRippleContainer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleContainer.android.kt\nandroidx/compose/material/ripple/RippleContainer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
public final class RippleContainer extends ViewGroup {

    /* renamed from: a */
    public final int f19007a = 5;
    @C12579k

    /* renamed from: b */
    public final List<RippleHostView> f19008b;
    @C12579k

    /* renamed from: c */
    public final List<RippleHostView> f19009c;
    @C12579k

    /* renamed from: d */
    public final C7919g f19010d;

    /* renamed from: e */
    public int f19011e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RippleContainer(@C12579k Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        ArrayList arrayList = new ArrayList();
        this.f19008b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f19009c = arrayList2;
        this.f19010d = new C7919g();
        setClipChildren(false);
        RippleHostView rippleHostView = new RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.f19011e = 1;
        setTag(C8776o.C8778b.hide_in_inspector_tag, Boolean.TRUE);
    }

    /* renamed from: a */
    public final void mo11032a(@C12579k AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        Intrinsics.checkNotNullParameter(androidRippleIndicationInstance, "<this>");
        androidRippleIndicationInstance.mo11007n();
        RippleHostView b = this.f19010d.mo11059b(androidRippleIndicationInstance);
        if (b != null) {
            b.mo11038d();
            this.f19010d.mo11060c(androidRippleIndicationInstance);
            this.f19009c.add(b);
        }
    }

    @C12579k
    /* renamed from: b */
    public final RippleHostView mo11033b(@C12579k AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        Intrinsics.checkNotNullParameter(androidRippleIndicationInstance, "<this>");
        RippleHostView b = this.f19010d.mo11059b(androidRippleIndicationInstance);
        if (b != null) {
            return b;
        }
        RippleHostView rippleHostView = (RippleHostView) C10994x.m42350K0(this.f19009c);
        if (rippleHostView == null) {
            if (this.f19011e > CollectionsKt__CollectionsKt.m40443G(this.f19008b)) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
                rippleHostView = new RippleHostView(context);
                addView(rippleHostView);
                this.f19008b.add(rippleHostView);
            } else {
                rippleHostView = this.f19008b.get(this.f19011e);
                AndroidRippleIndicationInstance a = this.f19010d.mo11058a(rippleHostView);
                if (a != null) {
                    a.mo11007n();
                    this.f19010d.mo11060c(a);
                    rippleHostView.mo11038d();
                }
            }
            int i = this.f19011e;
            if (i < this.f19007a - 1) {
                this.f19011e = i + 1;
            } else {
                this.f19011e = 0;
            }
        }
        this.f19010d.mo11061d(androidRippleIndicationInstance, rippleHostView);
        return rippleHostView;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
