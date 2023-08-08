package com.ortiz.touchview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import androidx.appcompat.widget.AppCompatImageView;
import com.ortiz.touchview.C35295e;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 ú\u00012\u00020\u0001:\u000bû\u0001ü\u0001ý\u0001ty|~_B.\b\u0007\u0012\b\u0010ô\u0001\u001a\u00030ó\u0001\u0012\f\b\u0002\u0010ö\u0001\u001a\u0005\u0018\u00010õ\u0001\u0012\t\b\u0002\u0010÷\u0001\u001a\u00020\u0006¢\u0006\u0006\bø\u0001\u0010ù\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002J(\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0002J \u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0014\u001a\u00020\tH\u0002J \u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0002JB\u0010\u001f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002J\u0010\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020 H\u0002J(\u0010(\u001a\u00020\t2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u0004H\u0002J\u0010\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020)H\u0003J\u000e\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020\u0004J\u0010\u00100\u001a\u00020\t2\u0006\u0010/\u001a\u00020.H\u0016J\u000e\u00103\u001a\u00020\t2\u0006\u00102\u001a\u000201J\u000e\u00106\u001a\u00020\t2\u0006\u00105\u001a\u000204J\u000e\u00109\u001a\u00020\t2\u0006\u00108\u001a\u000207J\u0010\u0010;\u001a\u00020\t2\u0006\u0010:\u001a\u00020\u0006H\u0016J\u0010\u0010>\u001a\u00020\t2\u0006\u0010=\u001a\u00020<H\u0016J\u0012\u0010?\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010B\u001a\u00020\t2\b\u0010A\u001a\u0004\u0018\u00010@H\u0016J\u0010\u0010E\u001a\u00020\t2\u0006\u0010D\u001a\u00020CH\u0016J\b\u0010F\u001a\u00020CH\u0016J\u0006\u0010G\u001a\u00020\tJ\n\u0010I\u001a\u0004\u0018\u00010HH\u0016J\u0010\u0010K\u001a\u00020\t2\u0006\u0010J\u001a\u00020HH\u0016J\u0010\u0010N\u001a\u00020\t2\u0006\u0010M\u001a\u00020LH\u0014J\u0010\u0010Q\u001a\u00020\t2\u0006\u0010P\u001a\u00020OH\u0016J\u000e\u0010S\u001a\u00020\t2\u0006\u0010R\u001a\u00020\fJ\u0006\u0010T\u001a\u00020\tJ\u0006\u0010U\u001a\u00020\tJ\u000e\u0010W\u001a\u00020\t2\u0006\u0010V\u001a\u00020\fJ\u001e\u0010W\u001a\u00020\t2\u0006\u0010V\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fJ(\u0010W\u001a\u00020\t2\u0006\u0010V\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\f2\b\u0010X\u001a\u0004\u0018\u00010CJ\u000e\u0010W\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\u0000J\u0016\u0010Z\u001a\u00020\t2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fJ\u0018\u0010]\u001a\u00020\t2\u0006\u0010[\u001a\u00020\u00062\u0006\u0010\\\u001a\u00020\u0006H\u0014J(\u0010b\u001a\u00020\t2\u0006\u0010^\u001a\u00020\u00062\u0006\u0010_\u001a\u00020\u00062\u0006\u0010`\u001a\u00020\u00062\u0006\u0010a\u001a\u00020\u0006H\u0014J\u0010\u0010d\u001a\u00020\u00042\u0006\u0010c\u001a\u00020\u0006H\u0007J\u0010\u0010e\u001a\u00020\u00042\u0006\u0010c\u001a\u00020\u0006H\u0016J\u0010\u0010f\u001a\u00020\u00042\u0006\u0010c\u001a\u00020\u0006H\u0016J \u0010k\u001a\u00020j2\u0006\u0010g\u001a\u00020\f2\u0006\u0010h\u001a\u00020\f2\u0006\u0010i\u001a\u00020\u0004H\u0004J\u0018\u0010n\u001a\u00020j2\u0006\u0010l\u001a\u00020\f2\u0006\u0010m\u001a\u00020\fH\u0004J\u001e\u0010o\u001a\u00020\t2\u0006\u0010V\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fJ&\u0010o\u001a\u00020\t2\u0006\u0010V\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\f2\u0006\u0010p\u001a\u00020\u0006J0\u0010o\u001a\u00020\t2\u0006\u0010V\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\f2\u0006\u0010p\u001a\u00020\u00062\b\u0010r\u001a\u0004\u0018\u00010qJ(\u0010o\u001a\u00020\t2\u0006\u0010V\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\f2\b\u0010r\u001a\u0004\u0018\u00010qR$\u0010w\u001a\u00020\f2\u0006\u0010s\u001a\u00020\f8\u0006@BX\u000e¢\u0006\f\n\u0004\bt\u0010\n\u001a\u0004\bu\u0010vR\u0016\u0010{\u001a\u00020x8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010}\u001a\u00020x8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b|\u0010zR'\u0010\u0001\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0016\n\u0004\b~\u0010\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010R*\u0010\u0001\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0005\b^\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0005\bg\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bh\u0010R\u001a\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010\nR\u0018\u0010\u0001\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010\nR\u0018\u0010\u0001\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010R\u0018\u0010\u0001\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010\nR\u0018\u0010\u0001\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010\nR\u0018\u0010\u0001\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010\nR\u0018\u0010 \u0001\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010\nR\u001a\u0010¤\u0001\u001a\u00030¡\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R'\u0010©\u0001\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0016\n\u0005\b¥\u0001\u0010\n\u001a\u0005\b¦\u0001\u0010v\"\u0006\b§\u0001\u0010¨\u0001R \u0010­\u0001\u001a\t\u0018\u00010ª\u0001R\u00020\u00008\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0018\u0010¯\u0001\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b®\u0001\u0010\u0013R\u001b\u0010²\u0001\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0018\u0010´\u0001\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b³\u0001\u0010R\u0018\u0010¶\u0001\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bµ\u0001\u0010R\u001c\u0010º\u0001\u001a\u0005\u0018\u00010·\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u0018\u0010¼\u0001\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b»\u0001\u0010\u0013R\u0018\u0010¾\u0001\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b½\u0001\u0010\u0013R\u0018\u0010À\u0001\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b¿\u0001\u0010\u0013R\u0018\u0010Â\u0001\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bÁ\u0001\u0010\u0013R\u0018\u0010Ä\u0001\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bÃ\u0001\u0010\nR\u0018\u0010Æ\u0001\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bÅ\u0001\u0010\nR\u0018\u0010È\u0001\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bÇ\u0001\u0010\nR\u0018\u0010Ê\u0001\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bÉ\u0001\u0010\nR\u001a\u0010Î\u0001\u001a\u00030Ë\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R\u001a\u0010Ò\u0001\u001a\u00030Ï\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u001b\u0010Õ\u0001\u001a\u0004\u0018\u0001078\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010Ô\u0001R\u001b\u0010Ø\u0001\u001a\u0004\u0018\u0001048\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R\u001b\u0010Û\u0001\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010Ú\u0001R\u001b\u0010Þ\u0001\u001a\u0004\u0018\u0001018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R\u0016\u0010à\u0001\u001a\u00020\f8BX\u0004¢\u0006\u0007\u001a\u0005\bß\u0001\u0010vR\u0016\u0010â\u0001\u001a\u00020\f8BX\u0004¢\u0006\u0007\u001a\u0005\bá\u0001\u0010vR\u0014\u0010ä\u0001\u001a\u00020\u00048F¢\u0006\b\u001a\u0006\bã\u0001\u0010\u0001R\u0015\u0010è\u0001\u001a\u00030å\u00018F¢\u0006\b\u001a\u0006\bæ\u0001\u0010ç\u0001R(\u0010ë\u0001\u001a\u00020\f2\u0006\u0010R\u001a\u00020\f8F@FX\u000e¢\u0006\u000f\u001a\u0005\bé\u0001\u0010v\"\u0006\bê\u0001\u0010¨\u0001R)\u0010ï\u0001\u001a\u00020\f2\u0007\u0010ì\u0001\u001a\u00020\f8F@FX\u000e¢\u0006\u000f\u001a\u0005\bí\u0001\u0010v\"\u0006\bî\u0001\u0010¨\u0001R\u0014\u0010ò\u0001\u001a\u00020j8F¢\u0006\b\u001a\u0006\bð\u0001\u0010ñ\u0001¨\u0006þ\u0001"}, mo22516d2 = {"Lcom/ortiz/touchview/TouchImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "N", "", "H", "G", "Lkotlin/d2;", "F", "E", "", "trans", "viewSize", "contentSize", "offset", "J", "delta", "I", "D", "mode", "size", "drawableWidth", "S", "prevImageSize", "imageSize", "prevViewSize", "drawableSize", "Lcom/ortiz/touchview/FixedPixel;", "sizeChangeFixedPixel", "M", "Lcom/ortiz/touchview/ImageActionState;", "imageActionState", "setState", "", "deltaScale", "focusX", "focusY", "stretchImageToSuper", "R", "Ljava/lang/Runnable;", "runnable", "C", "rotateImageToFitScreen", "setRotateImageToFitScreen", "Landroid/view/View$OnTouchListener;", "onTouchListener", "setOnTouchListener", "Lcom/ortiz/touchview/c;", "onTouchImageViewListener", "setOnTouchImageViewListener", "Landroid/view/GestureDetector$OnDoubleTapListener;", "onDoubleTapListener", "setOnDoubleTapListener", "Lcom/ortiz/touchview/b;", "onTouchCoordinatesListener", "setOnTouchCoordinatesListener", "resId", "setImageResource", "Landroid/graphics/Bitmap;", "bm", "setImageBitmap", "setImageDrawable", "Landroid/net/Uri;", "uri", "setImageURI", "Landroid/widget/ImageView$ScaleType;", "type", "setScaleType", "getScaleType", "Q", "Landroid/os/Parcelable;", "onSaveInstanceState", "state", "onRestoreInstanceState", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "max", "setMaxZoomRatio", "O", "P", "scale", "setZoom", "scaleType", "img", "setScrollPosition", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "w", "h", "oldw", "oldh", "onSizeChanged", "direction", "B", "canScrollHorizontally", "canScrollVertically", "x", "y", "clipToBitmap", "Landroid/graphics/PointF;", "U", "bx", "by", "T", "setZoomAnimated", "zoomTimeMs", "Lcom/ortiz/touchview/d;", "listener", "<set-?>", "d", "getCurrentZoom", "()F", "currentZoom", "Landroid/graphics/Matrix;", "e", "Landroid/graphics/Matrix;", "touchMatrix", "f", "prevMatrix", "g", "Z", "K", "()Z", "setZoomEnabled", "(Z)V", "isZoomEnabled", "v", "isRotateImageToFitScreen", "Lcom/ortiz/touchview/FixedPixel;", "getOrientationChangeFixedPixel", "()Lcom/ortiz/touchview/FixedPixel;", "setOrientationChangeFixedPixel", "(Lcom/ortiz/touchview/FixedPixel;)V", "orientationChangeFixedPixel", "getViewSizeChangeFixedPixel", "setViewSizeChangeFixedPixel", "viewSizeChangeFixedPixel", "orientationJustChanged", "z", "Lcom/ortiz/touchview/ImageActionState;", "E0", "userSpecifiedMinScale", "F0", "minScale", "G0", "maxScaleIsSetByMultiplier", "H0", "maxScaleMultiplier", "I0", "maxScale", "J0", "superMinScale", "K0", "superMaxScale", "", "L0", "[F", "floatMatrix", "M0", "getDoubleTapScale", "setDoubleTapScale", "(F)V", "doubleTapScale", "Lcom/ortiz/touchview/TouchImageView$e;", "N0", "Lcom/ortiz/touchview/TouchImageView$e;", "fling", "O0", "orientation", "P0", "Landroid/widget/ImageView$ScaleType;", "touchScaleType", "Q0", "imageRenderedAtLeastOnce", "R0", "onDrawReady", "Lcom/ortiz/touchview/f;", "S0", "Lcom/ortiz/touchview/f;", "delayedZoomVariables", "T0", "viewWidth", "U0", "viewHeight", "V0", "prevViewWidth", "W0", "prevViewHeight", "X0", "matchViewWidth", "Y0", "matchViewHeight", "Z0", "prevMatchViewWidth", "a1", "prevMatchViewHeight", "Landroid/view/ScaleGestureDetector;", "b1", "Landroid/view/ScaleGestureDetector;", "scaleDetector", "Landroid/view/GestureDetector;", "c1", "Landroid/view/GestureDetector;", "gestureDetector", "d1", "Lcom/ortiz/touchview/b;", "touchCoordinatesListener", "e1", "Landroid/view/GestureDetector$OnDoubleTapListener;", "doubleTapListener", "f1", "Landroid/view/View$OnTouchListener;", "userTouchListener", "g1", "Lcom/ortiz/touchview/c;", "touchImageViewListener", "getImageWidth", "imageWidth", "getImageHeight", "imageHeight", "L", "isZoomed", "Landroid/graphics/RectF;", "getZoomedRect", "()Landroid/graphics/RectF;", "zoomedRect", "getMaxZoom", "setMaxZoom", "maxZoom", "min", "getMinZoom", "setMinZoom", "minZoom", "getScrollPosition", "()Landroid/graphics/PointF;", "scrollPosition", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "h1", "a", "b", "c", "touchview_release"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public class TouchImageView extends AppCompatImageView {
    @C12579k

    /* renamed from: h1 */
    public static final C35283b f86687h1 = new C35283b((DefaultConstructorMarker) null);

    /* renamed from: i1 */
    public static final float f86688i1 = 0.75f;

    /* renamed from: j1 */
    public static final float f86689j1 = 1.25f;

    /* renamed from: k1 */
    public static final int f86690k1 = 500;

    /* renamed from: l1 */
    public static final float f86691l1 = -1.0f;

    /* renamed from: E0 */
    public float f86692E0;

    /* renamed from: F0 */
    public float f86693F0;

    /* renamed from: G0 */
    public boolean f86694G0;

    /* renamed from: H0 */
    public float f86695H0;

    /* renamed from: I0 */
    public float f86696I0;

    /* renamed from: J0 */
    public float f86697J0;

    /* renamed from: K0 */
    public float f86698K0;
    @C12579k

    /* renamed from: L0 */
    public float[] f86699L0;

    /* renamed from: M0 */
    public float f86700M0;
    @C12580l

    /* renamed from: N0 */
    public C35286e f86701N0;

    /* renamed from: O0 */
    public int f86702O0;
    @C12580l

    /* renamed from: P0 */
    public ImageView.ScaleType f86703P0;

    /* renamed from: Q0 */
    public boolean f86704Q0;

    /* renamed from: R0 */
    public boolean f86705R0;
    @C12580l

    /* renamed from: S0 */
    public C35309f f86706S0;

    /* renamed from: T0 */
    public int f86707T0;

    /* renamed from: U0 */
    public int f86708U0;

    /* renamed from: V0 */
    public int f86709V0;

    /* renamed from: W0 */
    public int f86710W0;

    /* renamed from: X0 */
    public float f86711X0;

    /* renamed from: Y0 */
    public float f86712Y0;

    /* renamed from: Z0 */
    public float f86713Z0;

    /* renamed from: a1 */
    public float f86714a1;
    @C12579k

    /* renamed from: b1 */
    public ScaleGestureDetector f86715b1;
    @C12579k

    /* renamed from: c1 */
    public GestureDetector f86716c1;

    /* renamed from: d */
    public float f86717d;
    @C12580l

    /* renamed from: d1 */
    public C35292b f86718d1;
    @C12579k

    /* renamed from: e */
    public Matrix f86719e;
    @C12580l

    /* renamed from: e1 */
    public GestureDetector.OnDoubleTapListener f86720e1;
    @C12579k

    /* renamed from: f */
    public Matrix f86721f;
    @C12580l

    /* renamed from: f1 */
    public View.OnTouchListener f86722f1;

    /* renamed from: g */
    public boolean f86723g;
    @C12580l

    /* renamed from: g1 */
    public C35293c f86724g1;

    /* renamed from: v */
    public boolean f86725v;
    @C12580l

    /* renamed from: w */
    public FixedPixel f86726w;
    @C12580l

    /* renamed from: x */
    public FixedPixel f86727x;

    /* renamed from: y */
    public boolean f86728y;
    @C12580l

    /* renamed from: z */
    public ImageActionState f86729z;

    /* renamed from: com.ortiz.touchview.TouchImageView$a */
    public final class C35282a implements Runnable {

        /* renamed from: a */
        public final int f86730a;

        /* renamed from: b */
        public final long f86731b;

        /* renamed from: c */
        public final float f86732c;

        /* renamed from: d */
        public final float f86733d;
        @C12579k

        /* renamed from: e */
        public final PointF f86734e;
        @C12579k

        /* renamed from: f */
        public final PointF f86735f;
        @C12579k

        /* renamed from: g */
        public final LinearInterpolator f86736g = new LinearInterpolator();
        @C12580l

        /* renamed from: v */
        public C35294d f86737v;

        /* renamed from: w */
        public final /* synthetic */ TouchImageView f86738w;

        public C35282a(TouchImageView touchImageView, @C12579k float f, PointF pointF, int i) {
            Intrinsics.checkNotNullParameter(touchImageView, "this$0");
            Intrinsics.checkNotNullParameter(pointF, "focus");
            this.f86738w = touchImageView;
            touchImageView.setState(ImageActionState.ANIMATE_ZOOM);
            this.f86731b = System.currentTimeMillis();
            this.f86732c = touchImageView.getCurrentZoom();
            this.f86733d = f;
            this.f86730a = i;
            this.f86734e = touchImageView.getScrollPosition();
            this.f86735f = pointF;
        }

        /* renamed from: a */
        public final float mo105693a() {
            return this.f86736g.getInterpolation(Math.min(1.0f, ((float) (System.currentTimeMillis() - this.f86731b)) / ((float) this.f86730a)));
        }

        /* renamed from: b */
        public final void mo105694b(@C12580l C35294d dVar) {
            this.f86737v = dVar;
        }

        public void run() {
            float a = mo105693a();
            float f = this.f86732c;
            float f2 = f + ((this.f86733d - f) * a);
            PointF pointF = this.f86734e;
            float f3 = pointF.x;
            PointF pointF2 = this.f86735f;
            float f4 = pointF.y;
            float f5 = f4 + ((pointF2.y - f4) * a);
            this.f86738w.setZoom(f2, f3 + ((pointF2.x - f3) * a), f5);
            if (a < 1.0f) {
                this.f86738w.mo105635C(this);
                return;
            }
            this.f86738w.setState(ImageActionState.NONE);
            C35294d dVar = this.f86737v;
            if (dVar != null) {
                dVar.mo105727a();
            }
        }
    }

    /* renamed from: com.ortiz.touchview.TouchImageView$b */
    public static final class C35283b {
        public /* synthetic */ C35283b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C35283b() {
        }
    }

    /* renamed from: com.ortiz.touchview.TouchImageView$c */
    public final class C35284c {
        @C12579k

        /* renamed from: a */
        public OverScroller f86739a;

        /* renamed from: b */
        public final /* synthetic */ TouchImageView f86740b;

        public C35284c(@C12580l TouchImageView touchImageView, Context context) {
            Intrinsics.checkNotNullParameter(touchImageView, "this$0");
            this.f86740b = touchImageView;
            this.f86739a = new OverScroller(context);
        }

        /* renamed from: a */
        public final boolean mo105696a() {
            this.f86739a.computeScrollOffset();
            return this.f86739a.computeScrollOffset();
        }

        /* renamed from: b */
        public final void mo105697b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f86739a.fling(i, i2, i3, i4, i5, i6, i7, i8);
        }

        /* renamed from: c */
        public final void mo105698c(boolean z) {
            this.f86739a.forceFinished(z);
        }

        /* renamed from: d */
        public final int mo105699d() {
            return this.f86739a.getCurrX();
        }

        /* renamed from: e */
        public final int mo105700e() {
            return this.f86739a.getCurrY();
        }

        @C12579k
        /* renamed from: f */
        public final OverScroller mo105701f() {
            return this.f86739a;
        }

        /* renamed from: g */
        public final boolean mo105702g() {
            return this.f86739a.isFinished();
        }

        /* renamed from: h */
        public final void mo105703h(@C12579k OverScroller overScroller) {
            Intrinsics.checkNotNullParameter(overScroller, "<set-?>");
            this.f86739a = overScroller;
        }
    }

    /* renamed from: com.ortiz.touchview.TouchImageView$d */
    public final class C35285d implements Runnable {

        /* renamed from: a */
        public final long f86741a;

        /* renamed from: b */
        public final float f86742b;

        /* renamed from: c */
        public final float f86743c;

        /* renamed from: d */
        public final float f86744d;

        /* renamed from: e */
        public final float f86745e;

        /* renamed from: f */
        public final boolean f86746f;
        @C12579k

        /* renamed from: g */
        public final AccelerateDecelerateInterpolator f86747g = new AccelerateDecelerateInterpolator();
        @C12579k

        /* renamed from: v */
        public final PointF f86748v;
        @C12579k

        /* renamed from: w */
        public final PointF f86749w;

        /* renamed from: x */
        public final /* synthetic */ TouchImageView f86750x;

        public C35285d(TouchImageView touchImageView, float f, float f2, float f3, boolean z) {
            Intrinsics.checkNotNullParameter(touchImageView, "this$0");
            this.f86750x = touchImageView;
            touchImageView.setState(ImageActionState.ANIMATE_ZOOM);
            this.f86741a = System.currentTimeMillis();
            this.f86742b = touchImageView.getCurrentZoom();
            this.f86743c = f;
            this.f86746f = z;
            PointF U = touchImageView.mo105653U(f2, f3, false);
            float f4 = U.x;
            this.f86744d = f4;
            float f5 = U.y;
            this.f86745e = f5;
            this.f86748v = touchImageView.mo105652T(f4, f5);
            this.f86749w = new PointF((float) (touchImageView.f86707T0 / 2), (float) (touchImageView.f86708U0 / 2));
        }

        /* renamed from: a */
        public final double mo105704a(float f) {
            float f2 = this.f86742b;
            return (((double) f2) + (((double) f) * ((double) (this.f86743c - f2)))) / ((double) this.f86750x.getCurrentZoom());
        }

        /* renamed from: c */
        public final float mo105705c() {
            return this.f86747g.getInterpolation(Math.min(1.0f, ((float) (System.currentTimeMillis() - this.f86741a)) / 500.0f));
        }

        /* renamed from: d */
        public final void mo105706d(float f) {
            PointF pointF = this.f86748v;
            float f2 = pointF.x;
            PointF pointF2 = this.f86749w;
            float f3 = f2 + ((pointF2.x - f2) * f);
            float f4 = pointF.y;
            float f5 = f4 + (f * (pointF2.y - f4));
            PointF T = this.f86750x.mo105652T(this.f86744d, this.f86745e);
            this.f86750x.f86719e.postTranslate(f3 - T.x, f5 - T.y);
        }

        public void run() {
            if (this.f86750x.getDrawable() == null) {
                this.f86750x.setState(ImageActionState.NONE);
                return;
            }
            float c = mo105705c();
            this.f86750x.mo105650R(mo105704a(c), this.f86744d, this.f86745e, this.f86746f);
            mo105706d(c);
            this.f86750x.mo105637E();
            TouchImageView touchImageView = this.f86750x;
            touchImageView.setImageMatrix(touchImageView.f86719e);
            C35293c r = this.f86750x.f86724g1;
            if (r != null) {
                r.mo105726a();
            }
            if (c < 1.0f) {
                this.f86750x.mo105635C(this);
            } else {
                this.f86750x.setState(ImageActionState.NONE);
            }
        }
    }

    /* renamed from: com.ortiz.touchview.TouchImageView$e */
    public final class C35286e implements Runnable {
        @C12579k

        /* renamed from: a */
        public C35284c f86751a;

        /* renamed from: b */
        public int f86752b;

        /* renamed from: c */
        public int f86753c;

        /* renamed from: d */
        public final /* synthetic */ TouchImageView f86754d;

        public C35286e(TouchImageView touchImageView, int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            Intrinsics.checkNotNullParameter(touchImageView, "this$0");
            this.f86754d = touchImageView;
            touchImageView.setState(ImageActionState.FLING);
            this.f86751a = new C35284c(touchImageView, touchImageView.getContext());
            touchImageView.f86719e.getValues(touchImageView.f86699L0);
            int i7 = (int) touchImageView.f86699L0[2];
            int i8 = (int) touchImageView.f86699L0[5];
            if (touchImageView.f86725v && touchImageView.mo105646N(touchImageView.getDrawable())) {
                i7 -= (int) touchImageView.getImageWidth();
            }
            if (touchImageView.getImageWidth() > ((float) touchImageView.f86707T0)) {
                i4 = touchImageView.f86707T0 - ((int) touchImageView.getImageWidth());
                i3 = 0;
            } else {
                i4 = i7;
                i3 = i4;
            }
            if (touchImageView.getImageHeight() > ((float) touchImageView.f86708U0)) {
                i6 = touchImageView.f86708U0 - ((int) touchImageView.getImageHeight());
                i5 = 0;
            } else {
                i6 = i8;
                i5 = i6;
            }
            this.f86751a.mo105697b(i7, i8, i, i2, i4, i3, i6, i5);
            this.f86752b = i7;
            this.f86753c = i8;
        }

        /* renamed from: a */
        public final void mo105708a() {
            this.f86754d.setState(ImageActionState.NONE);
            this.f86751a.mo105698c(true);
        }

        /* renamed from: c */
        public final int mo105709c() {
            return this.f86752b;
        }

        /* renamed from: d */
        public final int mo105710d() {
            return this.f86753c;
        }

        @C12579k
        /* renamed from: e */
        public final C35284c mo105711e() {
            return this.f86751a;
        }

        /* renamed from: f */
        public final void mo105712f(int i) {
            this.f86752b = i;
        }

        /* renamed from: g */
        public final void mo105713g(int i) {
            this.f86753c = i;
        }

        /* renamed from: h */
        public final void mo105714h(@C12579k C35284c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f86751a = cVar;
        }

        public void run() {
            C35293c r = this.f86754d.f86724g1;
            if (r != null) {
                r.mo105726a();
            }
            if (!this.f86751a.mo105702g() && this.f86751a.mo105696a()) {
                int d = this.f86751a.mo105699d();
                int e = this.f86751a.mo105700e();
                int i = d - this.f86752b;
                int i2 = e - this.f86753c;
                this.f86752b = d;
                this.f86753c = e;
                this.f86754d.f86719e.postTranslate((float) i, (float) i2);
                this.f86754d.mo105638F();
                TouchImageView touchImageView = this.f86754d;
                touchImageView.setImageMatrix(touchImageView.f86719e);
                this.f86754d.mo105635C(this);
            }
        }
    }

    /* renamed from: com.ortiz.touchview.TouchImageView$f */
    public final class C35287f extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        public final /* synthetic */ TouchImageView f86755a;

        public C35287f(TouchImageView touchImageView) {
            Intrinsics.checkNotNullParameter(touchImageView, "this$0");
            this.f86755a = touchImageView;
        }

        public boolean onDoubleTap(@C12580l MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            float f;
            boolean z3 = false;
            if (motionEvent == null || !this.f86755a.mo105643K()) {
                return false;
            }
            GestureDetector.OnDoubleTapListener f2 = this.f86755a.f86720e1;
            if (f2 == null) {
                z = false;
            } else {
                z = f2.onDoubleTap(motionEvent);
            }
            if (this.f86755a.f86729z != ImageActionState.NONE) {
                return z;
            }
            if (this.f86755a.getDoubleTapScale() == 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                f = this.f86755a.f86696I0;
            } else {
                f = this.f86755a.getDoubleTapScale();
            }
            if (this.f86755a.getCurrentZoom() == this.f86755a.f86693F0) {
                z3 = true;
            }
            if (!z3) {
                f = this.f86755a.f86693F0;
            }
            this.f86755a.mo105635C(new C35285d(this.f86755a, f, motionEvent.getX(), motionEvent.getY(), false));
            return true;
        }

        public boolean onDoubleTapEvent(@C12580l MotionEvent motionEvent) {
            GestureDetector.OnDoubleTapListener f = this.f86755a.f86720e1;
            if (f == null) {
                return false;
            }
            return f.onDoubleTapEvent(motionEvent);
        }

        public boolean onFling(@C12580l MotionEvent motionEvent, @C12580l MotionEvent motionEvent2, float f, float f2) {
            C35286e h = this.f86755a.f86701N0;
            if (h != null) {
                h.mo105708a();
            }
            TouchImageView touchImageView = this.f86755a;
            C35286e eVar = new C35286e(touchImageView, (int) f, (int) f2);
            this.f86755a.mo105635C(eVar);
            C11079d2 d2Var = C11079d2.f28267a;
            touchImageView.f86701N0 = eVar;
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }

        public void onLongPress(@C12580l MotionEvent motionEvent) {
            this.f86755a.performLongClick();
        }

        public boolean onSingleTapConfirmed(@C12580l MotionEvent motionEvent) {
            GestureDetector.OnDoubleTapListener f = this.f86755a.f86720e1;
            Boolean valueOf = f == null ? null : Boolean.valueOf(f.onSingleTapConfirmed(motionEvent));
            return valueOf == null ? this.f86755a.performClick() : valueOf.booleanValue();
        }
    }

    /* renamed from: com.ortiz.touchview.TouchImageView$g */
    public final class C35288g implements View.OnTouchListener {
        @C12579k

        /* renamed from: a */
        public final PointF f86756a = new PointF();

        /* renamed from: b */
        public final /* synthetic */ TouchImageView f86757b;

        public C35288g(TouchImageView touchImageView) {
            Intrinsics.checkNotNullParameter(touchImageView, "this$0");
            this.f86757b = touchImageView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x006d, code lost:
            if (r1 != 6) goto L_0x00de;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouch(@org.jetbrains.annotations.C12579k android.view.View r8, @org.jetbrains.annotations.C12579k android.view.MotionEvent r9) {
            /*
                r7 = this;
                java.lang.String r0 = "v"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                java.lang.String r0 = "event"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                com.ortiz.touchview.TouchImageView r0 = r7.f86757b
                android.graphics.drawable.Drawable r0 = r0.getDrawable()
                if (r0 != 0) goto L_0x001b
                com.ortiz.touchview.TouchImageView r8 = r7.f86757b
                com.ortiz.touchview.ImageActionState r9 = com.ortiz.touchview.ImageActionState.NONE
                r8.setState(r9)
                r8 = 0
                return r8
            L_0x001b:
                com.ortiz.touchview.TouchImageView r0 = r7.f86757b
                boolean r0 = r0.mo105643K()
                if (r0 == 0) goto L_0x002c
                com.ortiz.touchview.TouchImageView r0 = r7.f86757b
                android.view.ScaleGestureDetector r0 = r0.f86715b1
                r0.onTouchEvent(r9)
            L_0x002c:
                com.ortiz.touchview.TouchImageView r0 = r7.f86757b
                android.view.GestureDetector r0 = r0.f86716c1
                r0.onTouchEvent(r9)
                android.graphics.PointF r0 = new android.graphics.PointF
                float r1 = r9.getX()
                float r2 = r9.getY()
                r0.<init>(r1, r2)
                com.ortiz.touchview.TouchImageView r1 = r7.f86757b
                com.ortiz.touchview.ImageActionState r1 = r1.f86729z
                com.ortiz.touchview.ImageActionState r2 = com.ortiz.touchview.ImageActionState.NONE
                r3 = 1
                if (r1 == r2) goto L_0x0061
                com.ortiz.touchview.TouchImageView r1 = r7.f86757b
                com.ortiz.touchview.ImageActionState r1 = r1.f86729z
                com.ortiz.touchview.ImageActionState r4 = com.ortiz.touchview.ImageActionState.DRAG
                if (r1 == r4) goto L_0x0061
                com.ortiz.touchview.TouchImageView r1 = r7.f86757b
                com.ortiz.touchview.ImageActionState r1 = r1.f86729z
                com.ortiz.touchview.ImageActionState r4 = com.ortiz.touchview.ImageActionState.FLING
                if (r1 != r4) goto L_0x00de
            L_0x0061:
                int r1 = r9.getAction()
                if (r1 == 0) goto L_0x00c6
                if (r1 == r3) goto L_0x00c0
                r4 = 2
                if (r1 == r4) goto L_0x0070
                r0 = 6
                if (r1 == r0) goto L_0x00c0
                goto L_0x00de
            L_0x0070:
                com.ortiz.touchview.TouchImageView r1 = r7.f86757b
                com.ortiz.touchview.ImageActionState r1 = r1.f86729z
                com.ortiz.touchview.ImageActionState r2 = com.ortiz.touchview.ImageActionState.DRAG
                if (r1 != r2) goto L_0x00de
                float r1 = r0.x
                android.graphics.PointF r2 = r7.f86756a
                float r4 = r2.x
                float r1 = r1 - r4
                float r4 = r0.y
                float r2 = r2.y
                float r4 = r4 - r2
                com.ortiz.touchview.TouchImageView r2 = r7.f86757b
                int r5 = r2.f86707T0
                float r5 = (float) r5
                com.ortiz.touchview.TouchImageView r6 = r7.f86757b
                float r6 = r6.getImageWidth()
                float r1 = r2.mo105641I(r1, r5, r6)
                com.ortiz.touchview.TouchImageView r2 = r7.f86757b
                int r5 = r2.f86708U0
                float r5 = (float) r5
                com.ortiz.touchview.TouchImageView r6 = r7.f86757b
                float r6 = r6.getImageHeight()
                float r2 = r2.mo105641I(r4, r5, r6)
                com.ortiz.touchview.TouchImageView r4 = r7.f86757b
                android.graphics.Matrix r4 = r4.f86719e
                r4.postTranslate(r1, r2)
                com.ortiz.touchview.TouchImageView r1 = r7.f86757b
                r1.mo105638F()
                android.graphics.PointF r1 = r7.f86756a
                float r2 = r0.x
                float r0 = r0.y
                r1.set(r2, r0)
                goto L_0x00de
            L_0x00c0:
                com.ortiz.touchview.TouchImageView r0 = r7.f86757b
                r0.setState(r2)
                goto L_0x00de
            L_0x00c6:
                android.graphics.PointF r1 = r7.f86756a
                r1.set(r0)
                com.ortiz.touchview.TouchImageView r0 = r7.f86757b
                com.ortiz.touchview.TouchImageView$e r0 = r0.f86701N0
                if (r0 != 0) goto L_0x00d4
                goto L_0x00d7
            L_0x00d4:
                r0.mo105708a()
            L_0x00d7:
                com.ortiz.touchview.TouchImageView r0 = r7.f86757b
                com.ortiz.touchview.ImageActionState r1 = com.ortiz.touchview.ImageActionState.DRAG
                r0.setState(r1)
            L_0x00de:
                com.ortiz.touchview.TouchImageView r0 = r7.f86757b
                com.ortiz.touchview.b r0 = r0.f86718d1
                if (r0 != 0) goto L_0x00e7
                goto L_0x00f8
            L_0x00e7:
                com.ortiz.touchview.TouchImageView r1 = r7.f86757b
                float r2 = r9.getX()
                float r4 = r9.getY()
                android.graphics.PointF r1 = r1.mo105653U(r2, r4, r3)
                r0.mo105725a(r8, r9, r1)
            L_0x00f8:
                com.ortiz.touchview.TouchImageView r0 = r7.f86757b
                android.graphics.Matrix r1 = r0.f86719e
                r0.setImageMatrix(r1)
                com.ortiz.touchview.TouchImageView r0 = r7.f86757b
                android.view.View$OnTouchListener r0 = r0.f86722f1
                if (r0 != 0) goto L_0x010a
                goto L_0x010d
            L_0x010a:
                r0.onTouch(r8, r9)
            L_0x010d:
                com.ortiz.touchview.TouchImageView r8 = r7.f86757b
                com.ortiz.touchview.c r8 = r8.f86724g1
                if (r8 != 0) goto L_0x0116
                goto L_0x0119
            L_0x0116:
                r8.mo105726a()
            L_0x0119:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ortiz.touchview.TouchImageView.C35288g.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: com.ortiz.touchview.TouchImageView$h */
    public final class C35289h extends ScaleGestureDetector.SimpleOnScaleGestureListener {

        /* renamed from: a */
        public final /* synthetic */ TouchImageView f86758a;

        public C35289h(TouchImageView touchImageView) {
            Intrinsics.checkNotNullParameter(touchImageView, "this$0");
            this.f86758a = touchImageView;
        }

        public boolean onScale(@C12579k ScaleGestureDetector scaleGestureDetector) {
            Intrinsics.checkNotNullParameter(scaleGestureDetector, "detector");
            this.f86758a.mo105650R((double) scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), true);
            C35293c r = this.f86758a.f86724g1;
            if (r == null) {
                return true;
            }
            r.mo105726a();
            return true;
        }

        public boolean onScaleBegin(@C12579k ScaleGestureDetector scaleGestureDetector) {
            Intrinsics.checkNotNullParameter(scaleGestureDetector, "detector");
            this.f86758a.setState(ImageActionState.ZOOM);
            return true;
        }

        public void onScaleEnd(@C12579k ScaleGestureDetector scaleGestureDetector) {
            Intrinsics.checkNotNullParameter(scaleGestureDetector, "detector");
            super.onScaleEnd(scaleGestureDetector);
            this.f86758a.setState(ImageActionState.NONE);
            float currentZoom = this.f86758a.getCurrentZoom();
            boolean z = true;
            if (this.f86758a.getCurrentZoom() > this.f86758a.f86696I0) {
                currentZoom = this.f86758a.f86696I0;
            } else if (this.f86758a.getCurrentZoom() < this.f86758a.f86693F0) {
                currentZoom = this.f86758a.f86693F0;
            } else {
                z = false;
            }
            float f = currentZoom;
            if (z) {
                TouchImageView touchImageView = this.f86758a;
                this.f86758a.mo105635C(new C35285d(touchImageView, f, (float) (touchImageView.f86707T0 / 2), (float) (this.f86758a.f86708U0 / 2), true));
            }
        }
    }

    /* renamed from: com.ortiz.touchview.TouchImageView$i */
    public /* synthetic */ class C35290i {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            iArr[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            iArr[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            iArr[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public TouchImageView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* access modifiers changed from: private */
    public final float getImageHeight() {
        return this.f86712Y0 * this.f86717d;
    }

    /* access modifiers changed from: private */
    public final float getImageWidth() {
        return this.f86711X0 * this.f86717d;
    }

    /* access modifiers changed from: private */
    public final void setState(ImageActionState imageActionState) {
        this.f86729z = imageActionState;
    }

    @C11395k(message = "")
    /* renamed from: B */
    public final boolean mo105634B(int i) {
        return canScrollHorizontally(i);
    }

    @TargetApi(16)
    /* renamed from: C */
    public final void mo105635C(Runnable runnable) {
        postOnAnimation(runnable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0108, code lost:
        if (r4 != false) goto L_0x010a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f4  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo105636D() {
        /*
            r17 = this;
            r8 = r17
            boolean r0 = r8.f86728y
            if (r0 == 0) goto L_0x0009
            com.ortiz.touchview.FixedPixel r0 = r8.f86726w
            goto L_0x000b
        L_0x0009:
            com.ortiz.touchview.FixedPixel r0 = r8.f86727x
        L_0x000b:
            r9 = r0
            r0 = 0
            r8.f86728y = r0
            android.graphics.drawable.Drawable r1 = r17.getDrawable()
            if (r1 == 0) goto L_0x0169
            int r2 = r1.getIntrinsicWidth()
            if (r2 == 0) goto L_0x0169
            int r2 = r1.getIntrinsicHeight()
            if (r2 != 0) goto L_0x0023
            goto L_0x0169
        L_0x0023:
            android.graphics.Matrix r2 = r8.f86719e
            if (r2 == 0) goto L_0x0169
            android.graphics.Matrix r2 = r8.f86721f
            if (r2 != 0) goto L_0x002d
            goto L_0x0169
        L_0x002d:
            float r2 = r8.f86692E0
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0037
            r2 = 1
            goto L_0x0038
        L_0x0037:
            r2 = r0
        L_0x0038:
            if (r2 == 0) goto L_0x0047
            r8.setMinZoom(r3)
            float r2 = r8.f86717d
            float r3 = r8.f86693F0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0047
            r8.f86717d = r3
        L_0x0047:
            int r6 = r8.mo105640H(r1)
            int r10 = r8.mo105639G(r1)
            int r2 = r8.f86707T0
            float r2 = (float) r2
            float r3 = (float) r6
            float r2 = r2 / r3
            int r5 = r8.f86708U0
            float r5 = (float) r5
            float r7 = (float) r10
            float r5 = r5 / r7
            android.widget.ImageView$ScaleType r11 = r8.f86703P0
            if (r11 != 0) goto L_0x005f
            r11 = -1
            goto L_0x0067
        L_0x005f:
            int[] r13 = com.ortiz.touchview.TouchImageView.C35290i.$EnumSwitchMapping$0
            int r11 = r11.ordinal()
            r11 = r13[r11]
        L_0x0067:
            r13 = 1065353216(0x3f800000, float:1.0)
            switch(r11) {
                case 1: goto L_0x0084;
                case 2: goto L_0x007f;
                case 3: goto L_0x0072;
                case 4: goto L_0x006d;
                case 5: goto L_0x006d;
                case 6: goto L_0x006d;
                default: goto L_0x006c;
            }
        L_0x006c:
            goto L_0x0086
        L_0x006d:
            float r2 = java.lang.Math.min(r2, r5)
            goto L_0x0085
        L_0x0072:
            float r2 = java.lang.Math.min(r2, r5)
            float r2 = java.lang.Math.min(r13, r2)
            float r2 = java.lang.Math.min(r2, r2)
            goto L_0x0085
        L_0x007f:
            float r2 = java.lang.Math.max(r2, r5)
            goto L_0x0085
        L_0x0084:
            r2 = r13
        L_0x0085:
            r5 = r2
        L_0x0086:
            int r11 = r8.f86707T0
            float r14 = (float) r11
            float r15 = r2 * r3
            float r14 = r14 - r15
            int r15 = r8.f86708U0
            float r4 = (float) r15
            float r16 = r5 * r7
            float r4 = r4 - r16
            float r11 = (float) r11
            float r11 = r11 - r14
            r8.f86711X0 = r11
            float r11 = (float) r15
            float r11 = r11 - r4
            r8.f86712Y0 = r11
            boolean r11 = r17.mo105644L()
            r15 = 5
            r12 = 2
            r0 = 0
            if (r11 != 0) goto L_0x00f4
            boolean r11 = r8.f86704Q0
            if (r11 != 0) goto L_0x00f4
            boolean r6 = r8.f86725v
            if (r6 == 0) goto L_0x00c4
            boolean r1 = r8.mo105646N(r1)
            if (r1 == 0) goto L_0x00c4
            android.graphics.Matrix r1 = r8.f86719e
            r6 = 1119092736(0x42b40000, float:90.0)
            r1.setRotate(r6)
            android.graphics.Matrix r1 = r8.f86719e
            r1.postTranslate(r3, r0)
            android.graphics.Matrix r1 = r8.f86719e
            r1.postScale(r2, r5)
            goto L_0x00c9
        L_0x00c4:
            android.graphics.Matrix r1 = r8.f86719e
            r1.setScale(r2, r5)
        L_0x00c9:
            android.widget.ImageView$ScaleType r1 = r8.f86703P0
            if (r1 != 0) goto L_0x00cf
            r1 = -1
            goto L_0x00d7
        L_0x00cf:
            int[] r2 = com.ortiz.touchview.TouchImageView.C35290i.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r2[r1]
        L_0x00d7:
            if (r1 == r15) goto L_0x00eb
            r0 = 6
            if (r1 == r0) goto L_0x00e5
            android.graphics.Matrix r0 = r8.f86719e
            float r1 = (float) r12
            float r14 = r14 / r1
            float r4 = r4 / r1
            r0.postTranslate(r14, r4)
            goto L_0x00f0
        L_0x00e5:
            android.graphics.Matrix r0 = r8.f86719e
            r0.postTranslate(r14, r4)
            goto L_0x00f0
        L_0x00eb:
            android.graphics.Matrix r1 = r8.f86719e
            r1.postTranslate(r0, r0)
        L_0x00f0:
            r8.f86717d = r13
            goto L_0x0161
        L_0x00f4:
            float r1 = r8.f86713Z0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L_0x00fc
            r1 = 1
            goto L_0x00fd
        L_0x00fc:
            r1 = 0
        L_0x00fd:
            if (r1 != 0) goto L_0x010a
            float r1 = r8.f86714a1
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0107
            r4 = 1
            goto L_0x0108
        L_0x0107:
            r4 = 0
        L_0x0108:
            if (r4 == 0) goto L_0x010d
        L_0x010a:
            r17.mo105649Q()
        L_0x010d:
            android.graphics.Matrix r0 = r8.f86721f
            float[] r1 = r8.f86699L0
            r0.getValues(r1)
            float[] r0 = r8.f86699L0
            float r1 = r8.f86711X0
            float r1 = r1 / r3
            float r2 = r8.f86717d
            float r1 = r1 * r2
            r3 = 0
            r0[r3] = r1
            float r1 = r8.f86712Y0
            float r1 = r1 / r7
            float r1 = r1 * r2
            r3 = 4
            r0[r3] = r1
            r1 = r0[r12]
            r11 = r0[r15]
            float r0 = r8.f86713Z0
            float r2 = r2 * r0
            float r3 = r17.getImageWidth()
            float[] r13 = r8.f86699L0
            int r4 = r8.f86709V0
            int r5 = r8.f86707T0
            r0 = r17
            r7 = r9
            float r0 = r0.mo105645M(r1, r2, r3, r4, r5, r6, r7)
            r13[r12] = r0
            float r0 = r8.f86714a1
            float r1 = r8.f86717d
            float r2 = r0 * r1
            float r3 = r17.getImageHeight()
            float[] r12 = r8.f86699L0
            int r4 = r8.f86710W0
            int r5 = r8.f86708U0
            r0 = r17
            r1 = r11
            r6 = r10
            float r0 = r0.mo105645M(r1, r2, r3, r4, r5, r6, r7)
            r12[r15] = r0
            android.graphics.Matrix r0 = r8.f86719e
            float[] r1 = r8.f86699L0
            r0.setValues(r1)
        L_0x0161:
            r17.mo105638F()
            android.graphics.Matrix r0 = r8.f86719e
            r8.setImageMatrix(r0)
        L_0x0169:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ortiz.touchview.TouchImageView.mo105636D():void");
    }

    /* renamed from: E */
    public final void mo105637E() {
        mo105638F();
        this.f86719e.getValues(this.f86699L0);
        float imageWidth = getImageWidth();
        int i = this.f86707T0;
        if (imageWidth < ((float) i)) {
            float imageWidth2 = (((float) i) - getImageWidth()) / ((float) 2);
            if (this.f86725v && mo105646N(getDrawable())) {
                imageWidth2 += getImageWidth();
            }
            this.f86699L0[2] = imageWidth2;
        }
        float imageHeight = getImageHeight();
        int i2 = this.f86708U0;
        if (imageHeight < ((float) i2)) {
            this.f86699L0[5] = (((float) i2) - getImageHeight()) / ((float) 2);
        }
        this.f86719e.setValues(this.f86699L0);
    }

    /* renamed from: F */
    public final void mo105638F() {
        float f;
        this.f86719e.getValues(this.f86699L0);
        float[] fArr = this.f86699L0;
        float f2 = fArr[2];
        float f3 = fArr[5];
        if (!this.f86725v || !mo105646N(getDrawable())) {
            f = 0.0f;
        } else {
            f = getImageWidth();
        }
        this.f86719e.postTranslate(mo105642J(f2, (float) this.f86707T0, getImageWidth(), f), mo105642J(f3, (float) this.f86708U0, getImageHeight(), 0.0f));
    }

    /* renamed from: G */
    public final int mo105639G(Drawable drawable) {
        if (!mo105646N(drawable) || !this.f86725v) {
            Intrinsics.checkNotNull(drawable);
            return drawable.getIntrinsicHeight();
        }
        Intrinsics.checkNotNull(drawable);
        return drawable.getIntrinsicWidth();
    }

    /* renamed from: H */
    public final int mo105640H(Drawable drawable) {
        if (!mo105646N(drawable) || !this.f86725v) {
            Intrinsics.checkNotNull(drawable);
            return drawable.getIntrinsicWidth();
        }
        Intrinsics.checkNotNull(drawable);
        return drawable.getIntrinsicHeight();
    }

    /* renamed from: I */
    public final float mo105641I(float f, float f2, float f3) {
        if (f3 <= f2) {
            return 0.0f;
        }
        return f;
    }

    /* renamed from: J */
    public final float mo105642J(float f, float f2, float f3, float f4) {
        float f5;
        if (f3 <= f2) {
            f5 = (f2 + f4) - f3;
        } else {
            float f6 = f4;
            f4 = (f2 + f4) - f3;
            f5 = f6;
        }
        if (f < f4) {
            return (-f) + f4;
        }
        if (f > f5) {
            return (-f) + f5;
        }
        return 0.0f;
    }

    /* renamed from: K */
    public final boolean mo105643K() {
        return this.f86723g;
    }

    /* renamed from: L */
    public final boolean mo105644L() {
        return !(this.f86717d == 1.0f);
    }

    /* renamed from: M */
    public final float mo105645M(float f, float f2, float f3, int i, int i2, int i3, FixedPixel fixedPixel) {
        float f4 = (float) i2;
        float f5 = 0.5f;
        if (f3 < f4) {
            return (f4 - (((float) i3) * this.f86699L0[0])) * 0.5f;
        }
        if (f > 0.0f) {
            return -((f3 - f4) * 0.5f);
        }
        if (fixedPixel == FixedPixel.BOTTOM_RIGHT) {
            f5 = 1.0f;
        } else if (fixedPixel == FixedPixel.TOP_LEFT) {
            f5 = 0.0f;
        }
        return -(((((-f) + (((float) i) * f5)) / f2) * f3) - (f4 * f5));
    }

    /* renamed from: N */
    public final boolean mo105646N(Drawable drawable) {
        boolean z = this.f86707T0 > this.f86708U0;
        Intrinsics.checkNotNull(drawable);
        return z != (drawable.getIntrinsicWidth() > drawable.getIntrinsicHeight());
    }

    /* renamed from: O */
    public final void mo105647O() {
        this.f86717d = 1.0f;
        mo105636D();
    }

    /* renamed from: P */
    public final void mo105648P() {
        setZoomAnimated(1.0f, 0.5f, 0.5f);
    }

    /* renamed from: Q */
    public final void mo105649Q() {
        if (this.f86708U0 != 0 && this.f86707T0 != 0) {
            this.f86719e.getValues(this.f86699L0);
            this.f86721f.setValues(this.f86699L0);
            this.f86714a1 = this.f86712Y0;
            this.f86713Z0 = this.f86711X0;
            this.f86710W0 = this.f86708U0;
            this.f86709V0 = this.f86707T0;
        }
    }

    /* renamed from: R */
    public final void mo105650R(double d, float f, float f2, boolean z) {
        float f3;
        float f4;
        double d2;
        if (z) {
            f3 = this.f86697J0;
            f4 = this.f86698K0;
        } else {
            f3 = this.f86693F0;
            f4 = this.f86696I0;
        }
        float f5 = this.f86717d;
        float f6 = ((float) d) * f5;
        this.f86717d = f6;
        if (f6 > f4) {
            this.f86717d = f4;
            d2 = (double) f4;
        } else {
            if (f6 < f3) {
                this.f86717d = f3;
                d2 = (double) f3;
            }
            float f7 = (float) d;
            this.f86719e.postScale(f7, f7, f, f2);
            mo105637E();
        }
        d = d2 / ((double) f5);
        float f72 = (float) d;
        this.f86719e.postScale(f72, f72, f, f2);
        mo105637E();
    }

    /* renamed from: S */
    public final int mo105651S(int i, int i2, int i3) {
        return i != Integer.MIN_VALUE ? i != 0 ? i2 : i3 : Math.min(i3, i2);
    }

    @C12579k
    /* renamed from: T */
    public final PointF mo105652T(float f, float f2) {
        this.f86719e.getValues(this.f86699L0);
        return new PointF(this.f86699L0[2] + (getImageWidth() * (f / ((float) getDrawable().getIntrinsicWidth()))), this.f86699L0[5] + (getImageHeight() * (f2 / ((float) getDrawable().getIntrinsicHeight()))));
    }

    @C12579k
    /* renamed from: U */
    public final PointF mo105653U(float f, float f2, boolean z) {
        this.f86719e.getValues(this.f86699L0);
        float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
        float intrinsicHeight = (float) getDrawable().getIntrinsicHeight();
        float[] fArr = this.f86699L0;
        float f3 = fArr[2];
        float f4 = fArr[5];
        float imageWidth = ((f - f3) * intrinsicWidth) / getImageWidth();
        float imageHeight = ((f2 - f4) * intrinsicHeight) / getImageHeight();
        if (z) {
            imageWidth = Math.min(Math.max(imageWidth, 0.0f), intrinsicWidth);
            imageHeight = Math.min(Math.max(imageHeight, 0.0f), intrinsicHeight);
        }
        return new PointF(imageWidth, imageHeight);
    }

    public boolean canScrollHorizontally(int i) {
        this.f86719e.getValues(this.f86699L0);
        float f = this.f86699L0[2];
        if (getImageWidth() < ((float) this.f86707T0)) {
            return false;
        }
        if (f >= -1.0f && i < 0) {
            return false;
        }
        if (Math.abs(f) + ((float) this.f86707T0) + ((float) 1) < getImageWidth() || i <= 0) {
            return true;
        }
        return false;
    }

    public boolean canScrollVertically(int i) {
        this.f86719e.getValues(this.f86699L0);
        float f = this.f86699L0[5];
        if (getImageHeight() < ((float) this.f86708U0)) {
            return false;
        }
        if (f >= -1.0f && i < 0) {
            return false;
        }
        if (Math.abs(f) + ((float) this.f86708U0) + ((float) 1) < getImageHeight() || i <= 0) {
            return true;
        }
        return false;
    }

    public final float getCurrentZoom() {
        return this.f86717d;
    }

    public final float getDoubleTapScale() {
        return this.f86700M0;
    }

    public final float getMaxZoom() {
        return this.f86696I0;
    }

    public final float getMinZoom() {
        return this.f86693F0;
    }

    @C12580l
    public final FixedPixel getOrientationChangeFixedPixel() {
        return this.f86726w;
    }

    @C12579k
    public ImageView.ScaleType getScaleType() {
        ImageView.ScaleType scaleType = this.f86703P0;
        Intrinsics.checkNotNull(scaleType);
        return scaleType;
    }

    @C12579k
    public final PointF getScrollPosition() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return new PointF(0.5f, 0.5f);
        }
        int H = mo105640H(drawable);
        int G = mo105639G(drawable);
        PointF U = mo105653U(((float) this.f86707T0) / 2.0f, ((float) this.f86708U0) / 2.0f, true);
        U.x /= (float) H;
        U.y /= (float) G;
        return U;
    }

    @C12580l
    public final FixedPixel getViewSizeChangeFixedPixel() {
        return this.f86727x;
    }

    @C12579k
    public final RectF getZoomedRect() {
        if (this.f86703P0 != ImageView.ScaleType.FIT_XY) {
            PointF U = mo105653U(0.0f, 0.0f, true);
            PointF U2 = mo105653U((float) this.f86707T0, (float) this.f86708U0, true);
            float H = (float) mo105640H(getDrawable());
            float G = (float) mo105639G(getDrawable());
            return new RectF(U.x / H, U.y / G, U2.x / H, U2.y / G);
        }
        throw new UnsupportedOperationException("getZoomedRect() not supported with FIT_XY");
    }

    public void onConfigurationChanged(@C12579k Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        int i = getResources().getConfiguration().orientation;
        if (i != this.f86702O0) {
            this.f86728y = true;
            this.f86702O0 = i;
        }
        mo105649Q();
    }

    public void onDraw(@C12579k Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f86705R0 = true;
        this.f86704Q0 = true;
        C35309f fVar = this.f86706S0;
        if (fVar != null) {
            Intrinsics.checkNotNull(fVar);
            float i = fVar.mo105737i();
            C35309f fVar2 = this.f86706S0;
            Intrinsics.checkNotNull(fVar2);
            float g = fVar2.mo105734g();
            C35309f fVar3 = this.f86706S0;
            Intrinsics.checkNotNull(fVar3);
            float h = fVar3.mo105735h();
            C35309f fVar4 = this.f86706S0;
            Intrinsics.checkNotNull(fVar4);
            setZoom(i, g, h, fVar4.mo105738j());
            this.f86706S0 = null;
        }
        super.onDraw(canvas);
    }

    public void onMeasure(int i, int i2) {
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int H = mo105640H(drawable);
        int G = mo105639G(drawable);
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int S = mo105651S(mode, size, H);
        int S2 = mo105651S(mode2, size2, G);
        if (!this.f86728y) {
            mo105649Q();
        }
        setMeasuredDimension((S - getPaddingLeft()) - getPaddingRight(), (S2 - getPaddingTop()) - getPaddingBottom());
    }

    public void onRestoreInstanceState(@C12579k Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(parcelable, "state");
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f86717d = bundle.getFloat("saveScale");
            float[] floatArray = bundle.getFloatArray("matrix");
            Intrinsics.checkNotNull(floatArray);
            this.f86699L0 = floatArray;
            this.f86721f.setValues(floatArray);
            this.f86714a1 = bundle.getFloat("matchViewHeight");
            this.f86713Z0 = bundle.getFloat("matchViewWidth");
            this.f86710W0 = bundle.getInt("viewHeight");
            this.f86709V0 = bundle.getInt("viewWidth");
            this.f86704Q0 = bundle.getBoolean("imageRendered");
            this.f86727x = (FixedPixel) bundle.getSerializable("viewSizeChangeFixedPixel");
            this.f86726w = (FixedPixel) bundle.getSerializable("orientationChangeFixedPixel");
            if (this.f86702O0 != bundle.getInt("orientation")) {
                this.f86728y = true;
            }
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @C12580l
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("orientation", this.f86702O0);
        bundle.putFloat("saveScale", this.f86717d);
        bundle.putFloat("matchViewHeight", this.f86712Y0);
        bundle.putFloat("matchViewWidth", this.f86711X0);
        bundle.putInt("viewWidth", this.f86707T0);
        bundle.putInt("viewHeight", this.f86708U0);
        this.f86719e.getValues(this.f86699L0);
        bundle.putFloatArray("matrix", this.f86699L0);
        bundle.putBoolean("imageRendered", this.f86704Q0);
        bundle.putSerializable("viewSizeChangeFixedPixel", this.f86727x);
        bundle.putSerializable("orientationChangeFixedPixel", this.f86726w);
        return bundle;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f86707T0 = i;
        this.f86708U0 = i2;
        mo105636D();
    }

    public final void setDoubleTapScale(float f) {
        this.f86700M0 = f;
    }

    public void setImageBitmap(@C12579k Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bm");
        this.f86704Q0 = false;
        super.setImageBitmap(bitmap);
        mo105649Q();
        mo105636D();
    }

    public void setImageDrawable(@C12580l Drawable drawable) {
        this.f86704Q0 = false;
        super.setImageDrawable(drawable);
        mo105649Q();
        mo105636D();
    }

    public void setImageResource(int i) {
        this.f86704Q0 = false;
        super.setImageResource(i);
        mo105649Q();
        mo105636D();
    }

    public void setImageURI(@C12580l Uri uri) {
        this.f86704Q0 = false;
        super.setImageURI(uri);
        mo105649Q();
        mo105636D();
    }

    public final void setMaxZoom(float f) {
        this.f86696I0 = f;
        this.f86698K0 = f * 1.25f;
        this.f86694G0 = false;
    }

    public final void setMaxZoomRatio(float f) {
        this.f86695H0 = f;
        float f2 = this.f86693F0 * f;
        this.f86696I0 = f2;
        this.f86698K0 = f2 * 1.25f;
        this.f86694G0 = true;
    }

    public final void setMinZoom(float f) {
        boolean z;
        float f2;
        this.f86692E0 = f;
        if (f == -1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ImageView.ScaleType scaleType = this.f86703P0;
            if (scaleType == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.CENTER_CROP) {
                Drawable drawable = getDrawable();
                int H = mo105640H(drawable);
                int G = mo105639G(drawable);
                if (drawable != null && H > 0 && G > 0) {
                    float f3 = ((float) this.f86707T0) / ((float) H);
                    float f4 = ((float) this.f86708U0) / ((float) G);
                    if (this.f86703P0 == ImageView.ScaleType.CENTER) {
                        f2 = Math.min(f3, f4);
                    } else {
                        f2 = Math.min(f3, f4) / Math.max(f3, f4);
                    }
                    this.f86693F0 = f2;
                }
            } else {
                this.f86693F0 = 1.0f;
            }
        } else {
            this.f86693F0 = f;
        }
        if (this.f86694G0) {
            setMaxZoomRatio(this.f86695H0);
        }
        this.f86697J0 = this.f86693F0 * 0.75f;
    }

    public final void setOnDoubleTapListener(@C12579k GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        Intrinsics.checkNotNullParameter(onDoubleTapListener, "onDoubleTapListener");
        this.f86720e1 = onDoubleTapListener;
    }

    public final void setOnTouchCoordinatesListener(@C12579k C35292b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "onTouchCoordinatesListener");
        this.f86718d1 = bVar;
    }

    public final void setOnTouchImageViewListener(@C12579k C35293c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "onTouchImageViewListener");
        this.f86724g1 = cVar;
    }

    public void setOnTouchListener(@C12579k View.OnTouchListener onTouchListener) {
        Intrinsics.checkNotNullParameter(onTouchListener, "onTouchListener");
        this.f86722f1 = onTouchListener;
    }

    public final void setOrientationChangeFixedPixel(@C12580l FixedPixel fixedPixel) {
        this.f86726w = fixedPixel;
    }

    public final void setRotateImageToFitScreen(boolean z) {
        this.f86725v = z;
    }

    public void setScaleType(@C12579k ImageView.ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "type");
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.MATRIX;
        if (scaleType == scaleType2) {
            super.setScaleType(scaleType2);
            return;
        }
        this.f86703P0 = scaleType;
        if (this.f86705R0) {
            setZoom(this);
        }
    }

    public final void setScrollPosition(float f, float f2) {
        setZoom(this.f86717d, f, f2);
    }

    public final void setViewSizeChangeFixedPixel(@C12580l FixedPixel fixedPixel) {
        this.f86727x = fixedPixel;
    }

    public final void setZoom(float f) {
        setZoom(f, 0.5f, 0.5f);
    }

    public final void setZoomAnimated(float f, float f2, float f3) {
        setZoomAnimated(f, f2, f3, 500);
    }

    public final void setZoomEnabled(boolean z) {
        this.f86723g = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public TouchImageView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    public final void setZoom(float f, float f2, float f3) {
        setZoom(f, f2, f3, this.f86703P0);
    }

    public final void setZoomAnimated(float f, float f2, float f3, int i) {
        mo105635C(new C35282a(this, f, new PointF(f2, f3), i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TouchImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void setZoom(float f, float f2, float f3, @C12580l ImageView.ScaleType scaleType) {
        if (!this.f86705R0) {
            this.f86706S0 = new C35309f(f, f2, f3, scaleType);
            return;
        }
        if (this.f86692E0 == -1.0f) {
            setMinZoom(-1.0f);
            float f4 = this.f86717d;
            float f5 = this.f86693F0;
            if (f4 < f5) {
                this.f86717d = f5;
            }
        }
        if (scaleType != this.f86703P0) {
            Intrinsics.checkNotNull(scaleType);
            setScaleType(scaleType);
        }
        mo105647O();
        mo105650R((double) f, ((float) this.f86707T0) / 2.0f, ((float) this.f86708U0) / 2.0f, true);
        this.f86719e.getValues(this.f86699L0);
        float[] fArr = this.f86699L0;
        float f6 = this.f86711X0;
        float f7 = (float) 2;
        float f8 = f - ((float) 1);
        fArr[2] = ((((float) this.f86707T0) - f6) / f7) - ((f2 * f8) * f6);
        float f9 = this.f86712Y0;
        fArr[5] = ((((float) this.f86708U0) - f9) / f7) - ((f3 * f8) * f9);
        this.f86719e.setValues(fArr);
        mo105638F();
        mo105649Q();
        setImageMatrix(this.f86719e);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public TouchImageView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        FixedPixel fixedPixel = FixedPixel.CENTER;
        this.f86726w = fixedPixel;
        this.f86727x = fixedPixel;
        super.setClickable(true);
        this.f86702O0 = getResources().getConfiguration().orientation;
        this.f86715b1 = new ScaleGestureDetector(context, new C35289h(this));
        this.f86716c1 = new GestureDetector(context, new C35287f(this));
        this.f86719e = new Matrix();
        this.f86721f = new Matrix();
        this.f86699L0 = new float[9];
        this.f86717d = 1.0f;
        if (this.f86703P0 == null) {
            this.f86703P0 = ImageView.ScaleType.FIT_CENTER;
        }
        this.f86693F0 = 1.0f;
        this.f86696I0 = 3.0f;
        this.f86697J0 = 1.0f * 0.75f;
        this.f86698K0 = 3.0f * 1.25f;
        setImageMatrix(this.f86719e);
        setScaleType(ImageView.ScaleType.MATRIX);
        setState(ImageActionState.NONE);
        this.f86705R0 = false;
        super.setOnTouchListener(new C35288g(this));
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C35295e.C35308m.TouchImageView, i, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, R.styleable.TouchImageView, defStyle, 0)");
        try {
            if (!isInEditMode()) {
                this.f86723g = obtainStyledAttributes.getBoolean(C35295e.C35308m.TouchImageView_zoom_enabled, true);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void setZoomAnimated(float f, float f2, float f3, int i, @C12580l C35294d dVar) {
        C35282a aVar = new C35282a(this, f, new PointF(f2, f3), i);
        aVar.mo105694b(dVar);
        mo105635C(aVar);
    }

    public final void setZoomAnimated(float f, float f2, float f3, @C12580l C35294d dVar) {
        C35282a aVar = new C35282a(this, f, new PointF(f2, f3), 500);
        aVar.mo105694b(dVar);
        mo105635C(aVar);
    }

    public final void setZoom(@C12579k TouchImageView touchImageView) {
        Intrinsics.checkNotNullParameter(touchImageView, "img");
        PointF scrollPosition = touchImageView.getScrollPosition();
        setZoom(touchImageView.f86717d, scrollPosition.x, scrollPosition.y, touchImageView.getScaleType());
    }
}
