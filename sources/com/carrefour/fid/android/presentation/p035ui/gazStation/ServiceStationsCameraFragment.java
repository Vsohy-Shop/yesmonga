package com.carrefour.fid.android.presentation.p035ui.gazStation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.constants.C36185p;
import com.carrefour.fid.android.databinding.C36802q3;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.p035ui.gazStation.C24032k;
import com.carrefour.fid.android.presentation.viewmodels.gazStation.C26350a;
import com.carrefour.fid.android.shared.constant.C28539g;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.util.ImageUtils;
import com.carrefour.fid.android.widget.C22840a;
import com.carrefour.fid.android.widget.CameraPreview;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.C11384m;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b,\u0010-J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u0007H\u0002J\b\u0010\r\u001a\u00020\u0007H\u0002J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u0007H\u0002J\b\u0010\u0011\u001a\u00020\u0007H\u0003J\b\u0010\u0012\u001a\u00020\u0007H\u0002J\b\u0010\u0013\u001a\u00020\u0007H\u0002J\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u00060"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/gazStation/ServiceStationsCameraFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/q3;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "onResume", "onPause", "onDestroy", "b1", "Y0", "Landroid/hardware/Camera;", "U0", "e1", "W0", "initListeners", "Z0", "", "imageByteArray", "", "numberOfBytes", "f1", "Landroid/hardware/Camera$PictureCallback;", "f", "Landroid/hardware/Camera$PictureCallback;", "picture", "Lcom/carrefour/fid/android/presentation/viewmodels/gazStation/a;", "g", "Lcom/carrefour/fid/android/presentation/viewmodels/gazStation/a;", "V0", "()Lcom/carrefour/fid/android/presentation/viewmodels/gazStation/a;", "g1", "(Lcom/carrefour/fid/android/presentation/viewmodels/gazStation/a;)V", "serviceStationsAnalyticsViewModel", "v", "Landroid/hardware/Camera;", "camera", "Lcom/carrefour/fid/android/widget/CameraPreview;", "w", "Lcom/carrefour/fid/android/widget/CameraPreview;", "preview", "<init>", "()V", "x", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nServiceStationsCameraFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceStationsCameraFragment.kt\ncom/carrefour/fid/android/presentation/ui/gazStation/ServiceStationsCameraFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n1#2:161\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.ServiceStationsCameraFragment */
public final class ServiceStationsCameraFragment extends C24026e<C36802q3> {
    @C12579k

    /* renamed from: x */
    public static final C24000a f60209x = new C24000a((DefaultConstructorMarker) null);

    /* renamed from: y */
    public static final int f60210y = 8;
    @C12579k

    /* renamed from: z */
    public static final String f60211z;
    @C12579k

    /* renamed from: f */
    public final Camera.PictureCallback f60212f = new C24029h(this);
    @Inject

    /* renamed from: g */
    public C26350a f60213g;
    @C12580l

    /* renamed from: v */
    public Camera f60214v;
    @C12580l

    /* renamed from: w */
    public CameraPreview f60215w;

    /* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.ServiceStationsCameraFragment$a */
    public static final class C24000a {
        public /* synthetic */ C24000a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final String mo70202a() {
            return ServiceStationsCameraFragment.f60211z;
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final ServiceStationsCameraFragment mo70203b() {
            return new ServiceStationsCameraFragment();
        }

        public C24000a() {
        }
    }

    static {
        String name = ServiceStationsCameraFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "ServiceStationsCameraFragment::class.java.name");
        f60211z = name;
    }

    public ServiceStationsCameraFragment() {
        super(C239991.f60216a);
    }

    /* renamed from: X0 */
    public static final boolean m105941X0(ServiceStationsCameraFragment serviceStationsCameraFragment, View view, MotionEvent motionEvent) {
        Camera camera;
        Intrinsics.checkNotNullParameter(serviceStationsCameraFragment, "this$0");
        if (motionEvent.getAction() != 0 || (camera = serviceStationsCameraFragment.f60214v) == null) {
            return true;
        }
        C22840a.m103116a(camera);
        return true;
    }

    /* renamed from: a1 */
    public static final void m105942a1(ServiceStationsCameraFragment serviceStationsCameraFragment, View view) {
        Intrinsics.checkNotNullParameter(serviceStationsCameraFragment, "this$0");
        Camera camera = serviceStationsCameraFragment.f60214v;
        if (camera != null) {
            camera.takePicture((Camera.ShutterCallback) null, (Camera.PictureCallback) null, serviceStationsCameraFragment.f60212f);
        }
        serviceStationsCameraFragment.mo70192V0().mo76660c();
    }

    @C12579k
    @C11384m
    /* renamed from: c1 */
    public static final ServiceStationsCameraFragment m105943c1() {
        return f60209x.mo70203b();
    }

    /* renamed from: d1 */
    public static final void m105944d1(ServiceStationsCameraFragment serviceStationsCameraFragment, byte[] bArr, Camera camera) {
        Intrinsics.checkNotNullParameter(serviceStationsCameraFragment, "this$0");
        try {
            Intrinsics.checkNotNullExpressionValue(bArr, "data");
            serviceStationsCameraFragment.mo70198f1(bArr, bArr.length);
            Camera camera2 = serviceStationsCameraFragment.f60214v;
            if (camera2 != null) {
                camera2.startPreview();
            }
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder();
            sb.append("File not found: ");
            sb.append(message);
        } catch (IOException e2) {
            String message2 = e2.getMessage();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error accessing file: ");
            sb2.append(message2);
        }
    }

    /* renamed from: U0 */
    public final Camera mo70191U0() {
        try {
            return Camera.open();
        } catch (Exception unused) {
            return null;
        }
    }

    @C12579k
    /* renamed from: V0 */
    public final C26350a mo70192V0() {
        C26350a aVar = this.f60213g;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("serviceStationsAnalyticsViewModel");
        return null;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: W0 */
    public final void mo70193W0() {
        ((C36802q3) getBinding()).f91534c.setOnTouchListener(new C24031j(this));
    }

    /* renamed from: Y0 */
    public final void mo70194Y0() {
        Context context = getContext();
        if (context != null) {
            Camera camera = this.f60214v;
            CameraPreview cameraPreview = null;
            if (camera != null) {
                camera.setPreviewCallback((Camera.PreviewCallback) null);
            }
            Camera U0 = mo70191U0();
            this.f60214v = U0;
            if (U0 != null) {
                cameraPreview = new CameraPreview(context, U0);
            }
            this.f60215w = cameraPreview;
            if (cameraPreview != null) {
                ((C36802q3) getBinding()).f91534c.addView(cameraPreview);
            }
        }
    }

    /* renamed from: Z0 */
    public final void mo70195Z0() {
        ((C36802q3) getBinding()).f91533b.setOnClickListener(new C24030i(this));
    }

    /* renamed from: b1 */
    public final void mo70196b1() {
        BottomNavActivity bottomNavActivity;
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121107M1().mo121278k0(R.string.service_stations_toolbar_title);
            ToolBarDefaultView.setup$default(bottomNavActivity.mo121107M1(), (C11300l) null, ServiceStationsCameraFragment$initToolbar$1$1.f60217f, 1, (Object) null);
        }
    }

    /* renamed from: e1 */
    public final void mo70197e1() {
        SurfaceHolder holder;
        try {
            Camera camera = this.f60214v;
            if (camera != null) {
                camera.stopPreview();
                camera.setPreviewCallback((Camera.PreviewCallback) null);
                CameraPreview cameraPreview = this.f60215w;
                if (!(cameraPreview == null || (holder = cameraPreview.getHolder()) == null)) {
                    holder.removeCallback(this.f60215w);
                }
                camera.release();
            }
            this.f60214v = null;
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder();
            sb.append("Error accessing file: ");
            sb.append(message);
        }
    }

    /* renamed from: f1 */
    public final void mo70198f1(byte[] bArr, int i) {
        ImageUtils imageUtils = ImageUtils.f70796a;
        Bitmap m = imageUtils.mo84108m(imageUtils.mo84097a(bArr, i), 2048, C28539g.f69265w);
        C24032k.C24034b bVar = C24032k.f60275a;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        FragmentKt.m118823k(this, bVar.mo70321a(ImageUtils.m119497o(imageUtils, requireContext, m, C36185p.f89345g, (Bitmap.CompressFormat) null, 0, 24, (Object) null)));
    }

    /* renamed from: g1 */
    public final void mo70199g1(@C12579k C26350a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f60213g = aVar;
    }

    public final void initListeners() {
        mo70195Z0();
    }

    public void onDestroy() {
        super.onDestroy();
        mo70197e1();
    }

    public void onPause() {
        super.onPause();
        mo70197e1();
    }

    public void onResume() {
        super.onResume();
        mo70194Y0();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo70192V0().mo76659b();
        mo70196b1();
        initListeners();
        mo70193W0();
    }
}
