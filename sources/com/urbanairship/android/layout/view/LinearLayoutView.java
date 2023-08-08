package com.urbanairship.android.layout.view;

import android.animation.LayoutTransition;
import android.content.Context;
import android.view.View;
import androidx.core.graphics.C17616m0;
import androidx.core.view.C18196h2;
import androidx.core.view.C18436z4;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.info.C35698z;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.model.C35802i;
import com.urbanairship.android.layout.property.C35840k;
import com.urbanairship.android.layout.property.Direction;
import com.urbanairship.android.layout.property.Size;
import com.urbanairship.android.layout.util.C35916j;
import com.urbanairship.android.layout.util.C35921m;
import com.urbanairship.android.layout.widget.WeightlessLinearLayout;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0016"}, mo22516d2 = {"Lcom/urbanairship/android/layout/view/LinearLayoutView;", "Lcom/urbanairship/android/layout/widget/WeightlessLinearLayout;", "Lcom/urbanairship/android/layout/view/a;", "", "Lcom/urbanairship/android/layout/model/i$a;", "items", "Lkotlin/d2;", "q", "Lcom/urbanairship/android/layout/info/z;", "itemInfo", "Lcom/urbanairship/android/layout/widget/WeightlessLinearLayout$a;", "r", "Lcom/urbanairship/android/layout/environment/p;", "g", "Lcom/urbanairship/android/layout/environment/p;", "viewEnvironment", "Landroid/content/Context;", "context", "Lcom/urbanairship/android/layout/model/i;", "model", "<init>", "(Landroid/content/Context;Lcom/urbanairship/android/layout/model/i;Lcom/urbanairship/android/layout/environment/p;)V", "urbanairship-layout_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
public final class LinearLayoutView extends WeightlessLinearLayout implements C35977a {
    @C12579k

    /* renamed from: g */
    public final C35614p f88853g;

    /* renamed from: com.urbanairship.android.layout.view.LinearLayoutView$a */
    public static final class C35941a implements BaseModel.C35725a {

        /* renamed from: a */
        public final /* synthetic */ LinearLayoutView f88854a;

        public C35941a(LinearLayoutView linearLayoutView) {
            this.f88854a = linearLayoutView;
        }

        /* renamed from: f */
        public void mo107011f(boolean z) {
            int i;
            LinearLayoutView linearLayoutView = this.f88854a;
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            linearLayoutView.setVisibility(i);
        }

        public void setEnabled(boolean z) {
            this.f88854a.setEnabled(z);
        }
    }

    /* renamed from: com.urbanairship.android.layout.view.LinearLayoutView$b */
    public /* synthetic */ class C35942b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Size.DimensionType.values().length];
            iArr[Size.DimensionType.AUTO.ordinal()] = 1;
            iArr[Size.DimensionType.ABSOLUTE.ordinal()] = 2;
            iArr[Size.DimensionType.PERCENT.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinearLayoutView(@C12579k Context context, @C12579k C35802i iVar, @C12579k C35614p pVar) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(iVar, C40045d.f102104u);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        this.f88853g = pVar;
        int i = 0;
        setClipChildren(false);
        C35916j.m148085c(this, iVar);
        Direction K = iVar.mo107218K();
        Direction direction = Direction.VERTICAL;
        int i2 = 1;
        setOrientation(K == direction ? 1 : i);
        setGravity(iVar.mo107218K() != direction ? 16 : i2);
        mo107602q(iVar.mo107219L());
        iVar.mo106988H(new C35941a(this));
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.disableTransitionType(2);
        setLayoutTransition(layoutTransition);
        C18196h2.m82559a2(this, new C35980c(this));
    }

    /* renamed from: p */
    public static final C18436z4 m148154p(LinearLayoutView linearLayoutView, View view, C18436z4 z4Var) {
        Intrinsics.checkNotNullParameter(linearLayoutView, "this$0");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(z4Var, "<anonymous parameter 1>");
        C18436z4 a = new C18436z4.C18438b().mo53159c(C18436z4.C18449m.m83510i(), C17616m0.f45994e).mo53157a();
        Intrinsics.checkNotNullExpressionValue(a, "Builder()\n              …\n                .build()");
        int childCount = linearLayoutView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C18196h2.m82616p(linearLayoutView.getChildAt(i), a);
        }
        return a;
    }

    /* renamed from: q */
    public final void mo107602q(List<C35802i.C35803a> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C35802i.C35803a aVar = list.get(i);
            C35698z a = aVar.mo107221a();
            BaseModel b = aVar.mo107222b();
            WeightlessLinearLayout.C35999a r = mo107603r(a);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
            View h = b.mo106993h(context, this.f88853g);
            h.setLayoutParams(r);
            addViewInLayout(h, -1, r, true);
        }
    }

    /* renamed from: r */
    public final WeightlessLinearLayout.C35999a mo107603r(C35698z zVar) {
        Pair pair;
        Pair pair2;
        Size k = zVar.mo106865k();
        Size.C35820c c = k.mo107290c();
        Intrinsics.checkNotNullExpressionValue(c, "size.width");
        Size.C35820c b = k.mo107289b();
        Intrinsics.checkNotNullExpressionValue(b, "size.height");
        Size.DimensionType c2 = c.mo107295c();
        int[] iArr = C35942b.$EnumSwitchMapping$0;
        int i = iArr[c2.ordinal()];
        if (i == 1) {
            pair = C11078d1.m42659a(-2, Float.valueOf(0.0f));
        } else if (i == 2) {
            pair = C11078d1.m42659a(Integer.valueOf((int) C35921m.m148111a(getContext(), c.mo107292b())), Float.valueOf(0.0f));
        } else if (i == 3) {
            pair = C11078d1.m42659a(0, Float.valueOf(c.mo107291a()));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int intValue = ((Number) pair.mo21846a()).intValue();
        float floatValue = ((Number) pair.mo21847b()).floatValue();
        int i2 = iArr[b.mo107295c().ordinal()];
        if (i2 == 1) {
            pair2 = C11078d1.m42659a(-2, Float.valueOf(0.0f));
        } else if (i2 == 2) {
            pair2 = C11078d1.m42659a(Integer.valueOf((int) C35921m.m148111a(getContext(), b.mo107292b())), Float.valueOf(0.0f));
        } else if (i2 == 3) {
            pair2 = C11078d1.m42659a(0, Float.valueOf(b.mo107291a()));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        WeightlessLinearLayout.C35999a aVar = new WeightlessLinearLayout.C35999a(intValue, ((Number) pair2.mo21846a()).intValue(), floatValue, ((Number) pair2.mo21847b()).floatValue());
        C35840k j = zVar.mo106864j();
        if (j != null) {
            aVar.topMargin = (int) C35921m.m148111a(getContext(), j.mo107348e());
            aVar.bottomMargin = (int) C35921m.m148111a(getContext(), j.mo107345b());
            aVar.setMarginStart((int) C35921m.m148111a(getContext(), j.mo107347d()));
            aVar.setMarginEnd((int) C35921m.m148111a(getContext(), j.mo107346c()));
        }
        return aVar;
    }
}
