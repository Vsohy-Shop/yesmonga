package com.carrefour.fid.android.design.components.compose;

import androidx.compose.runtime.internal.C8567o;
import java.io.Serializable;
import java.util.Date;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/compose/ActiveState;", "Ljava/io/Serializable;", "ActiveData", "ActiveDataStore", "Error", "Steady", "Lcom/carrefour/fid/android/design/components/compose/ActiveState$ActiveData;", "Lcom/carrefour/fid/android/design/components/compose/ActiveState$ActiveDataStore;", "Lcom/carrefour/fid/android/design/components/compose/ActiveState$Error;", "Lcom/carrefour/fid/android/design/components/compose/ActiveState$Steady;", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public interface ActiveState extends Serializable {

    @C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/compose/ActiveState$ActiveData;", "Lcom/carrefour/fid/android/design/components/compose/ActiveState;", "", "a", "Ljava/util/Date;", "b", "storeName", "dateInfo", "c", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Ljava/util/Date;", "e", "()Ljava/util/Date;", "<init>", "(Ljava/lang/String;Ljava/util/Date;)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    public static final class ActiveData implements ActiveState {

        /* renamed from: a */
        public static final int f92082a = 8;
        @C12580l
        private final Date dateInfo;
        @C12579k
        private final String storeName;

        public ActiveData(@C12579k String str, @C12580l Date date) {
            Intrinsics.checkNotNullParameter(str, "storeName");
            this.storeName = str;
            this.dateInfo = date;
        }

        /* renamed from: d */
        public static /* synthetic */ ActiveData m151293d(ActiveData activeData, String str, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                str = activeData.storeName;
            }
            if ((i & 2) != 0) {
                date = activeData.dateInfo;
            }
            return activeData.mo111923c(str, date);
        }

        @C12579k
        /* renamed from: a */
        public final String mo111921a() {
            return this.storeName;
        }

        @C12580l
        /* renamed from: b */
        public final Date mo111922b() {
            return this.dateInfo;
        }

        @C12579k
        /* renamed from: c */
        public final ActiveData mo111923c(@C12579k String str, @C12580l Date date) {
            Intrinsics.checkNotNullParameter(str, "storeName");
            return new ActiveData(str, date);
        }

        @C12580l
        /* renamed from: e */
        public final Date mo111924e() {
            return this.dateInfo;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActiveData)) {
                return false;
            }
            ActiveData activeData = (ActiveData) obj;
            return Intrinsics.areEqual((Object) this.storeName, (Object) activeData.storeName) && Intrinsics.areEqual((Object) this.dateInfo, (Object) activeData.dateInfo);
        }

        @C12579k
        /* renamed from: f */
        public final String mo111926f() {
            return this.storeName;
        }

        public int hashCode() {
            int hashCode = this.storeName.hashCode() * 31;
            Date date = this.dateInfo;
            return hashCode + (date == null ? 0 : date.hashCode());
        }

        @C12579k
        public String toString() {
            String str = this.storeName;
            Date date = this.dateInfo;
            return "ActiveData(storeName=" + str + ", dateInfo=" + date + ")";
        }
    }

    @C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/compose/ActiveState$ActiveDataStore;", "Lcom/carrefour/fid/android/design/components/compose/ActiveState;", "", "a", "Lcom/carrefour/fid/android/design/components/compose/PhysicalStoreInfo;", "b", "storeName", "physicalStoreInfo", "c", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Lcom/carrefour/fid/android/design/components/compose/PhysicalStoreInfo;", "e", "()Lcom/carrefour/fid/android/design/components/compose/PhysicalStoreInfo;", "<init>", "(Ljava/lang/String;Lcom/carrefour/fid/android/design/components/compose/PhysicalStoreInfo;)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    public static final class ActiveDataStore implements ActiveState {

        /* renamed from: a */
        public static final int f92083a = 8;
        @C12579k
        private final PhysicalStoreInfo physicalStoreInfo;
        @C12579k
        private final String storeName;

        public ActiveDataStore(@C12579k String str, @C12579k PhysicalStoreInfo physicalStoreInfo2) {
            Intrinsics.checkNotNullParameter(str, "storeName");
            Intrinsics.checkNotNullParameter(physicalStoreInfo2, "physicalStoreInfo");
            this.storeName = str;
            this.physicalStoreInfo = physicalStoreInfo2;
        }

        /* renamed from: d */
        public static /* synthetic */ ActiveDataStore m151299d(ActiveDataStore activeDataStore, String str, PhysicalStoreInfo physicalStoreInfo2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = activeDataStore.storeName;
            }
            if ((i & 2) != 0) {
                physicalStoreInfo2 = activeDataStore.physicalStoreInfo;
            }
            return activeDataStore.mo111931c(str, physicalStoreInfo2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo111929a() {
            return this.storeName;
        }

        @C12579k
        /* renamed from: b */
        public final PhysicalStoreInfo mo111930b() {
            return this.physicalStoreInfo;
        }

        @C12579k
        /* renamed from: c */
        public final ActiveDataStore mo111931c(@C12579k String str, @C12579k PhysicalStoreInfo physicalStoreInfo2) {
            Intrinsics.checkNotNullParameter(str, "storeName");
            Intrinsics.checkNotNullParameter(physicalStoreInfo2, "physicalStoreInfo");
            return new ActiveDataStore(str, physicalStoreInfo2);
        }

        @C12579k
        /* renamed from: e */
        public final PhysicalStoreInfo mo111932e() {
            return this.physicalStoreInfo;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActiveDataStore)) {
                return false;
            }
            ActiveDataStore activeDataStore = (ActiveDataStore) obj;
            return Intrinsics.areEqual((Object) this.storeName, (Object) activeDataStore.storeName) && Intrinsics.areEqual((Object) this.physicalStoreInfo, (Object) activeDataStore.physicalStoreInfo);
        }

        @C12579k
        /* renamed from: f */
        public final String mo111934f() {
            return this.storeName;
        }

        public int hashCode() {
            return (this.storeName.hashCode() * 31) + this.physicalStoreInfo.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.storeName;
            PhysicalStoreInfo physicalStoreInfo2 = this.physicalStoreInfo;
            return "ActiveDataStore(storeName=" + str + ", physicalStoreInfo=" + physicalStoreInfo2 + ")";
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/compose/ActiveState$Error;", "Lcom/carrefour/fid/android/design/components/compose/ActiveState;", "()V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    @C8567o(parameters = 0)
    public static final class Error implements ActiveState {
        @C12579k

        /* renamed from: a */
        public static final Error f92084a = new Error();

        /* renamed from: b */
        public static final int f92085b = 0;

        private Error() {
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/compose/ActiveState$Steady;", "Lcom/carrefour/fid/android/design/components/compose/ActiveState;", "()V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    @C8567o(parameters = 0)
    public static final class Steady implements ActiveState {
        @C12579k

        /* renamed from: a */
        public static final Steady f92086a = new Steady();

        /* renamed from: b */
        public static final int f92087b = 0;

        private Steady() {
        }
    }
}
