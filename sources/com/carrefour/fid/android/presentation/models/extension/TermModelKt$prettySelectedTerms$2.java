package com.carrefour.fid.android.presentation.models.extension;

import com.carrefour.fid.android.presentation.models.TermModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/TermModel;", "term", "", "a", "(Lcom/carrefour/fid/android/presentation/models/TermModel;)Ljava/lang/CharSequence;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TermModelKt$prettySelectedTerms$2 extends Lambda implements C11300l<TermModel, CharSequence> {

    /* renamed from: f */
    public static final TermModelKt$prettySelectedTerms$2 f97594f = new TermModelKt$prettySelectedTerms$2();

    public TermModelKt$prettySelectedTerms$2() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final CharSequence invoke(@C12579k TermModel termModel) {
        Intrinsics.checkNotNullParameter(termModel, FirebaseAnalytics.C32532b.f78927O);
        return termModel.mo121966h();
    }
}
