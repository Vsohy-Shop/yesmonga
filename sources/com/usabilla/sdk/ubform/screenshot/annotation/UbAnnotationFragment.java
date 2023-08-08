package com.usabilla.sdk.ubform.screenshot.annotation;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.p004ui.text.platform.C16388q;
import androidx.compose.p004ui.text.platform.C16389r;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.carrefour.fid.android.shared.constant.C28515a1;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.bus.Bus;
import com.usabilla.sdk.ubform.bus.BusEvent;
import com.usabilla.sdk.ubform.screenshot.UbImageSource;
import com.usabilla.sdk.ubform.screenshot.UbScreenshotActivity;
import com.usabilla.sdk.ubform.screenshot.annotation.C9889b;
import com.usabilla.sdk.ubform.sdk.UbScreenshot;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import com.usabilla.sdk.ubform.utils.ext.C10133g;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C10864b0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.collections.C10953k0;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class UbAnnotationFragment extends Fragment implements C9889b.C9891b {
    @C12579k

    /* renamed from: X */
    public static final String f27112X = "args_uri";
    @C12579k

    /* renamed from: Y */
    public static final String f27113Y = "args_source";
    @C12579k

    /* renamed from: z */
    public static final C9883a f27114z = new C9883a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final int f27115a;

    /* renamed from: b */
    public final float f27116b;
    @C12579k

    /* renamed from: c */
    public final String f27117c;

    /* renamed from: d */
    public LinearLayout f27118d;

    /* renamed from: e */
    public Toolbar f27119e;

    /* renamed from: f */
    public UbAnnotationView f27120f;

    /* renamed from: g */
    public MenuItem f27121g;

    /* renamed from: v */
    public MenuItem f27122v;

    /* renamed from: w */
    public MenuItem f27123w;

    /* renamed from: x */
    public C9889b.C9890a f27124x;
    @C12579k

    /* renamed from: y */
    public final C11677z f27125y;

    /* renamed from: com.usabilla.sdk.ubform.screenshot.annotation.UbAnnotationFragment$a */
    public static final class C9883a {
        public /* synthetic */ C9883a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final UbAnnotationFragment mo20386a(@C12579k Uri uri, @C12579k UbImageSource ubImageSource) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(ubImageSource, "source");
            UbAnnotationFragment ubAnnotationFragment = new UbAnnotationFragment((DefaultConstructorMarker) null);
            Bundle bundle = new Bundle();
            bundle.putParcelable(UbAnnotationFragment.f27112X, uri);
            bundle.putInt(UbAnnotationFragment.f27113Y, ubImageSource.ordinal());
            C11079d2 d2Var = C11079d2.f28267a;
            ubAnnotationFragment.setArguments(bundle);
            return ubAnnotationFragment;
        }

        public C9883a() {
        }
    }

    public /* synthetic */ UbAnnotationFragment(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: R0 */
    public static /* synthetic */ ParcelFileDescriptor m37057R0(UbAnnotationFragment ubAnnotationFragment, Uri uri, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = C28515a1.f68703k;
        }
        return ubAnnotationFragment.mo20377Q0(uri, str);
    }

    /* renamed from: S0 */
    public static final boolean m37058S0(UbAnnotationFragment ubAnnotationFragment, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(ubAnnotationFragment, "this$0");
        int itemId = menuItem.getItemId();
        if (itemId == C9747c.C9756i.ub_action_done) {
            C9889b.C9890a aVar = ubAnnotationFragment.f27124x;
            if (aVar != null) {
                C19232h requireActivity = ubAnnotationFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                File b = C10133g.m38340b(requireActivity, UbScreenshot.f27222e);
                UbAnnotationView ubAnnotationView = ubAnnotationFragment.f27120f;
                if (ubAnnotationView != null) {
                    Bitmap bitmapFromPreview = ubAnnotationView.getBitmapFromPreview();
                    UbAnnotationView ubAnnotationView2 = ubAnnotationFragment.f27120f;
                    if (ubAnnotationView2 != null) {
                        aVar.mo20452n(b, bitmapFromPreview, ubAnnotationView2.getBehaviorBuilder());
                        return true;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("annotationView");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("annotationView");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            throw null;
        } else if (itemId == C9747c.C9756i.ub_action_confirm) {
            UbAnnotationView ubAnnotationView3 = ubAnnotationFragment.f27120f;
            if (ubAnnotationView3 != null) {
                Context requireContext = ubAnnotationFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                ubAnnotationView3.mo20396c(requireContext);
                return false;
            }
            Intrinsics.throwUninitializedPropertyAccessException("annotationView");
            throw null;
        } else if (itemId != C9747c.C9756i.ub_action_undo) {
            return false;
        } else {
            UbAnnotationView ubAnnotationView4 = ubAnnotationFragment.f27120f;
            if (ubAnnotationView4 != null) {
                ubAnnotationView4.mo20416q();
                return false;
            }
            Intrinsics.throwUninitializedPropertyAccessException("annotationView");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        kotlin.p010io.C11133b.m42950a(r4, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0066, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        kotlin.p010io.C11133b.m42950a(r3, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006e, code lost:
        kotlin.p010io.C11133b.m42950a(r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0071, code lost:
        throw r0;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo20373G(@org.jetbrains.annotations.C12579k android.net.Uri r8) {
        /*
            r7 = this;
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            r1 = 2
            android.os.ParcelFileDescriptor r2 = m37057R0(r7, r8, r0, r1, r0)
            if (r2 != 0) goto L_0x000e
            goto L_0x005c
        L_0x000e:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x006b }
            java.io.FileDescriptor r4 = r2.getFileDescriptor()     // Catch:{ all -> 0x006b }
            r3.<init>(r4)     // Catch:{ all -> 0x006b }
            android.content.Context r4 = r7.requireContext()     // Catch:{ all -> 0x006b }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ all -> 0x006b }
            java.lang.String r5 = "requireContext().contentResolver"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)     // Catch:{ all -> 0x006b }
            java.lang.String r4 = com.usabilla.sdk.ubform.utils.ext.C10132f.m38338a(r4, r8)     // Catch:{ all -> 0x006b }
            if (r4 != 0) goto L_0x002b
            goto L_0x0059
        L_0x002b:
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x006b }
            android.content.Context r6 = r7.requireContext()     // Catch:{ all -> 0x006b }
            java.io.File r6 = r6.getCacheDir()     // Catch:{ all -> 0x006b }
            r5.<init>(r6, r4)     // Catch:{ all -> 0x006b }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x006b }
            r4.<init>(r5)     // Catch:{ all -> 0x006b }
            r6 = 0
            kotlin.p010io.C11131a.m42932l(r3, r4, r6, r1, r0)     // Catch:{ all -> 0x005d }
            kotlin.p010io.C11133b.m42950a(r4, r0)     // Catch:{ all -> 0x0064 }
            kotlin.p010io.C11133b.m42950a(r3, r0)     // Catch:{ all -> 0x006b }
            java.lang.String r1 = r5.getAbsolutePath()     // Catch:{ all -> 0x006b }
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeFile(r1)     // Catch:{ all -> 0x006b }
            java.lang.String r3 = "decodeFile(file.absolutePath)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)     // Catch:{ all -> 0x006b }
            r7.mo20378T0(r8, r1)     // Catch:{ all -> 0x006b }
            kotlin.d2 r8 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x006b }
        L_0x0059:
            kotlin.p010io.C11133b.m42950a(r2, r0)
        L_0x005c:
            return
        L_0x005d:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x005f }
        L_0x005f:
            r0 = move-exception
            kotlin.p010io.C11133b.m42950a(r4, r8)     // Catch:{ all -> 0x0064 }
            throw r0     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            kotlin.p010io.C11133b.m42950a(r3, r8)     // Catch:{ all -> 0x006b }
            throw r0     // Catch:{ all -> 0x006b }
        L_0x006b:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x006d }
        L_0x006d:
            r0 = move-exception
            kotlin.p010io.C11133b.m42950a(r2, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.screenshot.annotation.UbAnnotationFragment.mo20373G(android.net.Uri):void");
    }

    /* renamed from: O0 */
    public final void mo20374O0(Toolbar toolbar, Typeface typeface) {
        C11466l W1 = C11479u.m44378W1(0, toolbar.getChildCount());
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(W1, 10));
        Iterator it = W1.iterator();
        while (it.hasNext()) {
            arrayList.add(toolbar.getChildAt(((C10953k0) it).mo6374c()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            if (next instanceof TextView) {
                arrayList2.add(next);
            }
        }
        ArrayList<TextView> arrayList3 = new ArrayList<>();
        for (Object next2 : arrayList2) {
            if (Intrinsics.areEqual((Object) ((TextView) next2).getText(), (Object) toolbar.getTitle())) {
                arrayList3.add(next2);
            }
        }
        for (TextView typeface2 : arrayList3) {
            typeface2.setTypeface(typeface);
        }
    }

    /* renamed from: P0 */
    public final float mo20375P0() {
        return ((Number) this.f27125y.getValue()).floatValue();
    }

    /* renamed from: Q */
    public void mo20376Q() {
        UbAnnotationView ubAnnotationView = this.f27120f;
        if (ubAnnotationView != null) {
            ubAnnotationView.mo20414o(new UbAnnotationFragment$initializeAnnotationView$1(this));
            UbAnnotationView ubAnnotationView2 = this.f27120f;
            if (ubAnnotationView2 != null) {
                ubAnnotationView2.setOnPluginSelectedCallback(new UbAnnotationFragment$initializeAnnotationView$2(this));
                UbAnnotationView ubAnnotationView3 = this.f27120f;
                if (ubAnnotationView3 != null) {
                    ubAnnotationView3.setOnPluginFinishedCallback(new UbAnnotationFragment$initializeAnnotationView$3(this));
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("annotationView");
                    throw null;
                }
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("annotationView");
                throw null;
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("annotationView");
            throw null;
        }
    }

    /* renamed from: Q0 */
    public final ParcelFileDescriptor mo20377Q0(Uri uri, String str) {
        return requireContext().getContentResolver().openFileDescriptor(uri, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        kotlin.p010io.C11133b.m42950a(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        throw r0;
     */
    /* renamed from: T0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20378T0(android.net.Uri r3, android.graphics.Bitmap r4) {
        /*
            r2 = this;
            android.content.Context r0 = r2.requireContext()
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.io.InputStream r3 = r0.openInputStream(r3)
            r0 = 0
            if (r3 != 0) goto L_0x0011
            r4 = r0
            goto L_0x002b
        L_0x0011:
            android.content.Context r1 = r2.requireContext()     // Catch:{ all -> 0x0039 }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ all -> 0x0039 }
            android.graphics.Bitmap r4 = com.usabilla.sdk.ubform.utils.ext.C10130d.m38331a(r4, r3)     // Catch:{ all -> 0x0039 }
            androidx.core.graphics.drawable.p r4 = androidx.core.graphics.drawable.C17565q.m80514a(r1, r4)     // Catch:{ all -> 0x0039 }
            float r1 = r2.mo20375P0()     // Catch:{ all -> 0x0039 }
            r4.mo51968m(r1)     // Catch:{ all -> 0x0039 }
            kotlin.p010io.C11133b.m42950a(r3, r0)
        L_0x002b:
            com.usabilla.sdk.ubform.screenshot.annotation.UbAnnotationView r3 = r2.f27120f
            if (r3 == 0) goto L_0x0033
            r3.setImageDrawable(r4)
            return
        L_0x0033:
            java.lang.String r3 = "annotationView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            throw r0
        L_0x0039:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x003b }
        L_0x003b:
            r0 = move-exception
            kotlin.p010io.C11133b.m42950a(r3, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.screenshot.annotation.UbAnnotationFragment.mo20378T0(android.net.Uri, android.graphics.Bitmap):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        kotlin.p010io.C11133b.m42950a(r0, r5);
     */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo20379c0(@org.jetbrains.annotations.C12579k android.net.Uri r5) {
        /*
            r4 = this;
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 2
            r1 = 0
            android.os.ParcelFileDescriptor r0 = m37057R0(r4, r5, r1, r0, r1)
            if (r0 != 0) goto L_0x000e
            goto L_0x0023
        L_0x000e:
            java.io.FileDescriptor r2 = r0.getFileDescriptor()     // Catch:{ all -> 0x0024 }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFileDescriptor(r2)     // Catch:{ all -> 0x0024 }
            java.lang.String r3 = "decodeFileDescriptor(descriptor.fileDescriptor)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch:{ all -> 0x0024 }
            r4.mo20378T0(r5, r2)     // Catch:{ all -> 0x0024 }
            kotlin.d2 r5 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0024 }
            kotlin.p010io.C11133b.m42950a(r0, r1)
        L_0x0023:
            return
        L_0x0024:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r1 = move-exception
            kotlin.p010io.C11133b.m42950a(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.screenshot.annotation.UbAnnotationFragment.mo20379c0(android.net.Uri):void");
    }

    /* renamed from: n */
    public void mo20380n(@C12579k Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        mo20379c0(uri);
    }

    public void onActivityResult(int i, int i2, @C12580l Intent intent) {
        Uri data;
        if (i != 1001 || i2 != -1) {
            super.onActivityResult(i, i2, intent);
        } else if (intent != null && (data = intent.getData()) != null) {
            C9889b.C9890a aVar = this.f27124x;
            if (aVar != null) {
                aVar.mo20450V(data);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
                throw null;
            }
        }
    }

    @C12580l
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(C9747c.C9759l.ub_fragment_annotation, viewGroup, false);
    }

    public void onDestroyView() {
        super.onDestroyView();
        C9889b.C9890a aVar = this.f27124x;
        if (aVar != null) {
            aVar.mo20466O();
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            throw null;
        }
    }

    public void onSaveInstanceState(@C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "outState");
        super.onSaveInstanceState(bundle);
        String str = this.f27117c;
        C9889b.C9890a aVar = this.f27124x;
        if (aVar != null) {
            bundle.putParcelable(str, aVar.mo20453x());
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            throw null;
        }
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Uri uri;
        Integer num;
        UbInternalTheme ubInternalTheme;
        Uri uri2;
        Window window;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C19232h activity = getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            window.clearFlags(1024);
        }
        View findViewById = view.findViewById(C9747c.C9756i.ub_screenshot_preview_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.ub_screenshot_preview_container)");
        this.f27118d = (LinearLayout) findViewById;
        View findViewById2 = view.findViewById(C9747c.C9756i.ub_toolbar);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.ub_toolbar)");
        Toolbar toolbar = (Toolbar) findViewById2;
        this.f27119e = toolbar;
        if (toolbar != null) {
            toolbar.mo3110A(C9747c.C9760m.ub_annotations_menu);
            MenuItem findItem = toolbar.getMenu().findItem(C9747c.C9756i.ub_action_done);
            Intrinsics.checkNotNullExpressionValue(findItem, "menu.findItem(R.id.ub_action_done)");
            this.f27121g = findItem;
            MenuItem findItem2 = toolbar.getMenu().findItem(C9747c.C9756i.ub_action_undo);
            Intrinsics.checkNotNullExpressionValue(findItem2, "menu.findItem(R.id.ub_action_undo)");
            this.f27122v = findItem2;
            MenuItem findItem3 = toolbar.getMenu().findItem(C9747c.C9756i.ub_action_confirm);
            Intrinsics.checkNotNullExpressionValue(findItem3, "menu.findItem(R.id.ub_action_confirm)");
            this.f27123w = findItem3;
            toolbar.setOnMenuItemClickListener(new C9892c(this));
            toolbar.setTitle(C9747c.C9761n.ub_edit_title);
            if (bundle == null) {
                uri = null;
            } else {
                uri = (Uri) bundle.getParcelable(this.f27117c);
            }
            if (uri == null) {
                Bundle arguments = getArguments();
                if (arguments == null) {
                    uri2 = null;
                } else {
                    uri2 = (Uri) arguments.getParcelable(f27112X);
                }
                Intrinsics.checkNotNull(uri);
            }
            Intrinsics.checkNotNullExpressionValue(uri, "savedInstanceState?.getParcelable<Uri>(savedUri)\n            ?: arguments?.getParcelable(ARGS_URI)!!");
            UbImageSource[] values = UbImageSource.values();
            Bundle arguments2 = getArguments();
            if (arguments2 == null) {
                num = null;
            } else {
                num = Integer.valueOf(arguments2.getInt(f27113Y));
            }
            Intrinsics.checkNotNull(num);
            UbImageSource ubImageSource = values[num.intValue()];
            Bundle arguments3 = getArguments();
            if (arguments3 == null) {
                ubInternalTheme = null;
            } else {
                ubInternalTheme = (UbInternalTheme) arguments3.getParcelable(UbScreenshotActivity.f27098g1);
            }
            Intrinsics.checkNotNull(ubInternalTheme);
            Intrinsics.checkNotNullExpressionValue(ubInternalTheme, "arguments?.getParcelable<UbInternalTheme>(UbScreenshotActivity.ARGS_THEME)!!");
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            UbAnnotationView ubAnnotationView = new UbAnnotationView(requireContext, (AttributeSet) null, 0, ubInternalTheme, 6, (DefaultConstructorMarker) null);
            this.f27120f = ubAnnotationView;
            LinearLayout linearLayout = this.f27118d;
            if (linearLayout != null) {
                linearLayout.addView(ubAnnotationView);
                C9894e eVar = new C9894e(uri, ubImageSource, ubInternalTheme);
                this.f27124x = eVar;
                eVar.mo20465L(this);
                C9889b.C9890a aVar = this.f27124x;
                if (aVar != null) {
                    aVar.mo20469u();
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                    throw null;
                }
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("container");
                throw null;
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("toolbar");
            throw null;
        }
    }

    /* renamed from: r0 */
    public void mo20382r0() {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.mo56901r1();
        }
    }

    /* renamed from: s0 */
    public void mo20383s0(int i) {
        LinearLayout linearLayout = this.f27118d;
        if (linearLayout != null) {
            linearLayout.setBackgroundColor(i);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("container");
            throw null;
        }
    }

    /* renamed from: w0 */
    public void mo20384w0(@C12579k Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Bus.f26721a.mo19920c(BusEvent.SCREENSHOT_SELECTED, uri.toString());
        requireActivity().finish();
    }

    /* renamed from: y */
    public void mo20385y(@C12579k UbInternalTheme ubInternalTheme) {
        Intrinsics.checkNotNullParameter(ubInternalTheme, C10108c.f27794S);
        int accent = ubInternalTheme.getColors().getAccent();
        int title = ubInternalTheme.getColors().getTitle();
        Toolbar toolbar = this.f27119e;
        if (toolbar != null) {
            MenuItem findItem = toolbar.getMenu().findItem(C9747c.C9756i.ub_action_done);
            Intrinsics.checkNotNullExpressionValue(findItem, "toolbar.menu.findItem(R.id.ub_action_done)");
            this.f27121g = findItem;
            MenuItem menuItem = this.f27121g;
            if (menuItem != null) {
                SpannableString spannableString = new SpannableString(menuItem.getTitle());
                spannableString.setSpan(new ForegroundColorSpan(accent), 0, spannableString.length(), 33);
                Typeface typefaceRegular = ubInternalTheme.getTypefaceRegular();
                if (Build.VERSION.SDK_INT >= 28 && typefaceRegular != null) {
                    C16389r.m73962a();
                    spannableString.setSpan(C16388q.m73961a(typefaceRegular), 0, spannableString.length(), 33);
                }
                MenuItem menuItem2 = this.f27121g;
                if (menuItem2 != null) {
                    menuItem2.setTitle(spannableString);
                    Toolbar toolbar2 = this.f27119e;
                    if (toolbar2 != null) {
                        toolbar2.setTitleTextColor(title);
                        Toolbar toolbar3 = this.f27119e;
                        if (toolbar3 != null) {
                            Context requireContext = requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                            mo20374O0(toolbar3, ubInternalTheme.getTitleFont(requireContext));
                            MenuItem menuItem3 = this.f27123w;
                            if (menuItem3 != null) {
                                Context requireContext2 = requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext()");
                                menuItem3.setIcon(C10133g.m38356r(requireContext2, C9747c.C9755h.ub_ic_check_confirm, ubInternalTheme.getColors().getAccent(), true));
                                MenuItem menuItem4 = this.f27122v;
                                if (menuItem4 != null) {
                                    Context requireContext3 = requireContext();
                                    Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext()");
                                    menuItem4.setIcon(C10133g.m38358t(requireContext3, C9747c.C9755h.ub_ic_undo, C11078d1.m42659a(16842910, Integer.valueOf(ubInternalTheme.getColors().getAccent())), C11078d1.m42659a(-16842910, Integer.valueOf(Color.argb(Math.round(((float) Color.alpha(ubInternalTheme.getColors().getText())) * this.f27116b), Color.red(ubInternalTheme.getColors().getText()), Color.green(ubInternalTheme.getColors().getText()), Color.blue(ubInternalTheme.getColors().getText()))))));
                                    return;
                                }
                                Intrinsics.throwUninitializedPropertyAccessException("menuUndo");
                                throw null;
                            }
                            Intrinsics.throwUninitializedPropertyAccessException("menuConfirm");
                            throw null;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("toolbar");
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("toolbar");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("menuDone");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("menuDone");
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("toolbar");
        throw null;
    }

    public UbAnnotationFragment() {
        this.f27115a = 4;
        this.f27116b = 0.3f;
        this.f27117c = "saved_uri";
        this.f27125y = C10864b0.m38748c(new UbAnnotationFragment$cornerRadiusInPx$2(this));
    }
}
