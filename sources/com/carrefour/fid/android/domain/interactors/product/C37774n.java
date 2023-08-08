package com.carrefour.fid.android.domain.interactors.product;

import com.carrefour.fid.android.domain.models.C38184v;
import com.carrefour.fid.android.domain.models.product.Gtin;
import java.util.List;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11074j;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.product.n */
public interface C37774n extends C11304p<C37775a, C11045c<? super C11907e<? extends List<? extends C38184v>>>, Object>, C11074j {

    /* renamed from: com.carrefour.fid.android.domain.interactors.product.n$a */
    public static final class C37775a {
        @C12579k

        /* renamed from: a */
        public final List<Gtin> f94813a;

        public C37775a(@C12579k List<Gtin> list) {
            Intrinsics.checkNotNullParameter(list, "gtinsList");
            this.f94813a = list;
        }

        /* renamed from: c */
        public static /* synthetic */ C37775a m154856c(C37775a aVar, List<Gtin> list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = aVar.f94813a;
            }
            return aVar.mo115104b(list);
        }

        @C12579k
        /* renamed from: a */
        public final List<Gtin> mo115103a() {
            return this.f94813a;
        }

        @C12579k
        /* renamed from: b */
        public final C37775a mo115104b(@C12579k List<Gtin> list) {
            Intrinsics.checkNotNullParameter(list, "gtinsList");
            return new C37775a(list);
        }

        @C12579k
        /* renamed from: d */
        public final List<Gtin> mo115105d() {
            return this.f94813a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37775a) && Intrinsics.areEqual((Object) this.f94813a, (Object) ((C37775a) obj).f94813a);
        }

        public int hashCode() {
            return this.f94813a.hashCode();
        }

        @C12579k
        public String toString() {
            List<Gtin> list = this.f94813a;
            return "Param(gtinsList=" + list + ")";
        }
    }
}
