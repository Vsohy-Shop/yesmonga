package androidx.compose.p004ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.C0344h1;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.autofill.C8709e;
import androidx.compose.p004ui.autofill.C8712h;
import androidx.compose.p004ui.autofill.C8713i;
import androidx.compose.p004ui.autofill.C8728x;
import androidx.compose.p004ui.autofill.C8731z;
import androidx.compose.p004ui.focus.C15059d;
import androidx.compose.p004ui.focus.C15076p;
import androidx.compose.p004ui.focus.FocusOwnerImpl;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.graphics.C15112a3;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15125c2;
import androidx.compose.p004ui.graphics.drawscope.C15179a;
import androidx.compose.p004ui.hapticfeedback.C15425a;
import androidx.compose.p004ui.hapticfeedback.C15428c;
import androidx.compose.p004ui.input.C15430a;
import androidx.compose.p004ui.input.C15432b;
import androidx.compose.p004ui.input.C15433c;
import androidx.compose.p004ui.input.key.C15434a;
import androidx.compose.p004ui.input.key.C15436b;
import androidx.compose.p004ui.input.key.C15439d;
import androidx.compose.p004ui.input.key.C15441f;
import androidx.compose.p004ui.input.pointer.C15462a0;
import androidx.compose.p004ui.input.pointer.C15464b0;
import androidx.compose.p004ui.input.pointer.C15478h;
import androidx.compose.p004ui.input.pointer.C15479h0;
import androidx.compose.p004ui.input.pointer.C15484j0;
import androidx.compose.p004ui.input.pointer.C15486k0;
import androidx.compose.p004ui.input.pointer.C15496s;
import androidx.compose.p004ui.input.pointer.C15498t;
import androidx.compose.p004ui.input.pointer.C15510y;
import androidx.compose.p004ui.input.pointer.C15511z;
import androidx.compose.p004ui.input.rotary.C15512a;
import androidx.compose.p004ui.input.rotary.C15515d;
import androidx.compose.p004ui.layout.RootMeasurePolicy;
import androidx.compose.p004ui.modifier.ModifierLocalManager;
import androidx.compose.p004ui.node.C15672b1;
import androidx.compose.p004ui.node.C15674c0;
import androidx.compose.p004ui.node.C15675c1;
import androidx.compose.p004ui.node.C15698j1;
import androidx.compose.p004ui.node.C15700k0;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.node.OwnerSnapshotObserver;
import androidx.compose.p004ui.platform.ViewLayer;
import androidx.compose.p004ui.semantics.C16038l;
import androidx.compose.p004ui.semantics.C16041n;
import androidx.compose.p004ui.text.font.C16238t;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.font.C16250x;
import androidx.compose.p004ui.text.input.C16271a;
import androidx.compose.p004ui.text.input.C16292g0;
import androidx.compose.p004ui.text.input.C16319s0;
import androidx.compose.p004ui.text.input.C16321t0;
import androidx.compose.p004ui.text.input.PlatformTextInputPluginRegistryImpl;
import androidx.compose.p004ui.unit.C16475a;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16496n;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.p004ui.viewinterop.AndroidViewHolder;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.collection.C8423g;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.view.C18196h2;
import androidx.core.view.C18317n0;
import androidx.core.view.C18338p3;
import androidx.lifecycle.C19427i;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.C20437e;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.gms.common.internal.C40852x;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.Pair;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@SuppressLint({"ViewConstructor", "VisibleForTests"})
@C11076d0(mo22515d1 = {"\u0000\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0002¢\u0003\b\u0001\u0018\u0000 ß\u00032\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002SfB\u0013\u0012\b\u0010Ü\u0003\u001a\u00030Û\u0003¢\u0006\u0006\bÝ\u0003\u0010Þ\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002J\u0014\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\f\u0010\r\u001a\u00020\f*\u00020\tH\u0002J\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0002J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0016H\u0002J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J \u0010 \u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b \u0010\u001cJ*\u0010%\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\fH\u0002J\u0010\u0010&\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002J\b\u0010'\u001a\u00020\u0007H\u0002J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0016H\u0002J\b\u0010)\u001a\u00020\u0007H\u0002J\b\u0010*\u001a\u00020\fH\u0002J\u0010\u0010+\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010,\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u001a\u00100\u001a\u0004\u0018\u00010.2\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020.H\u0002J\u0010\u00103\u001a\u00020\u00072\u0006\u00102\u001a\u000201H\u0016J\u0010\u00106\u001a\u00020\u00072\u0006\u00105\u001a\u000204H\u0016J\"\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\f2\u0006\u00108\u001a\u00020\u000e2\b\u00109\u001a\u0004\u0018\u000101H\u0014J\u0010\u0010<\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\fH\u0016J\u001d\u0010?\u001a\u00020\f2\u0006\u0010>\u001a\u00020=H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b?\u0010@J\u0010\u0010B\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020AH\u0016J\u0010\u0010C\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0010\u0010D\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0006\u0010E\u001a\u00020\u0007J\b\u0010F\u001a\u00020\u0007H\u0016J\u0016\u0010I\u001a\u00020\u00072\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00070GH\u0016J\u0016\u0010M\u001a\u00020\u00072\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020\tJ\u000e\u0010N\u001a\u00020\u00072\u0006\u0010K\u001a\u00020JJ\u0016\u0010Q\u001a\u00020\u00072\u0006\u0010K\u001a\u00020J2\u0006\u0010P\u001a\u00020OJ\u0010\u0010S\u001a\u00020\u00072\u0006\u0010R\u001a\u00020\fH\u0016J%\u0010V\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\t2\u0006\u0010U\u001a\u00020TH\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\tH\u0016J \u0010[\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\f2\u0006\u0010Z\u001a\u00020\fH\u0016J \u0010\\\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\f2\u0006\u0010Z\u001a\u00020\fH\u0016J\u0010\u0010]\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\tH\u0016J\b\u0010^\u001a\u00020\u0007H\u0016J\u0018\u0010a\u001a\u00020\u00072\u0006\u0010_\u001a\u00020\u000e2\u0006\u0010`\u001a\u00020\u000eH\u0014J0\u0010g\u001a\u00020\u00072\u0006\u0010b\u001a\u00020\f2\u0006\u0010c\u001a\u00020\u000e2\u0006\u0010d\u001a\u00020\u000e2\u0006\u0010e\u001a\u00020\u000e2\u0006\u0010f\u001a\u00020\u000eH\u0014J\u0010\u0010h\u001a\u00020\u00072\u0006\u0010P\u001a\u00020OH\u0014J*\u0010n\u001a\u00020m2\u0012\u0010k\u001a\u000e\u0012\u0004\u0012\u00020j\u0012\u0004\u0012\u00020\u00070i2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00070GH\u0016J\u0017\u0010p\u001a\u00020\f2\u0006\u0010o\u001a\u00020mH\u0000¢\u0006\u0004\bp\u0010qJ\b\u0010r\u001a\u00020\u0007H\u0016J\u0010\u0010c\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\tH\u0016J\u0010\u0010t\u001a\u00020\u00072\u0006\u0010H\u001a\u00020sH\u0016J\u001f\u0010d\u001a\u0004\u0018\u00010u2\u0006\u0010>\u001a\u00020=H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bd\u0010vJ\u0010\u0010w\u001a\u00020\u00072\u0006\u0010P\u001a\u00020OH\u0014J\u001f\u0010y\u001a\u00020\u00072\u0006\u0010o\u001a\u00020m2\u0006\u0010x\u001a\u00020\fH\u0000¢\u0006\u0004\by\u0010zJ\u001a\u0010}\u001a\u00020\u00072\u0012\u0010|\u001a\u000e\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u00070iJ\u0013\u0010~\u001a\u00020\u0007H@ø\u0001\u0002¢\u0006\u0004\b~\u0010J\t\u0010\u0001\u001a\u00020\u0007H\u0016J\t\u0010\u0001\u001a\u00020\u0007H\u0014J\t\u0010\u0001\u001a\u00020\u0007H\u0014J\u001e\u0010\u0001\u001a\u00020\u00072\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\u0007\u0010\u0001\u001a\u00020\u000eH\u0016J\u001a\u0010\u0001\u001a\u00020\u00072\u000f\u0010\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u0001H\u0016J\u0011\u0010\u0001\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0011\u0010\u0001\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u0011\u0010\u0001\u001a\u00020\f2\u0006\u00108\u001a\u00020\u000eH\u0016J\u0011\u0010\u0001\u001a\u00020\f2\u0006\u00108\u001a\u00020\u000eH\u0016J#\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b\u0001\u0010\u0001J#\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\t\u0010\u0001\u001a\u00020\fH\u0016J\u0016\u0010\u0001\u001a\u0005\u0018\u00010\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016J#\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b\u0001\u0010\u0001J#\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0013\u0010\u0001\u001a\u00020\u00072\b\u0010\u0001\u001a\u00030\u0001H\u0014J\u0012\u0010¡\u0001\u001a\u00020\u00072\u0007\u0010 \u0001\u001a\u00020\u000eH\u0016J\u0011\u0010¢\u0001\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0011\u0010£\u0001\u001a\u0004\u0018\u00010.2\u0006\u0010-\u001a\u00020\u000eJ\t\u0010¤\u0001\u001a\u00020\fH\u0016R\"\u0010¦\u0001\u001a\u00030\u00018\u0002@\u0002X\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\n\u0005\bS\u0010¥\u0001R\u0017\u0010§\u0001\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bf\u0010MR\u001f\u0010¬\u0001\u001a\u00030¨\u00018\u0016X\u0004¢\u0006\u000f\n\u0005\b[\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001R,\u0010³\u0001\u001a\u00030­\u00012\b\u0010®\u0001\u001a\u00030­\u00018\u0016@RX\u000e¢\u0006\u0010\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001R\u0017\u0010¶\u0001\u001a\u00030´\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b\\\u0010µ\u0001R \u0010¼\u0001\u001a\u00030·\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001R\u0018\u0010À\u0001\u001a\u00030½\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0017\u0010Ã\u0001\u001a\u00030Á\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b6\u0010Â\u0001R\u0017\u0010Ä\u0001\u001a\u00030Á\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\bV\u0010Â\u0001R\u0017\u0010Ç\u0001\u001a\u00030Å\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b?\u0010Æ\u0001R\u001f\u0010Ì\u0001\u001a\u00020\t8\u0016X\u0004¢\u0006\u0010\n\u0006\bÈ\u0001\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001R \u0010Ñ\u0001\u001a\u00030Í\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0001\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u001f\u0010Ö\u0001\u001a\u00030Ò\u00018\u0016X\u0004¢\u0006\u000f\n\u0005\b%\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u0018\u0010Ú\u0001\u001a\u00030×\u00018\u0002X\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R \u0010à\u0001\u001a\u00030Û\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\bÜ\u0001\u0010Ý\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001R\u001d\u0010ã\u0001\u001a\t\u0012\u0004\u0012\u00020m0á\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010â\u0001R\"\u0010å\u0001\u001a\u000b\u0012\u0004\u0012\u00020m\u0018\u00010á\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bä\u0001\u0010â\u0001R\u0018\u0010ç\u0001\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bæ\u0001\u0010MR\u0018\u0010ë\u0001\u001a\u00030è\u00018\u0002X\u0004¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001R\u0018\u0010ï\u0001\u001a\u00030ì\u00018\u0002X\u0004¢\u0006\b\n\u0006\bí\u0001\u0010î\u0001R6\u0010ö\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0001\u0012\u0004\u0012\u00020\u00070i8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\bð\u0001\u0010ñ\u0001\u001a\u0006\bò\u0001\u0010ó\u0001\"\u0006\bô\u0001\u0010õ\u0001R\u001a\u0010ú\u0001\u001a\u0005\u0018\u00010÷\u00018\u0002X\u0004¢\u0006\b\n\u0006\bø\u0001\u0010ù\u0001R\u0018\u0010ü\u0001\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bû\u0001\u0010MR \u0010\u0002\u001a\u00030ý\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\bþ\u0001\u0010ÿ\u0001\u001a\u0006\b\u0002\u0010\u0002R \u0010\u0002\u001a\u00030\u00028\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002R \u0010\u0002\u001a\u00030\u00028\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002R0\u0010\u0002\u001a\u00020\f8\u0016@\u0016X\u000e¢\u0006\u001f\n\u0005\b\u0002\u0010M\u0012\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R\u001c\u0010\u0002\u001a\u0005\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u001c\u0010\u0002\u001a\u0005\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R$\u0010¡\u0002\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\b\n\u0006\b\u0002\u0010 \u0002R\u0018\u0010£\u0002\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b¢\u0002\u0010MR\u0018\u0010§\u0002\u001a\u00030¤\u00028\u0002X\u0004¢\u0006\b\n\u0006\b¥\u0002\u0010¦\u0002R \u0010­\u0002\u001a\u00030¨\u00028\u0016X\u0004¢\u0006\u0010\n\u0006\b©\u0002\u0010ª\u0002\u001a\u0006\b«\u0002\u0010¬\u0002R#\u0010°\u0002\u001a\u00030®\u00028\u0002@\u0002X\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\b\n\u0006\b¯\u0002\u0010¥\u0001R\u0018\u0010´\u0002\u001a\u00030±\u00028\u0002X\u0004¢\u0006\b\n\u0006\b²\u0002\u0010³\u0002R!\u0010¸\u0002\u001a\u00030µ\u00028\u0002X\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\b\n\u0006\b¶\u0002\u0010·\u0002R!\u0010º\u0002\u001a\u00030µ\u00028\u0002X\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\b\n\u0006\b¹\u0002\u0010·\u0002R1\u0010Á\u0002\u001a\u00020\"8\u0000@\u0000X\u000e¢\u0006 \n\u0006\b»\u0002\u0010¥\u0001\u0012\u0006\bÀ\u0002\u0010\u0002\u001a\u0006\b¼\u0002\u0010½\u0002\"\u0006\b¾\u0002\u0010¿\u0002R\u0018\u0010Ã\u0002\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bÂ\u0002\u0010MR#\u0010Å\u0002\u001a\u00030\u00018\u0002@\u0002X\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\b\n\u0006\bÄ\u0002\u0010¥\u0001R\u0018\u0010Ç\u0002\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bÆ\u0002\u0010MR7\u0010Î\u0002\u001a\u0004\u0018\u00010{2\t\u0010®\u0001\u001a\u0004\u0018\u00010{8F@BX\u0002¢\u0006\u0018\n\u0006\bÈ\u0002\u0010É\u0002\u001a\u0006\bÊ\u0002\u0010Ë\u0002\"\u0006\bÌ\u0002\u0010Í\u0002R'\u0010Ð\u0002\u001a\u0010\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u0007\u0018\u00010i8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÏ\u0002\u0010ñ\u0001R\u0018\u0010Ô\u0002\u001a\u00030Ñ\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÒ\u0002\u0010Ó\u0002R\u0018\u0010Ø\u0002\u001a\u00030Õ\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÖ\u0002\u0010×\u0002R\u0018\u0010Ü\u0002\u001a\u00030Ù\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÚ\u0002\u0010Û\u0002R \u0010â\u0002\u001a\u00030Ý\u00028\u0016X\u0004¢\u0006\u0010\n\u0006\bÞ\u0002\u0010ß\u0002\u001a\u0006\bà\u0002\u0010á\u0002R \u0010è\u0002\u001a\u00030ã\u00028\u0016X\u0004¢\u0006\u0010\n\u0006\bä\u0002\u0010å\u0002\u001a\u0006\bæ\u0002\u0010ç\u0002R(\u0010ï\u0002\u001a\u00030é\u00028\u0016X\u0004¢\u0006\u0018\n\u0006\bê\u0002\u0010ë\u0002\u0012\u0006\bî\u0002\u0010\u0002\u001a\u0006\bì\u0002\u0010í\u0002R5\u0010ö\u0002\u001a\u00030ð\u00022\b\u0010®\u0001\u001a\u00030ð\u00028V@RX\u0002¢\u0006\u0018\n\u0006\bñ\u0002\u0010É\u0002\u001a\u0006\bò\u0002\u0010ó\u0002\"\u0006\bô\u0002\u0010õ\u0002R\u0018\u0010ø\u0002\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b÷\u0002\u0010rR5\u0010 \u0001\u001a\u00030ù\u00022\b\u0010®\u0001\u001a\u00030ù\u00028V@RX\u0002¢\u0006\u0018\n\u0006\bú\u0002\u0010É\u0002\u001a\u0006\bû\u0002\u0010ü\u0002\"\u0006\bý\u0002\u0010þ\u0002R \u0010\u0003\u001a\u00030ÿ\u00028\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0003\u0010\u0003\u001a\u0006\b\u0003\u0010\u0003R\u0018\u0010\u0003\u001a\u00030\u00038\u0002X\u0004¢\u0006\b\n\u0006\b\u0003\u0010\u0003R \u0010\u0003\u001a\u00030\u00038\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0003\u0010\u0003\u001a\u0006\b\u0003\u0010\u0003R \u0010\u0003\u001a\u00030\u00038\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0003\u0010\u0003\u001a\u0006\b\u0003\u0010\u0003R\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0003\u0010\u0003R\u0019\u0010\u0003\u001a\u00020\"8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0003\u0010¥\u0001R\u001e\u0010\u0003\u001a\t\u0012\u0004\u0012\u00020m0\u00038\u0002X\u0004¢\u0006\b\n\u0006\b\u0003\u0010\u0003R&\u0010¡\u0003\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010G0\u00038\u0002X\u0004¢\u0006\b\n\u0006\b\u0003\u0010 \u0003R\u0018\u0010¥\u0003\u001a\u00030¢\u00038\u0002X\u0004¢\u0006\b\n\u0006\b£\u0003\u0010¤\u0003R\u0018\u0010©\u0003\u001a\u00030¦\u00038\u0002X\u0004¢\u0006\b\n\u0006\b§\u0003\u0010¨\u0003R\u0018\u0010«\u0003\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bª\u0003\u0010MR\u001d\u0010®\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070G8\u0002X\u0004¢\u0006\b\n\u0006\b¬\u0003\u0010­\u0003R\u0018\u0010²\u0003\u001a\u00030¯\u00038\u0002X\u0004¢\u0006\b\n\u0006\b°\u0003\u0010±\u0003R\u0018\u0010´\u0003\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b³\u0003\u0010MR\u001c\u0010¸\u0003\u001a\u0005\u0018\u00010µ\u00038\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¶\u0003\u0010·\u0003R \u0010¾\u0003\u001a\u00030¹\u00038\u0016X\u0004¢\u0006\u0010\n\u0006\bº\u0003\u0010»\u0003\u001a\u0006\b¼\u0003\u0010½\u0003R\u001c\u0010Á\u0003\u001a\u00020\u000e*\u00030\u00018BX\u0004¢\u0006\b\u001a\u0006\b¿\u0003\u0010À\u0003R\u0016\u0010K\u001a\u00020.8VX\u0004¢\u0006\b\u001a\u0006\bÂ\u0003\u0010Ã\u0003R\u0018\u0010Ç\u0003\u001a\u00030Ä\u00038VX\u0004¢\u0006\b\u001a\u0006\bÅ\u0003\u0010Æ\u0003R\u001a\u0010\u0001\u001a\u0005\u0018\u00010È\u00038VX\u0004¢\u0006\b\u001a\u0006\bÉ\u0003\u0010Ê\u0003R\u0018\u0010Í\u0003\u001a\u00030\u00028@X\u0004¢\u0006\b\u001a\u0006\bË\u0003\u0010Ì\u0003R\u0017\u0010Ï\u0003\u001a\u00020\"8VX\u0004¢\u0006\b\u001a\u0006\bÎ\u0003\u0010½\u0002R\u0017\u0010Ñ\u0003\u001a\u00020\f8VX\u0004¢\u0006\b\u001a\u0006\bÐ\u0003\u0010\u0002R\u001a\u0010Õ\u0003\u001a\u0005\u0018\u00010Ò\u00038VX\u0004¢\u0006\b\u001a\u0006\bÓ\u0003\u0010Ô\u0003R\u0018\u0010Ù\u0003\u001a\u00030Ö\u00038VX\u0004¢\u0006\b\u001a\u0006\b×\u0003\u0010Ø\u0003R\u0016\u0010Ú\u0003\u001a\u00020\f8VX\u0004¢\u0006\u0007\u001a\u0005\be\u0010\u0002\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006à\u0003"}, mo22516d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/c1;", "Landroidx/compose/ui/platform/j4;", "Landroidx/compose/ui/input/pointer/j0;", "Landroidx/lifecycle/i;", "viewGroup", "Lkotlin/d2;", "d0", "Landroidx/compose/ui/node/LayoutNode;", "nodeToRemeasure", "z0", "", "c0", "", "measureSpec", "Lkotlin/Pair;", "e0", "H0", "node", "n0", "m0", "Landroid/view/MotionEvent;", "event", "k0", "motionEvent", "Landroidx/compose/ui/input/pointer/k0;", "j0", "(Landroid/view/MotionEvent;)I", "lastEvent", "l0", "p0", "D0", "action", "", "eventTime", "forceHover", "E0", "q0", "t0", "u0", "v0", "a0", "o0", "r0", "accessibilityId", "Landroid/view/View;", "currentView", "g0", "Landroid/graphics/Rect;", "rect", "getFocusedRect", "Landroidx/lifecycle/w;", "owner", "v", "gainFocus", "direction", "previouslyFocusedRect", "onFocusChanged", "hasWindowFocus", "onWindowFocusChanged", "Landroidx/compose/ui/input/key/b;", "keyEvent", "x", "(Landroid/view/KeyEvent;)Z", "Landroid/view/KeyEvent;", "dispatchKeyEvent", "u", "C", "y0", "H", "Lkotlin/Function0;", "listener", "G", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "view", "layoutNode", "Z", "x0", "Landroid/graphics/Canvas;", "canvas", "f0", "sendPointerUpdate", "a", "Landroidx/compose/ui/unit/b;", "constraints", "w", "(Landroidx/compose/ui/node/LayoutNode;J)V", "m", "affectsLookahead", "forceRequest", "c", "e", "j", "p", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "changed", "l", "t", "r", "b", "onLayout", "onDraw", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/b2;", "drawBlock", "invalidateParentLayer", "Landroidx/compose/ui/node/b1;", "F", "layer", "w0", "(Landroidx/compose/ui/node/b1;)Z", "I", "Landroidx/compose/ui/node/c1$b;", "o", "Landroidx/compose/ui/focus/d;", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/d;", "dispatchDraw", "isDirty", "s0", "(Landroidx/compose/ui/node/b1;Z)V", "Landroidx/compose/ui/platform/AndroidComposeView$b;", "callback", "setOnViewTreeOwnersAvailable", "b0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "D", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/ViewStructure;", "structure", "flags", "onProvideAutofillVirtualStructure", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "autofill", "dispatchGenericMotionEvent", "dispatchTouchEvent", "canScrollHorizontally", "canScrollVertically", "Landroidx/compose/ui/geometry/f;", "localPosition", "E", "(J)J", "positionOnScreen", "s", "onCheckIsTextEditor", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "onCreateInputConnection", "positionInWindow", "z", "h", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "layoutDirection", "onRtlPropertiesChanged", "dispatchHoverEvent", "findViewByAccessibilityIdTraversal", "shouldDelayChildPressedState", "J", "lastDownPointerPosition", "superclassInitComplete", "Landroidx/compose/ui/node/c0;", "Landroidx/compose/ui/node/c0;", "getSharedDrawScope", "()Landroidx/compose/ui/node/c0;", "sharedDrawScope", "Landroidx/compose/ui/unit/d;", "<set-?>", "d", "Landroidx/compose/ui/unit/d;", "getDensity", "()Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/semantics/l;", "Landroidx/compose/ui/semantics/l;", "semanticsModifier", "Landroidx/compose/ui/focus/p;", "f", "Landroidx/compose/ui/focus/p;", "getFocusOwner", "()Landroidx/compose/ui/focus/p;", "focusOwner", "Landroidx/compose/ui/platform/m4;", "g", "Landroidx/compose/ui/platform/m4;", "_windowInfo", "Landroidx/compose/ui/m;", "Landroidx/compose/ui/m;", "keyInputModifier", "rotaryInputModifier", "Landroidx/compose/ui/graphics/c2;", "Landroidx/compose/ui/graphics/c2;", "canvasHolder", "y", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/node/j1;", "Landroidx/compose/ui/node/j1;", "getRootForTest", "()Landroidx/compose/ui/node/j1;", "rootForTest", "Landroidx/compose/ui/semantics/n;", "Landroidx/compose/ui/semantics/n;", "getSemanticsOwner", "()Landroidx/compose/ui/semantics/n;", "semanticsOwner", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "F0", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "accessibilityDelegate", "Landroidx/compose/ui/autofill/z;", "G0", "Landroidx/compose/ui/autofill/z;", "getAutofillTree", "()Landroidx/compose/ui/autofill/z;", "autofillTree", "", "Ljava/util/List;", "dirtyLayers", "I0", "postponedDirtyLayers", "J0", "isDrawingContent", "Landroidx/compose/ui/input/pointer/h;", "K0", "Landroidx/compose/ui/input/pointer/h;", "motionEventAdapter", "Landroidx/compose/ui/input/pointer/a0;", "L0", "Landroidx/compose/ui/input/pointer/a0;", "pointerInputEventProcessor", "M0", "Lkotlin/jvm/functions/l;", "getConfigurationChangeObserver", "()Lkotlin/jvm/functions/l;", "setConfigurationChangeObserver", "(Lkotlin/jvm/functions/l;)V", "configurationChangeObserver", "Landroidx/compose/ui/autofill/e;", "N0", "Landroidx/compose/ui/autofill/e;", "_autofill", "O0", "observationClearRequested", "Landroidx/compose/ui/platform/f;", "P0", "Landroidx/compose/ui/platform/f;", "getClipboardManager", "()Landroidx/compose/ui/platform/f;", "clipboardManager", "Landroidx/compose/ui/platform/e;", "Q0", "Landroidx/compose/ui/platform/e;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/e;", "accessibilityManager", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "R0", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "S0", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "()V", "showLayoutBounds", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "T0", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "_androidViewsHandler", "Landroidx/compose/ui/platform/DrawChildContainer;", "U0", "Landroidx/compose/ui/platform/DrawChildContainer;", "viewLayersContainer", "V0", "Landroidx/compose/ui/unit/b;", "onMeasureConstraints", "W0", "wasMeasuredWithMultipleConstraints", "Landroidx/compose/ui/node/k0;", "X0", "Landroidx/compose/ui/node/k0;", "measureAndLayoutDelegate", "Landroidx/compose/ui/platform/c4;", "Y0", "Landroidx/compose/ui/platform/c4;", "getViewConfiguration", "()Landroidx/compose/ui/platform/c4;", "viewConfiguration", "Landroidx/compose/ui/unit/m;", "Z0", "globalPosition", "", "a1", "[I", "tmpPositionArray", "Landroidx/compose/ui/graphics/a3;", "b1", "[F", "viewToWindowMatrix", "c1", "windowToViewMatrix", "d1", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "(J)V", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", "e1", "forceUseMatrixCache", "f1", "windowPosition", "g1", "isRenderNodeCompatible", "h1", "Landroidx/compose/runtime/z0;", "getViewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$b;", "setViewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$b;)V", "viewTreeOwners", "i1", "onViewTreeOwnersAvailable", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "j1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "k1", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "scrollChangedListener", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "l1", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "touchModeChangeListener", "Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl;", "m1", "Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl;", "getPlatformTextInputPluginRegistry", "()Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl;", "platformTextInputPluginRegistry", "Landroidx/compose/ui/text/input/t0;", "n1", "Landroidx/compose/ui/text/input/t0;", "getTextInputService", "()Landroidx/compose/ui/text/input/t0;", "textInputService", "Landroidx/compose/ui/text/font/t$b;", "o1", "Landroidx/compose/ui/text/font/t$b;", "getFontLoader", "()Landroidx/compose/ui/text/font/t$b;", "getFontLoader$annotations", "fontLoader", "Landroidx/compose/ui/text/font/u$b;", "p1", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/u$b;", "setFontFamilyResolver", "(Landroidx/compose/ui/text/font/u$b;)V", "fontFamilyResolver", "q1", "currentFontWeightAdjustment", "Landroidx/compose/ui/unit/LayoutDirection;", "r1", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/hapticfeedback/a;", "s1", "Landroidx/compose/ui/hapticfeedback/a;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/a;", "hapticFeedBack", "Landroidx/compose/ui/input/c;", "t1", "Landroidx/compose/ui/input/c;", "_inputModeManager", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "u1", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "modifierLocalManager", "Landroidx/compose/ui/platform/x3;", "v1", "Landroidx/compose/ui/platform/x3;", "getTextToolbar", "()Landroidx/compose/ui/platform/x3;", "textToolbar", "w1", "Landroid/view/MotionEvent;", "previousMotionEvent", "x1", "relayoutTime", "Landroidx/compose/ui/platform/k4;", "y1", "Landroidx/compose/ui/platform/k4;", "layerCache", "Landroidx/compose/runtime/collection/g;", "z1", "Landroidx/compose/runtime/collection/g;", "endApplyChangesListeners", "androidx/compose/ui/platform/AndroidComposeView$d", "A1", "Landroidx/compose/ui/platform/AndroidComposeView$d;", "resendMotionEventRunnable", "Ljava/lang/Runnable;", "B1", "Ljava/lang/Runnable;", "sendHoverExitEvent", "C1", "hoverExitReceived", "D1", "Lkotlin/jvm/functions/a;", "resendMotionEventOnLayout", "Landroidx/compose/ui/platform/g0;", "E1", "Landroidx/compose/ui/platform/g0;", "matrixToWindow", "F1", "keyboardModifiersRequireUpdate", "Landroidx/compose/ui/input/pointer/s;", "G1", "Landroidx/compose/ui/input/pointer/s;", "desiredPointerIcon", "Landroidx/compose/ui/input/pointer/t;", "H1", "Landroidx/compose/ui/input/pointer/t;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/t;", "pointerIconService", "h0", "(Landroid/content/res/Configuration;)I", "fontWeightAdjustmentCompat", "getView", "()Landroid/view/View;", "Landroidx/compose/ui/platform/l4;", "getWindowInfo", "()Landroidx/compose/ui/platform/l4;", "windowInfo", "Landroidx/compose/ui/autofill/i;", "getAutofill", "()Landroidx/compose/ui/autofill/i;", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/AndroidViewsHandler;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Landroidx/compose/ui/text/input/s0;", "getTextInputForTests", "()Landroidx/compose/ui/text/input/s0;", "textInputForTests", "Landroidx/compose/ui/input/b;", "getInputModeManager", "()Landroidx/compose/ui/input/b;", "inputModeManager", "isLifecycleInResumedState", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "I1", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 6 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 9 DebugUtils.kt\nandroidx/compose/ui/platform/DebugUtilsKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1941:1\n1182#2:1942\n1161#2,2:1943\n76#3:1945\n102#3,2:1946\n76#3:1948\n102#3,2:1949\n76#3:1951\n102#3,2:1952\n523#4:1954\n728#4,2:1955\n460#4,11:1979\n460#4,11:1991\n26#5,5:1957\n26#5,5:1962\n26#5,5:1967\n26#5,5:2006\n47#6,5:1972\n1#7:1977\n163#8:1978\n163#8:1990\n20#9,2:2002\n20#9,2:2004\n533#10,6:2011\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n*L\n481#1:1942\n481#1:1943,2\n348#1:1945\n348#1:1946,2\n405#1:1948\n405#1:1949,2\n419#1:1951\n419#1:1952,2\n673#1:1954\n686#1:1955,2\n1115#1:1979,11\n1123#1:1991,11\n803#1:1957,5\n814#1:1962,5\n864#1:1967,5\n1273#1:2006,5\n1041#1:1972,5\n1115#1:1978\n1123#1:1990\n1135#1:2002,2\n1190#1:2004,2\n1357#1:2011,6\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidComposeView */
public final class AndroidComposeView extends ViewGroup implements C15675c1, C15909j4, C15484j0, C19427i {
    @C12579k

    /* renamed from: I1 */
    public static final C15752a f39108I1 = new C15752a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: J1 */
    public static final String f39109J1 = "Compose Focus";

    /* renamed from: K1 */
    public static final int f39110K1 = 10;
    @C12580l

    /* renamed from: L1 */
    public static Class<?> f39111L1;
    @C12580l

    /* renamed from: M1 */
    public static Method f39112M1;
    @C12579k

    /* renamed from: A1 */
    public final C15755d f39113A1;
    @C12579k

    /* renamed from: B1 */
    public final Runnable f39114B1;

    /* renamed from: C1 */
    public boolean f39115C1;
    @C12579k

    /* renamed from: D1 */
    public final C11289a<C11079d2> f39116D1;
    @C12579k

    /* renamed from: E0 */
    public final C16041n f39117E0;
    @C12579k

    /* renamed from: E1 */
    public final C15885g0 f39118E1;
    @C12579k

    /* renamed from: F0 */
    public final AndroidComposeViewAccessibilityDelegateCompat f39119F0;

    /* renamed from: F1 */
    public boolean f39120F1;
    @C12579k

    /* renamed from: G0 */
    public final C8731z f39121G0;
    @C12580l

    /* renamed from: G1 */
    public C15496s f39122G1;
    @C12579k

    /* renamed from: H0 */
    public final List<C15672b1> f39123H0;
    @C12579k

    /* renamed from: H1 */
    public final C15498t f39124H1;
    @C12580l

    /* renamed from: I0 */
    public List<C15672b1> f39125I0;

    /* renamed from: J0 */
    public boolean f39126J0;
    @C12579k

    /* renamed from: K0 */
    public final C15478h f39127K0;
    @C12579k

    /* renamed from: L0 */
    public final C15462a0 f39128L0;
    @C12579k

    /* renamed from: M0 */
    public C11300l<? super Configuration, C11079d2> f39129M0;
    @C12580l

    /* renamed from: N0 */
    public final C8709e f39130N0;

    /* renamed from: O0 */
    public boolean f39131O0;
    @C12579k

    /* renamed from: P0 */
    public final C15878f f39132P0;
    @C12579k

    /* renamed from: Q0 */
    public final C15871e f39133Q0;
    @C12579k

    /* renamed from: R0 */
    public final OwnerSnapshotObserver f39134R0;

    /* renamed from: S0 */
    public boolean f39135S0;
    @C12580l

    /* renamed from: T0 */
    public AndroidViewsHandler f39136T0;
    @C12580l

    /* renamed from: U0 */
    public DrawChildContainer f39137U0;
    @C12580l

    /* renamed from: V0 */
    public C16476b f39138V0;

    /* renamed from: W0 */
    public boolean f39139W0;
    @C12579k

    /* renamed from: X0 */
    public final C15700k0 f39140X0;
    @C12579k

    /* renamed from: Y0 */
    public final C15863c4 f39141Y0;

    /* renamed from: Z0 */
    public long f39142Z0;

    /* renamed from: a */
    public long f39143a;
    @C12579k

    /* renamed from: a1 */
    public final int[] f39144a1;

    /* renamed from: b */
    public boolean f39145b = true;
    @C12579k

    /* renamed from: b1 */
    public final float[] f39146b1;
    @C12579k

    /* renamed from: c */
    public final C15674c0 f39147c = new C15674c0((C15179a) null, 1, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: c1 */
    public final float[] f39148c1;
    @C12579k

    /* renamed from: d */
    public C16479d f39149d;

    /* renamed from: d1 */
    public long f39150d1;
    @C12579k

    /* renamed from: e */
    public final C16038l f39151e;

    /* renamed from: e1 */
    public boolean f39152e1;
    @C12579k

    /* renamed from: f */
    public final C15076p f39153f;

    /* renamed from: f1 */
    public long f39154f1;
    @C12579k

    /* renamed from: g */
    public final C15928m4 f39155g;

    /* renamed from: g1 */
    public boolean f39156g1;
    @C12579k

    /* renamed from: h1 */
    public final C8700z0 f39157h1;
    @C12580l

    /* renamed from: i1 */
    public C11300l<? super C15753b, C11079d2> f39158i1;
    @C12579k

    /* renamed from: j1 */
    public final ViewTreeObserver.OnGlobalLayoutListener f39159j1;
    @C12579k

    /* renamed from: k1 */
    public final ViewTreeObserver.OnScrollChangedListener f39160k1;
    @C12579k

    /* renamed from: l1 */
    public final ViewTreeObserver.OnTouchModeChangeListener f39161l1;
    @C12579k

    /* renamed from: m1 */
    public final PlatformTextInputPluginRegistryImpl f39162m1;
    @C12579k

    /* renamed from: n1 */
    public final C16321t0 f39163n1;
    @C12579k

    /* renamed from: o1 */
    public final C16238t.C16240b f39164o1;
    @C12579k

    /* renamed from: p1 */
    public final C8700z0 f39165p1;

    /* renamed from: q1 */
    public int f39166q1;
    @C12579k

    /* renamed from: r1 */
    public final C8700z0 f39167r1;
    @C12579k

    /* renamed from: s1 */
    public final C15425a f39168s1;
    @C12579k

    /* renamed from: t1 */
    public final C15433c f39169t1;
    @C12579k

    /* renamed from: u1 */
    public final ModifierLocalManager f39170u1;
    @C12579k

    /* renamed from: v */
    public final C8767m f39171v;
    @C12579k

    /* renamed from: v1 */
    public final C15996x3 f39172v1;
    @C12579k

    /* renamed from: w */
    public final C8767m f39173w;
    @C12580l

    /* renamed from: w1 */
    public MotionEvent f39174w1;
    @C12579k

    /* renamed from: x */
    public final C15125c2 f39175x;

    /* renamed from: x1 */
    public long f39176x1;
    @C12579k

    /* renamed from: y */
    public final LayoutNode f39177y;
    @C12579k

    /* renamed from: y1 */
    public final C15916k4<C15672b1> f39178y1;
    @C12579k

    /* renamed from: z */
    public final C15698j1 f39179z;
    @C12579k

    /* renamed from: z1 */
    public final C8423g<C11289a<C11079d2>> f39180z1;

    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$a */
    public static final class C15752a {
        public /* synthetic */ C15752a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SuppressLint({"PrivateApi", "BanUncheckedReflection"})
        /* renamed from: b */
        public final boolean mo45364b() {
            Object obj;
            Method method;
            try {
                Boolean bool = null;
                if (AndroidComposeView.f39111L1 == null) {
                    AndroidComposeView.f39111L1 = Class.forName("android.os.SystemProperties");
                    Class S = AndroidComposeView.f39111L1;
                    if (S != null) {
                        method = S.getDeclaredMethod("getBoolean", new Class[]{String.class, Boolean.TYPE});
                    } else {
                        method = null;
                    }
                    AndroidComposeView.f39112M1 = method;
                }
                Method O = AndroidComposeView.f39112M1;
                if (O != null) {
                    obj = O.invoke((Object) null, new Object[]{"debug.layout", Boolean.FALSE});
                } else {
                    obj = null;
                }
                if (obj instanceof Boolean) {
                    bool = (Boolean) obj;
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        public C15752a() {
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$b */
    public static final class C15753b {

        /* renamed from: c */
        public static final int f39181c = 8;
        @C12579k

        /* renamed from: a */
        public final C19499w f39182a;
        @C12579k

        /* renamed from: b */
        public final C20437e f39183b;

        public C15753b(@C12579k C19499w wVar, @C12579k C20437e eVar) {
            Intrinsics.checkNotNullParameter(wVar, "lifecycleOwner");
            Intrinsics.checkNotNullParameter(eVar, "savedStateRegistryOwner");
            this.f39182a = wVar;
            this.f39183b = eVar;
        }

        @C12579k
        /* renamed from: a */
        public final C19499w mo45365a() {
            return this.f39182a;
        }

        @C12579k
        /* renamed from: b */
        public final C20437e mo45366b() {
            return this.f39183b;
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$c */
    public static final class C15754c implements C15498t {

        /* renamed from: a */
        public final /* synthetic */ AndroidComposeView f39184a;

        public C15754c(AndroidComposeView androidComposeView) {
            this.f39184a = androidComposeView;
        }

        @C12579k
        /* renamed from: a */
        public C15496s mo44131a() {
            C15496s N = this.f39184a.f39122G1;
            return N == null ? C15496s.f38536a.mo44128b() : N;
        }

        /* renamed from: b */
        public void mo44132b(@C12579k C15496s sVar) {
            Intrinsics.checkNotNullParameter(sVar, "value");
            this.f39184a.f39122G1 = sVar;
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$d */
    public static final class C15755d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AndroidComposeView f39185a;

        public C15755d(AndroidComposeView androidComposeView) {
            this.f39185a = androidComposeView;
        }

        public void run() {
            boolean z;
            this.f39185a.removeCallbacks(this);
            MotionEvent P = this.f39185a.f39174w1;
            if (P != null) {
                boolean z2 = false;
                if (P.getToolType(0) == 3) {
                    z = true;
                } else {
                    z = false;
                }
                int actionMasked = P.getActionMasked();
                if (!z ? actionMasked != 1 : !(actionMasked == 10 || actionMasked == 1)) {
                    z2 = true;
                }
                if (z2) {
                    int i = 7;
                    if (!(actionMasked == 7 || actionMasked == 9)) {
                        i = 2;
                    }
                    AndroidComposeView androidComposeView = this.f39185a;
                    androidComposeView.mo45303E0(P, i, androidComposeView.f39176x1, false);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView(@C12579k Context context) {
        super(context);
        C8709e eVar;
        int i;
        C15885g0 g0Var;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C15094f.C15095a aVar = C15094f.f37256b;
        this.f39143a = aVar.mo42247c();
        this.f39149d = C16475a.m74346a(context);
        C16038l lVar = new C16038l(false, false, AndroidComposeView$semanticsModifier$1.f39192f, (C11300l) null, 8, (DefaultConstructorMarker) null);
        this.f39151e = lVar;
        this.f39153f = new FocusOwnerImpl(new AndroidComposeView$focusOwner$1(this));
        this.f39155g = new C15928m4();
        C8767m.C8768a aVar2 = C8767m.f23478j;
        C8767m a = C15441f.m68286a(aVar2, new AndroidComposeView$keyInputModifier$1(this));
        this.f39171v = a;
        C8767m b = C15512a.m68872b(aVar2, AndroidComposeView$rotaryInputModifier$1.f39191f);
        this.f39173w = b;
        this.f39175x = new C15125c2();
        LayoutNode layoutNode = new LayoutNode(false, 0, 3, (DefaultConstructorMarker) null);
        layoutNode.mo44581o(RootMeasurePolicy.f38673b);
        layoutNode.mo44583w(getDensity());
        layoutNode.mo44582u(aVar2.mo17224k3(lVar).mo17224k3(b).mo17224k3(getFocusOwner().mo42072b()).mo17224k3(a));
        this.f39177y = layoutNode;
        this.f39179z = this;
        this.f39117E0 = new C16041n(getRoot());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.f39119F0 = androidComposeViewAccessibilityDelegateCompat;
        this.f39121G0 = new C8731z();
        this.f39123H0 = new ArrayList();
        this.f39127K0 = new C15478h();
        this.f39128L0 = new C15462a0(getRoot());
        this.f39129M0 = AndroidComposeView$configurationChangeObserver$1.f39190f;
        if (mo45306a0()) {
            eVar = new C8709e(this, getAutofillTree());
        } else {
            eVar = null;
        }
        this.f39130N0 = eVar;
        this.f39132P0 = new C15878f(context);
        this.f39133Q0 = new C15871e(context);
        this.f39134R0 = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(this));
        this.f39140X0 = new C15700k0(getRoot());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        Intrinsics.checkNotNullExpressionValue(viewConfiguration, "get(context)");
        this.f39141Y0 = new C15866d0(viewConfiguration);
        this.f39142Z0 = C16496n.m74593a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f39144a1 = new int[]{0, 0};
        this.f39146b1 = C15112a3.m65154c((float[]) null, 1, (DefaultConstructorMarker) null);
        this.f39148c1 = C15112a3.m65154c((float[]) null, 1, (DefaultConstructorMarker) null);
        this.f39150d1 = -1;
        this.f39154f1 = aVar.mo42246a();
        this.f39156g1 = true;
        this.f39157h1 = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
        this.f39159j1 = new C15897i(this);
        this.f39160k1 = new C15904j(this);
        this.f39161l1 = new C15911k(this);
        this.f39162m1 = new PlatformTextInputPluginRegistryImpl(new AndroidComposeView$platformTextInputPluginRegistry$1(this));
        this.f39163n1 = ((C16271a.C16272a) getPlatformTextInputPluginRegistry().mo47094h(C16271a.f40442a).mo47097b()).mo47147d();
        this.f39164o1 = new C15998y(context);
        this.f39165p1 = C8415c2.m30241j(C16250x.m73191a(context), C8415c2.m30250s());
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "context.resources.configuration");
        this.f39166q1 = mo45329h0(configuration);
        Configuration configuration2 = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "context.resources.configuration");
        this.f39167r1 = C8539f2.m30981g(AndroidComposeView_androidKt.m70939d(configuration2), (C8410b2) null, 2, (Object) null);
        this.f39168s1 = new C15428c(this);
        if (isInTouchMode()) {
            i = C15430a.f38121b.mo43612b();
        } else {
            i = C15430a.f38121b.mo43611a();
        }
        this.f39169t1 = new C15433c(i, new AndroidComposeView$_inputModeManager$1(this), (DefaultConstructorMarker) null);
        this.f39170u1 = new ModifierLocalManager(this);
        this.f39172v1 = new AndroidTextToolbar(this);
        this.f39178y1 = new C15916k4<>();
        this.f39180z1 = new C8423g<>(new C11289a[16], 0);
        this.f39113A1 = new C15755d(this);
        this.f39114B1 = new C15917l(this);
        this.f39116D1 = new AndroidComposeView$resendMotionEventOnLayout$1(this);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            g0Var = new C15905j0();
        } else {
            g0Var = new C15891h0();
        }
        this.f39118E1 = g0Var;
        setWillNotDraw(false);
        setFocusable(true);
        if (i2 >= 26) {
            C15992x.f39687a.mo45978a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        C18196h2.m82474B1(this, androidComposeViewAccessibilityDelegateCompat);
        C11300l<C15909j4, C11079d2> a2 = C15909j4.f39605p.mo45814a();
        if (a2 != null) {
            a2.invoke(this);
        }
        getRoot().mo44618F(this);
        if (i2 >= 29) {
            C15970t.f39667a.mo45955a(this);
        }
        this.f39124H1 = new C15754c(this);
    }

    /* renamed from: A0 */
    public static /* synthetic */ void m70698A0(AndroidComposeView androidComposeView, LayoutNode layoutNode, int i, Object obj) {
        if ((i & 1) != 0) {
            layoutNode = null;
        }
        androidComposeView.mo45363z0(layoutNode);
    }

    /* renamed from: B0 */
    public static final void m70699B0(AndroidComposeView androidComposeView) {
        Intrinsics.checkNotNullParameter(androidComposeView, "this$0");
        androidComposeView.mo45304H0();
    }

    /* renamed from: C0 */
    public static final void m70700C0(AndroidComposeView androidComposeView) {
        Intrinsics.checkNotNullParameter(androidComposeView, "this$0");
        boolean z = false;
        androidComposeView.f39115C1 = false;
        MotionEvent motionEvent = androidComposeView.f39174w1;
        Intrinsics.checkNotNull(motionEvent);
        if (motionEvent.getActionMasked() == 10) {
            z = true;
        }
        if (z) {
            androidComposeView.mo45302D0(motionEvent);
            return;
        }
        throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
    }

    /* renamed from: F0 */
    public static /* synthetic */ void m70701F0(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i, long j, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        androidComposeView.mo45303E0(motionEvent, i, j, z);
    }

    /* renamed from: G0 */
    public static final void m70702G0(AndroidComposeView androidComposeView, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(androidComposeView, "this$0");
        C15433c cVar = androidComposeView.f39169t1;
        if (z) {
            i = C15430a.f38121b.mo43612b();
        } else {
            i = C15430a.f38121b.mo43611a();
        }
        cVar.mo43615c(i);
    }

    @C11395k(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @C11587t0(expression = "fontFamilyResolver", imports = {}))
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    @C0344h1
    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    /* renamed from: i0 */
    public static final void m70718i0(AndroidComposeView androidComposeView) {
        Intrinsics.checkNotNullParameter(androidComposeView, "this$0");
        androidComposeView.mo45304H0();
    }

    private void setFontFamilyResolver(C16242u.C16244b bVar) {
        this.f39165p1.setValue(bVar);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        this.f39167r1.setValue(layoutDirection);
    }

    private final void setViewTreeOwners(C15753b bVar) {
        this.f39157h1.setValue(bVar);
    }

    /* renamed from: C */
    public void mo44958C(@C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "node");
        this.f39140X0.mo45063r(layoutNode);
        mo45362y0();
    }

    /* renamed from: D */
    public void mo45301D() {
        mo45333m0(getRoot());
    }

    /* renamed from: D0 */
    public final int mo45302D0(MotionEvent motionEvent) {
        C15511z zVar;
        if (this.f39120F1) {
            this.f39120F1 = false;
            this.f39155g.mo45844e(C15479h0.m68605b(motionEvent.getMetaState()));
        }
        C15510y c = this.f39127K0.mo44057c(motionEvent, this);
        if (c != null) {
            List<C15511z> b = c.mo44194b();
            ListIterator<C15511z> listIterator = b.listIterator(b.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    zVar = null;
                    break;
                }
                zVar = listIterator.previous();
                if (zVar.mo44209m()) {
                    break;
                }
            }
            C15511z zVar2 = zVar;
            if (zVar2 != null) {
                this.f39143a = zVar2.mo44213q();
            }
            int b2 = this.f39128L0.mo44025b(c, this, mo45349q0(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked != 0 && actionMasked != 5) || C15486k0.m68638f(b2)) {
                return b2;
            }
            this.f39127K0.mo44059e(motionEvent.getPointerId(motionEvent.getActionIndex()));
            return b2;
        }
        this.f39128L0.mo44026d();
        return C15464b0.m68452a(false, false);
    }

    /* renamed from: E */
    public long mo44077E(long j) {
        mo45357t0();
        long j2 = C15112a3.m65160j(this.f39146b1, j);
        return C15096g.m64898a(C15094f.m64880p(j2) + C15094f.m64880p(this.f39154f1), C15094f.m64882r(j2) + C15094f.m64882r(this.f39154f1));
    }

    /* renamed from: E0 */
    public final void mo45303E0(MotionEvent motionEvent, int i, long j, boolean z) {
        int i2;
        int i3;
        long j2;
        int i4;
        MotionEvent motionEvent2 = motionEvent;
        int i5 = i;
        int actionMasked = motionEvent.getActionMasked();
        int i6 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i6 = motionEvent.getActionIndex();
            }
        } else if (!(i5 == 9 || i5 == 10)) {
            i6 = 0;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (i6 >= 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i7 = pointerCount - i2;
        if (i7 != 0) {
            MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                pointerPropertiesArr[i8] = new MotionEvent.PointerProperties();
            }
            MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i7];
            for (int i9 = 0; i9 < i7; i9++) {
                pointerCoordsArr[i9] = new MotionEvent.PointerCoords();
            }
            for (int i10 = 0; i10 < i7; i10++) {
                if (i6 < 0 || i10 < i6) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
                int i11 = i4 + i10;
                motionEvent2.getPointerProperties(i11, pointerPropertiesArr[i10]);
                MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i10];
                motionEvent2.getPointerCoords(i11, pointerCoords);
                long E = mo44077E(C15096g.m64898a(pointerCoords.x, pointerCoords.y));
                pointerCoords.x = C15094f.m64880p(E);
                pointerCoords.y = C15094f.m64882r(E);
            }
            if (z) {
                i3 = 0;
            } else {
                i3 = motionEvent.getButtonState();
            }
            if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
                j2 = j;
            } else {
                j2 = motionEvent.getDownTime();
            }
            MotionEvent obtain = MotionEvent.obtain(j2, j, i, i7, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), i3, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
            C15478h hVar = this.f39127K0;
            Intrinsics.checkNotNullExpressionValue(obtain, "event");
            C15510y c = hVar.mo44057c(obtain, this);
            Intrinsics.checkNotNull(c);
            this.f39128L0.mo44025b(c, this, true);
            obtain.recycle();
        }
    }

    @C12579k
    /* renamed from: F */
    public C15672b1 mo44959F(@C12579k C11300l<? super C15118b2, C11079d2> lVar, @C12579k C11289a<C11079d2> aVar) {
        DrawChildContainer drawChildContainer;
        Intrinsics.checkNotNullParameter(lVar, "drawBlock");
        Intrinsics.checkNotNullParameter(aVar, "invalidateParentLayer");
        C15672b1 c = this.f39178y1.mo45819c();
        if (c != null) {
            c.mo44945g(lVar, aVar);
            return c;
        }
        if (isHardwareAccelerated() && this.f39156g1) {
            try {
                return new RenderNodeLayer(this, lVar, aVar);
            } catch (Throwable unused) {
                this.f39156g1 = false;
            }
        }
        if (this.f39137U0 == null) {
            ViewLayer.C15813b bVar = ViewLayer.f39405G0;
            if (!bVar.mo45584a()) {
                bVar.mo45588e(new View(getContext()));
            }
            if (bVar.mo45586c()) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
                drawChildContainer = new DrawChildContainer(context);
            } else {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, C9175a.f24932Y);
                drawChildContainer = new ViewLayerContainer(context2);
            }
            this.f39137U0 = drawChildContainer;
            addView(drawChildContainer);
        }
        DrawChildContainer drawChildContainer2 = this.f39137U0;
        Intrinsics.checkNotNull(drawChildContainer2);
        return new ViewLayer(this, drawChildContainer2, lVar, aVar);
    }

    /* renamed from: G */
    public void mo44960G(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C40852x.C40853a.f103958a);
        if (!this.f39180z1.mo15492x(aVar)) {
            this.f39180z1.mo15463e(aVar);
        }
    }

    /* renamed from: H */
    public void mo44961H() {
        if (this.f39131O0) {
            getSnapshotObserver().mo44914b();
            this.f39131O0 = false;
        }
        AndroidViewsHandler androidViewsHandler = this.f39136T0;
        if (androidViewsHandler != null) {
            mo45312d0(androidViewsHandler);
        }
        while (this.f39180z1.mo15477m0()) {
            int h0 = this.f39180z1.mo15469h0();
            for (int i = 0; i < h0; i++) {
                C11289a aVar = (C11289a) this.f39180z1.mo15462d0()[i];
                this.f39180z1.mo15443H0(i, null);
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.f39180z1.mo15439E0(0, h0);
        }
    }

    /* renamed from: H0 */
    public final void mo45304H0() {
        getLocationOnScreen(this.f39144a1);
        long j = this.f39142Z0;
        int c = C16494m.m74571c(j);
        int d = C16494m.m74572d(j);
        int[] iArr = this.f39144a1;
        boolean z = false;
        int i = iArr[0];
        if (!(c == i && d == iArr[1])) {
            this.f39142Z0 = C16496n.m74593a(i, iArr[1]);
            if (!(c == Integer.MAX_VALUE || d == Integer.MAX_VALUE)) {
                getRoot().mo44687k0().mo44759x().mo44799f1();
                z = true;
            }
        }
        this.f39140X0.mo45051d(z);
    }

    /* renamed from: I */
    public void mo44962I() {
        this.f39119F0.mo45423i0();
    }

    /* renamed from: Z */
    public final void mo45305Z(@C12579k AndroidViewHolder androidViewHolder, @C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(androidViewHolder, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(androidViewHolder, layoutNode);
        getAndroidViewsHandler$ui_release().addView(androidViewHolder);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, androidViewHolder);
        C18196h2.m82531R1(androidViewHolder, 1);
        C18196h2.m82474B1(androidViewHolder, new AndroidComposeView$addAndroidView$1(layoutNode, this, this));
    }

    /* renamed from: a */
    public void mo44963a(boolean z) {
        C11289a<C11079d2> aVar;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (z) {
            try {
                aVar = this.f39116D1;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            aVar = null;
        }
        if (this.f39140X0.mo45060n(aVar)) {
            requestLayout();
        }
        C15700k0.m70349e(this.f39140X0, false, 1, (Object) null);
        C11079d2 d2Var = C11079d2.f28267a;
        Trace.endSection();
    }

    /* renamed from: a0 */
    public final boolean mo45306a0() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public void autofill(@C12579k SparseArray<AutofillValue> sparseArray) {
        C8709e eVar;
        Intrinsics.checkNotNullParameter(sparseArray, C19456p0.f49833g);
        if (mo45306a0() && (eVar = this.f39130N0) != null) {
            C8712h.m32326a(eVar, sparseArray);
        }
    }

    @C12580l
    /* renamed from: b0 */
    public final Object mo45308b0(@C12579k C11045c<? super C11079d2> cVar) {
        Object z = this.f39119F0.mo45435z(cVar);
        return z == C11063b.m42612h() ? z : C11079d2.f28267a;
    }

    /* renamed from: c */
    public void mo44964c(@C12579k LayoutNode layoutNode, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (z) {
            if (this.f39140X0.mo45070z(layoutNode, z2)) {
                mo45363z0(layoutNode);
            }
        } else if (this.f39140X0.mo45048E(layoutNode, z2)) {
            mo45363z0(layoutNode);
        }
    }

    /* renamed from: c0 */
    public final boolean mo45309c0(LayoutNode layoutNode) {
        boolean z;
        if (this.f39139W0) {
            return true;
        }
        LayoutNode C0 = layoutNode.mo44613C0();
        if (C0 == null || C0.mo44672c0()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public boolean canScrollHorizontally(int i) {
        return this.f39119F0.mo45377A(false, i, this.f39143a);
    }

    public boolean canScrollVertically(int i) {
        return this.f39119F0.mo45377A(true, i, this.f39143a);
    }

    /* renamed from: d0 */
    public final void mo45312d0(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).mo44961H();
            } else if (childAt instanceof ViewGroup) {
                mo45312d0((ViewGroup) childAt);
            }
        }
    }

    public void dispatchDraw(@C12579k Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!isAttachedToWindow()) {
            mo45333m0(getRoot());
        }
        C15675c1.m70188b(this, false, 1, (Object) null);
        this.f39126J0 = true;
        C15125c2 c2Var = this.f39175x;
        Canvas T = c2Var.mo42490b().mo42733T();
        c2Var.mo42490b().mo42734V(canvas);
        getRoot().mo44643P(c2Var.mo42490b());
        c2Var.mo42490b().mo42734V(T);
        if (!this.f39123H0.isEmpty()) {
            int size = this.f39123H0.size();
            for (int i = 0; i < size; i++) {
                this.f39123H0.get(i).mo44951m();
            }
        }
        if (ViewLayer.f39405G0.mo45586c()) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.f39123H0.clear();
        this.f39126J0 = false;
        List<C15672b1> list = this.f39125I0;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            this.f39123H0.addAll(list);
            list.clear();
        }
    }

    public boolean dispatchGenericMotionEvent(@C12579k MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "event");
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.isFromSource(4194304)) {
            return mo45331k0(motionEvent);
        }
        if (mo45335o0(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return C15486k0.m68638f(mo45330j0(motionEvent));
    }

    public boolean dispatchHoverEvent(@C12579k MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "event");
        if (this.f39115C1) {
            removeCallbacks(this.f39114B1);
            this.f39114B1.run();
        }
        if (mo45335o0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.isFromSource(C18317n0.f46977l) && motionEvent.getToolType(0) == 1) {
            return this.f39119F0.mo45391H(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && mo45349q0(motionEvent)) {
                if (motionEvent.getToolType(0) != 3) {
                    MotionEvent motionEvent2 = this.f39174w1;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.f39174w1 = MotionEvent.obtainNoHistory(motionEvent);
                    this.f39115C1 = true;
                    post(this.f39114B1);
                    return false;
                } else if (motionEvent.getButtonState() != 0) {
                    return false;
                }
            }
        } else if (!mo45351r0(motionEvent)) {
            return false;
        }
        return C15486k0.m68638f(mo45330j0(motionEvent));
    }

    public boolean dispatchKeyEvent(@C12579k KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "event");
        if (!isFocused()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        this.f39155g.mo45844e(C15479h0.m68605b(keyEvent.getMetaState()));
        return mo45043x(C15436b.m68253b(keyEvent));
    }

    public boolean dispatchTouchEvent(@C12579k MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (this.f39115C1) {
            removeCallbacks(this.f39114B1);
            MotionEvent motionEvent2 = this.f39174w1;
            Intrinsics.checkNotNull(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || mo45332l0(motionEvent, motionEvent2)) {
                this.f39114B1.run();
            } else {
                this.f39115C1 = false;
            }
        }
        if (mo45335o0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !mo45351r0(motionEvent)) {
            return false;
        }
        int j0 = mo45330j0(motionEvent);
        if (C15486k0.m68637e(j0)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return C15486k0.m68638f(j0);
    }

    /* renamed from: e */
    public void mo44965e(@C12579k LayoutNode layoutNode, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (z) {
            if (this.f39140X0.mo45069x(layoutNode, z2)) {
                m70698A0(this, (LayoutNode) null, 1, (Object) null);
            }
        } else if (this.f39140X0.mo45047C(layoutNode, z2)) {
            m70698A0(this, (LayoutNode) null, 1, (Object) null);
        }
    }

    /* renamed from: e0 */
    public final Pair<Integer, Integer> mo45318e0(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return C11078d1.m42659a(0, Integer.valueOf(size));
        }
        if (mode == 0) {
            return C11078d1.m42659a(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return C11078d1.m42659a(Integer.valueOf(size), Integer.valueOf(size));
        }
        throw new IllegalStateException();
    }

    /* renamed from: f0 */
    public final void mo45319f0(@C12579k AndroidViewHolder androidViewHolder, @C12579k Canvas canvas) {
        Intrinsics.checkNotNullParameter(androidViewHolder, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        getAndroidViewsHandler$ui_release().mo45506a(androidViewHolder, canvas);
    }

    @C12580l
    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return mo45321g0(i, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", new Class[]{Integer.TYPE});
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, new Object[]{Integer.valueOf(i)});
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: g0 */
    public final View mo45321g0(int i, View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (Intrinsics.areEqual(declaredMethod.invoke(view, new Object[0]), (Object) Integer.valueOf(i))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            Intrinsics.checkNotNullExpressionValue(childAt, "currentView.getChildAt(i)");
            View g0 = mo45321g0(i, childAt);
            if (g0 != null) {
                return g0;
            }
        }
        return null;
    }

    @C12579k
    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this.f39136T0 == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(context);
            this.f39136T0 = androidViewsHandler;
            addView(androidViewsHandler);
        }
        AndroidViewsHandler androidViewsHandler2 = this.f39136T0;
        Intrinsics.checkNotNull(androidViewsHandler2);
        return androidViewsHandler2;
    }

    @C12580l
    public C8713i getAutofill() {
        return this.f39130N0;
    }

    @C12579k
    public C8731z getAutofillTree() {
        return this.f39121G0;
    }

    @C12579k
    public final C11300l<Configuration, C11079d2> getConfigurationChangeObserver() {
        return this.f39129M0;
    }

    @C12579k
    public C16479d getDensity() {
        return this.f39149d;
    }

    @C12579k
    public C15076p getFocusOwner() {
        return this.f39153f;
    }

    public void getFocusedRect(@C12579k Rect rect) {
        C11079d2 d2Var;
        Intrinsics.checkNotNullParameter(rect, "rect");
        C15098i k = getFocusOwner().mo42081k();
        if (k != null) {
            rect.left = C11409d.m43851L0(k.mo42279t());
            rect.top = C11409d.m43851L0(k.mo42249B());
            rect.right = C11409d.m43851L0(k.mo42283x());
            rect.bottom = C11409d.m43851L0(k.mo42271j());
            d2Var = C11079d2.f28267a;
        } else {
            d2Var = null;
        }
        if (d2Var == null) {
            super.getFocusedRect(rect);
        }
    }

    @C12579k
    public C16242u.C16244b getFontFamilyResolver() {
        return (C16242u.C16244b) this.f39165p1.getValue();
    }

    @C12579k
    public C16238t.C16240b getFontLoader() {
        return this.f39164o1;
    }

    @C12579k
    public C15425a getHapticFeedBack() {
        return this.f39168s1;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f39140X0.mo45057k();
    }

    @C12579k
    public C15432b getInputModeManager() {
        return this.f39169t1;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f39150d1;
    }

    @C12579k
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.f39167r1.getValue();
    }

    public long getMeasureIteration() {
        return this.f39140X0.mo45059m();
    }

    @C12579k
    public ModifierLocalManager getModifierLocalManager() {
        return this.f39170u1;
    }

    @C12579k
    public C15498t getPointerIconService() {
        return this.f39124H1;
    }

    @C12579k
    public LayoutNode getRoot() {
        return this.f39177y;
    }

    @C12579k
    public C15698j1 getRootForTest() {
        return this.f39179z;
    }

    @C12579k
    public C16041n getSemanticsOwner() {
        return this.f39117E0;
    }

    @C12579k
    public C15674c0 getSharedDrawScope() {
        return this.f39147c;
    }

    public boolean getShowLayoutBounds() {
        return this.f39135S0;
    }

    @C12579k
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.f39134R0;
    }

    @C12580l
    public C16319s0 getTextInputForTests() {
        C16292g0 g = getPlatformTextInputPluginRegistry().mo47093g();
        if (g != null) {
            return g.mo47145a();
        }
        return null;
    }

    @C12579k
    public C16321t0 getTextInputService() {
        return this.f39163n1;
    }

    @C12579k
    public C15996x3 getTextToolbar() {
        return this.f39172v1;
    }

    @C12579k
    public View getView() {
        return this;
    }

    @C12579k
    public C15863c4 getViewConfiguration() {
        return this.f39141Y0;
    }

    @C12580l
    public final C15753b getViewTreeOwners() {
        return (C15753b) this.f39157h1.getValue();
    }

    @C12579k
    public C15922l4 getWindowInfo() {
        return this.f39155g;
    }

    /* renamed from: h */
    public long mo44990h(long j) {
        mo45357t0();
        return C15112a3.m65160j(this.f39146b1, j);
    }

    /* renamed from: h0 */
    public final int mo45329h0(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    /* renamed from: j */
    public void mo44991j(@C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f39140X0.mo45046B(layoutNode);
        m70698A0(this, (LayoutNode) null, 1, (Object) null);
    }

    /* renamed from: j0 */
    public final int mo45330j0(MotionEvent motionEvent) {
        boolean z;
        removeCallbacks(this.f39113A1);
        try {
            mo45358u0(motionEvent);
            boolean z2 = true;
            this.f39152e1 = true;
            mo44963a(false);
            this.f39122G1 = null;
            Trace.beginSection("AndroidOwner:onTouch");
            int actionMasked = motionEvent.getActionMasked();
            MotionEvent motionEvent2 = this.f39174w1;
            if (motionEvent2 == null || motionEvent2.getToolType(0) != 3) {
                z = false;
            } else {
                z = true;
            }
            if (motionEvent2 != null && mo45332l0(motionEvent, motionEvent2)) {
                if (mo45348p0(motionEvent2)) {
                    this.f39128L0.mo44026d();
                } else if (motionEvent2.getActionMasked() != 10 && z) {
                    m70701F0(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, (Object) null);
                }
            }
            if (motionEvent.getToolType(0) != 3) {
                z2 = false;
            }
            if (!z && z2 && actionMasked != 3 && actionMasked != 9 && mo45349q0(motionEvent)) {
                m70701F0(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, (Object) null);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.f39174w1 = MotionEvent.obtainNoHistory(motionEvent);
            int D0 = mo45302D0(motionEvent);
            Trace.endSection();
            C15976u.f39677a.mo45967a(this, this.f39122G1);
            this.f39152e1 = false;
            return D0;
        } catch (Throwable th) {
            this.f39152e1 = false;
            throw th;
        }
    }

    /* renamed from: k0 */
    public final boolean mo45331k0(MotionEvent motionEvent) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f = -motionEvent.getAxisValue(26);
        return getFocusOwner().mo42079i(new C15515d(C18338p3.m83062e(viewConfiguration, getContext()) * f, f * C18338p3.m83059b(viewConfiguration, getContext()), motionEvent.getEventTime()));
    }

    /* renamed from: l */
    public void mo44992l(@C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f39119F0.mo45422h0(layoutNode);
    }

    /* renamed from: l0 */
    public final boolean mo45332l0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public void mo44993m(@C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f39140X0.mo45054h(layoutNode);
    }

    /* renamed from: m0 */
    public final void mo45333m0(LayoutNode layoutNode) {
        layoutNode.mo44653S0();
        C8423g<LayoutNode> I0 = layoutNode.mo44627I0();
        int h0 = I0.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = I0.mo15462d0();
            int i = 0;
            do {
                mo45333m0((LayoutNode) d0[i]);
                i++;
            } while (i < h0);
        }
    }

    /* renamed from: n0 */
    public final void mo45334n0(LayoutNode layoutNode) {
        int i = 0;
        C15700k0.m70346F(this.f39140X0, layoutNode, false, 2, (Object) null);
        C8423g<LayoutNode> I0 = layoutNode.mo44627I0();
        int h0 = I0.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = I0.mo15462d0();
            do {
                mo45334n0((LayoutNode) d0[i]);
                i++;
            } while (i < h0);
        }
    }

    /* renamed from: o */
    public void mo44994o(@C12579k C15675c1.C15677b bVar) {
        Intrinsics.checkNotNullParameter(bVar, C40852x.C40853a.f103958a);
        this.f39140X0.mo45066u(bVar);
        m70698A0(this, (LayoutNode) null, 1, (Object) null);
    }

    /* renamed from: o0 */
    public final boolean mo45335o0(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float x = motionEvent.getX();
        if (Float.isInfinite(x) || Float.isNaN(x)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return true;
        }
        float y = motionEvent.getY();
        if (Float.isInfinite(y) || Float.isNaN(y)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            return true;
        }
        float rawX = motionEvent.getRawX();
        if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3) {
            return true;
        }
        float rawY = motionEvent.getRawY();
        if (Float.isInfinite(rawY) || Float.isNaN(rawY)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z4) {
            return true;
        }
        return false;
    }

    public void onAttachedToWindow() {
        boolean z;
        int i;
        C19499w a;
        Lifecycle lifecycle;
        C8709e eVar;
        super.onAttachedToWindow();
        mo45334n0(getRoot());
        mo45333m0(getRoot());
        getSnapshotObserver().mo44919j();
        if (mo45306a0() && (eVar = this.f39130N0) != null) {
            C8728x.f23396a.mo17044a(eVar);
        }
        C19499w a2 = ViewTreeLifecycleOwner.m90620a(this);
        C20437e a3 = ViewTreeSavedStateRegistryOwner.m95251a(this);
        C15753b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || !(a2 == null || a3 == null || (a2 == viewTreeOwners.mo45365a() && a3 == viewTreeOwners.mo45365a()))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (a2 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            } else if (a3 != null) {
                if (!(viewTreeOwners == null || (a = viewTreeOwners.mo45365a()) == null || (lifecycle = a.getLifecycle()) == null)) {
                    lifecycle.mo57467d(this);
                }
                a2.getLifecycle().mo57464a(this);
                C15753b bVar = new C15753b(a2, a3);
                setViewTreeOwners(bVar);
                C11300l<? super C15753b, C11079d2> lVar = this.f39158i1;
                if (lVar != null) {
                    lVar.invoke(bVar);
                }
                this.f39158i1 = null;
            } else {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
        }
        C15433c cVar = this.f39169t1;
        if (isInTouchMode()) {
            i = C15430a.f38121b.mo43612b();
        } else {
            i = C15430a.f38121b.mo43611a();
        }
        cVar.mo43615c(i);
        C15753b viewTreeOwners2 = getViewTreeOwners();
        Intrinsics.checkNotNull(viewTreeOwners2);
        viewTreeOwners2.mo45365a().getLifecycle().mo57464a(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f39159j1);
        getViewTreeObserver().addOnScrollChangedListener(this.f39160k1);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f39161l1);
    }

    public boolean onCheckIsTextEditor() {
        return getPlatformTextInputPluginRegistry().mo47093g() != null;
    }

    public void onConfigurationChanged(@C12579k Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        this.f39149d = C16475a.m74346a(context);
        if (mo45329h0(configuration) != this.f39166q1) {
            this.f39166q1 = mo45329h0(configuration);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, C9175a.f24932Y);
            setFontFamilyResolver(C16250x.m73191a(context2));
        }
        this.f39129M0.invoke(configuration);
    }

    @C12580l
    public InputConnection onCreateInputConnection(@C12579k EditorInfo editorInfo) {
        Intrinsics.checkNotNullParameter(editorInfo, "outAttrs");
        C16292g0 g = getPlatformTextInputPluginRegistry().mo47093g();
        if (g != null) {
            return g.mo47146c(editorInfo);
        }
        return null;
    }

    public void onDetachedFromWindow() {
        C8709e eVar;
        C19499w a;
        Lifecycle lifecycle;
        super.onDetachedFromWindow();
        getSnapshotObserver().mo44920k();
        C15753b viewTreeOwners = getViewTreeOwners();
        if (!(viewTreeOwners == null || (a = viewTreeOwners.mo45365a()) == null || (lifecycle = a.getLifecycle()) == null)) {
            lifecycle.mo57467d(this);
        }
        if (mo45306a0() && (eVar = this.f39130N0) != null) {
            C8728x.f23396a.mo17045b(eVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f39159j1);
        getViewTreeObserver().removeOnScrollChangedListener(this.f39160k1);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f39161l1);
    }

    public void onDraw(@C12579k Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
    }

    public void onFocusChanged(boolean z, int i, @C12580l Rect rect) {
        super.onFocusChanged(z, i, rect);
        StringBuilder sb = new StringBuilder();
        sb.append("Owner FocusChanged(");
        sb.append(z);
        sb.append(')');
        if (z) {
            getFocusOwner().mo42074d();
        } else {
            getFocusOwner().mo42082l();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f39140X0.mo45060n(this.f39116D1);
        this.f39138V0 = null;
        mo45304H0();
        if (this.f39136T0 != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public void onMeasure(int i, int i2) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                mo45334n0(getRoot());
            }
            Pair<Integer, Integer> e0 = mo45318e0(i);
            int intValue = e0.mo21846a().intValue();
            int intValue2 = e0.mo21847b().intValue();
            Pair<Integer, Integer> e02 = mo45318e0(i2);
            long a = C16478c.m74376a(intValue, intValue2, e02.mo21846a().intValue(), e02.mo21847b().intValue());
            C16476b bVar = this.f39138V0;
            boolean z = false;
            if (bVar == null) {
                this.f39138V0 = C16476b.m74348b(a);
                this.f39139W0 = false;
            } else {
                if (bVar != null) {
                    z = C16476b.m74353g(bVar.mo47807x(), a);
                }
                if (!z) {
                    this.f39139W0 = true;
                }
            }
            this.f39140X0.mo45049G(a);
            this.f39140X0.mo45062q();
            setMeasuredDimension(getRoot().getWidth(), getRoot().getHeight());
            if (this.f39136T0 != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().getHeight(), 1073741824));
            }
            C11079d2 d2Var = C11079d2.f28267a;
        } finally {
            Trace.endSection();
        }
    }

    public void onProvideAutofillVirtualStructure(@C12580l ViewStructure viewStructure, int i) {
        C8709e eVar;
        if (mo45306a0() && viewStructure != null && (eVar = this.f39130N0) != null) {
            C8712h.m32327b(eVar, viewStructure);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        if (this.f39145b) {
            LayoutDirection a = AndroidComposeView_androidKt.m70942g(i);
            setLayoutDirection(a);
            getFocusOwner().mo42071a(a);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        boolean a;
        this.f39155g.mo45845f(z);
        this.f39120F1 = true;
        super.onWindowFocusChanged(z);
        if (z && getShowLayoutBounds() != (a = f39108I1.mo45364b())) {
            setShowLayoutBounds(a);
            mo45301D();
        }
    }

    /* renamed from: p */
    public void mo45042p() {
        C15675c1.m70188b(this, false, 1, (Object) null);
    }

    /* renamed from: p0 */
    public final boolean mo45348p0(MotionEvent motionEvent) {
        int actionMasked;
        if (motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
            return true;
        }
        return false;
    }

    /* renamed from: q0 */
    public final boolean mo45349q0(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (0.0f > x || x > ((float) getWidth())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (0.0f > y || y > ((float) getHeight())) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    public boolean mo45350r() {
        Lifecycle.State state;
        C19499w a;
        Lifecycle lifecycle;
        C15753b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (a = viewTreeOwners.mo45365a()) == null || (lifecycle = a.getLifecycle()) == null) {
            state = null;
        } else {
            state = lifecycle.mo57465b();
        }
        if (state == Lifecycle.State.RESUMED) {
            return true;
        }
        return false;
    }

    /* renamed from: r0 */
    public final boolean mo45351r0(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        boolean z;
        boolean z2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.f39174w1) == null) {
            return true;
        }
        if (motionEvent.getRawX() == motionEvent2.getRawX()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        if (motionEvent.getRawY() == motionEvent2.getRawY()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public long mo44078s(long j) {
        mo45357t0();
        return C15112a3.m65160j(this.f39148c1, C15096g.m64898a(C15094f.m64880p(j) - C15094f.m64880p(this.f39154f1), C15094f.m64882r(j) - C15094f.m64882r(this.f39154f1)));
    }

    /* renamed from: s0 */
    public final void mo45352s0(@C12579k C15672b1 b1Var, boolean z) {
        Intrinsics.checkNotNullParameter(b1Var, "layer");
        if (!z) {
            if (!this.f39126J0) {
                this.f39123H0.remove(b1Var);
                List<C15672b1> list = this.f39125I0;
                if (list != null) {
                    list.remove(b1Var);
                }
            }
        } else if (!this.f39126J0) {
            this.f39123H0.add(b1Var);
        } else {
            List list2 = this.f39125I0;
            if (list2 == null) {
                list2 = new ArrayList();
                this.f39125I0 = list2;
            }
            list2.add(b1Var);
        }
    }

    public final void setConfigurationChangeObserver(@C12579k C11300l<? super Configuration, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.f39129M0 = lVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.f39150d1 = j;
    }

    public final void setOnViewTreeOwnersAvailable(@C12579k C11300l<? super C15753b, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C10108c.f27778C);
        C15753b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            lVar.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.f39158i1 = lVar;
        }
    }

    public void setShowLayoutBounds(boolean z) {
        this.f39135S0 = z;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @C12580l
    /* renamed from: t */
    public C15059d mo44997t(@C12579k KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        int i;
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        long a = C15439d.m68273a(keyEvent);
        C15434a.C15435a aVar = C15434a.f38267b;
        if (C15434a.m67412E4(a, aVar.mo43762W7())) {
            if (C15439d.m68279g(keyEvent)) {
                i = C15059d.f37228b.mo42191l();
            } else {
                i = C15059d.f37228b.mo42189i();
            }
            return C15059d.m64706k(i);
        } else if (C15434a.m67412E4(a, aVar.mo43723Q1())) {
            return C15059d.m64706k(C15059d.f37228b.mo42192m());
        } else {
            if (C15434a.m67412E4(a, aVar.mo43712O1())) {
                return C15059d.m64706k(C15059d.f37228b.mo42188h());
            }
            if (C15434a.m67412E4(a, aVar.mo43734S1())) {
                return C15059d.m64706k(C15059d.f37228b.mo42193n());
            }
            if (C15434a.m67412E4(a, aVar.mo43679I1())) {
                return C15059d.m64706k(C15059d.f37228b.mo42184a());
            }
            boolean z3 = true;
            if (C15434a.m67412E4(a, aVar.mo43668G1())) {
                z = true;
            } else {
                z = C15434a.m67412E4(a, aVar.mo43824i2());
            }
            if (z) {
                z2 = true;
            } else {
                z2 = C15434a.m67412E4(a, aVar.mo43694K5());
            }
            if (z2) {
                return C15059d.m64706k(C15059d.f37228b.mo42185b());
            }
            if (!C15434a.m67412E4(a, aVar.mo43898w())) {
                z3 = C15434a.m67412E4(a, aVar.mo43857o2());
            }
            if (z3) {
                return C15059d.m64706k(C15059d.f37228b.mo42186d());
            }
            return null;
        }
    }

    /* renamed from: t0 */
    public final void mo45357t0() {
        if (!this.f39152e1) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.f39150d1) {
                this.f39150d1 = currentAnimationTimeMillis;
                mo45359v0();
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                view.getLocationOnScreen(this.f39144a1);
                int[] iArr = this.f39144a1;
                view.getLocationInWindow(iArr);
                int[] iArr2 = this.f39144a1;
                this.f39154f1 = C15096g.m64898a(((float) iArr[0]) - ((float) iArr2[0]), ((float) iArr[1]) - ((float) iArr2[1]));
            }
        }
    }

    /* renamed from: u */
    public void mo44998u(@C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "node");
    }

    /* renamed from: u0 */
    public final void mo45358u0(MotionEvent motionEvent) {
        this.f39150d1 = AnimationUtils.currentAnimationTimeMillis();
        mo45359v0();
        long j = C15112a3.m65160j(this.f39146b1, C15096g.m64898a(motionEvent.getX(), motionEvent.getY()));
        this.f39154f1 = C15096g.m64898a(motionEvent.getRawX() - C15094f.m64880p(j), motionEvent.getRawY() - C15094f.m64882r(j));
    }

    /* renamed from: v */
    public void mo34383v(@C12579k C19499w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "owner");
        setShowLayoutBounds(f39108I1.mo45364b());
    }

    /* renamed from: v0 */
    public final void mo45359v0() {
        this.f39118E1.mo45728a(this, this.f39146b1);
        C15993x0.m71801a(this.f39146b1, this.f39148c1);
    }

    /* renamed from: w */
    public void mo44999w(@C12579k LayoutNode layoutNode, long j) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.f39140X0.mo45061p(layoutNode, j);
            C15700k0.m70349e(this.f39140X0, false, 1, (Object) null);
            C11079d2 d2Var = C11079d2.f28267a;
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: w0 */
    public final boolean mo45360w0(@C12579k C15672b1 b1Var) {
        Intrinsics.checkNotNullParameter(b1Var, "layer");
        if (this.f39137U0 != null) {
            boolean c = ViewLayer.f39405G0.mo45586c();
        }
        this.f39178y1.mo45820d(b1Var);
        return true;
    }

    /* renamed from: x */
    public boolean mo45043x(@C12579k KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        return getFocusOwner().mo42084n(keyEvent);
    }

    /* renamed from: x0 */
    public final void mo45361x0(@C12579k AndroidViewHolder androidViewHolder) {
        Intrinsics.checkNotNullParameter(androidViewHolder, C40383c.f102945c);
        mo44960G(new AndroidComposeView$removeAndroidView$1(this, androidViewHolder));
    }

    /* renamed from: y0 */
    public final void mo45362y0() {
        this.f39131O0 = true;
    }

    /* renamed from: z */
    public long mo45000z(long j) {
        mo45357t0();
        return C15112a3.m65160j(this.f39148c1, j);
    }

    /* renamed from: z0 */
    public final void mo45363z0(LayoutNode layoutNode) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (layoutNode != null) {
                while (layoutNode != null && layoutNode.mo44707u0() == LayoutNode.UsageByParent.InMeasureBlock && mo45309c0(layoutNode)) {
                    layoutNode = layoutNode.mo44613C0();
                }
                if (layoutNode == getRoot()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() == 0 || getHeight() == 0) {
                requestLayout();
            } else {
                invalidate();
            }
        }
    }

    @C12579k
    public C15871e getAccessibilityManager() {
        return this.f39133Q0;
    }

    @C12579k
    public C15878f getClipboardManager() {
        return this.f39132P0;
    }

    @C12579k
    public PlatformTextInputPluginRegistryImpl getPlatformTextInputPluginRegistry() {
        return this.f39162m1;
    }
}
