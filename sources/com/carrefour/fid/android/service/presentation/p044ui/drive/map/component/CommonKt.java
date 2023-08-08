package com.carrefour.fid.android.service.presentation.p044ui.drive.map.component;

import com.carrefour.fid.android.domain.models.service.models.DriveType;
import com.carrefour.fid.android.service.C28330R;
import kotlin.C11076d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, mo22516d2 = {"getDriveLabelId", "", "type", "Lcom/carrefour/fid/android/domain/models/service/models/DriveType;", "getFacilitiesLogo", "facilityName", "", "service_release"}, mo22517k = 2, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.component.CommonKt */
public final class CommonKt {

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.component.CommonKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.carrefour.fid.android.domain.models.service.models.DriveType[] r0 = com.carrefour.fid.android.domain.models.service.models.DriveType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.service.models.DriveType r1 = com.carrefour.fid.android.domain.models.service.models.DriveType.DRIVE_PEDESTRIAN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.service.models.DriveType r1 = com.carrefour.fid.android.domain.models.service.models.DriveType.DRIVE_LOCKER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.domain.models.service.models.DriveType r1 = com.carrefour.fid.android.domain.models.service.models.DriveType.DRIVE_IN_STORE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.carrefour.fid.android.domain.models.service.models.DriveType r1 = com.carrefour.fid.android.domain.models.service.models.DriveType.DRIVE_PARKING     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.p044ui.drive.map.component.CommonKt.WhenMappings.<clinit>():void");
        }
    }

    public static final int getDriveLabelId(@C12579k DriveType driveType) {
        Intrinsics.checkNotNullParameter(driveType, "type");
        int i = WhenMappings.$EnumSwitchMapping$0[driveType.ordinal()];
        if (i == 1) {
            return C28330R.string.drive_map_pedestrian;
        }
        if (i == 2) {
            return C28330R.string.drive_map_locker;
        }
        if (i == 3) {
            return C28330R.string.drive_map_in_store_pick;
        }
        if (i == 4) {
            return C28330R.string.drive_map_parking;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
        if (r1.equals(com.carrefour.fid.android.shared.presentation.p047ui.map.C28855a.f70691j) == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
        if (r1.equals(com.carrefour.fid.android.shared.presentation.p047ui.map.C28855a.f70685d) == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return com.carrefour.fid.android.service.C28330R.C28332drawable.ic_logo_carrefour;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return com.carrefour.fid.android.service.C28330R.C28332drawable.ic_crf_express_logo;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return com.carrefour.fid.android.service.C28330R.C28332drawable.ic_crf_market_logo;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r1.equals(com.carrefour.fid.android.shared.presentation.p047ui.map.C28855a.f70684c) == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r1.equals(com.carrefour.fid.android.shared.presentation.p047ui.map.C28855a.f70690i) == false) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int getFacilitiesLogo(@org.jetbrains.annotations.C12579k java.lang.String r1) {
        /*
            java.lang.String r0 = "facilityName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -2027976644: goto L_0x0077;
                case -1162676091: goto L_0x006b;
                case -1033870472: goto L_0x005f;
                case -734094995: goto L_0x0053;
                case -117562718: goto L_0x0047;
                case 65768: goto L_0x003b;
                case 780456706: goto L_0x002f;
                case 1300366525: goto L_0x0026;
                case 1673062174: goto L_0x0018;
                case 1773813039: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0083
        L_0x000e:
            java.lang.String r0 = "CARREFOUR MARKET"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0080
            goto L_0x0083
        L_0x0018:
            java.lang.String r0 = "CARREFOUR CITY"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0022
            goto L_0x0083
        L_0x0022:
            int r1 = com.carrefour.fid.android.service.C28330R.C28332drawable.ic_crf_city_logo
            goto L_0x0085
        L_0x0026:
            java.lang.String r0 = "CARREFOUR EXPRESS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0074
            goto L_0x0083
        L_0x002f:
            java.lang.String r0 = "BON APP"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0038
            goto L_0x0083
        L_0x0038:
            int r1 = com.carrefour.fid.android.service.C28330R.C28332drawable.ic_crf_bon_app_logo
            goto L_0x0085
        L_0x003b:
            java.lang.String r0 = "BIO"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0044
            goto L_0x0083
        L_0x0044:
            int r1 = com.carrefour.fid.android.service.C28330R.C28332drawable.ic_crf_bio_logo
            goto L_0x0085
        L_0x0047:
            java.lang.String r0 = "CONTACT MARCHE"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0050
            goto L_0x0083
        L_0x0050:
            int r1 = com.carrefour.fid.android.service.C28330R.C28332drawable.ic_crf_contact_logo
            goto L_0x0085
        L_0x0053:
            java.lang.String r0 = "CARREFOUR CONTACT"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x005c
            goto L_0x0083
        L_0x005c:
            int r1 = com.carrefour.fid.android.service.C28330R.C28332drawable.ic_crf_contact_logo
            goto L_0x0085
        L_0x005f:
            java.lang.String r0 = "CARREFOUR MONTAGNE"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0068
            goto L_0x0083
        L_0x0068:
            int r1 = com.carrefour.fid.android.service.C28330R.C28332drawable.ic_crf_montagne
            goto L_0x0085
        L_0x006b:
            java.lang.String r0 = "CORNER EXPRESS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0074
            goto L_0x0083
        L_0x0074:
            int r1 = com.carrefour.fid.android.service.C28330R.C28332drawable.ic_crf_express_logo
            goto L_0x0085
        L_0x0077:
            java.lang.String r0 = "MARKET"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0080
            goto L_0x0083
        L_0x0080:
            int r1 = com.carrefour.fid.android.service.C28330R.C28332drawable.ic_crf_market_logo
            goto L_0x0085
        L_0x0083:
            int r1 = com.carrefour.fid.android.service.C28330R.C28332drawable.ic_logo_carrefour
        L_0x0085:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.p044ui.drive.map.component.CommonKt.getFacilitiesLogo(java.lang.String):int");
    }
}
