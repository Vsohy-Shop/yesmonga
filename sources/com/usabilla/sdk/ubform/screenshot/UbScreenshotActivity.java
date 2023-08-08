package com.usabilla.sdk.ubform.screenshot;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0302g;
import androidx.activity.result.contract.C0268b;
import androidx.appcompat.app.C0475e;
import androidx.compose.runtime.C8698y1;
import androidx.core.content.C17339i;
import androidx.fragment.app.C19234h0;
import androidx.fragment.app.Fragment;
import com.urbanairship.automation.C8814b;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.Logger;
import com.usabilla.sdk.ubform.screenshot.annotation.UbAnnotationFragment;
import com.usabilla.sdk.ubform.sdk.UbScreenshot;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.io.File;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 22\u00020\u0001:\u0001;B\u0007¢\u0006\u0004\b9\u0010:J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J/\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0016H\u0002J \u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J \u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0002R\u0014\u0010\"\u001a\u00020\u00068\u0002XD¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\t8\u0002XD¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\t8\u0002XD¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u0014\u0010,\u001a\u00020\t8\u0002XD¢\u0006\u0006\n\u0004\b\u001a\u0010)R\u001d\u00100\u001a\u0004\u0018\u00010-8BX\u0002¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b.\u0010/R\u001b\u00104\u001a\u0002018BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010$\u001a\u0004\b2\u00103R\"\u00108\u001a\u0010\u0012\f\u0012\n 6*\u0004\u0018\u00010\u00190\u0019058\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u00107¨\u0006<"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/screenshot/UbScreenshotActivity;", "Landroidx/appcompat/app/e;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onCreate", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Landroidx/fragment/app/Fragment;", "fragment", "g1", "a1", "Landroid/content/Context;", "context", "X0", "", "d1", "hasCameraPermission", "Landroid/content/Intent;", "Y0", "height", "width", "rotation", "f1", "e1", "U0", "I", "cameraPermissionRequestCode", "V0", "Lkotlin/z;", "Z0", "()Ljava/lang/String;", "fileProviderPath", "W0", "Ljava/lang/String;", "tempImageName", "tempImageSuffix", "typeGalleryIntent", "Ljava/io/File;", "b1", "()Ljava/io/File;", "tempCameraFile", "Lcom/usabilla/sdk/ubform/sdk/form/model/UbInternalTheme;", "c1", "()Lcom/usabilla/sdk/ubform/sdk/form/model/UbInternalTheme;", "theme", "Landroidx/activity/result/g;", "kotlin.jvm.PlatformType", "Landroidx/activity/result/g;", "cameraResultListener", "<init>", "()V", "a", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class UbScreenshotActivity extends C0475e {
    @C12579k

    /* renamed from: c1 */
    public static final C9881a f27094c1 = new C9881a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: d1 */
    public static final String f27095d1 = "extra_theme";
    @C12579k

    /* renamed from: e1 */
    public static final String f27096e1 = "extra_screenshot";

    /* renamed from: f1 */
    public static final int f27097f1 = 1001;
    @C12579k

    /* renamed from: g1 */
    public static final String f27098g1 = "args_theme";

    /* renamed from: U0 */
    public final int f27099U0 = 123;
    @C12579k

    /* renamed from: V0 */
    public final C11677z f27100V0 = C10864b0.m38748c(new UbScreenshotActivity$fileProviderPath$2(this));
    @C12579k

    /* renamed from: W0 */
    public final String f27101W0 = "tempImageName";
    @C12579k

    /* renamed from: X0 */
    public final String f27102X0 = ".jpg";
    @C12579k

    /* renamed from: Y0 */
    public final String f27103Y0 = "image/*";
    @C12579k

    /* renamed from: Z0 */
    public final C11677z f27104Z0 = C10864b0.m38748c(new UbScreenshotActivity$tempCameraFile$2(this));
    @C12579k

    /* renamed from: a1 */
    public final C11677z f27105a1 = C10864b0.m38748c(new UbScreenshotActivity$theme$2(this));
    @C12579k

    /* renamed from: b1 */
    public final C0302g<Intent> f27106b1;

    /* renamed from: com.usabilla.sdk.ubform.screenshot.UbScreenshotActivity$a */
    public static final class C9881a {
        public /* synthetic */ C9881a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m37045b(C9881a aVar, Fragment fragment, int i, UbInternalTheme ubInternalTheme, UbScreenshot ubScreenshot, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                ubScreenshot = null;
            }
            aVar.mo20370a(fragment, i, ubInternalTheme, ubScreenshot);
        }

        /* renamed from: a */
        public final void mo20370a(@C12579k Fragment fragment, int i, @C12579k UbInternalTheme ubInternalTheme, @C12580l UbScreenshot ubScreenshot) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(ubInternalTheme, C10108c.f27794S);
            Intent intent = new Intent(fragment.requireContext(), UbScreenshotActivity.class);
            intent.putExtra(UbScreenshotActivity.f27095d1, ubInternalTheme);
            intent.putExtra(UbScreenshotActivity.f27096e1, ubScreenshot);
            intent.addFlags(C8698y1.f23302n);
            fragment.startActivityForResult(intent, i);
        }

        public C9881a() {
        }
    }

    public UbScreenshotActivity() {
        C0302g<Intent> registerForActivityResult = registerForActivityResult(new C0268b.C0290m(), new C9882a(this));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->\n            if (result.resultCode == Activity.RESULT_OK) {\n                result.data?.dataString?.let {\n                    showAnnotationFragment(\n                        UbAnnotationFragment.newInstance(Uri.parse(it), UbImageSource.GALLERY)\n                    )\n                    return@registerForActivityResult\n                }\n                tempCameraFile?.let {\n                    showAnnotationFragment(\n                        UbAnnotationFragment.newInstance(Uri.fromFile(it), UbImageSource.CAMERA)\n                    )\n                }\n            } else {\n                finish()\n            }\n        }");
        this.f27106b1 = registerForActivityResult;
    }

    /* renamed from: W0 */
    public static final void m37034W0(UbScreenshotActivity ubScreenshotActivity, ActivityResult activityResult) {
        String dataString;
        Intrinsics.checkNotNullParameter(ubScreenshotActivity, "this$0");
        if (activityResult.mo855b() == -1) {
            Intent a = activityResult.mo854a();
            if (a == null || (dataString = a.getDataString()) == null) {
                File b1 = ubScreenshotActivity.mo20364b1();
                if (b1 != null) {
                    UbAnnotationFragment.C9883a aVar = UbAnnotationFragment.f27114z;
                    Uri fromFile = Uri.fromFile(b1);
                    Intrinsics.checkNotNullExpressionValue(fromFile, "fromFile(it)");
                    ubScreenshotActivity.mo20369g1(aVar.mo20386a(fromFile, UbImageSource.CAMERA));
                    return;
                }
                return;
            }
            UbAnnotationFragment.C9883a aVar2 = UbAnnotationFragment.f27114z;
            Uri parse = Uri.parse(dataString);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(it)");
            ubScreenshotActivity.mo20369g1(aVar2.mo20386a(parse, UbImageSource.GALLERY));
            return;
        }
        ubScreenshotActivity.finish();
    }

    /* renamed from: X0 */
    public final void mo20360X0(Context context) {
        File file = new File(context.getExternalCacheDir(), this.f27101W0);
        if (file.exists()) {
            file.delete();
        }
    }

    /* renamed from: Y0 */
    public final Intent mo20361Y0(Context context, boolean z) {
        mo20360X0(context);
        Intent intent = new Intent();
        intent.setType(this.f27103Y0);
        intent.setAction("android.intent.action.PICK");
        intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
        intent.addFlags(C8698y1.f23302n);
        if (!z || mo20364b1() == null) {
            return Intent.createChooser(intent, getString(C9747c.C9761n.ub_pick_image));
        }
        Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
        intent2.putExtra("return-data", true);
        String Z0 = mo20362Z0();
        File b1 = mo20364b1();
        Intrinsics.checkNotNull(b1);
        intent2.putExtra("output", C17339i.m79773f(context, Z0, b1));
        Intent createChooser = Intent.createChooser(intent, getString(C9747c.C9761n.ub_pick_image));
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) new Intent[]{intent2});
        return createChooser;
    }

    /* renamed from: Z0 */
    public final String mo20362Z0() {
        return (String) this.f27100V0.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        if (r1 != 3) goto L_0x0060;
     */
    /* renamed from: a1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo20363a1() {
        /*
            r10 = this;
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            r3 = 0
            if (r1 < r2) goto L_0x0023
            android.view.Display r1 = r10.getDisplay()
            if (r1 != 0) goto L_0x0013
            goto L_0x0016
        L_0x0013:
            r1.getRealMetrics(r0)
        L_0x0016:
            android.view.Display r1 = r10.getDisplay()
            if (r1 != 0) goto L_0x001e
            r1 = r3
            goto L_0x0032
        L_0x001e:
            int r1 = r1.getRotation()
            goto L_0x0032
        L_0x0023:
            android.view.WindowManager r1 = r10.getWindowManager()
            android.view.Display r1 = r1.getDefaultDisplay()
            r1.getMetrics(r0)
            int r1 = r1.getRotation()
        L_0x0032:
            int r2 = r0.widthPixels
            int r0 = r0.heightPixels
            boolean r4 = r10.mo20368f1(r0, r2, r1)
            r5 = 8
            r6 = 9
            r7 = 3
            r8 = 2
            r9 = 1
            if (r4 != 0) goto L_0x0053
            boolean r0 = r10.mo20367e1(r0, r2, r1)
            if (r0 == 0) goto L_0x004a
            goto L_0x0053
        L_0x004a:
            if (r1 == 0) goto L_0x0061
            if (r1 == r9) goto L_0x0060
            if (r1 == r8) goto L_0x005c
            if (r1 == r7) goto L_0x005e
            goto L_0x0061
        L_0x0053:
            if (r1 == 0) goto L_0x0060
            if (r1 == r9) goto L_0x0061
            if (r1 == r8) goto L_0x005e
            if (r1 == r7) goto L_0x005c
            goto L_0x0060
        L_0x005c:
            r3 = r5
            goto L_0x0061
        L_0x005e:
            r3 = r6
            goto L_0x0061
        L_0x0060:
            r3 = r9
        L_0x0061:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.screenshot.UbScreenshotActivity.mo20363a1():int");
    }

    /* renamed from: b1 */
    public final File mo20364b1() {
        return (File) this.f27104Z0.getValue();
    }

    /* renamed from: c1 */
    public final UbInternalTheme mo20365c1() {
        return (UbInternalTheme) this.f27105a1.getValue();
    }

    /* renamed from: d1 */
    public final boolean mo20366d1() {
        try {
            String[] strArr = getPackageManager().getPackageInfo(getPackageName(), 4096).requestedPermissions;
            Intrinsics.checkNotNullExpressionValue(strArr, "pckInfo.requestedPermissions");
            for (String areEqual : strArr) {
                if (Intrinsics.areEqual((Object) areEqual, (Object) "android.permission.CAMERA")) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.f26647a.logInfo("Could not determine whether Camera permissions are defined on the manifest");
            return false;
        }
    }

    /* renamed from: e1 */
    public final boolean mo20367e1(int i, int i2, int i3) {
        return (i3 == 1 || i3 == 3) && i2 > i;
    }

    /* renamed from: f1 */
    public final boolean mo20368f1(int i, int i2, int i3) {
        return (i3 == 0 || i3 == 2) && i > i2;
    }

    /* renamed from: g1 */
    public final void mo20369g1(Fragment fragment) {
        C19234h0 u = mo57175g0().mo56909u();
        int i = C9747c.C9756i.ub_screenshot_container;
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putParcelable(f27098g1, mo20365c1());
        C11079d2 d2Var = C11079d2.f28267a;
        fragment.setArguments(arguments);
        u.mo57201C(i, fragment).mo57053r();
    }

    public void onCreate(@C12580l Bundle bundle) {
        C11079d2 d2Var;
        super.onCreate(bundle);
        setRequestedOrientation(mo20363a1());
        setContentView(C9747c.C9759l.ub_activity_screenshot);
        mo20365c1().initializeFont(this);
        UbScreenshot ubScreenshot = (UbScreenshot) getIntent().getParcelableExtra(f27096e1);
        if (ubScreenshot == null) {
            d2Var = null;
        } else {
            UbAnnotationFragment.C9883a aVar = UbAnnotationFragment.f27114z;
            Uri parse = Uri.parse(ubScreenshot.mo20547f());
            Intrinsics.checkNotNullExpressionValue(parse, "parse(it.imageSource)");
            mo20369g1(aVar.mo20386a(parse, UbImageSource.SCREENSHOT));
            d2Var = C11079d2.f28267a;
        }
        if (d2Var != null || bundle != null) {
            return;
        }
        if (!mo20366d1() || checkSelfPermission("android.permission.CAMERA") == 0) {
            this.f27106b1.mo960b(mo20361Y0(this, true));
        } else {
            requestPermissions(new String[]{"android.permission.CAMERA"}, this.f27099U0);
        }
    }

    public void onRequestPermissionsResult(int i, @C12579k String[] strArr, @C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, C8814b.f23598I0);
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != this.f27099U0) {
            return;
        }
        if (iArr[0] == 0) {
            this.f27106b1.mo960b(mo20361Y0(this, true));
        } else {
            this.f27106b1.mo960b(mo20361Y0(this, false));
        }
    }
}
