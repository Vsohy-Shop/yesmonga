package com.usabilla.sdk.ubform.sdk.field.presenter;

import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.sdk.field.contract.C9968d;
import com.usabilla.sdk.ubform.sdk.field.model.MoodModel;
import com.usabilla.sdk.ubform.sdk.field.model.common.Option;
import com.usabilla.sdk.ubform.sdk.field.presenter.common.FieldPresenter;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldView;
import com.usabilla.sdk.ubform.sdk.form.model.MoodAmount;
import com.usabilla.sdk.ubform.sdk.page.contract.C10061a;
import java.util.List;
import kotlin.collections.C10976s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.sdk.field.presenter.d */
public final class C10018d extends FieldPresenter<MoodModel, Integer> implements C9968d.C9969a {
    @C12579k

    /* renamed from: v */
    public static final C10019a f27507v = new C10019a((DefaultConstructorMarker) null);
    @Deprecated

    /* renamed from: w */
    public static final int f27508w = 5;
    @Deprecated

    /* renamed from: x */
    public static final int f27509x = 3;
    @Deprecated

    /* renamed from: y */
    public static final int f27510y = 2;

    /* renamed from: f */
    public final int f27511f = 2;

    /* renamed from: g */
    public final int f27512g = 3;

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.presenter.d$a */
    public static final class C10019a {
        public /* synthetic */ C10019a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C10019a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10018d(@C12579k MoodModel moodModel, @C12579k C10061a.C10062a aVar) {
        super(moodModel, aVar);
        Intrinsics.checkNotNullParameter(moodModel, "fieldModel");
        Intrinsics.checkNotNullParameter(aVar, "pagePresenter");
    }

    @C12579k
    /* renamed from: C */
    public List<Option> mo20841C() {
        List<Option> x = ((MoodModel) mo20826p()).mo20953x();
        Intrinsics.checkNotNullExpressionValue(x, "fieldModel.options");
        return x;
    }

    /* renamed from: R */
    public /* bridge */ /* synthetic */ void mo20824R(Object obj) {
        mo21029i0(((Number) obj).intValue());
    }

    /* renamed from: Y */
    public int mo20842Y() {
        Object d = ((MoodModel) mo20826p()).mo20973d();
        Intrinsics.checkNotNullExpressionValue(d, "fieldModel.fieldValue");
        return ((Number) d).intValue();
    }

    /* renamed from: i0 */
    public void mo21029i0(int i) {
        ((MoodModel) mo20826p()).mo20983q(Integer.valueOf(i));
        C10061a.C10062a g0 = mo21027g0();
        String e = ((MoodModel) mo20826p()).mo20974e();
        Intrinsics.checkNotNullExpressionValue(e, "fieldModel.id");
        g0.mo20735w(e, C10976s.m41419k(String.valueOf(i)));
    }

    /* renamed from: j0 */
    public final int mo21030j0(int i) {
        if (i == 2) {
            return C9747c.C9750c.ub_element_mood_two;
        }
        if (i == 3) {
            return C9747c.C9750c.ub_element_mood_three;
        }
        if (i != 5) {
            return -1;
        }
        return C9747c.C9750c.ub_element_mood_five;
    }

    /* renamed from: u */
    public void mo20469u() {
        MoodAmount moodAmount;
        int size = ((MoodModel) mo20826p()).mo20953x().size();
        if (size == this.f27511f) {
            moodAmount = MoodAmount.TWO;
        } else if (size == this.f27512g) {
            moodAmount = MoodAmount.THREE;
        } else {
            moodAmount = MoodAmount.FIVE;
        }
        FieldView<?> j = mo20825j();
        if (j != null) {
            ((C9968d.C9970b) j).setMoodIconBackgroundResources(((MoodModel) mo20826p()).mo20976g().getImages(), moodAmount);
            FieldView<?> j2 = mo20825j();
            if (j2 != null) {
                ((C9968d.C9970b) j2).setAccessibilityLabels(mo21030j0(((MoodModel) mo20826p()).mo20953x().size()));
                super.mo20469u();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.usabilla.sdk.ubform.sdk.field.contract.MoodContract.View");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.usabilla.sdk.ubform.sdk.field.contract.MoodContract.View");
    }
}
