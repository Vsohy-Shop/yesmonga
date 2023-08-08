package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0376v0;
import com.carrefour.fid.android.shared.constant.C28531e0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@SuppressLint({"ClassVerificationFailure"})
/* renamed from: androidx.core.graphics.l0 */
public final class C17610l0 {

    /* renamed from: androidx.core.graphics.l0$a */
    public static final class C17611a implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a */
        public final /* synthetic */ C11305q<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, C11079d2> f45984a;

        public C17611a(C11305q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, C11079d2> qVar) {
            this.f45984a = qVar;
        }

        public final void onHeaderDecoded(@C12579k ImageDecoder imageDecoder, @C12579k ImageDecoder.ImageInfo imageInfo, @C12579k ImageDecoder.Source source) {
            Intrinsics.checkNotNullParameter(imageDecoder, "decoder");
            Intrinsics.checkNotNullParameter(imageInfo, C28531e0.f69094x);
            Intrinsics.checkNotNullParameter(source, "source");
            this.f45984a.invoke(imageDecoder, imageInfo, source);
        }
    }

    /* renamed from: androidx.core.graphics.l0$b */
    public static final class C17612b implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a */
        public final /* synthetic */ C11305q<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, C11079d2> f45985a;

        public C17612b(C11305q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, C11079d2> qVar) {
            this.f45985a = qVar;
        }

        public final void onHeaderDecoded(@C12579k ImageDecoder imageDecoder, @C12579k ImageDecoder.ImageInfo imageInfo, @C12579k ImageDecoder.Source source) {
            Intrinsics.checkNotNullParameter(imageDecoder, "decoder");
            Intrinsics.checkNotNullParameter(imageInfo, C28531e0.f69094x);
            Intrinsics.checkNotNullParameter(source, "source");
            this.f45985a.invoke(imageDecoder, imageInfo, source);
        }
    }

    @C0376v0(28)
    @C12579k
    /* renamed from: a */
    public static final Bitmap m80685a(@C12579k ImageDecoder.Source source, @C12579k C11305q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, C11079d2> qVar) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(qVar, "action");
        Bitmap a = ImageDecoder.decodeBitmap(source, C17597i0.m80639a(new C17611a(qVar)));
        Intrinsics.checkNotNullExpressionValue(a, "crossinline action: Imag…ction(info, source)\n    }");
        return a;
    }

    @C0376v0(28)
    @C12579k
    /* renamed from: b */
    public static final Drawable m80686b(@C12579k ImageDecoder.Source source, @C12579k C11305q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, C11079d2> qVar) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(qVar, "action");
        Drawable a = ImageDecoder.decodeDrawable(source, C17597i0.m80639a(new C17612b(qVar)));
        Intrinsics.checkNotNullExpressionValue(a, "crossinline action: Imag…ction(info, source)\n    }");
        return a;
    }
}
