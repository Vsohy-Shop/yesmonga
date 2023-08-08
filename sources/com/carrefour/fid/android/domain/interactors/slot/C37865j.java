package com.carrefour.fid.android.domain.interactors.slot;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.slot.Slot;
import com.carrefour.fid.android.presentation.p035ui.home.shop.OnlineStoreShopFragment;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.slot.j */
public interface C37865j extends C37679f<C37866a, C11079d2> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.slot.j$a */
    public static final class C37866a {
        @C12579k

        /* renamed from: a */
        public final Slot f94959a;

        public C37866a(@C12579k Slot slot) {
            Intrinsics.checkNotNullParameter(slot, OnlineStoreShopFragment.f60516Z);
            this.f94959a = slot;
        }

        /* renamed from: c */
        public static /* synthetic */ C37866a m155091c(C37866a aVar, Slot slot, int i, Object obj) {
            if ((i & 1) != 0) {
                slot = aVar.f94959a;
            }
            return aVar.mo115322b(slot);
        }

        @C12579k
        /* renamed from: a */
        public final Slot mo115321a() {
            return this.f94959a;
        }

        @C12579k
        /* renamed from: b */
        public final C37866a mo115322b(@C12579k Slot slot) {
            Intrinsics.checkNotNullParameter(slot, OnlineStoreShopFragment.f60516Z);
            return new C37866a(slot);
        }

        @C12579k
        /* renamed from: d */
        public final Slot mo115323d() {
            return this.f94959a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37866a) && Intrinsics.areEqual((Object) this.f94959a, (Object) ((C37866a) obj).f94959a);
        }

        public int hashCode() {
            return this.f94959a.hashCode();
        }

        @C12579k
        public String toString() {
            Slot slot = this.f94959a;
            return "Params(slot=" + slot + ")";
        }
    }
}
