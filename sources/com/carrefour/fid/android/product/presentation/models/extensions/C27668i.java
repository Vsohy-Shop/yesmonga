package com.carrefour.fid.android.product.presentation.models.extensions;

import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.product.presentation.models.C27670g;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.models.extensions.i */
public final class C27668i {
    @C12580l
    /* renamed from: a */
    public static final C38114b m116407a(@C12579k C27670g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (gVar instanceof C27670g.C27676f) {
            return ((C27670g.C27676f) gVar).mo80412e();
        }
        if (gVar instanceof C27670g.C27671a) {
            return (C38114b) CollectionsKt___CollectionsKt.m40479B2(((C27670g.C27671a) gVar).mo80368e().mo117435d());
        }
        if (gVar instanceof C27670g.C27672b) {
            return (C38114b) CollectionsKt___CollectionsKt.m40479B2(((C27670g.C27672b) gVar).mo80376e().mo117435d());
        }
        return null;
    }
}
