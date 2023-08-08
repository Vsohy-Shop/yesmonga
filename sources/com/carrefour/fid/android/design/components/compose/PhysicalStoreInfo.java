package com.carrefour.fid.android.design.components.compose;

import androidx.compose.runtime.internal.C8567o;
import java.io.Serializable;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/compose/PhysicalStoreInfo;", "Ljava/io/Serializable;", "NoInfo", "PhysicalStoreClosed", "PhysicalStoreOpened", "Lcom/carrefour/fid/android/design/components/compose/PhysicalStoreInfo$NoInfo;", "Lcom/carrefour/fid/android/design/components/compose/PhysicalStoreInfo$PhysicalStoreClosed;", "Lcom/carrefour/fid/android/design/components/compose/PhysicalStoreInfo$PhysicalStoreOpened;", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public interface PhysicalStoreInfo extends Serializable {

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/compose/PhysicalStoreInfo$NoInfo;", "Lcom/carrefour/fid/android/design/components/compose/PhysicalStoreInfo;", "()V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    @C8567o(parameters = 0)
    public static final class NoInfo implements PhysicalStoreInfo {
        @C12579k

        /* renamed from: a */
        public static final NoInfo f92304a = new NoInfo();

        /* renamed from: b */
        public static final int f92305b = 0;

        private NoInfo() {
        }
    }

    @C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/compose/PhysicalStoreInfo$PhysicalStoreClosed;", "Lcom/carrefour/fid/android/design/components/compose/PhysicalStoreInfo;", "", "a", "openingHour", "b", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    public static final class PhysicalStoreClosed implements PhysicalStoreInfo {

        /* renamed from: a */
        public static final int f92306a = 0;
        @C12579k
        private final String openingHour;

        public PhysicalStoreClosed(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "openingHour");
            this.openingHour = str;
        }

        /* renamed from: c */
        public static /* synthetic */ PhysicalStoreClosed m151551c(PhysicalStoreClosed physicalStoreClosed, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = physicalStoreClosed.openingHour;
            }
            return physicalStoreClosed.mo112238b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo112237a() {
            return this.openingHour;
        }

        @C12579k
        /* renamed from: b */
        public final PhysicalStoreClosed mo112238b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "openingHour");
            return new PhysicalStoreClosed(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo112239d() {
            return this.openingHour;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PhysicalStoreClosed) && Intrinsics.areEqual((Object) this.openingHour, (Object) ((PhysicalStoreClosed) obj).openingHour);
        }

        public int hashCode() {
            return this.openingHour.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.openingHour;
            return "PhysicalStoreClosed(openingHour=" + str + ")";
        }
    }

    @C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/compose/PhysicalStoreInfo$PhysicalStoreOpened;", "Lcom/carrefour/fid/android/design/components/compose/PhysicalStoreInfo;", "", "a", "closingHour", "b", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    public static final class PhysicalStoreOpened implements PhysicalStoreInfo {

        /* renamed from: a */
        public static final int f92307a = 0;
        @C12579k
        private final String closingHour;

        public PhysicalStoreOpened(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "closingHour");
            this.closingHour = str;
        }

        /* renamed from: c */
        public static /* synthetic */ PhysicalStoreOpened m151555c(PhysicalStoreOpened physicalStoreOpened, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = physicalStoreOpened.closingHour;
            }
            return physicalStoreOpened.mo112244b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo112243a() {
            return this.closingHour;
        }

        @C12579k
        /* renamed from: b */
        public final PhysicalStoreOpened mo112244b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "closingHour");
            return new PhysicalStoreOpened(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo112245d() {
            return this.closingHour;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PhysicalStoreOpened) && Intrinsics.areEqual((Object) this.closingHour, (Object) ((PhysicalStoreOpened) obj).closingHour);
        }

        public int hashCode() {
            return this.closingHour.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.closingHour;
            return "PhysicalStoreOpened(closingHour=" + str + ")";
        }
    }
}
