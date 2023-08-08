package com.carrefour.fid.android.domain.interactors.consent;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.consent.ConsentOptIn;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.consent.c */
public interface C37631c extends C37679f<C37632a, C11079d2> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.consent.c$a */
    public static final class C37632a {
        @C12579k

        /* renamed from: a */
        public final List<ConsentOptIn> f94414a;

        public C37632a() {
            this((List) null, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C37632a m154255c(C37632a aVar, List<ConsentOptIn> list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = aVar.f94414a;
            }
            return aVar.mo114528b(list);
        }

        @C12579k
        /* renamed from: a */
        public final List<ConsentOptIn> mo114527a() {
            return this.f94414a;
        }

        @C12579k
        /* renamed from: b */
        public final C37632a mo114528b(@C12579k List<ConsentOptIn> list) {
            Intrinsics.checkNotNullParameter(list, "consentOptIns");
            return new C37632a(list);
        }

        @C12579k
        /* renamed from: d */
        public final List<ConsentOptIn> mo114529d() {
            return this.f94414a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37632a) && Intrinsics.areEqual((Object) this.f94414a, (Object) ((C37632a) obj).f94414a);
        }

        public int hashCode() {
            return this.f94414a.hashCode();
        }

        @C12579k
        public String toString() {
            List<ConsentOptIn> list = this.f94414a;
            return "Params(consentOptIns=" + list + ")";
        }

        public C37632a(@C12579k List<ConsentOptIn> list) {
            Intrinsics.checkNotNullParameter(list, "consentOptIns");
            this.f94414a = list;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37632a(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list);
        }
    }
}
