package com.usabilla.sdk.ubform.sdk.field.presenter;

import android.graphics.Bitmap;
import com.google.android.gms.maps.internal.C30519p1;
import com.usabilla.sdk.ubform.sdk.field.contract.C9971e;
import com.usabilla.sdk.ubform.utils.C10145l;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 5, 1}, mo22520xi = 48)
public /* synthetic */ class ParagraphPresenter$populateView$1 extends FunctionReferenceImpl implements C11304p<C10145l.C10146a, Bitmap, C11079d2> {
    public ParagraphPresenter$populateView$1(C9971e.C9973b bVar) {
        super(2, bVar, C9971e.C9973b.class, "updateDrawablePlaceholder", "updateDrawablePlaceholder(Lcom/usabilla/sdk/ubform/utils/UbImageGetter$BitmapDrawablePlaceHolder;Landroid/graphics/Bitmap;)V", 0);
    }

    /* renamed from: d */
    public final void mo21019d(@C12579k C10145l.C10146a aVar, @C12579k Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(aVar, "p0");
        Intrinsics.checkNotNullParameter(bitmap, C30519p1.f72971a);
        ((C9971e.C9973b) this.receiver).mo20846i(aVar, bitmap);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo21019d((C10145l.C10146a) obj, (Bitmap) obj2);
        return C11079d2.f28267a;
    }
}
