package androidx.activity.result.contract;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0305j;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.C0266a;
import androidx.annotation.C0346i;
import androidx.annotation.C0376v0;
import androidx.core.content.C17318d;
import com.urbanairship.iam.events.C9175a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.C11078d1;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.activity.result.contract.b */
public final class C0268b {

    /* renamed from: androidx.activity.result.contract.b$a */
    public static class C0269a extends C0266a<Uri, Boolean> {
        @C12579k
        @C0346i
        /* renamed from: d */
        public Intent mo869a(@C12579k Context context, @C12579k Uri uri) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(uri, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        @C12580l
        /* renamed from: e */
        public final C0266a.C0267a<Boolean> mo898b(@C12579k Context context, @C12579k Uri uri) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(uri, "input");
            return null;
        }

        @C12579k
        /* renamed from: f */
        public final Boolean mo870c(int i, @C12580l Intent intent) {
            return Boolean.valueOf(i == -1);
        }
    }

    @C11363r0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$GetContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    /* renamed from: androidx.activity.result.contract.b$c */
    public static class C0271c extends C0266a<String, Uri> {
        @C12579k
        @C0346i
        /* renamed from: d */
        public Intent mo869a(@C12579k Context context, @C12579k String str) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(str, "input");
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
            Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_GET…          .setType(input)");
            return type;
        }

        @C12580l
        /* renamed from: e */
        public final C0266a.C0267a<Uri> mo898b(@C12579k Context context, @C12579k String str) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(str, "input");
            return null;
        }

        @C12580l
        /* renamed from: f */
        public final Uri mo870c(int i, @C12580l Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @C0376v0(18)
    /* renamed from: androidx.activity.result.contract.b$d */
    public static class C0272d extends C0266a<String, List<Uri>> {
        @C12579k

        /* renamed from: a */
        public static final C0273a f801a = new C0273a((DefaultConstructorMarker) null);

        @C0376v0(18)
        /* renamed from: androidx.activity.result.contract.b$d$a */
        public static final class C0273a {
            public /* synthetic */ C0273a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final List<Uri> mo912a(@C12579k Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return CollectionsKt__CollectionsKt.m40441E();
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i = 0; i < itemCount; i++) {
                        Uri uri = clipData.getItemAt(i).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }

            public C0273a() {
            }
        }

        @C12579k
        @C0346i
        /* renamed from: d */
        public Intent mo869a(@C12579k Context context, @C12579k String str) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(str, "input");
            Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
            return putExtra;
        }

        @C12580l
        /* renamed from: e */
        public final C0266a.C0267a<List<Uri>> mo898b(@C12579k Context context, @C12579k String str) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(str, "input");
            return null;
        }

        @C12579k
        /* renamed from: f */
        public final List<Uri> mo870c(int i, @C12580l Intent intent) {
            List<Uri> a;
            if (!(i == -1)) {
                intent = null;
            }
            return (intent == null || (a = f801a.mo912a(intent)) == null) ? CollectionsKt__CollectionsKt.m40441E() : a;
        }
    }

    @C0376v0(19)
    @C11363r0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$OpenDocument\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    /* renamed from: androidx.activity.result.contract.b$e */
    public static class C0274e extends C0266a<String[], Uri> {
        @C12579k
        @C0346i
        /* renamed from: d */
        public Intent mo869a(@C12579k Context context, @C12579k String[] strArr) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(strArr, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
            Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @C12580l
        /* renamed from: e */
        public final C0266a.C0267a<Uri> mo898b(@C12579k Context context, @C12579k String[] strArr) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(strArr, "input");
            return null;
        }

        @C12580l
        /* renamed from: f */
        public final Uri mo870c(int i, @C12580l Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @C0376v0(21)
    @C11363r0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$OpenDocumentTree\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    /* renamed from: androidx.activity.result.contract.b$f */
    public static class C0275f extends C0266a<Uri, Uri> {
        @C12579k
        @C0346i
        /* renamed from: d */
        public Intent mo869a(@C12579k Context context, @C12580l Uri uri) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (Build.VERSION.SDK_INT >= 26 && uri != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri);
            }
            return intent;
        }

        @C12580l
        /* renamed from: e */
        public final C0266a.C0267a<Uri> mo898b(@C12579k Context context, @C12580l Uri uri) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            return null;
        }

        @C12580l
        /* renamed from: f */
        public final Uri mo870c(int i, @C12580l Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @C0376v0(19)
    /* renamed from: androidx.activity.result.contract.b$g */
    public static class C0276g extends C0266a<String[], List<Uri>> {
        @C12579k
        @C0346i
        /* renamed from: d */
        public Intent mo869a(@C12579k Context context, @C12579k String[] strArr) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(strArr, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
            Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @C12580l
        /* renamed from: e */
        public final C0266a.C0267a<List<Uri>> mo898b(@C12579k Context context, @C12579k String[] strArr) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(strArr, "input");
            return null;
        }

        @C12579k
        /* renamed from: f */
        public final List<Uri> mo870c(int i, @C12580l Intent intent) {
            List<Uri> a;
            if (!(i == -1)) {
                intent = null;
            }
            return (intent == null || (a = C0272d.f801a.mo912a(intent)) == null) ? CollectionsKt__CollectionsKt.m40441E() : a;
        }
    }

    @C11363r0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$PickContact\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    /* renamed from: androidx.activity.result.contract.b$h */
    public static final class C0277h extends C0266a<Void, Uri> {
        @C12579k
        /* renamed from: d */
        public Intent mo869a(@C12579k Context context, @C12580l Void voidR) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intent type = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
            Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)");
            return type;
        }

        @C12580l
        /* renamed from: e */
        public Uri mo870c(int i, @C12580l Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @C0376v0(19)
    /* renamed from: androidx.activity.result.contract.b$i */
    public static class C0278i extends C0266a<C0305j, List<Uri>> {
        @C12579k

        /* renamed from: b */
        public static final C0279a f802b = new C0279a((DefaultConstructorMarker) null);

        /* renamed from: a */
        public final int f803a;

        /* renamed from: androidx.activity.result.contract.b$i$a */
        public static final class C0279a {
            public /* synthetic */ C0279a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @SuppressLint({"NewApi", "ClassVerificationFailure"})
            /* renamed from: a */
            public final int mo927a() {
                if (C0280j.f804a.mo938j()) {
                    return MediaStore.getPickImagesMaxLimit();
                }
                return Integer.MAX_VALUE;
            }

            public C0279a() {
            }
        }

        public C0278i() {
            this(0, 1, (DefaultConstructorMarker) null);
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        @C12579k
        @C0346i
        /* renamed from: d */
        public Intent mo869a(@C12579k Context context, @C12579k C0305j jVar) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(jVar, "input");
            C0280j.C0281a aVar = C0280j.f804a;
            boolean z = true;
            if (aVar.mo938j()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(aVar.mo933e(jVar.mo961a()));
                if (this.f803a > MediaStore.getPickImagesMaxLimit()) {
                    z = false;
                }
                if (z) {
                    intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.f803a);
                    return intent;
                }
                throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()".toString());
            } else if (aVar.mo937i(context)) {
                ResolveInfo d = aVar.mo932d(context);
                if (d != null) {
                    ActivityInfo activityInfo = d.activityInfo;
                    Intent intent2 = new Intent(C0280j.f805b);
                    intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                    intent2.setType(aVar.mo933e(jVar.mo961a()));
                    intent2.putExtra(C0280j.f808e, this.f803a);
                    return intent2;
                }
                throw new IllegalStateException("Required value was null.".toString());
            } else if (aVar.mo934f(context)) {
                ResolveInfo c = aVar.mo931c(context);
                if (c != null) {
                    ActivityInfo activityInfo2 = c.activityInfo;
                    Intent intent3 = new Intent(C0280j.f807d);
                    intent3.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                    intent3.putExtra(C0280j.f808e, this.f803a);
                    return intent3;
                }
                throw new IllegalStateException("Required value was null.".toString());
            } else {
                Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent4.setType(aVar.mo933e(jVar.mo961a()));
                intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                if (intent4.getType() != null) {
                    return intent4;
                }
                intent4.setType("*/*");
                intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                return intent4;
            }
        }

        @C12580l
        /* renamed from: e */
        public final C0266a.C0267a<List<Uri>> mo898b(@C12579k Context context, @C12579k C0305j jVar) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(jVar, "input");
            return null;
        }

        @C12579k
        /* renamed from: f */
        public final List<Uri> mo870c(int i, @C12580l Intent intent) {
            List<Uri> a;
            if (!(i == -1)) {
                intent = null;
            }
            return (intent == null || (a = C0272d.f801a.mo912a(intent)) == null) ? CollectionsKt__CollectionsKt.m40441E() : a;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C0278i(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? f802b.mo927a() : i);
        }

        public C0278i(int i) {
            this.f803a = i;
            if (!(i <= 1 ? false : true)) {
                throw new IllegalArgumentException("Max items must be higher than 1".toString());
            }
        }
    }

    @C0376v0(19)
    @C11363r0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    /* renamed from: androidx.activity.result.contract.b$j */
    public static class C0280j extends C0266a<C0305j, Uri> {
        @C12579k

        /* renamed from: a */
        public static final C0281a f804a = new C0281a((DefaultConstructorMarker) null);
        @C12579k

        /* renamed from: b */
        public static final String f805b = "androidx.activity.result.contract.action.PICK_IMAGES";
        @C12579k

        /* renamed from: c */
        public static final String f806c = "androidx.activity.result.contract.extra.PICK_IMAGES_MAX";
        @C12579k

        /* renamed from: d */
        public static final String f807d = "com.google.android.gms.provider.action.PICK_IMAGES";
        @C12579k

        /* renamed from: e */
        public static final String f808e = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX";

        /* renamed from: androidx.activity.result.contract.b$j$a */
        public static final class C0281a {
            public /* synthetic */ C0281a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public static /* synthetic */ void m1472a() {
            }

            /* renamed from: b */
            public static /* synthetic */ void m1473b() {
            }

            @C12580l
            @C11384m
            /* renamed from: c */
            public final ResolveInfo mo931c(@C12579k Context context) {
                Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
                return context.getPackageManager().resolveActivity(new Intent(C0280j.f807d), 1114112);
            }

            @C12580l
            @C11384m
            /* renamed from: d */
            public final ResolveInfo mo932d(@C12579k Context context) {
                Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
                return context.getPackageManager().resolveActivity(new Intent(C0280j.f805b), 1114112);
            }

            @C12580l
            /* renamed from: e */
            public final String mo933e(@C12579k C0286f fVar) {
                Intrinsics.checkNotNullParameter(fVar, "input");
                if (fVar instanceof C0283c) {
                    return "image/*";
                }
                if (fVar instanceof C0285e) {
                    return "video/*";
                }
                if (fVar instanceof C0284d) {
                    return ((C0284d) fVar).mo939a();
                }
                if (fVar instanceof C0282b) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }

            @C11384m
            /* renamed from: f */
            public final boolean mo934f(@C12579k Context context) {
                Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
                if (mo931c(context) != null) {
                    return true;
                }
                return false;
            }

            @C11395k(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @C11587t0(expression = "isPhotoPickerAvailable(context)", imports = {}))
            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            @C11384m
            /* renamed from: g */
            public final boolean mo935g() {
                return mo938j();
            }

            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            @C11384m
            /* renamed from: h */
            public final boolean mo936h(@C12579k Context context) {
                Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
                if (mo938j() || mo937i(context) || mo934f(context)) {
                    return true;
                }
                return false;
            }

            @C11384m
            /* renamed from: i */
            public final boolean mo937i(@C12579k Context context) {
                Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
                if (mo932d(context) != null) {
                    return true;
                }
                return false;
            }

            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            @C11384m
            /* renamed from: j */
            public final boolean mo938j() {
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    return true;
                }
                if (i < 30 || SdkExtensions.getExtensionVersion(30) < 2) {
                    return false;
                }
                return true;
            }

            public C0281a() {
            }
        }

        /* renamed from: androidx.activity.result.contract.b$j$b */
        public static final class C0282b implements C0286f {
            @C12579k

            /* renamed from: a */
            public static final C0282b f809a = new C0282b();
        }

        /* renamed from: androidx.activity.result.contract.b$j$c */
        public static final class C0283c implements C0286f {
            @C12579k

            /* renamed from: a */
            public static final C0283c f810a = new C0283c();
        }

        /* renamed from: androidx.activity.result.contract.b$j$d */
        public static final class C0284d implements C0286f {
            @C12579k

            /* renamed from: a */
            public final String f811a;

            public C0284d(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "mimeType");
                this.f811a = str;
            }

            @C12579k
            /* renamed from: a */
            public final String mo939a() {
                return this.f811a;
            }
        }

        /* renamed from: androidx.activity.result.contract.b$j$e */
        public static final class C0285e implements C0286f {
            @C12579k

            /* renamed from: a */
            public static final C0285e f812a = new C0285e();
        }

        /* renamed from: androidx.activity.result.contract.b$j$f */
        public interface C0286f {
        }

        @C12580l
        @C11384m
        /* renamed from: e */
        public static final ResolveInfo m1459e(@C12579k Context context) {
            return f804a.mo931c(context);
        }

        @C12580l
        @C11384m
        /* renamed from: g */
        public static final ResolveInfo m1460g(@C12579k Context context) {
            return f804a.mo932d(context);
        }

        @C11384m
        /* renamed from: h */
        public static final boolean m1461h(@C12579k Context context) {
            return f804a.mo934f(context);
        }

        @C11395k(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @C11587t0(expression = "isPhotoPickerAvailable(context)", imports = {}))
        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        @C11384m
        /* renamed from: i */
        public static final boolean m1462i() {
            return f804a.mo935g();
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        @C11384m
        /* renamed from: j */
        public static final boolean m1463j(@C12579k Context context) {
            return f804a.mo936h(context);
        }

        @C11384m
        /* renamed from: k */
        public static final boolean m1464k(@C12579k Context context) {
            return f804a.mo937i(context);
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        @C11384m
        /* renamed from: l */
        public static final boolean m1465l() {
            return f804a.mo938j();
        }

        @C12579k
        @C0346i
        /* renamed from: d */
        public Intent mo869a(@C12579k Context context, @C12579k C0305j jVar) {
            Intent intent;
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(jVar, "input");
            C0281a aVar = f804a;
            if (aVar.mo938j()) {
                Intent intent2 = new Intent("android.provider.action.PICK_IMAGES");
                intent2.setType(aVar.mo933e(jVar.mo961a()));
                return intent2;
            }
            if (aVar.mo937i(context)) {
                ResolveInfo d = aVar.mo932d(context);
                if (d != null) {
                    ActivityInfo activityInfo = d.activityInfo;
                    intent = new Intent(f805b);
                    intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                    intent.setType(aVar.mo933e(jVar.mo961a()));
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } else if (aVar.mo934f(context)) {
                ResolveInfo c = aVar.mo931c(context);
                if (c != null) {
                    ActivityInfo activityInfo2 = c.activityInfo;
                    intent = new Intent(f807d);
                    intent.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                    intent.setType(aVar.mo933e(jVar.mo961a()));
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } else {
                Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent3.setType(aVar.mo933e(jVar.mo961a()));
                if (intent3.getType() != null) {
                    return intent3;
                }
                intent3.setType("*/*");
                intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                return intent3;
            }
            return intent;
        }

        @C12580l
        /* renamed from: f */
        public final C0266a.C0267a<Uri> mo898b(@C12579k Context context, @C12579k C0305j jVar) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(jVar, "input");
            return null;
        }

        @C12580l
        /* renamed from: m */
        public final Uri mo870c(int i, @C12580l Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            Uri data = intent.getData();
            if (data == null) {
                data = (Uri) CollectionsKt___CollectionsKt.m40479B2(C0272d.f801a.mo912a(intent));
            }
            return data;
        }
    }

    @C11363r0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,959:1\n12541#2,2:960\n8676#2,2:962\n9358#2,4:964\n11365#2:968\n11700#2,3:969\n*S KotlinDebug\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n*L\n188#1:960,2\n195#1:962,2\n195#1:964,4\n208#1:968\n208#1:969,3\n*E\n"})
    /* renamed from: androidx.activity.result.contract.b$k */
    public static final class C0287k extends C0266a<String[], Map<String, Boolean>> {
        @C12579k

        /* renamed from: a */
        public static final C0288a f813a = new C0288a((DefaultConstructorMarker) null);
        @C12579k

        /* renamed from: b */
        public static final String f814b = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";
        @C12579k

        /* renamed from: c */
        public static final String f815c = "androidx.activity.result.contract.extra.PERMISSIONS";
        @C12579k

        /* renamed from: d */
        public static final String f816d = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        /* renamed from: androidx.activity.result.contract.b$k$a */
        public static final class C0288a {
            public /* synthetic */ C0288a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final Intent mo943a(@C12579k String[] strArr) {
                Intrinsics.checkNotNullParameter(strArr, "input");
                Intent putExtra = new Intent(C0287k.f814b).putExtra(C0287k.f815c, strArr);
                Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            }

            public C0288a() {
            }
        }

        @C12579k
        /* renamed from: d */
        public Intent mo869a(@C12579k Context context, @C12579k String[] strArr) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(strArr, "input");
            return f813a.mo943a(strArr);
        }

        @C12580l
        /* renamed from: e */
        public C0266a.C0267a<Map<String, Boolean>> mo898b(@C12579k Context context, @C12579k String[] strArr) {
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(strArr, "input");
            boolean z3 = true;
            if (strArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new C0266a.C0267a<>(C10977s0.m41492z());
            }
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (C17318d.m79718a(context, strArr[i]) == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    z3 = false;
                    break;
                }
                i++;
            }
            if (!z3) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(C11479u.m44447u(C10975r0.m41400j(strArr.length), 16));
            for (String a : strArr) {
                Pair a2 = C11078d1.m42659a(a, Boolean.TRUE);
                linkedHashMap.put(a2.mo21849e(), a2.mo21851f());
            }
            return new C0266a.C0267a<>(linkedHashMap);
        }

        @C12579k
        /* renamed from: f */
        public Map<String, Boolean> mo870c(int i, @C12580l Intent intent) {
            boolean z;
            if (i != -1) {
                return C10977s0.m41492z();
            }
            if (intent == null) {
                return C10977s0.m41492z();
            }
            String[] stringArrayExtra = intent.getStringArrayExtra(f815c);
            int[] intArrayExtra = intent.getIntArrayExtra(f816d);
            if (intArrayExtra == null || stringArrayExtra == null) {
                return C10977s0.m41492z();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i2 : intArrayExtra) {
                if (i2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(Boolean.valueOf(z));
            }
            return C10977s0.m41426B0(CollectionsKt___CollectionsKt.m40622d6(ArraysKt___ArraysKt.m40241ub(stringArrayExtra), arrayList));
        }
    }

    @C11363r0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestPermission\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,959:1\n12774#2,2:960\n*S KotlinDebug\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestPermission\n*L\n228#1:960,2\n*E\n"})
    /* renamed from: androidx.activity.result.contract.b$l */
    public static final class C0289l extends C0266a<String, Boolean> {
        @C12579k
        /* renamed from: d */
        public Intent mo869a(@C12579k Context context, @C12579k String str) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(str, "input");
            return C0287k.f813a.mo943a(new String[]{str});
        }

        @C12580l
        /* renamed from: e */
        public C0266a.C0267a<Boolean> mo898b(@C12579k Context context, @C12579k String str) {
            boolean z;
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(str, "input");
            if (C17318d.m79718a(context, str) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new C0266a.C0267a<>(Boolean.TRUE);
            }
            return null;
        }

        @C12579k
        /* renamed from: f */
        public Boolean mo870c(int i, @C12580l Intent intent) {
            boolean z;
            boolean z2;
            if (intent == null || i != -1) {
                return Boolean.FALSE;
            }
            int[] intArrayExtra = intent.getIntArrayExtra(C0287k.f816d);
            boolean z3 = false;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    }
                    if (intArrayExtra[i2] == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                if (z) {
                    z3 = true;
                }
            }
            return Boolean.valueOf(z3);
        }
    }

    /* renamed from: androidx.activity.result.contract.b$m */
    public static final class C0290m extends C0266a<Intent, ActivityResult> {
        @C12579k

        /* renamed from: a */
        public static final C0291a f817a = new C0291a((DefaultConstructorMarker) null);
        @C12579k

        /* renamed from: b */
        public static final String f818b = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        /* renamed from: androidx.activity.result.contract.b$m$a */
        public static final class C0291a {
            public /* synthetic */ C0291a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C0291a() {
            }
        }

        @C12579k
        /* renamed from: d */
        public Intent mo869a(@C12579k Context context, @C12579k Intent intent) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(intent, "input");
            return intent;
        }

        @C12579k
        /* renamed from: e */
        public ActivityResult mo870c(int i, @C12580l Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* renamed from: androidx.activity.result.contract.b$n */
    public static final class C0292n extends C0266a<IntentSenderRequest, ActivityResult> {
        @C12579k

        /* renamed from: a */
        public static final C0293a f819a = new C0293a((DefaultConstructorMarker) null);
        @C12579k

        /* renamed from: b */
        public static final String f820b = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";
        @C12579k

        /* renamed from: c */
        public static final String f821c = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";
        @C12579k

        /* renamed from: d */
        public static final String f822d = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        /* renamed from: androidx.activity.result.contract.b$n$a */
        public static final class C0293a {
            public /* synthetic */ C0293a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C0293a() {
            }
        }

        @C12579k
        /* renamed from: d */
        public Intent mo869a(@C12579k Context context, @C12579k IntentSenderRequest intentSenderRequest) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(intentSenderRequest, "input");
            Intent putExtra = new Intent(f820b).putExtra(f821c, intentSenderRequest);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
            return putExtra;
        }

        @C12579k
        /* renamed from: e */
        public ActivityResult mo870c(int i, @C12580l Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* renamed from: androidx.activity.result.contract.b$o */
    public static class C0294o extends C0266a<Uri, Boolean> {
        @C12579k
        @C0346i
        /* renamed from: d */
        public Intent mo869a(@C12579k Context context, @C12579k Uri uri) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(uri, "input");
            Intent putExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        @C12580l
        /* renamed from: e */
        public final C0266a.C0267a<Boolean> mo898b(@C12579k Context context, @C12579k Uri uri) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(uri, "input");
            return null;
        }

        @C12579k
        /* renamed from: f */
        public final Boolean mo870c(int i, @C12580l Intent intent) {
            return Boolean.valueOf(i == -1);
        }
    }

    @C11363r0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$TakePicturePreview\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    /* renamed from: androidx.activity.result.contract.b$p */
    public static class C0295p extends C0266a<Void, Bitmap> {
        @C12579k
        @C0346i
        /* renamed from: d */
        public Intent mo869a(@C12579k Context context, @C12580l Void voidR) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        @C12580l
        /* renamed from: e */
        public final C0266a.C0267a<Bitmap> mo898b(@C12579k Context context, @C12580l Void voidR) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            return null;
        }

        @C12580l
        /* renamed from: f */
        public final Bitmap mo870c(int i, @C12580l Intent intent) {
            boolean z;
            if (i == -1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    @C11395k(message = "The thumbnail bitmap is rarely returned and is not a good signal to determine\n      whether the video was actually successfully captured. Use {@link CaptureVideo} instead.")
    @C11363r0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$TakeVideo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    /* renamed from: androidx.activity.result.contract.b$q */
    public static class C0296q extends C0266a<Uri, Bitmap> {
        @C12579k
        @C0346i
        /* renamed from: d */
        public Intent mo869a(@C12579k Context context, @C12579k Uri uri) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(uri, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        @C12580l
        /* renamed from: e */
        public final C0266a.C0267a<Bitmap> mo898b(@C12579k Context context, @C12579k Uri uri) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(uri, "input");
            return null;
        }

        @C12580l
        /* renamed from: f */
        public final Bitmap mo870c(int i, @C12580l Intent intent) {
            boolean z;
            if (i == -1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    @C0376v0(19)
    @C11363r0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$CreateDocument\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    /* renamed from: androidx.activity.result.contract.b$b */
    public static class C0270b extends C0266a<String, Uri> {
        @C12579k

        /* renamed from: a */
        public final String f800a;

        public C0270b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "mimeType");
            this.f800a = str;
        }

        @C12579k
        @C0346i
        /* renamed from: d */
        public Intent mo869a(@C12579k Context context, @C12579k String str) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(str, "input");
            Intent putExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.f800a).putExtra("android.intent.extra.TITLE", str);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
            return putExtra;
        }

        @C12580l
        /* renamed from: e */
        public final C0266a.C0267a<Uri> mo898b(@C12579k Context context, @C12579k String str) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(str, "input");
            return null;
        }

        @C12580l
        /* renamed from: f */
        public final Uri mo870c(int i, @C12580l Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @C11395k(message = "Using a wildcard mime type with CreateDocument is not recommended as it breaks the automatic handling of file extensions. Instead, specify the mime type by using the constructor that takes an concrete mime type (e.g.., CreateDocument(\"image/png\")).", replaceWith = @C11587t0(expression = "CreateDocument(\"todo/todo\")", imports = {}))
        public C0270b() {
            this("*/*");
        }
    }
}
