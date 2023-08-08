package com.carrefour.fid.android.catalogs.domain.interactors;

import android.content.Context;
import com.carrefour.fid.android.domain.interactors.account.C37518d;
import com.carrefour.fid.android.domain.interactors.catalog.C37610b;
import com.carrefour.fid.android.domain.interactors.criteo.C37668h;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37832c;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.domain.interactors.user.C37886i;
import com.carrefour.fid.android.performance.C38328d;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11602d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BS\b\u0007\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b(\u0010)J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0002H\u0002J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ\n\u0010\f\u001a\u00020\u0002*\u00020\u0002R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006*"}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/domain/interactors/CatalogsGetCatalogActionUseCase;", "Lcom/carrefour/fid/android/domain/interactors/catalog/b;", "", "input", "algorithm", "hashString", "formatAnabelKey", "Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/catalog/a;", "invoke-IoAF18A", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "sha256", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/c;", "getFavoriteStore", "Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/c;", "Lcom/carrefour/fid/android/domain/interactors/remoteconfig/b;", "remoteConfigUseCase", "Lcom/carrefour/fid/android/domain/interactors/remoteconfig/b;", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "appEnvironment", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "Lcom/carrefour/fid/android/domain/interactors/user/i;", "isUserConnectedUseCase", "Lcom/carrefour/fid/android/domain/interactors/user/i;", "Lcom/carrefour/fid/android/domain/interactors/criteo/h;", "isCriteoPrivacyAcceptedUseCase", "Lcom/carrefour/fid/android/domain/interactors/criteo/h;", "Lcom/carrefour/fid/android/domain/interactors/account/d;", "getUserUidIamUseCase", "Lcom/carrefour/fid/android/domain/interactors/account/d;", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "getUSerInfoUseCase", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "Lcom/carrefour/fid/android/performance/d;", "performance", "Lcom/carrefour/fid/android/performance/d;", "<init>", "(Landroid/content/Context;Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/c;Lcom/carrefour/fid/android/domain/interactors/remoteconfig/b;Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;Lcom/carrefour/fid/android/domain/interactors/user/i;Lcom/carrefour/fid/android/domain/interactors/criteo/h;Lcom/carrefour/fid/android/domain/interactors/account/d;Lcom/carrefour/fid/android/domain/interactors/user/e;Lcom/carrefour/fid/android/performance/d;)V", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCatalogsGetCatalogActionUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogsGetCatalogActionUseCase.kt\ncom/carrefour/fid/android/catalogs/domain/interactors/CatalogsGetCatalogActionUseCase\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,120:1\n13004#2,3:121\n*S KotlinDebug\n*F\n+ 1 CatalogsGetCatalogActionUseCase.kt\ncom/carrefour/fid/android/catalogs/domain/interactors/CatalogsGetCatalogActionUseCase\n*L\n108#1:121,3\n*E\n"})
public final class CatalogsGetCatalogActionUseCase implements C37610b {
    @C12579k
    private final AppEnvironment appEnvironment;
    @C12579k
    private final Context context;
    @C12579k
    private final C37832c getFavoriteStore;
    @C12579k
    private final C37878e getUSerInfoUseCase;
    @C12579k
    private final C37518d getUserUidIamUseCase;
    @C12579k
    private final C37668h isCriteoPrivacyAcceptedUseCase;
    @C12579k
    private final C37886i isUserConnectedUseCase;
    @C12579k
    private final C38328d performance;
    @C12579k
    private final C37807b remoteConfigUseCase;

    @Inject
    public CatalogsGetCatalogActionUseCase(@C10255b @C12579k Context context2, @C12579k C37832c cVar, @C12579k C37807b bVar, @C12579k AppEnvironment appEnvironment2, @C12579k C37886i iVar, @C12579k C37668h hVar, @C12579k C37518d dVar, @C12579k C37878e eVar, @C12579k C38328d dVar2) {
        Intrinsics.checkNotNullParameter(context2, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(cVar, "getFavoriteStore");
        Intrinsics.checkNotNullParameter(bVar, "remoteConfigUseCase");
        Intrinsics.checkNotNullParameter(appEnvironment2, "appEnvironment");
        Intrinsics.checkNotNullParameter(iVar, "isUserConnectedUseCase");
        Intrinsics.checkNotNullParameter(hVar, "isCriteoPrivacyAcceptedUseCase");
        Intrinsics.checkNotNullParameter(dVar, "getUserUidIamUseCase");
        Intrinsics.checkNotNullParameter(eVar, "getUSerInfoUseCase");
        Intrinsics.checkNotNullParameter(dVar2, "performance");
        this.context = context2;
        this.getFavoriteStore = cVar;
        this.remoteConfigUseCase = bVar;
        this.appEnvironment = appEnvironment2;
        this.isUserConnectedUseCase = iVar;
        this.isCriteoPrivacyAcceptedUseCase = hVar;
        this.getUserUidIamUseCase = dVar;
        this.getUSerInfoUseCase = eVar;
        this.performance = dVar2;
    }

    private final String formatAnabelKey(String str) {
        while (str.length() < 4) {
            str = "0" + str;
        }
        return str;
    }

    private final String hashString(String str, String str2) {
        MessageDigest instance = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(C11602d.f28868b);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] digest = instance.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "getInstance(algorithm)\n …gest(input.toByteArray())");
        int length = digest.length;
        String str3 = "";
        for (int i = 0; i < length; i++) {
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(digest[i])}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
            str3 = str3 + format;
        }
        return str3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x018e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173096invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends com.carrefour.fid.android.domain.models.catalog.C37976a>> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogActionUseCase$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogActionUseCase$invoke$1 r2 = (com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogActionUseCase$invoke$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogActionUseCase$invoke$1 r2 = new com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogActionUseCase$invoke$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            if (r4 == 0) goto L_0x00ba
            if (r4 == r9) goto L_0x00a8
            if (r4 == r8) goto L_0x0094
            if (r4 == r7) goto L_0x0076
            if (r4 == r6) goto L_0x0055
            if (r4 != r5) goto L_0x004d
            java.lang.Object r3 = r2.L$3
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3
            java.lang.Object r4 = r2.L$1
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogActionUseCase r2 = (com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogActionUseCase) r2
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x01d5
        L_0x004d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0055:
            java.lang.Object r4 = r2.L$4
            java.lang.Object r6 = r2.L$3
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref.ObjectRef) r6
            java.lang.Object r7 = r2.L$2
            java.lang.Object r8 = r2.L$1
            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
            java.lang.Object r9 = r2.L$0
            com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogActionUseCase r9 = (com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogActionUseCase) r9
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            r16 = r7
            r7 = r4
            r4 = r8
            r8 = r16
            goto L_0x0198
        L_0x0076:
            java.lang.Object r4 = r2.L$3
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            java.lang.Object r7 = r2.L$2
            java.lang.Object r11 = r2.L$1
            kotlin.jvm.internal.Ref$ObjectRef r11 = (kotlin.jvm.internal.Ref.ObjectRef) r11
            java.lang.Object r12 = r2.L$0
            com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogActionUseCase r12 = (com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogActionUseCase) r12
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            r16 = r4
            r4 = r1
            r1 = r16
            goto L_0x0132
        L_0x0094:
            java.lang.Object r4 = r2.L$1
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            java.lang.Object r11 = r2.L$0
            com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogActionUseCase r11 = (com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogActionUseCase) r11
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
        L_0x00a5:
            r12 = r11
            r11 = r4
            goto L_0x00f9
        L_0x00a8:
            java.lang.Object r4 = r2.L$1
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            java.lang.Object r11 = r2.L$0
            com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogActionUseCase r11 = (com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogActionUseCase) r11
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x00d9
        L_0x00ba:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.performance.d r1 = r0.performance
            java.lang.String r4 = "get_catalogs"
            r1.mo121195d(r4)
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            com.carrefour.fid.android.domain.interactors.service.physicalstore.c r1 = r0.getFavoriteStore
            r2.L$0 = r0
            r2.L$1 = r4
            r2.label = r9
            java.lang.Object r1 = r1.m172965invokeIoAF18A(r2)
            if (r1 != r3) goto L_0x00d8
            return r3
        L_0x00d8:
            r11 = r0
        L_0x00d9:
            boolean r12 = kotlin.Result.m38710j(r1)
            if (r12 == 0) goto L_0x00e3
            com.carrefour.fid.android.domain.models.service.models.l r1 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r1
            r4.element = r1
        L_0x00e3:
            com.carrefour.fid.android.domain.interactors.remoteconfig.b r1 = r11.remoteConfigUseCase
            com.carrefour.fid.android.domain.interactors.remoteconfig.b$a r12 = new com.carrefour.fid.android.domain.interactors.remoteconfig.b$a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r13 = com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.WebViewCatalog
            r12.<init>(r13)
            r2.L$0 = r11
            r2.L$1 = r4
            r2.label = r8
            java.lang.Object r1 = r1.m172966invokegIAlus(r12, r2)
            if (r1 != r3) goto L_0x00a5
            return r3
        L_0x00f9:
            boolean r4 = kotlin.Result.m38710j(r1)
            if (r4 == 0) goto L_0x0250
            r4 = r1
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r4.booleanValue()
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            com.carrefour.fid.android.shared.util.environment.AppEnvironment r13 = r12.appEnvironment
            java.lang.String r13 = r13.mo84168h()
            r4.element = r13
            com.carrefour.fid.android.domain.interactors.criteo.h r13 = r12.isCriteoPrivacyAcceptedUseCase
            com.carrefour.fid.android.domain.interactors.criteo.h$a r14 = new com.carrefour.fid.android.domain.interactors.criteo.h$a
            android.content.Context r15 = r12.context
            r14.<init>(r15)
            r2.L$0 = r12
            r2.L$1 = r11
            r2.L$2 = r1
            r2.L$3 = r4
            r2.label = r7
            java.lang.Object r7 = r13.m172966invokegIAlus(r14, r2)
            if (r7 != r3) goto L_0x012c
            return r3
        L_0x012c:
            r16 = r7
            r7 = r1
            r1 = r4
            r4 = r16
        L_0x0132:
            boolean r13 = kotlin.Result.m38710j(r4)
            if (r13 == 0) goto L_0x0209
            r13 = r4
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x0209
            android.content.Context r13 = r12.context
            android.content.ContentResolver r13 = r13.getContentResolver()
            java.lang.String r14 = "android_id"
            java.lang.String r13 = android.provider.Settings.Secure.getString(r13, r14)
            java.lang.String r14 = "sid"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r14)
            int r14 = r13.length()
            if (r14 <= 0) goto L_0x0159
            goto L_0x015a
        L_0x0159:
            r9 = 0
        L_0x015a:
            if (r9 == 0) goto L_0x017a
            T r9 = r1.element
            com.carrefour.fid.android.shared.util.type.HashType r14 = com.carrefour.fid.android.shared.util.type.HashType.SHA_ONE
            java.lang.String r8 = com.carrefour.fid.android.shared.extension.StringKt.m118899H(r13, r14, r10, r8, r10)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r9)
            java.lang.String r9 = "&sid="
            r13.append(r9)
            r13.append(r8)
            java.lang.String r8 = r13.toString()
            r1.element = r8
        L_0x017a:
            com.carrefour.fid.android.domain.interactors.user.i r8 = r12.isUserConnectedUseCase
            r2.L$0 = r12
            r2.L$1 = r11
            r2.L$2 = r7
            r2.L$3 = r1
            r2.L$4 = r4
            r2.label = r6
            java.lang.Object r6 = r8.m172965invokeIoAF18A(r2)
            if (r6 != r3) goto L_0x018f
            return r3
        L_0x018f:
            r8 = r7
            r9 = r12
            r7 = r4
            r4 = r11
            r16 = r6
            r6 = r1
            r1 = r16
        L_0x0198:
            boolean r1 = kotlin.Result.m38710j(r1)
            if (r1 == 0) goto L_0x0206
            com.carrefour.fid.android.domain.interactors.account.d r1 = r9.getUserUidIamUseCase
            java.lang.String r1 = r1.invoke()
            T r11 = r6.element
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r11 = "&cid="
            r12.append(r11)
            r12.append(r1)
            java.lang.String r1 = r12.toString()
            r6.element = r1
            com.carrefour.fid.android.domain.interactors.user.e r1 = r9.getUSerInfoUseCase
            com.carrefour.fid.android.domain.interactors.user.e$a r11 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r2.L$0 = r9
            r2.L$1 = r4
            r2.L$2 = r8
            r2.L$3 = r6
            r2.L$4 = r7
            r2.label = r5
            java.lang.Object r1 = r1.m172966invokegIAlus(r11, r2)
            if (r1 != r3) goto L_0x01d3
            return r3
        L_0x01d3:
            r3 = r6
            r2 = r9
        L_0x01d5:
            boolean r5 = kotlin.Result.m38709i(r1)
            if (r5 == 0) goto L_0x01dc
            r1 = r10
        L_0x01dc:
            com.carrefour.fid.android.domain.models.account.AccountInfo r1 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r1
            if (r1 == 0) goto L_0x01e4
            java.lang.String r10 = r1.mo116663r()
        L_0x01e4:
            if (r10 == 0) goto L_0x0202
            T r1 = r3.element
            java.lang.String r5 = r2.sha256(r10)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            java.lang.String r1 = "&mail="
            r6.append(r1)
            r6.append(r5)
            java.lang.String r1 = r6.toString()
            r3.element = r1
        L_0x0202:
            r12 = r2
            r1 = r3
            r11 = r4
            goto L_0x0209
        L_0x0206:
            r11 = r4
            r1 = r6
            r12 = r9
        L_0x0209:
            com.carrefour.fid.android.performance.d r2 = r12.performance
            r2.mo121196e()
            T r2 = r11.element
            com.carrefour.fid.android.domain.models.service.models.l r2 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r2
            if (r2 == 0) goto L_0x0240
            java.lang.String r2 = r2.mo119393w()
            java.lang.String r2 = r12.formatAnabelKey(r2)
            T r3 = r1.element
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "&codeMagasin="
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.element = r2
            kotlin.Result$a r1 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.models.catalog.e r1 = new com.carrefour.fid.android.domain.models.catalog.e
            r1.<init>(r2)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        L_0x0240:
            kotlin.Result$a r2 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.models.catalog.e r2 = new com.carrefour.fid.android.domain.models.catalog.e
            T r1 = r1.element
            java.lang.String r1 = (java.lang.String) r1
            r2.<init>(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r2)
            return r1
        L_0x0250:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r1)
            if (r1 == 0) goto L_0x026d
            T r1 = r11.element
            com.carrefour.fid.android.domain.models.service.models.l r1 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r1
            if (r1 == 0) goto L_0x026d
            com.carrefour.fid.android.performance.d r1 = r12.performance
            r1.mo121196e()
            kotlin.Result$a r1 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.models.catalog.d r1 = new com.carrefour.fid.android.domain.models.catalog.d
            r1.<init>()
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        L_0x026d:
            com.carrefour.fid.android.performance.d r1 = r12.performance
            r1.mo121196e()
            kotlin.Result$a r1 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.models.catalog.d r1 = new com.carrefour.fid.android.domain.models.catalog.d
            r1.<init>()
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogActionUseCase.m173096invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    public final String sha256(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return hashString(str, "SHA-256");
    }
}
