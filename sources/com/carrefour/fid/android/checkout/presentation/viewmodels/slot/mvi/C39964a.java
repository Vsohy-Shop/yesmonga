package com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.slot.Slot;
import com.carrefour.fid.android.domain.models.slot.SlotPartOfDay;
import com.carrefour.fid.android.presentation.p035ui.home.shop.OnlineStoreShopFragment;
import com.carrefour.fid.android.shared.base.C28505u;
import java.util.List;
import java.util.Map;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a */
public final class C39964a {
    @C12579k

    /* renamed from: a */
    public static final C39964a f101938a = new C39964a();
    @C12579k

    /* renamed from: b */
    public static final C28505u.C28508c<C39975c, C39965a> f101939b = C39983e.f101986a;

    /* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$a */
    public interface C39965a extends C28505u.C28509d {

        /* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$a$a */
        public static final class C39966a {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m162876a(@C12579k C39965a aVar) {
                return C28505u.C28509d.C28510a.m118428a(aVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$a$b */
        public static final class C39967b implements C39965a {
            @C12579k

            /* renamed from: b */
            public static final C39967b f101940b = new C39967b();

            /* renamed from: c */
            public static final int f101941c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C39966a.m162876a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$a$c */
        public static final class C39968c implements C39965a {

            /* renamed from: c */
            public static final int f101942c = 8;
            @C12580l

            /* renamed from: b */
            public final Map<String, List<Slot>> f101943b;

            public C39968c(@C12580l Map<String, ? extends List<Slot>> map) {
                this.f101943b = map;
            }

            /* renamed from: g */
            public static /* synthetic */ C39968c m162877g(C39968c cVar, Map<String, List<Slot>> map, int i, Object obj) {
                if ((i & 1) != 0) {
                    map = cVar.f101943b;
                }
                return cVar.mo131785f(map);
            }

            @C12580l
            /* renamed from: e */
            public final Map<String, List<Slot>> mo131783e() {
                return this.f101943b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C39968c) && Intrinsics.areEqual((Object) this.f101943b, (Object) ((C39968c) obj).f101943b);
            }

            @C12579k
            /* renamed from: f */
            public final C39968c mo131785f(@C12580l Map<String, ? extends List<Slot>> map) {
                return new C39968c(map);
            }

            @C12580l
            /* renamed from: h */
            public final Map<String, List<Slot>> mo131786h() {
                return this.f101943b;
            }

            public int hashCode() {
                Map<String, List<Slot>> map = this.f101943b;
                if (map == null) {
                    return 0;
                }
                return map.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C39966a.m162876a(this);
            }

            @C12579k
            public String toString() {
                Map<String, List<Slot>> map = this.f101943b;
                return "SlotListResult(slotMap=" + map + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$a$d */
        public static final class C39969d implements C39965a {

            /* renamed from: g */
            public static final int f101944g = 8;
            @C12579k

            /* renamed from: b */
            public final List<Slot> f101945b;
            @C12580l

            /* renamed from: c */
            public final Slot f101946c;
            @C12580l

            /* renamed from: d */
            public final Integer f101947d;
            @C12580l

            /* renamed from: e */
            public final SlotPartOfDay f101948e;
            @C12580l

            /* renamed from: f */
            public final List<SlotPartOfDay> f101949f;

            public C39969d(@C12579k List<Slot> list, @C12580l Slot slot, @C12580l Integer num, @C12580l SlotPartOfDay slotPartOfDay, @C12580l List<? extends SlotPartOfDay> list2) {
                Intrinsics.checkNotNullParameter(list, "slots");
                this.f101945b = list;
                this.f101946c = slot;
                this.f101947d = num;
                this.f101948e = slotPartOfDay;
                this.f101949f = list2;
            }

            /* renamed from: k */
            public static /* synthetic */ C39969d m162881k(C39969d dVar, List<Slot> list, Slot slot, Integer num, SlotPartOfDay slotPartOfDay, List<SlotPartOfDay> list2, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = dVar.f101945b;
                }
                if ((i & 2) != 0) {
                    slot = dVar.f101946c;
                }
                Slot slot2 = slot;
                if ((i & 4) != 0) {
                    num = dVar.f101947d;
                }
                Integer num2 = num;
                if ((i & 8) != 0) {
                    slotPartOfDay = dVar.f101948e;
                }
                SlotPartOfDay slotPartOfDay2 = slotPartOfDay;
                if ((i & 16) != 0) {
                    list2 = dVar.f101949f;
                }
                return dVar.mo131796j(list, slot2, num2, slotPartOfDay2, list2);
            }

            @C12579k
            /* renamed from: e */
            public final List<Slot> mo131789e() {
                return this.f101945b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C39969d)) {
                    return false;
                }
                C39969d dVar = (C39969d) obj;
                return Intrinsics.areEqual((Object) this.f101945b, (Object) dVar.f101945b) && Intrinsics.areEqual((Object) this.f101946c, (Object) dVar.f101946c) && Intrinsics.areEqual((Object) this.f101947d, (Object) dVar.f101947d) && this.f101948e == dVar.f101948e && Intrinsics.areEqual((Object) this.f101949f, (Object) dVar.f101949f);
            }

            @C12580l
            /* renamed from: f */
            public final Slot mo131791f() {
                return this.f101946c;
            }

            @C12580l
            /* renamed from: g */
            public final Integer mo131792g() {
                return this.f101947d;
            }

            @C12580l
            /* renamed from: h */
            public final SlotPartOfDay mo131793h() {
                return this.f101948e;
            }

            public int hashCode() {
                int hashCode = this.f101945b.hashCode() * 31;
                Slot slot = this.f101946c;
                int i = 0;
                int hashCode2 = (hashCode + (slot == null ? 0 : slot.hashCode())) * 31;
                Integer num = this.f101947d;
                int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                SlotPartOfDay slotPartOfDay = this.f101948e;
                int hashCode4 = (hashCode3 + (slotPartOfDay == null ? 0 : slotPartOfDay.hashCode())) * 31;
                List<SlotPartOfDay> list = this.f101949f;
                if (list != null) {
                    i = list.hashCode();
                }
                return hashCode4 + i;
            }

            @C12580l
            /* renamed from: i */
            public final List<SlotPartOfDay> mo131795i() {
                return this.f101949f;
            }

            @C12579k
            /* renamed from: j */
            public final C39969d mo131796j(@C12579k List<Slot> list, @C12580l Slot slot, @C12580l Integer num, @C12580l SlotPartOfDay slotPartOfDay, @C12580l List<? extends SlotPartOfDay> list2) {
                Intrinsics.checkNotNullParameter(list, "slots");
                return new C39969d(list, slot, num, slotPartOfDay, list2);
            }

            @C12580l
            /* renamed from: l */
            public final List<SlotPartOfDay> mo131797l() {
                return this.f101949f;
            }

            @C12580l
            /* renamed from: m */
            public final Slot mo131798m() {
                return this.f101946c;
            }

            @C12580l
            /* renamed from: n */
            public final Integer mo131799n() {
                return this.f101947d;
            }

            @C12580l
            /* renamed from: o */
            public final SlotPartOfDay mo131800o() {
                return this.f101948e;
            }

            @C12579k
            /* renamed from: p */
            public final List<Slot> mo131801p() {
                return this.f101945b;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C39966a.m162876a(this);
            }

            @C12579k
            public String toString() {
                List<Slot> list = this.f101945b;
                Slot slot = this.f101946c;
                Integer num = this.f101947d;
                SlotPartOfDay slotPartOfDay = this.f101948e;
                List<SlotPartOfDay> list2 = this.f101949f;
                return "UpdateSlotDetails(slots=" + list + ", selectedSlot=" + slot + ", slotDateMapIndex=" + num + ", slotPartOfDay=" + slotPartOfDay + ", disabledPartOfDayList=" + list2 + ")";
            }
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$c */
    public static final class C39975c implements C28505u.C28509d {
        @C12579k

        /* renamed from: i */
        public static final C39976a f101961i = new C39976a((DefaultConstructorMarker) null);

        /* renamed from: j */
        public static final int f101962j = 8;
        @C12579k

        /* renamed from: k */
        public static final C39975c f101963k = new C39975c(false, (List) null, (Map) null, (Integer) null, (Slot) null, (SlotPartOfDay) null, (List) null, 127, (DefaultConstructorMarker) null);

        /* renamed from: b */
        public final boolean f101964b;
        @C12580l

        /* renamed from: c */
        public final List<Slot> f101965c;
        @C12580l

        /* renamed from: d */
        public final Map<String, List<Slot>> f101966d;
        @C12580l

        /* renamed from: e */
        public final Integer f101967e;
        @C12580l

        /* renamed from: f */
        public final Slot f101968f;
        @C12580l

        /* renamed from: g */
        public final SlotPartOfDay f101969g;
        @C12580l

        /* renamed from: h */
        public final List<SlotPartOfDay> f101970h;

        /* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$c$a */
        public static final class C39976a {
            public /* synthetic */ C39976a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final C39975c mo131851a() {
                return C39975c.f101963k;
            }

            public C39976a() {
            }
        }

        public C39975c() {
            this(false, (List) null, (Map) null, (Integer) null, (Slot) null, (SlotPartOfDay) null, (List) null, 127, (DefaultConstructorMarker) null);
        }

        /* renamed from: n */
        public static /* synthetic */ C39975c m162916n(C39975c cVar, boolean z, List<Slot> list, Map<String, List<Slot>> map, Integer num, Slot slot, SlotPartOfDay slotPartOfDay, List<SlotPartOfDay> list2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = cVar.f101964b;
            }
            if ((i & 2) != 0) {
                list = cVar.f101965c;
            }
            List<Slot> list3 = list;
            if ((i & 4) != 0) {
                map = cVar.f101966d;
            }
            Map<String, List<Slot>> map2 = map;
            if ((i & 8) != 0) {
                num = cVar.f101967e;
            }
            Integer num2 = num;
            if ((i & 16) != 0) {
                slot = cVar.f101968f;
            }
            Slot slot2 = slot;
            if ((i & 32) != 0) {
                slotPartOfDay = cVar.f101969g;
            }
            SlotPartOfDay slotPartOfDay2 = slotPartOfDay;
            if ((i & 64) != 0) {
                list2 = cVar.f101970h;
            }
            return cVar.mo131843m(z, list3, map2, num2, slot2, slotPartOfDay2, list2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C39975c)) {
                return false;
            }
            C39975c cVar = (C39975c) obj;
            return this.f101964b == cVar.f101964b && Intrinsics.areEqual((Object) this.f101965c, (Object) cVar.f101965c) && Intrinsics.areEqual((Object) this.f101966d, (Object) cVar.f101966d) && Intrinsics.areEqual((Object) this.f101967e, (Object) cVar.f101967e) && Intrinsics.areEqual((Object) this.f101968f, (Object) cVar.f101968f) && this.f101969g == cVar.f101969g && Intrinsics.areEqual((Object) this.f101970h, (Object) cVar.f101970h);
        }

        /* renamed from: f */
        public final boolean mo131834f() {
            return this.f101964b;
        }

        @C12580l
        /* renamed from: g */
        public final List<Slot> mo131835g() {
            return this.f101965c;
        }

        @C12580l
        /* renamed from: h */
        public final Map<String, List<Slot>> mo131836h() {
            return this.f101966d;
        }

        public int hashCode() {
            boolean z = this.f101964b;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            List<Slot> list = this.f101965c;
            int i2 = 0;
            int hashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
            Map<String, List<Slot>> map = this.f101966d;
            int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
            Integer num = this.f101967e;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Slot slot = this.f101968f;
            int hashCode4 = (hashCode3 + (slot == null ? 0 : slot.hashCode())) * 31;
            SlotPartOfDay slotPartOfDay = this.f101969g;
            int hashCode5 = (hashCode4 + (slotPartOfDay == null ? 0 : slotPartOfDay.hashCode())) * 31;
            List<SlotPartOfDay> list2 = this.f101970h;
            if (list2 != null) {
                i2 = list2.hashCode();
            }
            return hashCode5 + i2;
        }

        @C12580l
        /* renamed from: i */
        public final Integer mo131838i() {
            return this.f101967e;
        }

        public final boolean isLoading() {
            return this.f101964b;
        }

        @C12580l
        /* renamed from: j */
        public final Slot mo131840j() {
            return this.f101968f;
        }

        @C12580l
        /* renamed from: k */
        public final SlotPartOfDay mo131841k() {
            return this.f101969g;
        }

        @C12580l
        /* renamed from: l */
        public final List<SlotPartOfDay> mo131842l() {
            return this.f101970h;
        }

        @C12579k
        /* renamed from: m */
        public final C39975c mo131843m(boolean z, @C12580l List<Slot> list, @C12580l Map<String, ? extends List<Slot>> map, @C12580l Integer num, @C12580l Slot slot, @C12580l SlotPartOfDay slotPartOfDay, @C12580l List<? extends SlotPartOfDay> list2) {
            return new C39975c(z, list, map, num, slot, slotPartOfDay, list2);
        }

        @C12580l
        /* renamed from: o */
        public final List<SlotPartOfDay> mo131844o() {
            return this.f101970h;
        }

        @C12580l
        /* renamed from: p */
        public final Slot mo131845p() {
            return this.f101968f;
        }

        @C12580l
        /* renamed from: q */
        public final Integer mo131846q() {
            return this.f101967e;
        }

        @C12580l
        /* renamed from: r */
        public final Map<String, List<Slot>> mo131847r() {
            return this.f101966d;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12580l
        /* renamed from: s */
        public final SlotPartOfDay mo131848s() {
            return this.f101969g;
        }

        @C12580l
        /* renamed from: t */
        public final List<Slot> mo131849t() {
            return this.f101965c;
        }

        @C12579k
        public String toString() {
            boolean z = this.f101964b;
            List<Slot> list = this.f101965c;
            Map<String, List<Slot>> map = this.f101966d;
            Integer num = this.f101967e;
            Slot slot = this.f101968f;
            SlotPartOfDay slotPartOfDay = this.f101969g;
            List<SlotPartOfDay> list2 = this.f101970h;
            return "UiState(isLoading=" + z + ", slots=" + list + ", slotMap=" + map + ", slotDateMapIndex=" + num + ", selectedSlot=" + slot + ", slotPartOfDay=" + slotPartOfDay + ", disabledPartOfDayList=" + list2 + ")";
        }

        public C39975c(boolean z, @C12580l List<Slot> list, @C12580l Map<String, ? extends List<Slot>> map, @C12580l Integer num, @C12580l Slot slot, @C12580l SlotPartOfDay slotPartOfDay, @C12580l List<? extends SlotPartOfDay> list2) {
            this.f101964b = z;
            this.f101965c = list;
            this.f101966d = map;
            this.f101967e = num;
            this.f101968f = slot;
            this.f101969g = slotPartOfDay;
            this.f101970h = list2;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C39975c(boolean r6, java.util.List r7, java.util.Map r8, java.lang.Integer r9, com.carrefour.fid.android.domain.models.slot.Slot r10, com.carrefour.fid.android.domain.models.slot.SlotPartOfDay r11, java.util.List r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
            /*
                r5 = this;
                r14 = r13 & 1
                if (r14 == 0) goto L_0x0005
                r6 = 1
            L_0x0005:
                r14 = r13 & 2
                r0 = 0
                if (r14 == 0) goto L_0x000c
                r14 = r0
                goto L_0x000d
            L_0x000c:
                r14 = r7
            L_0x000d:
                r7 = r13 & 4
                if (r7 == 0) goto L_0x0013
                r1 = r0
                goto L_0x0014
            L_0x0013:
                r1 = r8
            L_0x0014:
                r7 = r13 & 8
                if (r7 == 0) goto L_0x001a
                r2 = r0
                goto L_0x001b
            L_0x001a:
                r2 = r9
            L_0x001b:
                r7 = r13 & 16
                if (r7 == 0) goto L_0x0021
                r3 = r0
                goto L_0x0022
            L_0x0021:
                r3 = r10
            L_0x0022:
                r7 = r13 & 32
                if (r7 == 0) goto L_0x0028
                r4 = r0
                goto L_0x0029
            L_0x0028:
                r4 = r11
            L_0x0029:
                r7 = r13 & 64
                if (r7 == 0) goto L_0x002e
                goto L_0x002f
            L_0x002e:
                r0 = r12
            L_0x002f:
                r7 = r5
                r8 = r6
                r9 = r14
                r10 = r1
                r11 = r2
                r12 = r3
                r13 = r4
                r14 = r0
                r7.<init>(r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39975c.<init>(boolean, java.util.List, java.util.Map, java.lang.Integer, com.carrefour.fid.android.domain.models.slot.Slot, com.carrefour.fid.android.domain.models.slot.SlotPartOfDay, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    /* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$d */
    public interface C39977d extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$d$a */
        public static final class C39978a implements C39977d {

            /* renamed from: g */
            public static final int f101971g = 8;
            @C12580l

            /* renamed from: a */
            public final String f101972a;
            @C12580l

            /* renamed from: b */
            public final SlotArgsHome f101973b;

            /* renamed from: c */
            public final boolean f101974c;

            /* renamed from: d */
            public final boolean f101975d;
            @C12580l

            /* renamed from: e */
            public final String f101976e;

            /* renamed from: f */
            public final boolean f101977f;

            public C39978a(@C12580l String str, @C12580l SlotArgsHome slotArgsHome, boolean z, boolean z2, @C12580l String str2, boolean z3) {
                this.f101972a = str;
                this.f101973b = slotArgsHome;
                this.f101974c = z;
                this.f101975d = z2;
                this.f101976e = str2;
                this.f101977f = z3;
            }

            /* renamed from: h */
            public static /* synthetic */ C39978a m162932h(C39978a aVar, String str, SlotArgsHome slotArgsHome, boolean z, boolean z2, String str2, boolean z3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f101972a;
                }
                if ((i & 2) != 0) {
                    slotArgsHome = aVar.f101973b;
                }
                SlotArgsHome slotArgsHome2 = slotArgsHome;
                if ((i & 4) != 0) {
                    z = aVar.f101974c;
                }
                boolean z4 = z;
                if ((i & 8) != 0) {
                    z2 = aVar.f101975d;
                }
                boolean z5 = z2;
                if ((i & 16) != 0) {
                    str2 = aVar.f101976e;
                }
                String str3 = str2;
                if ((i & 32) != 0) {
                    z3 = aVar.f101977f;
                }
                return aVar.mo131859g(str, slotArgsHome2, z4, z5, str3, z3);
            }

            @C12580l
            /* renamed from: a */
            public final String mo131852a() {
                return this.f101972a;
            }

            @C12580l
            /* renamed from: b */
            public final SlotArgsHome mo131853b() {
                return this.f101973b;
            }

            /* renamed from: c */
            public final boolean mo131854c() {
                return this.f101974c;
            }

            /* renamed from: d */
            public final boolean mo131855d() {
                return this.f101975d;
            }

            @C12580l
            /* renamed from: e */
            public final String mo131856e() {
                return this.f101976e;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C39978a)) {
                    return false;
                }
                C39978a aVar = (C39978a) obj;
                return Intrinsics.areEqual((Object) this.f101972a, (Object) aVar.f101972a) && Intrinsics.areEqual((Object) this.f101973b, (Object) aVar.f101973b) && this.f101974c == aVar.f101974c && this.f101975d == aVar.f101975d && Intrinsics.areEqual((Object) this.f101976e, (Object) aVar.f101976e) && this.f101977f == aVar.f101977f;
            }

            /* renamed from: f */
            public final boolean mo131858f() {
                return this.f101977f;
            }

            @C12579k
            /* renamed from: g */
            public final C39978a mo131859g(@C12580l String str, @C12580l SlotArgsHome slotArgsHome, boolean z, boolean z2, @C12580l String str2, boolean z3) {
                return new C39978a(str, slotArgsHome, z, z2, str2, z3);
            }

            public int hashCode() {
                String str = this.f101972a;
                int i = 0;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                SlotArgsHome slotArgsHome = this.f101973b;
                int hashCode2 = (hashCode + (slotArgsHome == null ? 0 : slotArgsHome.hashCode())) * 31;
                boolean z = this.f101974c;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
                boolean z3 = this.f101975d;
                if (z3) {
                    z3 = true;
                }
                int i3 = (i2 + (z3 ? 1 : 0)) * 31;
                String str2 = this.f101976e;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                int i4 = (i3 + i) * 31;
                boolean z4 = this.f101977f;
                if (!z4) {
                    z2 = z4;
                }
                return i4 + (z2 ? 1 : 0);
            }

            @C12580l
            /* renamed from: i */
            public final String mo131861i() {
                return this.f101972a;
            }

            @C12580l
            /* renamed from: j */
            public final SlotArgsHome mo131862j() {
                return this.f101973b;
            }

            @C12580l
            /* renamed from: k */
            public final String mo131863k() {
                return this.f101976e;
            }

            /* renamed from: l */
            public final boolean mo131864l() {
                return this.f101974c;
            }

            /* renamed from: m */
            public final boolean mo131865m() {
                return this.f101975d;
            }

            /* renamed from: n */
            public final boolean mo131866n() {
                return this.f101977f;
            }

            @C12579k
            public String toString() {
                String str = this.f101972a;
                SlotArgsHome slotArgsHome = this.f101973b;
                boolean z = this.f101974c;
                boolean z2 = this.f101975d;
                String str2 = this.f101976e;
                boolean z3 = this.f101977f;
                return "GetSlotDetails(facilityStoreId=" + str + ", homeArgs=" + slotArgsHome + ", isFromCheckout=" + z + ", isFromHomePage=" + z2 + ", slotId=" + str2 + ", isSlotBooked=" + z3 + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$d$b */
        public static final class C39979b implements C39977d {

            /* renamed from: b */
            public static final int f101978b = 0;

            /* renamed from: a */
            public final int f101979a;

            public C39979b(int i) {
                this.f101979a = i;
            }

            /* renamed from: c */
            public static /* synthetic */ C39979b m162946c(C39979b bVar, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = bVar.f101979a;
                }
                return bVar.mo131869b(i);
            }

            /* renamed from: a */
            public final int mo131868a() {
                return this.f101979a;
            }

            @C12579k
            /* renamed from: b */
            public final C39979b mo131869b(int i) {
                return new C39979b(i);
            }

            /* renamed from: d */
            public final int mo131870d() {
                return this.f101979a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C39979b) && this.f101979a == ((C39979b) obj).f101979a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f101979a);
            }

            @C12579k
            public String toString() {
                int i = this.f101979a;
                return "UpdateDate(slotDateIndex=" + i + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$d$c */
        public static final class C39980c implements C39977d {

            /* renamed from: b */
            public static final int f101980b = 0;
            @C12579k

            /* renamed from: a */
            public final String f101981a;

            public C39980c(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "orderId");
                this.f101981a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C39980c m162950c(C39980c cVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = cVar.f101981a;
                }
                return cVar.mo131875b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo131874a() {
                return this.f101981a;
            }

            @C12579k
            /* renamed from: b */
            public final C39980c mo131875b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "orderId");
                return new C39980c(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo131876d() {
                return this.f101981a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C39980c) && Intrinsics.areEqual((Object) this.f101981a, (Object) ((C39980c) obj).f101981a);
            }

            public int hashCode() {
                return this.f101981a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f101981a;
                return "UpdateOrder(orderId=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$d$d */
        public static final class C39981d implements C39977d {

            /* renamed from: b */
            public static final int f101982b = 0;

            /* renamed from: a */
            public final int f101983a;

            public C39981d(int i) {
                this.f101983a = i;
            }

            /* renamed from: c */
            public static /* synthetic */ C39981d m162954c(C39981d dVar, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = dVar.f101983a;
                }
                return dVar.mo131881b(i);
            }

            /* renamed from: a */
            public final int mo131880a() {
                return this.f101983a;
            }

            @C12579k
            /* renamed from: b */
            public final C39981d mo131881b(int i) {
                return new C39981d(i);
            }

            /* renamed from: d */
            public final int mo131882d() {
                return this.f101983a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C39981d) && this.f101983a == ((C39981d) obj).f101983a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f101983a);
            }

            @C12579k
            public String toString() {
                int i = this.f101983a;
                return "UpdateSlot(slotIndex=" + i + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$d$e */
        public static final class C39982e implements C39977d {

            /* renamed from: b */
            public static final int f101984b = 0;
            @C12579k

            /* renamed from: a */
            public final SlotPartOfDay f101985a;

            public C39982e(@C12579k SlotPartOfDay slotPartOfDay) {
                Intrinsics.checkNotNullParameter(slotPartOfDay, "slotPartOfDay");
                this.f101985a = slotPartOfDay;
            }

            /* renamed from: c */
            public static /* synthetic */ C39982e m162958c(C39982e eVar, SlotPartOfDay slotPartOfDay, int i, Object obj) {
                if ((i & 1) != 0) {
                    slotPartOfDay = eVar.f101985a;
                }
                return eVar.mo131887b(slotPartOfDay);
            }

            @C12579k
            /* renamed from: a */
            public final SlotPartOfDay mo131886a() {
                return this.f101985a;
            }

            @C12579k
            /* renamed from: b */
            public final C39982e mo131887b(@C12579k SlotPartOfDay slotPartOfDay) {
                Intrinsics.checkNotNullParameter(slotPartOfDay, "slotPartOfDay");
                return new C39982e(slotPartOfDay);
            }

            @C12579k
            /* renamed from: d */
            public final SlotPartOfDay mo131888d() {
                return this.f101985a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C39982e) && this.f101985a == ((C39982e) obj).f101985a;
            }

            public int hashCode() {
                return this.f101985a.hashCode();
            }

            @C12579k
            public String toString() {
                SlotPartOfDay slotPartOfDay = this.f101985a;
                return "UpdateSlotPartOfDay(slotPartOfDay=" + slotPartOfDay + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$e */
    public static final class C39983e implements C28505u.C28508c<C39975c, C39965a> {

        /* renamed from: a */
        public static final C39983e f101986a = new C39983e();

        @C12579k
        /* renamed from: b */
        public final C39975c mo32307a(@C12579k C39975c cVar, @C12579k C39965a aVar) {
            Intrinsics.checkNotNullParameter(cVar, "state");
            Intrinsics.checkNotNullParameter(aVar, "partialState");
            if (aVar instanceof C39965a.C39967b) {
                return new C39975c(true, (List) null, (Map) null, (Integer) null, (Slot) null, (SlotPartOfDay) null, (List) null, 126, (DefaultConstructorMarker) null);
            }
            if (aVar instanceof C39965a.C39968c) {
                return C39975c.m162916n(cVar, false, (List) null, ((C39965a.C39968c) aVar).mo131786h(), (Integer) null, (Slot) null, (SlotPartOfDay) null, (List) null, 122, (Object) null);
            } else if (aVar instanceof C39965a.C39969d) {
                C39965a.C39969d dVar = (C39965a.C39969d) aVar;
                List<Slot> p = dVar.mo131801p();
                Slot m = dVar.mo131798m();
                Integer n = dVar.mo131799n();
                SlotPartOfDay o = dVar.mo131800o();
                if (o == null) {
                    o = SlotPartOfDay.MORNING;
                }
                return C39975c.m162916n(cVar, false, p, (Map) null, n, m, o, dVar.mo131797l(), 4, (Object) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @C12579k
    /* renamed from: a */
    public final C28505u.C28508c<C39975c, C39965a> mo131782a() {
        return f101939b;
    }

    /* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b */
    public interface C39970b extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$a */
        public static final class C39971a implements C39970b {

            /* renamed from: c */
            public static final int f101950c = 8;
            @C12579k

            /* renamed from: a */
            public final Slot f101951a;
            @C12579k

            /* renamed from: b */
            public final Basket f101952b;

            public C39971a(@C12579k Slot slot, @C12579k Basket basket) {
                Intrinsics.checkNotNullParameter(slot, OnlineStoreShopFragment.f60516Z);
                Intrinsics.checkNotNullParameter(basket, "basket");
                this.f101951a = slot;
                this.f101952b = basket;
            }

            /* renamed from: d */
            public static /* synthetic */ C39971a m162893d(C39971a aVar, Slot slot, Basket basket, int i, Object obj) {
                if ((i & 1) != 0) {
                    slot = aVar.f101951a;
                }
                if ((i & 2) != 0) {
                    basket = aVar.f101952b;
                }
                return aVar.mo131805c(slot, basket);
            }

            @C12579k
            /* renamed from: a */
            public final Slot mo131803a() {
                return this.f101951a;
            }

            @C12579k
            /* renamed from: b */
            public final Basket mo131804b() {
                return this.f101952b;
            }

            @C12579k
            /* renamed from: c */
            public final C39971a mo131805c(@C12579k Slot slot, @C12579k Basket basket) {
                Intrinsics.checkNotNullParameter(slot, OnlineStoreShopFragment.f60516Z);
                Intrinsics.checkNotNullParameter(basket, "basket");
                return new C39971a(slot, basket);
            }

            @C12579k
            /* renamed from: e */
            public final Basket mo131806e() {
                return this.f101952b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C39971a)) {
                    return false;
                }
                C39971a aVar = (C39971a) obj;
                return Intrinsics.areEqual((Object) this.f101951a, (Object) aVar.f101951a) && Intrinsics.areEqual((Object) this.f101952b, (Object) aVar.f101952b);
            }

            @C12579k
            /* renamed from: f */
            public final Slot mo131808f() {
                return this.f101951a;
            }

            public int hashCode() {
                return (this.f101951a.hashCode() * 31) + this.f101952b.hashCode();
            }

            @C12579k
            public String toString() {
                Slot slot = this.f101951a;
                Basket basket = this.f101952b;
                return "BookSlotSuccess(slot=" + slot + ", basket=" + basket + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b */
        public static final class C39972b implements C39970b {

            /* renamed from: b */
            public static final int f101953b = 8;
            @C12579k

            /* renamed from: a */
            public final Throwable f101954a;

            public C39972b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f101954a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C39972b m162899c(C39972b bVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = bVar.f101954a;
                }
                return bVar.mo131812b(th);
            }

            @C12579k
            /* renamed from: a */
            public final Throwable mo131811a() {
                return this.f101954a;
            }

            @C12579k
            /* renamed from: b */
            public final C39972b mo131812b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C39972b(th);
            }

            @C12579k
            /* renamed from: d */
            public final Throwable mo131813d() {
                return this.f101954a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C39972b) && Intrinsics.areEqual((Object) this.f101954a, (Object) ((C39972b) obj).f101954a);
            }

            public int hashCode() {
                return this.f101954a.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f101954a;
                return "Error(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$c */
        public static final class C39973c implements C39970b {

            /* renamed from: b */
            public static final int f101955b = 0;
            @C12579k

            /* renamed from: a */
            public final String f101956a;

            public C39973c(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "orderId");
                this.f101956a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C39973c m162903c(C39973c cVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = cVar.f101956a;
                }
                return cVar.mo131818b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo131817a() {
                return this.f101956a;
            }

            @C12579k
            /* renamed from: b */
            public final C39973c mo131818b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "orderId");
                return new C39973c(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo131819d() {
                return this.f101956a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C39973c) && Intrinsics.areEqual((Object) this.f101956a, (Object) ((C39973c) obj).f101956a);
            }

            public int hashCode() {
                return this.f101956a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f101956a;
                return "OrderUpdated(orderId=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$d */
        public static final class C39974d implements C39970b {

            /* renamed from: d */
            public static final int f101957d = 0;

            /* renamed from: a */
            public final boolean f101958a;
            @C12580l

            /* renamed from: b */
            public final String f101959b;

            /* renamed from: c */
            public final boolean f101960c;

            public C39974d(boolean z, @C12580l String str, boolean z2) {
                this.f101958a = z;
                this.f101959b = str;
                this.f101960c = z2;
            }

            /* renamed from: e */
            public static /* synthetic */ C39974d m162907e(C39974d dVar, boolean z, String str, boolean z2, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = dVar.f101958a;
                }
                if ((i & 2) != 0) {
                    str = dVar.f101959b;
                }
                if ((i & 4) != 0) {
                    z2 = dVar.f101960c;
                }
                return dVar.mo131826d(z, str, z2);
            }

            /* renamed from: a */
            public final boolean mo131823a() {
                return this.f101958a;
            }

            @C12580l
            /* renamed from: b */
            public final String mo131824b() {
                return this.f101959b;
            }

            /* renamed from: c */
            public final boolean mo131825c() {
                return this.f101960c;
            }

            @C12579k
            /* renamed from: d */
            public final C39974d mo131826d(boolean z, @C12580l String str, boolean z2) {
                return new C39974d(z, str, z2);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C39974d)) {
                    return false;
                }
                C39974d dVar = (C39974d) obj;
                return this.f101958a == dVar.f101958a && Intrinsics.areEqual((Object) this.f101959b, (Object) dVar.f101959b) && this.f101960c == dVar.f101960c;
            }

            @C12580l
            /* renamed from: f */
            public final String mo131828f() {
                return this.f101959b;
            }

            /* renamed from: g */
            public final boolean mo131829g() {
                return this.f101958a;
            }

            /* renamed from: h */
            public final boolean mo131830h() {
                return this.f101960c;
            }

            public int hashCode() {
                boolean z = this.f101958a;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                int i = (z ? 1 : 0) * true;
                String str = this.f101959b;
                int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
                boolean z3 = this.f101960c;
                if (!z3) {
                    z2 = z3;
                }
                return hashCode + (z2 ? 1 : 0);
            }

            @C12579k
            public String toString() {
                boolean z = this.f101958a;
                String str = this.f101959b;
                boolean z2 = this.f101960c;
                return "SlotH1H3Success(isProductThresholdExceeded=" + z + ", startHourAvailable=" + str + ", isYieldEligible=" + z2 + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C39974d(boolean z, String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(z, str, (i & 4) != 0 ? false : z2);
            }
        }
    }
}
