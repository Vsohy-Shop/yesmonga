package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: androidx.core.view.l0 */
public final class C18294l0 {

    /* renamed from: a */
    public final C18295a f46930a;

    /* renamed from: androidx.core.view.l0$a */
    public interface C18295a {
        /* renamed from: a */
        void mo52971a(GestureDetector.OnDoubleTapListener onDoubleTapListener);

        /* renamed from: b */
        boolean mo52972b(MotionEvent motionEvent);

        /* renamed from: c */
        void mo52973c(boolean z);

        /* renamed from: d */
        boolean mo52974d();
    }

    /* renamed from: androidx.core.view.l0$b */
    public static class C18296b implements C18295a {

        /* renamed from: v */
        public static final int f46931v = ViewConfiguration.getTapTimeout();

        /* renamed from: w */
        public static final int f46932w = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: x */
        public static final int f46933x = 1;

        /* renamed from: y */
        public static final int f46934y = 2;

        /* renamed from: z */
        public static final int f46935z = 3;

        /* renamed from: a */
        public int f46936a;

        /* renamed from: b */
        public int f46937b;

        /* renamed from: c */
        public int f46938c;

        /* renamed from: d */
        public int f46939d;

        /* renamed from: e */
        public final Handler f46940e;

        /* renamed from: f */
        public final GestureDetector.OnGestureListener f46941f;

        /* renamed from: g */
        public GestureDetector.OnDoubleTapListener f46942g;

        /* renamed from: h */
        public boolean f46943h;

        /* renamed from: i */
        public boolean f46944i;

        /* renamed from: j */
        public boolean f46945j;

        /* renamed from: k */
        public boolean f46946k;

        /* renamed from: l */
        public boolean f46947l;

        /* renamed from: m */
        public MotionEvent f46948m;

        /* renamed from: n */
        public MotionEvent f46949n;

        /* renamed from: o */
        public boolean f46950o;

        /* renamed from: p */
        public float f46951p;

        /* renamed from: q */
        public float f46952q;

        /* renamed from: r */
        public float f46953r;

        /* renamed from: s */
        public float f46954s;

        /* renamed from: t */
        public boolean f46955t;

        /* renamed from: u */
        public VelocityTracker f46956u;

        public C18296b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f46940e = new C18297a(handler);
            } else {
                this.f46940e = new C18297a();
            }
            this.f46941f = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                mo52971a((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            mo52978h(context);
        }

        /* renamed from: a */
        public void mo52971a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f46942g = onDoubleTapListener;
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x0204  */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x021b  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo52972b(android.view.MotionEvent r13) {
            /*
                r12 = this;
                int r0 = r13.getAction()
                android.view.VelocityTracker r1 = r12.f46956u
                if (r1 != 0) goto L_0x000e
                android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
                r12.f46956u = r1
            L_0x000e:
                android.view.VelocityTracker r1 = r12.f46956u
                r1.addMovement(r13)
                r0 = r0 & 255(0xff, float:3.57E-43)
                r1 = 6
                r2 = 1
                r3 = 0
                if (r0 != r1) goto L_0x001c
                r4 = r2
                goto L_0x001d
            L_0x001c:
                r4 = r3
            L_0x001d:
                if (r4 == 0) goto L_0x0024
                int r5 = r13.getActionIndex()
                goto L_0x0025
            L_0x0024:
                r5 = -1
            L_0x0025:
                int r6 = r13.getPointerCount()
                r7 = 0
                r8 = r3
                r9 = r7
                r10 = r9
            L_0x002d:
                if (r8 >= r6) goto L_0x003f
                if (r5 != r8) goto L_0x0032
                goto L_0x003c
            L_0x0032:
                float r11 = r13.getX(r8)
                float r9 = r9 + r11
                float r11 = r13.getY(r8)
                float r10 = r10 + r11
            L_0x003c:
                int r8 = r8 + 1
                goto L_0x002d
            L_0x003f:
                if (r4 == 0) goto L_0x0044
                int r4 = r6 + -1
                goto L_0x0045
            L_0x0044:
                r4 = r6
            L_0x0045:
                float r4 = (float) r4
                float r9 = r9 / r4
                float r10 = r10 / r4
                r4 = 2
                r5 = 3
                if (r0 == 0) goto L_0x01bb
                r8 = 1000(0x3e8, float:1.401E-42)
                if (r0 == r2) goto L_0x012d
                if (r0 == r4) goto L_0x00b8
                if (r0 == r5) goto L_0x00b3
                r2 = 5
                if (r0 == r2) goto L_0x00a6
                if (r0 == r1) goto L_0x005b
                goto L_0x024c
            L_0x005b:
                r12.f46951p = r9
                r12.f46953r = r9
                r12.f46952q = r10
                r12.f46954s = r10
                android.view.VelocityTracker r0 = r12.f46956u
                int r1 = r12.f46939d
                float r1 = (float) r1
                r0.computeCurrentVelocity(r8, r1)
                int r0 = r13.getActionIndex()
                int r1 = r13.getPointerId(r0)
                android.view.VelocityTracker r2 = r12.f46956u
                float r2 = r2.getXVelocity(r1)
                android.view.VelocityTracker r4 = r12.f46956u
                float r1 = r4.getYVelocity(r1)
                r4 = r3
            L_0x0080:
                if (r4 >= r6) goto L_0x024c
                if (r4 != r0) goto L_0x0085
                goto L_0x00a3
            L_0x0085:
                int r5 = r13.getPointerId(r4)
                android.view.VelocityTracker r8 = r12.f46956u
                float r8 = r8.getXVelocity(r5)
                float r8 = r8 * r2
                android.view.VelocityTracker r9 = r12.f46956u
                float r5 = r9.getYVelocity(r5)
                float r5 = r5 * r1
                float r8 = r8 + r5
                int r5 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
                if (r5 >= 0) goto L_0x00a3
                android.view.VelocityTracker r13 = r12.f46956u
                r13.clear()
                goto L_0x024c
            L_0x00a3:
                int r4 = r4 + 1
                goto L_0x0080
            L_0x00a6:
                r12.f46951p = r9
                r12.f46953r = r9
                r12.f46952q = r10
                r12.f46954s = r10
                r12.mo52976f()
                goto L_0x024c
            L_0x00b3:
                r12.mo52975e()
                goto L_0x024c
            L_0x00b8:
                boolean r0 = r12.f46945j
                if (r0 == 0) goto L_0x00be
                goto L_0x024c
            L_0x00be:
                float r0 = r12.f46951p
                float r0 = r0 - r9
                float r1 = r12.f46952q
                float r1 = r1 - r10
                boolean r6 = r12.f46950o
                if (r6 == 0) goto L_0x00d1
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.f46942g
                boolean r13 = r0.onDoubleTapEvent(r13)
                r3 = r3 | r13
                goto L_0x024c
            L_0x00d1:
                boolean r6 = r12.f46946k
                if (r6 == 0) goto L_0x010d
                float r6 = r12.f46953r
                float r6 = r9 - r6
                int r6 = (int) r6
                float r7 = r12.f46954s
                float r7 = r10 - r7
                int r7 = (int) r7
                int r6 = r6 * r6
                int r7 = r7 * r7
                int r6 = r6 + r7
                int r7 = r12.f46936a
                if (r6 <= r7) goto L_0x0104
                android.view.GestureDetector$OnGestureListener r7 = r12.f46941f
                android.view.MotionEvent r8 = r12.f46948m
                boolean r13 = r7.onScroll(r8, r13, r0, r1)
                r12.f46951p = r9
                r12.f46952q = r10
                r12.f46946k = r3
                android.os.Handler r0 = r12.f46940e
                r0.removeMessages(r5)
                android.os.Handler r0 = r12.f46940e
                r0.removeMessages(r2)
                android.os.Handler r0 = r12.f46940e
                r0.removeMessages(r4)
                goto L_0x0105
            L_0x0104:
                r13 = r3
            L_0x0105:
                int r0 = r12.f46936a
                if (r6 <= r0) goto L_0x01b8
                r12.f46947l = r3
                goto L_0x01b8
            L_0x010d:
                float r2 = java.lang.Math.abs(r0)
                r4 = 1065353216(0x3f800000, float:1.0)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 >= 0) goto L_0x011f
                float r2 = java.lang.Math.abs(r1)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L_0x024c
            L_0x011f:
                android.view.GestureDetector$OnGestureListener r2 = r12.f46941f
                android.view.MotionEvent r3 = r12.f46948m
                boolean r3 = r2.onScroll(r3, r13, r0, r1)
                r12.f46951p = r9
                r12.f46952q = r10
                goto L_0x024c
            L_0x012d:
                r12.f46943h = r3
                android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r13)
                boolean r1 = r12.f46950o
                if (r1 == 0) goto L_0x013f
                android.view.GestureDetector$OnDoubleTapListener r1 = r12.f46942g
                boolean r13 = r1.onDoubleTapEvent(r13)
                r13 = r13 | r3
                goto L_0x0197
            L_0x013f:
                boolean r1 = r12.f46945j
                if (r1 == 0) goto L_0x014b
                android.os.Handler r13 = r12.f46940e
                r13.removeMessages(r5)
                r12.f46945j = r3
                goto L_0x018d
            L_0x014b:
                boolean r1 = r12.f46946k
                if (r1 == 0) goto L_0x0162
                android.view.GestureDetector$OnGestureListener r1 = r12.f46941f
                boolean r1 = r1.onSingleTapUp(r13)
                boolean r5 = r12.f46944i
                if (r5 == 0) goto L_0x0160
                android.view.GestureDetector$OnDoubleTapListener r5 = r12.f46942g
                if (r5 == 0) goto L_0x0160
                r5.onSingleTapConfirmed(r13)
            L_0x0160:
                r13 = r1
                goto L_0x0197
            L_0x0162:
                android.view.VelocityTracker r1 = r12.f46956u
                int r5 = r13.getPointerId(r3)
                int r6 = r12.f46939d
                float r6 = (float) r6
                r1.computeCurrentVelocity(r8, r6)
                float r6 = r1.getYVelocity(r5)
                float r1 = r1.getXVelocity(r5)
                float r5 = java.lang.Math.abs(r6)
                int r7 = r12.f46938c
                float r7 = (float) r7
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 > 0) goto L_0x018f
                float r5 = java.lang.Math.abs(r1)
                int r7 = r12.f46938c
                float r7 = (float) r7
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 <= 0) goto L_0x018d
                goto L_0x018f
            L_0x018d:
                r13 = r3
                goto L_0x0197
            L_0x018f:
                android.view.GestureDetector$OnGestureListener r5 = r12.f46941f
                android.view.MotionEvent r7 = r12.f46948m
                boolean r13 = r5.onFling(r7, r13, r1, r6)
            L_0x0197:
                android.view.MotionEvent r1 = r12.f46949n
                if (r1 == 0) goto L_0x019e
                r1.recycle()
            L_0x019e:
                r12.f46949n = r0
                android.view.VelocityTracker r0 = r12.f46956u
                if (r0 == 0) goto L_0x01aa
                r0.recycle()
                r0 = 0
                r12.f46956u = r0
            L_0x01aa:
                r12.f46950o = r3
                r12.f46944i = r3
                android.os.Handler r0 = r12.f46940e
                r0.removeMessages(r2)
                android.os.Handler r0 = r12.f46940e
                r0.removeMessages(r4)
            L_0x01b8:
                r3 = r13
                goto L_0x024c
            L_0x01bb:
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.f46942g
                if (r0 == 0) goto L_0x01f7
                android.os.Handler r0 = r12.f46940e
                boolean r0 = r0.hasMessages(r5)
                if (r0 == 0) goto L_0x01cc
                android.os.Handler r1 = r12.f46940e
                r1.removeMessages(r5)
            L_0x01cc:
                android.view.MotionEvent r1 = r12.f46948m
                if (r1 == 0) goto L_0x01ef
                android.view.MotionEvent r6 = r12.f46949n
                if (r6 == 0) goto L_0x01ef
                if (r0 == 0) goto L_0x01ef
                boolean r0 = r12.mo52979i(r1, r6, r13)
                if (r0 == 0) goto L_0x01ef
                r12.f46950o = r2
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.f46942g
                android.view.MotionEvent r1 = r12.f46948m
                boolean r0 = r0.onDoubleTap(r1)
                r0 = r0 | r3
                android.view.GestureDetector$OnDoubleTapListener r1 = r12.f46942g
                boolean r1 = r1.onDoubleTapEvent(r13)
                r0 = r0 | r1
                goto L_0x01f8
            L_0x01ef:
                android.os.Handler r0 = r12.f46940e
                int r1 = f46932w
                long r6 = (long) r1
                r0.sendEmptyMessageDelayed(r5, r6)
            L_0x01f7:
                r0 = r3
            L_0x01f8:
                r12.f46951p = r9
                r12.f46953r = r9
                r12.f46952q = r10
                r12.f46954s = r10
                android.view.MotionEvent r1 = r12.f46948m
                if (r1 == 0) goto L_0x0207
                r1.recycle()
            L_0x0207:
                android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r13)
                r12.f46948m = r1
                r12.f46946k = r2
                r12.f46947l = r2
                r12.f46943h = r2
                r12.f46945j = r3
                r12.f46944i = r3
                boolean r1 = r12.f46955t
                if (r1 == 0) goto L_0x0235
                android.os.Handler r1 = r12.f46940e
                r1.removeMessages(r4)
                android.os.Handler r1 = r12.f46940e
                android.view.MotionEvent r3 = r12.f46948m
                long r5 = r3.getDownTime()
                int r3 = f46931v
                long r7 = (long) r3
                long r5 = r5 + r7
                int r3 = android.view.ViewConfiguration.getLongPressTimeout()
                long r7 = (long) r3
                long r5 = r5 + r7
                r1.sendEmptyMessageAtTime(r4, r5)
            L_0x0235:
                android.os.Handler r1 = r12.f46940e
                android.view.MotionEvent r3 = r12.f46948m
                long r3 = r3.getDownTime()
                int r5 = f46931v
                long r5 = (long) r5
                long r3 = r3 + r5
                r1.sendEmptyMessageAtTime(r2, r3)
                android.view.GestureDetector$OnGestureListener r1 = r12.f46941f
                boolean r13 = r1.onDown(r13)
                r3 = r0 | r13
            L_0x024c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.C18294l0.C18296b.mo52972b(android.view.MotionEvent):boolean");
        }

        /* renamed from: c */
        public void mo52973c(boolean z) {
            this.f46955t = z;
        }

        /* renamed from: d */
        public boolean mo52974d() {
            return this.f46955t;
        }

        /* renamed from: e */
        public final void mo52975e() {
            this.f46940e.removeMessages(1);
            this.f46940e.removeMessages(2);
            this.f46940e.removeMessages(3);
            this.f46956u.recycle();
            this.f46956u = null;
            this.f46950o = false;
            this.f46943h = false;
            this.f46946k = false;
            this.f46947l = false;
            this.f46944i = false;
            if (this.f46945j) {
                this.f46945j = false;
            }
        }

        /* renamed from: f */
        public final void mo52976f() {
            this.f46940e.removeMessages(1);
            this.f46940e.removeMessages(2);
            this.f46940e.removeMessages(3);
            this.f46950o = false;
            this.f46946k = false;
            this.f46947l = false;
            this.f46944i = false;
            if (this.f46945j) {
                this.f46945j = false;
            }
        }

        /* renamed from: g */
        public void mo52977g() {
            this.f46940e.removeMessages(3);
            this.f46944i = false;
            this.f46945j = true;
            this.f46941f.onLongPress(this.f46948m);
        }

        /* renamed from: h */
        public final void mo52978h(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (this.f46941f != null) {
                this.f46955t = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.f46938c = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f46939d = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f46936a = scaledTouchSlop * scaledTouchSlop;
                this.f46937b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            } else {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
        }

        /* renamed from: i */
        public final boolean mo52979i(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.f46947l || motionEvent3.getEventTime() - motionEvent2.getEventTime() > ((long) f46932w)) {
                return false;
            }
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            if ((x * x) + (y * y) < this.f46937b) {
                return true;
            }
            return false;
        }

        /* renamed from: androidx.core.view.l0$b$a */
        public class C18297a extends Handler {
            public C18297a() {
            }

            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    C18296b bVar = C18296b.this;
                    bVar.f46941f.onShowPress(bVar.f46948m);
                } else if (i == 2) {
                    C18296b.this.mo52977g();
                } else if (i == 3) {
                    C18296b bVar2 = C18296b.this;
                    GestureDetector.OnDoubleTapListener onDoubleTapListener = bVar2.f46942g;
                    if (onDoubleTapListener == null) {
                        return;
                    }
                    if (!bVar2.f46943h) {
                        onDoubleTapListener.onSingleTapConfirmed(bVar2.f46948m);
                    } else {
                        bVar2.f46944i = true;
                    }
                } else {
                    throw new RuntimeException("Unknown message " + message);
                }
            }

            public C18297a(Handler handler) {
                super(handler.getLooper());
            }
        }
    }

    /* renamed from: androidx.core.view.l0$c */
    public static class C18298c implements C18295a {

        /* renamed from: a */
        public final GestureDetector f46958a;

        public C18298c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f46958a = new GestureDetector(context, onGestureListener, handler);
        }

        /* renamed from: a */
        public void mo52971a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f46958a.setOnDoubleTapListener(onDoubleTapListener);
        }

        /* renamed from: b */
        public boolean mo52972b(MotionEvent motionEvent) {
            return this.f46958a.onTouchEvent(motionEvent);
        }

        /* renamed from: c */
        public void mo52973c(boolean z) {
            this.f46958a.setIsLongpressEnabled(z);
        }

        /* renamed from: d */
        public boolean mo52974d() {
            return this.f46958a.isLongpressEnabled();
        }
    }

    public C18294l0(@C0359n0 Context context, @C0359n0 GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, (Handler) null);
    }

    /* renamed from: a */
    public boolean mo52967a() {
        return this.f46930a.mo52974d();
    }

    /* renamed from: b */
    public boolean mo52968b(@C0359n0 MotionEvent motionEvent) {
        return this.f46930a.mo52972b(motionEvent);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* renamed from: c */
    public void mo52969c(boolean z) {
        this.f46930a.mo52973c(z);
    }

    /* renamed from: d */
    public void mo52970d(@C0363p0 GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f46930a.mo52971a(onDoubleTapListener);
    }

    public C18294l0(@C0359n0 Context context, @C0359n0 GestureDetector.OnGestureListener onGestureListener, @C0363p0 Handler handler) {
        this.f46930a = new C18298c(context, onGestureListener, handler);
    }
}
