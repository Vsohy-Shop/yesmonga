package com.usabilla.sdk.ubform.sdk.field.presenter;

import com.usabilla.sdk.ubform.sdk.field.contract.C9983i;
import com.usabilla.sdk.ubform.sdk.field.model.SliderModel;
import com.usabilla.sdk.ubform.sdk.field.presenter.common.FieldPresenter;
import com.usabilla.sdk.ubform.sdk.page.contract.C10061a;
import kotlin.collections.C10976s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.sdk.field.presenter.h */
public final class C10023h extends FieldPresenter<SliderModel, Integer> implements C9983i.C9984a {
    @C12579k

    /* renamed from: v */
    public static final C10024a f27514v = new C10024a((DefaultConstructorMarker) null);

    /* renamed from: w */
    public static final int f27515w = 10;

    /* renamed from: x */
    public static final int f27516x = 0;

    /* renamed from: y */
    public static final int f27517y = 1;
    @C12579k

    /* renamed from: z */
    public static final String f27518z = "10/10";
    @C12579k

    /* renamed from: f */
    public final String f27519f;
    @C12579k

    /* renamed from: g */
    public final String f27520g;

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.presenter.h$a */
    public static final class C10024a {
        public /* synthetic */ C10024a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C10024a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10023h(@C12579k SliderModel sliderModel, @C12579k C10061a.C10062a aVar) {
        super(sliderModel, aVar);
        Intrinsics.checkNotNullParameter(sliderModel, "fieldModel");
        Intrinsics.checkNotNullParameter(aVar, "pagePresenter");
        String y = sliderModel.mo20924y();
        String str = "";
        this.f27519f = y == null ? str : y;
        String x = sliderModel.mo20923x();
        this.f27520g = x != null ? x : str;
    }

    @C12579k
    /* renamed from: G */
    public String mo20862G() {
        int i;
        Integer num;
        if (((SliderModel) mo20826p()).mo20922A()) {
            i = 10;
        } else {
            i = mo21036j0();
        }
        if (((SliderModel) mo20826p()).mo20885j()) {
            if (((SliderModel) mo20826p()).mo20922A()) {
                num = (Integer) ((SliderModel) mo20826p()).mo20973d();
            } else {
                num = Integer.valueOf(((Number) ((SliderModel) mo20826p()).mo20973d()).intValue() + 1);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(num);
            sb.append('/');
            sb.append(i);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((SliderModel) mo20826p()).mo20922A() ^ true ? 1 : 0);
        sb2.append('/');
        sb2.append(i);
        return sb2.toString();
    }

    @C12579k
    /* renamed from: N */
    public String mo20863N() {
        return this.f27519f;
    }

    /* renamed from: R */
    public /* bridge */ /* synthetic */ void mo20824R(Object obj) {
        mo21035i0(((Number) obj).intValue());
    }

    /* renamed from: S */
    public int mo20864S() {
        if (!((SliderModel) mo20826p()).mo20922A()) {
            return mo21036j0() - 1;
        }
        return 10;
    }

    public int getProgress() {
        if (!((SliderModel) mo20826p()).mo20885j()) {
            return 0;
        }
        Object d = ((SliderModel) mo20826p()).mo20973d();
        Intrinsics.checkNotNullExpressionValue(d, "fieldModel.fieldValue");
        return ((Number) d).intValue();
    }

    /* renamed from: i0 */
    public void mo21035i0(int i) {
        ((SliderModel) mo20826p()).mo20983q(Integer.valueOf(i));
        C10061a.C10062a g0 = mo21027g0();
        String e = ((SliderModel) mo20826p()).mo20974e();
        Intrinsics.checkNotNullExpressionValue(e, "fieldModel.id");
        g0.mo20735w(e, C10976s.m41419k(String.valueOf(i)));
    }

    /* renamed from: j0 */
    public final int mo21036j0() {
        int z = ((SliderModel) mo20826p()).mo20925z();
        if (z > 0) {
            return z;
        }
        return 10;
    }

    @C12579k
    /* renamed from: l */
    public String mo20866l() {
        return this.f27520g;
    }

    /* renamed from: q */
    public int mo20867q() {
        return ((SliderModel) mo20826p()).mo20922A() ^ true ? 1 : 0;
    }
}
