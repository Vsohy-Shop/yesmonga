package com.carrefour.fid.android.domain.interactors.order;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import androidx.annotation.C0344h1;
import androidx.annotation.C0376v0;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.constants.C36174e;
import com.carrefour.fid.android.data.repositories.OrderOfflineDownloadRepository;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.DownloadReceipt;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import java.io.File;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public final class DownloadOrderBillAndBankReceiptOfflineUseCase implements C37679f<C37720a, String> {

    /* renamed from: c */
    public static final int f94653c = 8;
    @C12579k

    /* renamed from: a */
    public final OrderOfflineDownloadRepository f94654a;
    @C12579k

    /* renamed from: b */
    public final Context f94655b;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase$a */
    public static final class C37720a {

        /* renamed from: e */
        public static final int f94656e = 0;
        @C12579k

        /* renamed from: a */
        public final String f94657a;
        @C12579k

        /* renamed from: b */
        public final String f94658b;
        @C12579k

        /* renamed from: c */
        public final String f94659c;
        @C12579k

        /* renamed from: d */
        public final DownloadReceipt f94660d;

        public C37720a(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k DownloadReceipt downloadReceipt) {
            Intrinsics.checkNotNullParameter(str, "orderGln");
            Intrinsics.checkNotNullParameter(str2, "orderKey");
            Intrinsics.checkNotNullParameter(str3, "orderDate");
            Intrinsics.checkNotNullParameter(downloadReceipt, "downloadReceipt");
            this.f94657a = str;
            this.f94658b = str2;
            this.f94659c = str3;
            this.f94660d = downloadReceipt;
        }

        /* renamed from: f */
        public static /* synthetic */ C37720a m154604f(C37720a aVar, String str, String str2, String str3, DownloadReceipt downloadReceipt, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94657a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f94658b;
            }
            if ((i & 4) != 0) {
                str3 = aVar.f94659c;
            }
            if ((i & 8) != 0) {
                downloadReceipt = aVar.f94660d;
            }
            return aVar.mo114825e(str, str2, str3, downloadReceipt);
        }

        @C12579k
        /* renamed from: a */
        public final String mo114821a() {
            return this.f94657a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo114822b() {
            return this.f94658b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo114823c() {
            return this.f94659c;
        }

        @C12579k
        /* renamed from: d */
        public final DownloadReceipt mo114824d() {
            return this.f94660d;
        }

        @C12579k
        /* renamed from: e */
        public final C37720a mo114825e(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k DownloadReceipt downloadReceipt) {
            Intrinsics.checkNotNullParameter(str, "orderGln");
            Intrinsics.checkNotNullParameter(str2, "orderKey");
            Intrinsics.checkNotNullParameter(str3, "orderDate");
            Intrinsics.checkNotNullParameter(downloadReceipt, "downloadReceipt");
            return new C37720a(str, str2, str3, downloadReceipt);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37720a)) {
                return false;
            }
            C37720a aVar = (C37720a) obj;
            return Intrinsics.areEqual((Object) this.f94657a, (Object) aVar.f94657a) && Intrinsics.areEqual((Object) this.f94658b, (Object) aVar.f94658b) && Intrinsics.areEqual((Object) this.f94659c, (Object) aVar.f94659c) && Intrinsics.areEqual((Object) this.f94660d, (Object) aVar.f94660d);
        }

        @C12579k
        /* renamed from: g */
        public final DownloadReceipt mo114827g() {
            return this.f94660d;
        }

        @C12579k
        /* renamed from: h */
        public final String mo114828h() {
            return this.f94659c;
        }

        public int hashCode() {
            return (((((this.f94657a.hashCode() * 31) + this.f94658b.hashCode()) * 31) + this.f94659c.hashCode()) * 31) + this.f94660d.hashCode();
        }

        @C12579k
        /* renamed from: i */
        public final String mo114830i() {
            return this.f94657a;
        }

        @C12579k
        /* renamed from: j */
        public final String mo114831j() {
            return this.f94658b;
        }

        @C12579k
        public String toString() {
            String str = this.f94657a;
            String str2 = this.f94658b;
            String str3 = this.f94659c;
            DownloadReceipt downloadReceipt = this.f94660d;
            return "Param(orderGln=" + str + ", orderKey=" + str2 + ", orderDate=" + str3 + ", downloadReceipt=" + downloadReceipt + ")";
        }
    }

    @Inject
    public DownloadOrderBillAndBankReceiptOfflineUseCase(@C12579k OrderOfflineDownloadRepository orderOfflineDownloadRepository, @C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(orderOfflineDownloadRepository, "orderOfflineDownloadRepository");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f94654a = orderOfflineDownloadRepository;
        this.f94655b = context;
    }

    @C0344h1(otherwise = 2)
    @C12580l
    /* renamed from: a */
    public final String mo114816a(@C12579k C37720a aVar) {
        String str;
        Intrinsics.checkNotNullParameter(aVar, "param");
        if (aVar.mo114827g() instanceof DownloadReceipt.BillReceipt) {
            str = String.format(C36174e.f89289a, Arrays.copyOf(new Object[]{aVar.mo114828h(), aVar.mo114831j()}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        } else {
            str = String.format(C36174e.f89290b, Arrays.copyOf(new Object[]{aVar.mo114828h(), aVar.mo114831j()}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return mo114818c(str);
        }
        return mo114817b(str);
    }

    /* renamed from: b */
    public final String mo114817b(String str) {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        File file = new File(externalStoragePublicDirectory + C36174e.f89294f, str);
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        return null;
    }

    @C0376v0(29)
    /* renamed from: c */
    public final String mo114818c(String str) {
        Cursor query = this.f94655b.getContentResolver().query(MediaStore.Downloads.EXTERNAL_CONTENT_URI, new String[]{C36174e.f89292d}, "_display_name LIKE ?", new String[]{str}, (String) null);
        if (query == null || query.getCount() <= 0) {
            return null;
        }
        query.moveToFirst();
        String string = query.getString(query.getColumnIndex(C36174e.f89292d));
        query.close();
        return string;
    }

    @C12579k
    /* renamed from: d */
    public final Context mo114819d() {
        return this.f94655b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172977invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase.C37720a r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase$invoke$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.mo21858l()
            goto L_0x0078
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.mo21858l()
            goto L_0x006c
        L_0x0044:
            kotlin.C11661u0.m45747n(r7)
            java.lang.String r7 = r5.mo114816a(r6)
            if (r7 == 0) goto L_0x0056
            int r2 = r7.length()
            if (r2 != 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r2 = 0
            goto L_0x0057
        L_0x0056:
            r2 = r4
        L_0x0057:
            if (r2 == 0) goto L_0x0079
            com.carrefour.fid.android.presentation.ui.orders.offline.model.DownloadReceipt r7 = r6.mo114827g()
            boolean r7 = r7 instanceof com.carrefour.fid.android.presentation.p035ui.orders.offline.model.DownloadReceipt.BillReceipt
            if (r7 == 0) goto L_0x006d
            com.carrefour.fid.android.data.repositories.OrderOfflineDownloadRepository r7 = r5.f94654a
            r0.label = r4
            java.lang.Object r6 = r7.mo111528b(r6, r0)
            if (r6 != r1) goto L_0x006c
            return r1
        L_0x006c:
            return r6
        L_0x006d:
            com.carrefour.fid.android.data.repositories.OrderOfflineDownloadRepository r7 = r5.f94654a
            r0.label = r3
            java.lang.Object r6 = r7.mo111527a(r6, r0)
            if (r6 != r1) goto L_0x0078
            return r1
        L_0x0078:
            return r6
        L_0x0079:
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.Result.m38702b(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase.m172977invokegIAlus(com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
