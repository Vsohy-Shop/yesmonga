package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18665a;
import androidx.datastore.preferences.protobuf.C18753i1;
import androidx.datastore.preferences.protobuf.C18793l;
import androidx.datastore.preferences.protobuf.C18909y0;
import androidx.datastore.preferences.protobuf.C18920z1;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.C18634b;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C18634b<MessageType, BuilderType>> extends C18665a<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize = -1;
    protected C18900w3 unknownFields = C18900w3.m87953e();

    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final byte[] asBytes;
        private final Class<?> messageClass;
        private final String messageClassName;

        public SerializedForm(C18920z1 z1Var) {
            Class<?> cls = z1Var.getClass();
            this.messageClass = cls;
            this.messageClassName = cls.getName();
            this.asBytes = z1Var.toByteArray();
        }

        /* renamed from: a */
        public static SerializedForm m85000a(C18920z1 z1Var) {
            return new SerializedForm(z1Var);
        }

        @Deprecated
        /* renamed from: b */
        public final Object mo54004b() throws ObjectStreamException {
            try {
                Field declaredField = mo54005c().getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((C18920z1) declaredField.get((Object) null)).newBuilderForType().mo54263W(this.asBytes).mo54011Q();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e);
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException("Unable to find defaultInstance in " + this.messageClassName, e2);
            } catch (SecurityException e3) {
                throw new RuntimeException("Unable to call defaultInstance in " + this.messageClassName, e3);
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("Unable to call parsePartialFrom", e4);
            } catch (InvalidProtocolBufferException e5) {
                throw new RuntimeException("Unable to understand proto buffer", e5);
            }
        }

        /* renamed from: c */
        public final Class<?> mo54005c() throws ClassNotFoundException {
            Class<?> cls = this.messageClass;
            return cls != null ? cls : Class.forName(this.messageClassName);
        }

        public Object readResolve() throws ObjectStreamException {
            try {
                Field declaredField = mo54005c().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((C18920z1) declaredField.get((Object) null)).newBuilderForType().mo54263W(this.asBytes).mo54011Q();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e);
            } catch (NoSuchFieldException unused) {
                return mo54004b();
            } catch (SecurityException e2) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.messageClassName, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Unable to call parsePartialFrom", e3);
            } catch (InvalidProtocolBufferException e4) {
                throw new RuntimeException("Unable to understand proto buffer", e4);
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$a */
    public static /* synthetic */ class C18633a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47639a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.datastore.preferences.protobuf.WireFormat$JavaType[] r0 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f47639a = r0
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47639a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.ENUM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.GeneratedMessageLite.C18633a.<clinit>():void");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$b */
    public static abstract class C18634b<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C18634b<MessageType, BuilderType>> extends C18665a.C18666a<MessageType, BuilderType> {

        /* renamed from: a */
        public final MessageType f47640a;

        /* renamed from: b */
        public MessageType f47641b;

        /* renamed from: c */
        public boolean f47642c = false;

        public C18634b(MessageType messagetype) {
            this.f47640a = messagetype;
            this.f47641b = (GeneratedMessageLite) messagetype.mo53983Z(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        /* renamed from: B0 */
        public BuilderType mo54020k0(byte[] bArr, int i, int i2, C18836p0 p0Var) throws InvalidProtocolBufferException {
            mo54025u0();
            try {
                C18853r2.m87361a().mo55374j(this.f47641b).mo54461j(this.f47641b, bArr, i, i + i2, new C18793l.C18795b(p0Var));
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.m85094l();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }

        /* renamed from: D0 */
        public final void mo54008D0(MessageType messagetype, MessageType messagetype2) {
            C18853r2.m87361a().mo55374j(messagetype).mo54445a(messagetype, messagetype2);
        }

        public final boolean isInitialized() {
            return GeneratedMessageLite.m84975o0(this.f47641b, false);
        }

        /* renamed from: o0 */
        public final MessageType mo54018g() {
            MessageType q0 = mo54011Q();
            if (q0.isInitialized()) {
                return q0;
            }
            throw C18665a.C18666a.m85416m0(q0);
        }

        /* renamed from: q0 */
        public MessageType mo54011Q() {
            if (this.f47642c) {
                return this.f47641b;
            }
            this.f47641b.mo53996p0();
            this.f47642c = true;
            return this.f47641b;
        }

        /* renamed from: r0 */
        public final BuilderType clear() {
            this.f47641b = (GeneratedMessageLite) this.f47641b.mo53983Z(MethodToInvoke.NEW_MUTABLE_INSTANCE);
            return this;
        }

        /* renamed from: s0 */
        public BuilderType clone() {
            BuilderType B0 = getDefaultInstanceForType().newBuilderForType();
            B0.mo54029y0(mo54011Q());
            return B0;
        }

        /* renamed from: u0 */
        public void mo54025u0() {
            if (this.f47642c) {
                MessageType messagetype = (GeneratedMessageLite) this.f47641b.mo53983Z(MethodToInvoke.NEW_MUTABLE_INSTANCE);
                mo54008D0(messagetype, this.f47641b);
                this.f47641b = messagetype;
                this.f47642c = false;
            }
        }

        /* renamed from: v0 */
        public MessageType getDefaultInstanceForType() {
            return this.f47640a;
        }

        /* renamed from: w0 */
        public BuilderType mo54013Y(MessageType messagetype) {
            return mo54029y0(messagetype);
        }

        /* renamed from: x0 */
        public BuilderType mo54014c0(C18889w wVar, C18836p0 p0Var) throws IOException {
            mo54025u0();
            try {
                C18853r2.m87361a().mo55374j(this.f47641b).mo54457h(this.f47641b, C18901x.m87974T(wVar), p0Var);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        /* renamed from: y0 */
        public BuilderType mo54029y0(MessageType messagetype) {
            mo54025u0();
            mo54008D0(this.f47641b, messagetype);
            return this;
        }

        /* renamed from: z0 */
        public BuilderType mo54019j0(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            return mo54020k0(bArr, i, i2, C18836p0.m87223d());
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$c */
    public static class C18635c<T extends GeneratedMessageLite<T, ?>> extends C18687b<T> {

        /* renamed from: b */
        public final T f47643b;

        public C18635c(T t) {
            this.f47643b = t;
        }

        /* renamed from: b0 */
        public T mo54035z(C18889w wVar, C18836p0 p0Var) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.m84962W0(this.f47643b, wVar, p0Var);
        }

        /* renamed from: c0 */
        public T mo54034p(byte[] bArr, int i, int i2, C18836p0 p0Var) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.m84963X0(this.f47643b, bArr, i, i2, p0Var);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$d */
    public static abstract class C18636d<MessageType extends C18637e<MessageType, BuilderType>, BuilderType extends C18636d<MessageType, BuilderType>> extends C18634b<MessageType, BuilderType> implements C18639f<MessageType, BuilderType> {
        public C18636d(MessageType messagetype) {
            super(messagetype);
        }

        /* renamed from: E */
        public final <Type> int mo54036E(C18817n0<MessageType, List<Type>> n0Var) {
            return ((C18637e) this.f47641b).mo54036E(n0Var);
        }

        /* renamed from: E0 */
        public final <Type> BuilderType mo54037E0(C18817n0<MessageType, List<Type>> n0Var, Type type) {
            C18641h R = GeneratedMessageLite.m84957T(n0Var);
            mo54044M0(R);
            mo54025u0();
            mo54040H0().mo55623h(R.f47656d, R.mo54080j(type));
            return this;
        }

        /* renamed from: F0 */
        public final MessageType mo54022q0() {
            if (this.f47642c) {
                return (C18637e) this.f47641b;
            }
            ((C18637e) this.f47641b).extensions.mo55612I();
            return (C18637e) super.mo54011Q();
        }

        /* renamed from: G0 */
        public final <Type> BuilderType mo54039G0(C18817n0<MessageType, ?> n0Var) {
            C18641h R = GeneratedMessageLite.m84957T(n0Var);
            mo54044M0(R);
            mo54025u0();
            mo54040H0().mo55626j(R.f47656d);
            return this;
        }

        /* renamed from: H0 */
        public final C18909y0<C18640g> mo54040H0() {
            C18909y0<C18640g> y0Var = ((C18637e) this.f47641b).extensions;
            if (!y0Var.mo55609D()) {
                return y0Var;
            }
            C18909y0<C18640g> k = y0Var.clone();
            ((C18637e) this.f47641b).extensions = k;
            return k;
        }

        /* renamed from: I0 */
        public void mo54041I0(C18909y0<C18640g> y0Var) {
            mo54025u0();
            ((C18637e) this.f47641b).extensions = y0Var;
        }

        /* renamed from: J0 */
        public final <Type> BuilderType mo54042J0(C18817n0<MessageType, List<Type>> n0Var, int i, Type type) {
            C18641h R = GeneratedMessageLite.m84957T(n0Var);
            mo54044M0(R);
            mo54025u0();
            mo54040H0().mo55616P(R.f47656d, i, R.mo54080j(type));
            return this;
        }

        /* renamed from: L0 */
        public final <Type> BuilderType mo54043L0(C18817n0<MessageType, Type> n0Var, Type type) {
            C18641h R = GeneratedMessageLite.m84957T(n0Var);
            mo54044M0(R);
            mo54025u0();
            mo54040H0().mo55615O(R.f47656d, R.mo54081k(type));
            return this;
        }

        /* renamed from: M0 */
        public final void mo54044M0(C18641h<MessageType, ?> hVar) {
            if (hVar.mo54078h() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        /* renamed from: f */
        public final <Type> Type mo54045f(C18817n0<MessageType, Type> n0Var) {
            return ((C18637e) this.f47641b).mo54045f(n0Var);
        }

        /* JADX WARNING: type inference failed for: r2v0, types: [androidx.datastore.preferences.protobuf.n0, androidx.datastore.preferences.protobuf.n0<MessageType, java.util.List<Type>>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <Type> Type mo54046o(androidx.datastore.preferences.protobuf.C18817n0<MessageType, java.util.List<Type>> r2, int r3) {
            /*
                r1 = this;
                MessageType r0 = r1.f47641b
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$e r0 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.C18637e) r0
                java.lang.Object r2 = r0.mo54046o(r2, r3)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.GeneratedMessageLite.C18636d.mo54046o(androidx.datastore.preferences.protobuf.n0, int):java.lang.Object");
        }

        /* renamed from: u0 */
        public void mo54025u0() {
            if (this.f47642c) {
                super.mo54025u0();
                MessageType messagetype = this.f47641b;
                ((C18637e) messagetype).extensions = ((C18637e) messagetype).extensions.clone();
            }
        }

        /* renamed from: v */
        public final <Type> boolean mo54047v(C18817n0<MessageType, Type> n0Var) {
            return ((C18637e) this.f47641b).mo54047v(n0Var);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$e */
    public static abstract class C18637e<MessageType extends C18637e<MessageType, BuilderType>, BuilderType extends C18636d<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements C18639f<MessageType, BuilderType> {
        protected C18909y0<C18640g> extensions = C18909y0.m88149s();

        /* renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$e$a */
        public class C18638a {

            /* renamed from: a */
            public final Iterator<Map.Entry<C18640g, Object>> f47644a;

            /* renamed from: b */
            public Map.Entry<C18640g, Object> f47645b;

            /* renamed from: c */
            public final boolean f47646c;

            public /* synthetic */ C18638a(C18637e eVar, boolean z, C18633a aVar) {
                this(z);
            }

            /* renamed from: a */
            public void mo54062a(int i, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<C18640g, Object> entry = this.f47645b;
                    if (entry != null && entry.getKey().getNumber() < i) {
                        C18640g key = this.f47645b.getKey();
                        if (!this.f47646c || key.mo54065R() != WireFormat.JavaType.MESSAGE || key.mo54063B()) {
                            C18909y0.m88135T(key, this.f47645b.getValue(), codedOutputStream);
                        } else {
                            codedOutputStream.mo53811P1(key.getNumber(), (C18920z1) this.f47645b.getValue());
                        }
                        if (this.f47644a.hasNext()) {
                            this.f47645b = this.f47644a.next();
                        } else {
                            this.f47645b = null;
                        }
                    } else {
                        return;
                    }
                }
            }

            public C18638a(boolean z) {
                Iterator<Map.Entry<C18640g, Object>> H = C18637e.this.extensions.mo55611H();
                this.f47644a = H;
                if (H.hasNext()) {
                    this.f47645b = H.next();
                }
                this.f47646c = z;
            }
        }

        /* renamed from: E */
        public final <Type> int mo54036E(C18817n0<MessageType, List<Type>> n0Var) {
            C18641h R = GeneratedMessageLite.m84957T(n0Var);
            mo54061p1(R);
            return this.extensions.mo55634y(R.f47656d);
        }

        /* renamed from: c1 */
        public final void mo54048c1(C18889w wVar, C18641h<?, ?> hVar, C18836p0 p0Var, int i) throws IOException {
            mo54058m1(wVar, p0Var, hVar, WireFormat.m85346c(i, 2), i);
        }

        /* renamed from: d1 */
        public C18909y0<C18640g> mo54049d1() {
            if (this.extensions.mo55609D()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        /* renamed from: e1 */
        public boolean mo54050e1() {
            return this.extensions.mo55610E();
        }

        /* renamed from: f */
        public final <Type> Type mo54045f(C18817n0<MessageType, Type> n0Var) {
            C18641h R = GeneratedMessageLite.m84957T(n0Var);
            mo54061p1(R);
            Object u = this.extensions.mo55630u(R.f47656d);
            if (u == null) {
                return R.f47654b;
            }
            return R.mo54077g(u);
        }

        /* renamed from: f1 */
        public int mo54051f1() {
            return this.extensions.mo55635z();
        }

        /* renamed from: g1 */
        public int mo54052g1() {
            return this.extensions.mo55631v();
        }

        public /* bridge */ /* synthetic */ C18920z1 getDefaultInstanceForType() {
            return GeneratedMessageLite.super.getDefaultInstanceForType();
        }

        /* renamed from: h1 */
        public final void mo54053h1(MessageType messagetype) {
            if (this.extensions.mo55609D()) {
                this.extensions = this.extensions.clone();
            }
            this.extensions.mo55613J(messagetype.extensions);
        }

        /* renamed from: i1 */
        public final void mo54054i1(ByteString byteString, C18836p0 p0Var, C18641h<?, ?> hVar) throws IOException {
            C18920z1.C18921a aVar;
            C18920z1 z1Var = (C18920z1) this.extensions.mo55630u(hVar.f47656d);
            if (z1Var != null) {
                aVar = z1Var.toBuilder();
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = hVar.mo54074c().newBuilderForType();
            }
            aVar.mo54270c2(byteString, p0Var);
            mo54049d1().mo55615O(hVar.f47656d, hVar.mo54080j(aVar.mo54018g()));
        }

        /* renamed from: j1 */
        public final <MessageType extends C18920z1> void mo54055j1(MessageType messagetype, C18889w wVar, C18836p0 p0Var) throws IOException {
            int i = 0;
            ByteString byteString = null;
            C18641h hVar = null;
            while (true) {
                int Y = wVar.mo55498Y();
                if (Y == 0) {
                    break;
                } else if (Y == WireFormat.f47735s) {
                    i = wVar.mo55499Z();
                    if (i != 0) {
                        hVar = p0Var.mo55303c(messagetype, i);
                    }
                } else if (Y == WireFormat.f47736t) {
                    if (i == 0 || hVar == null) {
                        byteString = wVar.mo55524x();
                    } else {
                        mo54048c1(wVar, hVar, p0Var, i);
                        byteString = null;
                    }
                } else if (!wVar.mo55511g0(Y)) {
                    break;
                }
            }
            wVar.mo55500a(WireFormat.f47734r);
            if (byteString != null && i != 0) {
                if (hVar != null) {
                    mo54054i1(byteString, p0Var, hVar);
                } else {
                    mo53998q0(i, byteString);
                }
            }
        }

        /* renamed from: k1 */
        public C18637e<MessageType, BuilderType>.a mo54056k1() {
            return new C18638a(this, false, (C18633a) null);
        }

        /* renamed from: l1 */
        public C18637e<MessageType, BuilderType>.a mo54057l1() {
            return new C18638a(this, true, (C18633a) null);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
        /* renamed from: m1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo54058m1(androidx.datastore.preferences.protobuf.C18889w r6, androidx.datastore.preferences.protobuf.C18836p0 r7, androidx.datastore.preferences.protobuf.GeneratedMessageLite.C18641h<?, ?> r8, int r9, int r10) throws java.io.IOException {
            /*
                r5 = this;
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.m85345b(r9)
                r1 = 1
                r2 = 0
                if (r8 != 0) goto L_0x000b
            L_0x0008:
                r0 = r1
                r3 = r2
                goto L_0x0036
            L_0x000b:
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$g r3 = r8.f47656d
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r3 = r3.mo54064D()
                int r3 = androidx.datastore.preferences.protobuf.C18909y0.m88127A(r3, r2)
                if (r0 != r3) goto L_0x001a
                r0 = r2
                r3 = r0
                goto L_0x0036
            L_0x001a:
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$g r3 = r8.f47656d
                boolean r4 = r3.f47651d
                if (r4 == 0) goto L_0x0008
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r3 = r3.f47650c
                boolean r3 = r3.mo54203r()
                if (r3 == 0) goto L_0x0008
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$g r3 = r8.f47656d
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r3 = r3.mo54064D()
                int r3 = androidx.datastore.preferences.protobuf.C18909y0.m88127A(r3, r1)
                if (r0 != r3) goto L_0x0008
                r3 = r1
                r0 = r2
            L_0x0036:
                if (r0 == 0) goto L_0x003d
                boolean r6 = r5.mo53984Z0(r9, r6)
                return r6
            L_0x003d:
                r5.mo54049d1()
                if (r3 == 0) goto L_0x0094
                int r7 = r6.mo55489N()
                int r7 = r6.mo55520t(r7)
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$g r9 = r8.f47656d
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r9 = r9.mo54064D()
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM
                if (r9 != r10) goto L_0x0077
            L_0x0054:
                int r9 = r6.mo55508f()
                if (r9 <= 0) goto L_0x008f
                int r9 = r6.mo55526z()
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$g r10 = r8.f47656d
                androidx.datastore.preferences.protobuf.i1$d r10 = r10.mo54071s()
                androidx.datastore.preferences.protobuf.i1$c r9 = r10.mo53931a(r9)
                if (r9 != 0) goto L_0x006b
                return r1
            L_0x006b:
                androidx.datastore.preferences.protobuf.y0<androidx.datastore.preferences.protobuf.GeneratedMessageLite$g> r10 = r5.extensions
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$g r0 = r8.f47656d
                java.lang.Object r9 = r8.mo54080j(r9)
                r10.mo55623h(r0, r9)
                goto L_0x0054
            L_0x0077:
                int r9 = r6.mo55508f()
                if (r9 <= 0) goto L_0x008f
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$g r9 = r8.f47656d
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r9 = r9.mo54064D()
                java.lang.Object r9 = androidx.datastore.preferences.protobuf.C18909y0.m88132N(r6, r9, r2)
                androidx.datastore.preferences.protobuf.y0<androidx.datastore.preferences.protobuf.GeneratedMessageLite$g> r10 = r5.extensions
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$g r0 = r8.f47656d
                r10.mo55623h(r0, r9)
                goto L_0x0077
            L_0x008f:
                r6.mo55519s(r7)
                goto L_0x0124
            L_0x0094:
                int[] r9 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.C18633a.f47639a
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$g r0 = r8.f47656d
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r0 = r0.mo54065R()
                int r0 = r0.ordinal()
                r9 = r9[r0]
                if (r9 == r1) goto L_0x00c8
                r7 = 2
                if (r9 == r7) goto L_0x00b2
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$g r7 = r8.f47656d
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r7 = r7.mo54064D()
                java.lang.Object r6 = androidx.datastore.preferences.protobuf.C18909y0.m88132N(r6, r7, r2)
                goto L_0x0105
            L_0x00b2:
                int r6 = r6.mo55526z()
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$g r7 = r8.f47656d
                androidx.datastore.preferences.protobuf.i1$d r7 = r7.mo54071s()
                androidx.datastore.preferences.protobuf.i1$c r7 = r7.mo53931a(r6)
                if (r7 != 0) goto L_0x00c6
                r5.mo54000s0(r10, r6)
                return r1
            L_0x00c6:
                r6 = r7
                goto L_0x0105
            L_0x00c8:
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$g r9 = r8.f47656d
                boolean r9 = r9.mo54063B()
                if (r9 != 0) goto L_0x00e1
                androidx.datastore.preferences.protobuf.y0<androidx.datastore.preferences.protobuf.GeneratedMessageLite$g> r9 = r5.extensions
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$g r10 = r8.f47656d
                java.lang.Object r9 = r9.mo55630u(r10)
                androidx.datastore.preferences.protobuf.z1 r9 = (androidx.datastore.preferences.protobuf.C18920z1) r9
                if (r9 == 0) goto L_0x00e1
                androidx.datastore.preferences.protobuf.z1$a r9 = r9.toBuilder()
                goto L_0x00e2
            L_0x00e1:
                r9 = 0
            L_0x00e2:
                if (r9 != 0) goto L_0x00ec
                androidx.datastore.preferences.protobuf.z1 r9 = r8.mo54074c()
                androidx.datastore.preferences.protobuf.z1$a r9 = r9.newBuilderForType()
            L_0x00ec:
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$g r10 = r8.f47656d
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = r10.mo54064D()
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r0 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.GROUP
                if (r10 != r0) goto L_0x00fe
                int r10 = r8.mo54075d()
                r6.mo55480E(r10, r9, r7)
                goto L_0x0101
            L_0x00fe:
                r6.mo55484I(r9, r7)
            L_0x0101:
                androidx.datastore.preferences.protobuf.z1 r6 = r9.mo54018g()
            L_0x0105:
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$g r7 = r8.f47656d
                boolean r7 = r7.mo54063B()
                if (r7 == 0) goto L_0x0119
                androidx.datastore.preferences.protobuf.y0<androidx.datastore.preferences.protobuf.GeneratedMessageLite$g> r7 = r5.extensions
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$g r9 = r8.f47656d
                java.lang.Object r6 = r8.mo54080j(r6)
                r7.mo55623h(r9, r6)
                goto L_0x0124
            L_0x0119:
                androidx.datastore.preferences.protobuf.y0<androidx.datastore.preferences.protobuf.GeneratedMessageLite$g> r7 = r5.extensions
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$g r9 = r8.f47656d
                java.lang.Object r6 = r8.mo54080j(r6)
                r7.mo55615O(r9, r6)
            L_0x0124:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.GeneratedMessageLite.C18637e.mo54058m1(androidx.datastore.preferences.protobuf.w, androidx.datastore.preferences.protobuf.p0, androidx.datastore.preferences.protobuf.GeneratedMessageLite$h, int, int):boolean");
        }

        /* renamed from: n1 */
        public <MessageType extends C18920z1> boolean mo54059n1(MessageType messagetype, C18889w wVar, C18836p0 p0Var, int i) throws IOException {
            int a = WireFormat.m85344a(i);
            return mo54058m1(wVar, p0Var, p0Var.mo55303c(messagetype, a), i, a);
        }

        public /* bridge */ /* synthetic */ C18920z1.C18921a newBuilderForType() {
            return GeneratedMessageLite.super.newBuilderForType();
        }

        /* renamed from: o */
        public final <Type> Type mo54046o(C18817n0<MessageType, List<Type>> n0Var, int i) {
            C18641h R = GeneratedMessageLite.m84957T(n0Var);
            mo54061p1(R);
            return R.mo54079i(this.extensions.mo55633x(R.f47656d, i));
        }

        /* renamed from: o1 */
        public <MessageType extends C18920z1> boolean mo54060o1(MessageType messagetype, C18889w wVar, C18836p0 p0Var, int i) throws IOException {
            if (i == WireFormat.f47733q) {
                mo54055j1(messagetype, wVar, p0Var);
                return true;
            } else if (WireFormat.m85345b(i) == 2) {
                return mo54059n1(messagetype, wVar, p0Var, i);
            } else {
                return wVar.mo55511g0(i);
            }
        }

        /* renamed from: p1 */
        public final void mo54061p1(C18641h<MessageType, ?> hVar) {
            if (hVar.mo54078h() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public /* bridge */ /* synthetic */ C18920z1.C18921a toBuilder() {
            return GeneratedMessageLite.super.toBuilder();
        }

        /* renamed from: v */
        public final <Type> boolean mo54047v(C18817n0<MessageType, Type> n0Var) {
            C18641h R = GeneratedMessageLite.m84957T(n0Var);
            mo54061p1(R);
            return this.extensions.mo55607B(R.f47656d);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$f */
    public interface C18639f<MessageType extends C18637e<MessageType, BuilderType>, BuilderType extends C18636d<MessageType, BuilderType>> extends C18675a2 {
        /* renamed from: E */
        <Type> int mo54036E(C18817n0<MessageType, List<Type>> n0Var);

        /* renamed from: f */
        <Type> Type mo54045f(C18817n0<MessageType, Type> n0Var);

        /* renamed from: o */
        <Type> Type mo54046o(C18817n0<MessageType, List<Type>> n0Var, int i);

        /* renamed from: v */
        <Type> boolean mo54047v(C18817n0<MessageType, Type> n0Var);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$g */
    public static final class C18640g implements C18909y0.C18912c<C18640g> {

        /* renamed from: a */
        public final C18753i1.C18757d<?> f47648a;

        /* renamed from: b */
        public final int f47649b;

        /* renamed from: c */
        public final WireFormat.FieldType f47650c;

        /* renamed from: d */
        public final boolean f47651d;

        /* renamed from: e */
        public final boolean f47652e;

        public C18640g(C18753i1.C18757d<?> dVar, int i, WireFormat.FieldType fieldType, boolean z, boolean z2) {
            this.f47648a = dVar;
            this.f47649b = i;
            this.f47650c = fieldType;
            this.f47651d = z;
            this.f47652e = z2;
        }

        /* renamed from: B */
        public boolean mo54063B() {
            return this.f47651d;
        }

        /* renamed from: D */
        public WireFormat.FieldType mo54064D() {
            return this.f47650c;
        }

        /* renamed from: R */
        public WireFormat.JavaType mo54065R() {
            return this.f47650c.mo54201g();
        }

        /* renamed from: S */
        public boolean mo54066S() {
            return this.f47652e;
        }

        /* renamed from: b */
        public int compareTo(C18640g gVar) {
            return this.f47649b - gVar.f47649b;
        }

        /* renamed from: g1 */
        public C18920z1.C18921a mo54069g1(C18920z1.C18921a aVar, C18920z1 z1Var) {
            return ((C18634b) aVar).mo54029y0((GeneratedMessageLite) z1Var);
        }

        public int getNumber() {
            return this.f47649b;
        }

        /* renamed from: s */
        public C18753i1.C18757d<?> mo54071s() {
            return this.f47648a;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$h */
    public static class C18641h<ContainingType extends C18920z1, Type> extends C18817n0<ContainingType, Type> {

        /* renamed from: a */
        public final ContainingType f47653a;

        /* renamed from: b */
        public final Type f47654b;

        /* renamed from: c */
        public final C18920z1 f47655c;

        /* renamed from: d */
        public final C18640g f47656d;

        public C18641h(ContainingType containingtype, Type type, C18920z1 z1Var, C18640g gVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (gVar.mo54064D() == WireFormat.FieldType.MESSAGE && z1Var == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.f47653a = containingtype;
                this.f47654b = type;
                this.f47655c = z1Var;
                this.f47656d = gVar;
            }
        }

        /* renamed from: a */
        public Type mo54072a() {
            return this.f47654b;
        }

        /* renamed from: b */
        public WireFormat.FieldType mo54073b() {
            return this.f47656d.mo54064D();
        }

        /* renamed from: c */
        public C18920z1 mo54074c() {
            return this.f47655c;
        }

        /* renamed from: d */
        public int mo54075d() {
            return this.f47656d.getNumber();
        }

        /* renamed from: f */
        public boolean mo54076f() {
            return this.f47656d.f47651d;
        }

        /* renamed from: g */
        public Object mo54077g(Object obj) {
            if (!this.f47656d.mo54063B()) {
                return mo54079i(obj);
            }
            if (this.f47656d.mo54065R() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            for (Object i : (List) obj) {
                arrayList.add(mo54079i(i));
            }
            return arrayList;
        }

        /* renamed from: h */
        public ContainingType mo54078h() {
            return this.f47653a;
        }

        /* renamed from: i */
        public Object mo54079i(Object obj) {
            if (this.f47656d.mo54065R() == WireFormat.JavaType.ENUM) {
                return this.f47656d.f47648a.mo53931a(((Integer) obj).intValue());
            }
            return obj;
        }

        /* renamed from: j */
        public Object mo54080j(Object obj) {
            if (this.f47656d.mo54065R() == WireFormat.JavaType.ENUM) {
                return Integer.valueOf(((C18753i1.C18756c) obj).getNumber());
            }
            return obj;
        }

        /* renamed from: k */
        public Object mo54081k(Object obj) {
            if (!this.f47656d.mo54063B()) {
                return mo54080j(obj);
            }
            if (this.f47656d.mo54065R() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            for (Object j : (List) obj) {
                arrayList.add(mo54080j(j));
            }
            return arrayList;
        }
    }

    /* renamed from: D0 */
    public static Object m84941D0(C18920z1 z1Var, String str, Object[] objArr) {
        return new C18887v2(z1Var, str, objArr);
    }

    /* renamed from: E0 */
    public static <ContainingType extends C18920z1, Type> C18641h<ContainingType, Type> m84942E0(ContainingType containingtype, C18920z1 z1Var, C18753i1.C18757d<?> dVar, int i, WireFormat.FieldType fieldType, boolean z, Class cls) {
        return new C18641h(containingtype, Collections.emptyList(), z1Var, new C18640g(dVar, i, fieldType, true, z), cls);
    }

    /* renamed from: F0 */
    public static <ContainingType extends C18920z1, Type> C18641h<ContainingType, Type> m84943F0(ContainingType containingtype, Type type, C18920z1 z1Var, C18753i1.C18757d<?> dVar, int i, WireFormat.FieldType fieldType, Class cls) {
        return new C18641h(containingtype, type, z1Var, new C18640g(dVar, i, fieldType, false, false), cls);
    }

    /* renamed from: G0 */
    public static <T extends GeneratedMessageLite<T, ?>> T m84944G0(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return m84959U(m84958T0(t, inputStream, C18836p0.m87223d()));
    }

    /* renamed from: H0 */
    public static <T extends GeneratedMessageLite<T, ?>> T m84945H0(T t, InputStream inputStream, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return m84959U(m84958T0(t, inputStream, p0Var));
    }

    /* renamed from: I0 */
    public static <T extends GeneratedMessageLite<T, ?>> T m84946I0(T t, ByteString byteString) throws InvalidProtocolBufferException {
        return m84959U(m84947J0(t, byteString, C18836p0.m87223d()));
    }

    /* renamed from: J0 */
    public static <T extends GeneratedMessageLite<T, ?>> T m84947J0(T t, ByteString byteString, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return m84959U(m84960U0(t, byteString, p0Var));
    }

    /* renamed from: L0 */
    public static <T extends GeneratedMessageLite<T, ?>> T m84948L0(T t, C18889w wVar) throws InvalidProtocolBufferException {
        return m84949M0(t, wVar, C18836p0.m87223d());
    }

    /* renamed from: M0 */
    public static <T extends GeneratedMessageLite<T, ?>> T m84949M0(T t, C18889w wVar, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return m84959U(m84962W0(t, wVar, p0Var));
    }

    /* renamed from: N0 */
    public static <T extends GeneratedMessageLite<T, ?>> T m84950N0(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return m84959U(m84962W0(t, C18889w.m87622j(inputStream), C18836p0.m87223d()));
    }

    /* renamed from: O0 */
    public static <T extends GeneratedMessageLite<T, ?>> T m84951O0(T t, InputStream inputStream, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return m84959U(m84962W0(t, C18889w.m87622j(inputStream), p0Var));
    }

    /* renamed from: P0 */
    public static <T extends GeneratedMessageLite<T, ?>> T m84952P0(T t, ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return m84953Q0(t, byteBuffer, C18836p0.m87223d());
    }

    /* renamed from: Q0 */
    public static <T extends GeneratedMessageLite<T, ?>> T m84953Q0(T t, ByteBuffer byteBuffer, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return m84959U(m84949M0(t, C18889w.m87626n(byteBuffer), p0Var));
    }

    /* renamed from: R0 */
    public static <T extends GeneratedMessageLite<T, ?>> T m84955R0(T t, byte[] bArr) throws InvalidProtocolBufferException {
        return m84959U(m84963X0(t, bArr, 0, bArr.length, C18836p0.m87223d()));
    }

    /* renamed from: S0 */
    public static <T extends GeneratedMessageLite<T, ?>> T m84956S0(T t, byte[] bArr, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return m84959U(m84963X0(t, bArr, 0, bArr.length, p0Var));
    }

    /* renamed from: T */
    public static <MessageType extends C18637e<MessageType, BuilderType>, BuilderType extends C18636d<MessageType, BuilderType>, T> C18641h<MessageType, T> m84957T(C18817n0<MessageType, T> n0Var) {
        if (n0Var.mo55185e()) {
            return (C18641h) n0Var;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    /* renamed from: T0 */
    public static <T extends GeneratedMessageLite<T, ?>> T m84958T0(T t, InputStream inputStream, C18836p0 p0Var) throws InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            C18889w j = C18889w.m87622j(new C18665a.C18666a.C18667a(inputStream, C18889w.m87618O(read, inputStream)));
            T W0 = m84962W0(t, j, p0Var);
            try {
                j.mo55500a(0);
                return W0;
            } catch (InvalidProtocolBufferException e) {
                throw e.mo54083j(W0);
            }
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        }
    }

    /* renamed from: U */
    public static <T extends GeneratedMessageLite<T, ?>> T m84959U(T t) throws InvalidProtocolBufferException {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.mo54257y().mo54135a().mo54083j(t);
    }

    /* renamed from: U0 */
    public static <T extends GeneratedMessageLite<T, ?>> T m84960U0(T t, ByteString byteString, C18836p0 p0Var) throws InvalidProtocolBufferException {
        C18889w v0 = byteString.mo53766v0();
        T W0 = m84962W0(t, v0, p0Var);
        try {
            v0.mo55500a(0);
            return W0;
        } catch (InvalidProtocolBufferException e) {
            throw e.mo54083j(W0);
        }
    }

    /* renamed from: V0 */
    public static <T extends GeneratedMessageLite<T, ?>> T m84961V0(T t, C18889w wVar) throws InvalidProtocolBufferException {
        return m84962W0(t, wVar, C18836p0.m87223d());
    }

    /* renamed from: W0 */
    public static <T extends GeneratedMessageLite<T, ?>> T m84962W0(T t, C18889w wVar, C18836p0 p0Var) throws InvalidProtocolBufferException {
        T t2 = (GeneratedMessageLite) t.mo53983Z(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            C18905x2 j = C18853r2.m87361a().mo55374j(t2);
            j.mo54457h(t2, C18901x.m87974T(wVar), p0Var);
            j.mo54446b(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e.getCause());
            }
            throw new InvalidProtocolBufferException(e.getMessage()).mo54083j(t2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: X0 */
    public static <T extends GeneratedMessageLite<T, ?>> T m84963X0(T t, byte[] bArr, int i, int i2, C18836p0 p0Var) throws InvalidProtocolBufferException {
        T t2 = (GeneratedMessageLite) t.mo53983Z(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            C18905x2 j = C18853r2.m87361a().mo55374j(t2);
            j.mo54461j(t2, bArr, i, i + i2, new C18793l.C18795b(p0Var));
            j.mo54446b(t2);
            if (t2.memoizedHashCode == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e.getCause());
            }
            throw new InvalidProtocolBufferException(e.getMessage()).mo54083j(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.m85094l().mo54083j(t2);
        }
    }

    /* renamed from: Y0 */
    public static <T extends GeneratedMessageLite<T, ?>> T m84964Y0(T t, byte[] bArr, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return m84959U(m84963X0(t, bArr, 0, bArr.length, p0Var));
    }

    /* renamed from: a1 */
    public static <T extends GeneratedMessageLite<?, ?>> void m84965a1(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    /* renamed from: c0 */
    public static C18753i1.C18754a m84966c0() {
        return C18843q.m87306q();
    }

    /* renamed from: d0 */
    public static C18753i1.C18755b m84967d0() {
        return C18918z.m88228q();
    }

    /* renamed from: e0 */
    public static C18753i1.C18759f m84968e0() {
        return C18919z0.m88241q();
    }

    /* renamed from: g0 */
    public static C18753i1.C18760g m84969g0() {
        return C18744h1.m86068q();
    }

    /* renamed from: h0 */
    public static C18753i1.C18763i m84970h0() {
        return C18852r1.m87348q();
    }

    /* renamed from: i0 */
    public static <E> C18753i1.C18770k<E> m84971i0() {
        return C18862s2.m87419i();
    }

    /* renamed from: k0 */
    public static <T extends GeneratedMessageLite<?, ?>> T m84972k0(Class<T> cls) {
        T t = (GeneratedMessageLite) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (GeneratedMessageLite) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = ((GeneratedMessageLite) C18923z3.m88398j(cls)).getDefaultInstanceForType();
            if (t != null) {
                defaultInstanceMap.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: m0 */
    static Method m84973m0(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    /* renamed from: n0 */
    static Object m84974n0(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: o0 */
    public static final <T extends GeneratedMessageLite<T, ?>> boolean m84975o0(T t, boolean z) {
        T t2;
        byte byteValue = ((Byte) t.mo53983Z(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c = C18853r2.m87361a().mo55374j(t).mo54447c(t);
        if (z) {
            MethodToInvoke methodToInvoke = MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED;
            if (c) {
                t2 = t;
            } else {
                t2 = null;
            }
            t.mo53985a0(methodToInvoke, t2);
        }
        return c;
    }

    /* renamed from: u0 */
    public static C18753i1.C18754a m84976u0(C18753i1.C18754a aVar) {
        int i;
        int size = aVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size * 2;
        }
        return aVar.mo54630c(i);
    }

    /* renamed from: v0 */
    public static C18753i1.C18755b m84977v0(C18753i1.C18755b bVar) {
        int i;
        int size = bVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size * 2;
        }
        return bVar.mo54630c(i);
    }

    /* renamed from: w0 */
    public static C18753i1.C18759f m84978w0(C18753i1.C18759f fVar) {
        int i;
        int size = fVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size * 2;
        }
        return fVar.mo54630c(i);
    }

    /* renamed from: x0 */
    public static C18753i1.C18760g m84979x0(C18753i1.C18760g gVar) {
        int i;
        int size = gVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size * 2;
        }
        return gVar.mo54630c(i);
    }

    /* renamed from: y0 */
    public static C18753i1.C18763i m84980y0(C18753i1.C18763i iVar) {
        int i;
        int size = iVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size * 2;
        }
        return iVar.mo54630c(i);
    }

    /* renamed from: z0 */
    public static <E> C18753i1.C18770k<E> m84981z0(C18753i1.C18770k<E> kVar) {
        int i;
        int size = kVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size * 2;
        }
        return kVar.mo54630c(i);
    }

    /* renamed from: B0 */
    public final BuilderType newBuilderForType() {
        return (C18634b) mo53983Z(MethodToInvoke.NEW_BUILDER);
    }

    /* renamed from: J */
    public void mo53979J(CodedOutputStream codedOutputStream) throws IOException {
        C18853r2.m87361a().mo55374j(this).mo54459i(this, C18907y.m88074T(codedOutputStream));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public Object mo53980S() throws Exception {
        return mo53983Z(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    /* renamed from: V */
    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C18634b<MessageType, BuilderType>> BuilderType mo53981V() {
        return (C18634b) mo53983Z(MethodToInvoke.NEW_BUILDER);
    }

    /* renamed from: Y */
    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C18634b<MessageType, BuilderType>> BuilderType mo53982Y(MessageType messagetype) {
        return mo53981V().mo54029y0(messagetype);
    }

    /* renamed from: Z */
    public Object mo53983Z(MethodToInvoke methodToInvoke) {
        return mo53621b0(methodToInvoke, (Object) null, (Object) null);
    }

    /* renamed from: Z0 */
    public boolean mo53984Z0(int i, C18889w wVar) throws IOException {
        if (WireFormat.m85345b(i) == 4) {
            return false;
        }
        mo53993j0();
        return this.unknownFields.mo55566k(i, wVar);
    }

    /* renamed from: a0 */
    public Object mo53985a0(MethodToInvoke methodToInvoke, Object obj) {
        return mo53621b0(methodToInvoke, obj, (Object) null);
    }

    /* renamed from: b0 */
    public abstract Object mo53621b0(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    /* renamed from: b1 */
    public final BuilderType toBuilder() {
        BuilderType buildertype = (C18634b) mo53983Z(MethodToInvoke.NEW_BUILDER);
        buildertype.mo54029y0(this);
        return buildertype;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getDefaultInstanceForType().getClass().isInstance(obj)) {
            return false;
        }
        return C18853r2.m87361a().mo55374j(this).mo54455g(this, (GeneratedMessageLite) obj);
    }

    public final C18841p2<MessageType> getParserForType() {
        return (C18841p2) mo53983Z(MethodToInvoke.GET_PARSER);
    }

    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = C18853r2.m87361a().mo55374j(this).mo54449d(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int f = C18853r2.m87361a().mo55374j(this).mo54453f(this);
        this.memoizedHashCode = f;
        return f;
    }

    public final boolean isInitialized() {
        return m84975o0(this, true);
    }

    /* renamed from: j0 */
    public final void mo53993j0() {
        if (this.unknownFields == C18900w3.m87953e()) {
            this.unknownFields = C18900w3.m87957p();
        }
    }

    /* renamed from: l0 */
    public final MessageType getDefaultInstanceForType() {
        return (GeneratedMessageLite) mo53983Z(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    /* renamed from: p0 */
    public void mo53996p0() {
        C18853r2.m87361a().mo55374j(this).mo54446b(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo53997q() {
        return this.memoizedSerializedSize;
    }

    /* renamed from: q0 */
    public void mo53998q0(int i, ByteString byteString) {
        mo53993j0();
        this.unknownFields.mo55568m(i, byteString);
    }

    /* renamed from: r0 */
    public final void mo53999r0(C18900w3 w3Var) {
        this.unknownFields = C18900w3.m87956o(this.unknownFields, w3Var);
    }

    /* renamed from: s0 */
    public void mo54000s0(int i, int i2) {
        mo53993j0();
        this.unknownFields.mo55569n(i, i2);
    }

    public String toString() {
        return C18690b2.m85582e(this, super.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo54003z(int i) {
        this.memoizedSerializedSize = i;
    }
}
