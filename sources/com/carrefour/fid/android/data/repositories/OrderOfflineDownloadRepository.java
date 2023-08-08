package com.carrefour.fid.android.data.repositories;

import android.content.Context;
import android.os.Build;
import androidx.annotation.C0344h1;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.constants.C36174e;
import com.carrefour.fid.android.data.provider.headers.C36571m;
import com.carrefour.fid.android.data.service.C36632k;
import com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.DownloadReceipt;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import java.io.InputStream;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class OrderOfflineDownloadRepository {

    /* renamed from: d */
    public static final int f90407d = 8;
    @C12579k

    /* renamed from: a */
    public final C36632k f90408a;
    @C12579k

    /* renamed from: b */
    public final C36571m f90409b;
    @C12579k

    /* renamed from: c */
    public final Context f90410c;

    @Inject
    public OrderOfflineDownloadRepository(@C12579k C36632k kVar, @C12579k C36571m mVar, @C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(kVar, "orderOfflineApiService");
        Intrinsics.checkNotNullParameter(mVar, "ordersHistoryHeaders");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f90408a = kVar;
        this.f90409b = mVar;
        this.f90410c = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111527a(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase.C37720a r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.data.repositories.OrderOfflineDownloadRepository$downloadBankReceipt$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.data.repositories.OrderOfflineDownloadRepository$downloadBankReceipt$1 r0 = (com.carrefour.fid.android.data.repositories.OrderOfflineDownloadRepository$downloadBankReceipt$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.OrderOfflineDownloadRepository$downloadBankReceipt$1 r0 = new com.carrefour.fid.android.data.repositories.OrderOfflineDownloadRepository$downloadBankReceipt$1
            r0.<init>(r7, r9)
        L_0x0018:
            r6 = r0
            java.lang.Object r9 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x003a
            if (r1 != r2) goto L_0x0032
            java.lang.Object r8 = r6.L$1
            com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase$a r8 = (com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase.C37720a) r8
            java.lang.Object r0 = r6.L$0
            com.carrefour.fid.android.data.repositories.OrderOfflineDownloadRepository r0 = (com.carrefour.fid.android.data.repositories.OrderOfflineDownloadRepository) r0
            kotlin.C11661u0.m45747n(r9)     // Catch:{ Exception -> 0x009d }
            goto L_0x0060
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003a:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.data.service.k r1 = r7.f90408a     // Catch:{ Exception -> 0x009d }
            com.carrefour.fid.android.data.provider.headers.m r9 = r7.f90409b     // Catch:{ Exception -> 0x009d }
            java.util.HashMap r9 = r9.mo111440a()     // Catch:{ Exception -> 0x009d }
            java.lang.String r3 = r8.mo114830i()     // Catch:{ Exception -> 0x009d }
            java.lang.String r4 = r8.mo114831j()     // Catch:{ Exception -> 0x009d }
            java.lang.String r5 = r8.mo114828h()     // Catch:{ Exception -> 0x009d }
            r6.L$0 = r7     // Catch:{ Exception -> 0x009d }
            r6.L$1 = r8     // Catch:{ Exception -> 0x009d }
            r6.label = r2     // Catch:{ Exception -> 0x009d }
            r2 = r9
            java.lang.Object r9 = r1.mo111650d(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x009d }
            if (r9 != r0) goto L_0x005f
            return r0
        L_0x005f:
            r0 = r7
        L_0x0060:
            retrofit2.w r9 = (retrofit2.C13091w) r9     // Catch:{ Exception -> 0x009d }
            java.lang.Object r1 = r9.mo30572a()     // Catch:{ Exception -> 0x009d }
            okhttp3.ResponseBody r1 = (okhttp3.ResponseBody) r1     // Catch:{ Exception -> 0x009d }
            boolean r2 = r9.mo30576g()     // Catch:{ Exception -> 0x009d }
            if (r2 == 0) goto L_0x0079
            if (r1 == 0) goto L_0x0079
            java.io.InputStream r9 = r1.byteStream()     // Catch:{ Exception -> 0x009d }
            java.lang.Object r8 = r0.mo111532f(r9, r8)     // Catch:{ Exception -> 0x009d }
            goto L_0x00ac
        L_0x0079:
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ Exception -> 0x009d }
            java.lang.String r8 = r8.mo114831j()     // Catch:{ Exception -> 0x009d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009d }
            r0.<init>()     // Catch:{ Exception -> 0x009d }
            java.lang.String r1 = "Error during downloading offline bank receipt for "
            r0.append(r1)     // Catch:{ Exception -> 0x009d }
            r0.append(r8)     // Catch:{ Exception -> 0x009d }
            java.lang.String r8 = r0.toString()     // Catch:{ Exception -> 0x009d }
            com.carrefour.fid.android.shared.io.ResponseThrowable r8 = com.carrefour.fid.android.core.extension.C36311i.m148971g(r9, r8)     // Catch:{ Exception -> 0x009d }
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)     // Catch:{ Exception -> 0x009d }
            java.lang.Object r8 = kotlin.Result.m38702b(r8)     // Catch:{ Exception -> 0x009d }
            goto L_0x00ac
        L_0x009d:
            r8 = move-exception
            kotlin.Result$a r9 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.ResponseThrowable r8 = com.carrefour.fid.android.shared.data.entities.extension.C28639a.m118564c(r8)
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
        L_0x00ac:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.OrderOfflineDownloadRepository.mo111527a(com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111528b(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase.C37720a r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.data.repositories.OrderOfflineDownloadRepository$downloadOrderBill$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.data.repositories.OrderOfflineDownloadRepository$downloadOrderBill$1 r0 = (com.carrefour.fid.android.data.repositories.OrderOfflineDownloadRepository$downloadOrderBill$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.OrderOfflineDownloadRepository$downloadOrderBill$1 r0 = new com.carrefour.fid.android.data.repositories.OrderOfflineDownloadRepository$downloadOrderBill$1
            r0.<init>(r7, r9)
        L_0x0018:
            r6 = r0
            java.lang.Object r9 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x003a
            if (r1 != r2) goto L_0x0032
            java.lang.Object r8 = r6.L$1
            com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase$a r8 = (com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase.C37720a) r8
            java.lang.Object r0 = r6.L$0
            com.carrefour.fid.android.data.repositories.OrderOfflineDownloadRepository r0 = (com.carrefour.fid.android.data.repositories.OrderOfflineDownloadRepository) r0
            kotlin.C11661u0.m45747n(r9)     // Catch:{ Exception -> 0x009d }
            goto L_0x0060
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003a:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.data.service.k r1 = r7.f90408a     // Catch:{ Exception -> 0x009d }
            com.carrefour.fid.android.data.provider.headers.m r9 = r7.f90409b     // Catch:{ Exception -> 0x009d }
            java.util.HashMap r9 = r9.mo111440a()     // Catch:{ Exception -> 0x009d }
            java.lang.String r3 = r8.mo114830i()     // Catch:{ Exception -> 0x009d }
            java.lang.String r4 = r8.mo114831j()     // Catch:{ Exception -> 0x009d }
            java.lang.String r5 = r8.mo114828h()     // Catch:{ Exception -> 0x009d }
            r6.L$0 = r7     // Catch:{ Exception -> 0x009d }
            r6.L$1 = r8     // Catch:{ Exception -> 0x009d }
            r6.label = r2     // Catch:{ Exception -> 0x009d }
            r2 = r9
            java.lang.Object r9 = r1.mo111647a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x009d }
            if (r9 != r0) goto L_0x005f
            return r0
        L_0x005f:
            r0 = r7
        L_0x0060:
            retrofit2.w r9 = (retrofit2.C13091w) r9     // Catch:{ Exception -> 0x009d }
            java.lang.Object r1 = r9.mo30572a()     // Catch:{ Exception -> 0x009d }
            okhttp3.ResponseBody r1 = (okhttp3.ResponseBody) r1     // Catch:{ Exception -> 0x009d }
            boolean r2 = r9.mo30576g()     // Catch:{ Exception -> 0x009d }
            if (r2 == 0) goto L_0x0079
            if (r1 == 0) goto L_0x0079
            java.io.InputStream r9 = r1.byteStream()     // Catch:{ Exception -> 0x009d }
            java.lang.Object r8 = r0.mo111532f(r9, r8)     // Catch:{ Exception -> 0x009d }
            goto L_0x00ac
        L_0x0079:
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ Exception -> 0x009d }
            java.lang.String r8 = r8.mo114831j()     // Catch:{ Exception -> 0x009d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009d }
            r0.<init>()     // Catch:{ Exception -> 0x009d }
            java.lang.String r1 = "Error during downloading offline order bill for "
            r0.append(r1)     // Catch:{ Exception -> 0x009d }
            r0.append(r8)     // Catch:{ Exception -> 0x009d }
            java.lang.String r8 = r0.toString()     // Catch:{ Exception -> 0x009d }
            com.carrefour.fid.android.shared.io.ResponseThrowable r8 = com.carrefour.fid.android.core.extension.C36311i.m148971g(r9, r8)     // Catch:{ Exception -> 0x009d }
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)     // Catch:{ Exception -> 0x009d }
            java.lang.Object r8 = kotlin.Result.m38702b(r8)     // Catch:{ Exception -> 0x009d }
            goto L_0x00ac
        L_0x009d:
            r8 = move-exception
            kotlin.Result$a r9 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.ResponseThrowable r8 = com.carrefour.fid.android.shared.data.entities.extension.C28639a.m118564c(r8)
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
        L_0x00ac:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.OrderOfflineDownloadRepository.mo111528b(com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: c */
    public final Context mo111529c() {
        return this.f90410c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        kotlin.p010io.C11133b.m42950a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        kotlin.p010io.C11133b.m42950a(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        throw r0;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111530d(java.io.InputStream r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = android.os.Environment.DIRECTORY_DOWNLOADS
            java.io.File r0 = android.os.Environment.getExternalStoragePublicDirectory(r0)
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "/carrefour"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r6)
            java.io.File r6 = r1.getParentFile()     // Catch:{ all -> 0x0046 }
            r6.mkdirs()     // Catch:{ all -> 0x0046 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ all -> 0x0046 }
            r6.<init>(r1)     // Catch:{ all -> 0x0046 }
            r0 = 0
            r2 = 2
            r3 = 0
            kotlin.p010io.C11131a.m42932l(r5, r6, r0, r2, r3)     // Catch:{ all -> 0x003f }
            kotlin.p010io.C11133b.m42950a(r6, r3)     // Catch:{ all -> 0x0046 }
            kotlin.p010io.C11133b.m42950a(r5, r3)
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.String r5 = r1.getAbsolutePath()
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        L_0x003f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r1 = move-exception
            kotlin.p010io.C11133b.m42950a(r6, r0)     // Catch:{ all -> 0x0046 }
            throw r1     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            kotlin.p010io.C11133b.m42950a(r5, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.OrderOfflineDownloadRepository.mo111530d(java.io.InputStream, java.lang.String):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        kotlin.p010io.C11133b.m42950a(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        kotlin.p010io.C11133b.m42950a(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        throw r0;
     */
    @androidx.annotation.C0376v0(29)
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111531e(java.io.InputStream r8, java.lang.String r9) {
        /*
            r7 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "_display_name"
            r0.put(r1, r9)
            java.lang.String r9 = "mime_type"
            java.lang.String r1 = "application/pdf"
            r0.put(r9, r1)
            java.lang.String r9 = android.os.Environment.DIRECTORY_DOWNLOADS
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            java.lang.String r9 = "/carrefour"
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            java.lang.String r1 = "relative_path"
            r0.put(r1, r9)
            android.content.Context r9 = r7.f90410c
            android.content.ContentResolver r1 = r9.getContentResolver()
            android.net.Uri r9 = android.provider.MediaStore.Downloads.EXTERNAL_CONTENT_URI
            android.net.Uri r2 = r1.insert(r9, r0)
            if (r2 == 0) goto L_0x0080
            java.io.OutputStream r9 = r1.openOutputStream(r2)     // Catch:{ all -> 0x0079 }
            r0 = 0
            if (r9 == 0) goto L_0x0055
            java.lang.String r3 = "output"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r3)     // Catch:{ all -> 0x004e }
            r3 = 8192(0x2000, float:1.14794E-41)
            kotlin.p010io.C11131a.m42931k(r8, r9, r3)     // Catch:{ all -> 0x004e }
            kotlin.p010io.C11133b.m42950a(r9, r0)     // Catch:{ all -> 0x0079 }
            goto L_0x0055
        L_0x004e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r1 = move-exception
            kotlin.p010io.C11133b.m42950a(r9, r0)     // Catch:{ all -> 0x0079 }
            throw r1     // Catch:{ all -> 0x0079 }
        L_0x0055:
            kotlin.p010io.C11133b.m42950a(r8, r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)
            if (r8 == 0) goto L_0x0080
            r8.moveToFirst()
            java.lang.String r9 = "_data"
            int r9 = r8.getColumnIndex(r9)
            java.lang.String r9 = r8.getString(r9)
            r8.close()
            kotlin.Result$a r8 = kotlin.Result.f28060a
            java.lang.Object r8 = kotlin.Result.m38702b(r9)
            return r8
        L_0x0079:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x007b }
        L_0x007b:
            r0 = move-exception
            kotlin.p010io.C11133b.m42950a(r8, r9)
            throw r0
        L_0x0080:
            kotlin.Result$a r8 = kotlin.Result.f28060a
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "Error during downloading offline order bill"
            r8.<init>(r9)
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.OrderOfflineDownloadRepository.mo111531e(java.io.InputStream, java.lang.String):java.lang.Object");
    }

    @C0344h1(otherwise = 2)
    @C12579k
    /* renamed from: f */
    public final Object mo111532f(@C12579k InputStream inputStream, @C12579k DownloadOrderBillAndBankReceiptOfflineUseCase.C37720a aVar) {
        String str;
        Intrinsics.checkNotNullParameter(inputStream, "input");
        Intrinsics.checkNotNullParameter(aVar, "param");
        if (aVar.mo114827g() instanceof DownloadReceipt.BillReceipt) {
            str = String.format(C36174e.f89289a, Arrays.copyOf(new Object[]{aVar.mo114828h(), aVar.mo114831j()}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        } else {
            str = String.format(C36174e.f89290b, Arrays.copyOf(new Object[]{aVar.mo114828h(), aVar.mo114831j()}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return mo111531e(inputStream, str);
        }
        return mo111530d(inputStream, str);
    }
}
