package com.google.protobuf;

import com.google.protobuf.C34319a;
import com.google.protobuf.C34382j;
import com.google.protobuf.C34412l1;
import com.google.protobuf.C34425o0;
import com.google.protobuf.C34471v0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.C34263b;
import com.google.protobuf.WireFormat;
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

public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C34263b<MessageType, BuilderType>> extends C34319a<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize = -1;
    protected C34505y2 unknownFields = C34505y2.m140700c();

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

        public SerializedForm(C34412l1 l1Var) {
            Class<?> cls = l1Var.getClass();
            this.messageClass = cls;
            this.messageClassName = cls.getName();
            this.asBytes = l1Var.toByteArray();
        }

        /* renamed from: a */
        public static SerializedForm m138348a(C34412l1 l1Var) {
            return new SerializedForm(l1Var);
        }

        @Deprecated
        /* renamed from: b */
        public final Object mo100450b() throws ObjectStreamException {
            try {
                Field declaredField = mo100451c().getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((C34412l1) declaredField.get((Object) null)).newBuilderForType().mo100842W(this.asBytes).mo100467Q();
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
        public final Class<?> mo100451c() throws ClassNotFoundException {
            Class<?> cls = this.messageClass;
            return cls != null ? cls : Class.forName(this.messageClassName);
        }

        public Object readResolve() throws ObjectStreamException {
            try {
                Field declaredField = mo100451c().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((C34412l1) declaredField.get((Object) null)).newBuilderForType().mo100842W(this.asBytes).mo100467Q();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e);
            } catch (NoSuchFieldException unused) {
                return mo100450b();
            } catch (SecurityException e2) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.messageClassName, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Unable to call parsePartialFrom", e3);
            } catch (InvalidProtocolBufferException e4) {
                throw new RuntimeException("Unable to understand proto buffer", e4);
            }
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$a */
    public static /* synthetic */ class C34262a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83051a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.protobuf.WireFormat$JavaType[] r0 = com.google.protobuf.WireFormat.JavaType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f83051a = r0
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f83051a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.ENUM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.GeneratedMessageLite.C34262a.<clinit>():void");
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$b */
    public static abstract class C34263b<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C34263b<MessageType, BuilderType>> extends C34319a.C34320a<MessageType, BuilderType> {

        /* renamed from: a */
        public final MessageType f83052a;

        /* renamed from: b */
        public MessageType f83053b;

        /* renamed from: c */
        public boolean f83054c = false;

        public C34263b(MessageType messagetype) {
            this.f83052a = messagetype;
            this.f83053b = (GeneratedMessageLite) messagetype.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        /* renamed from: B */
        public final MessageType mo100473g() {
            MessageType C = mo100467Q();
            if (C.isInitialized()) {
                return C;
            }
            throw C34319a.C34320a.m138783A(C);
        }

        /* renamed from: C */
        public MessageType mo100467Q() {
            if (this.f83054c) {
                return this.f83053b;
            }
            this.f83053b.makeImmutable();
            this.f83054c = true;
            return this.f83053b;
        }

        /* renamed from: D */
        public final BuilderType clear() {
            this.f83053b = (GeneratedMessageLite) this.f83053b.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
            return this;
        }

        /* renamed from: E */
        public BuilderType mo100471f() {
            BuilderType newBuilderForType = getDefaultInstanceForType().newBuilderForType();
            newBuilderForType.mo100463K(mo100467Q());
            return newBuilderForType;
        }

        /* renamed from: F */
        public final void mo100457F() {
            if (this.f83054c) {
                mo100458G();
                this.f83054c = false;
            }
        }

        /* renamed from: G */
        public void mo100458G() {
            MessageType messagetype = (GeneratedMessageLite) this.f83053b.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
            mo100466O(messagetype, this.f83053b);
            this.f83053b = messagetype;
        }

        /* renamed from: H */
        public MessageType getDefaultInstanceForType() {
            return this.f83052a;
        }

        /* renamed from: I */
        public BuilderType mo100474i(MessageType messagetype) {
            return mo100463K(messagetype);
        }

        /* renamed from: J */
        public BuilderType mo100475m(C34448s sVar, C34368g0 g0Var) throws IOException {
            mo100457F();
            try {
                C34325a2.m138828a().mo100882j(this.f83053b).mo101122i(this.f83053b, C34460t.m140434T(sVar), g0Var);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        /* renamed from: K */
        public BuilderType mo100463K(MessageType messagetype) {
            mo100457F();
            mo100466O(this.f83053b, messagetype);
            return this;
        }

        /* renamed from: L */
        public BuilderType mo100476u(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            return mo100477v(bArr, i, i2, C34368g0.m139242d());
        }

        /* renamed from: N */
        public BuilderType mo100477v(byte[] bArr, int i, int i2, C34368g0 g0Var) throws InvalidProtocolBufferException {
            mo100457F();
            try {
                C34325a2.m138828a().mo100882j(this.f83053b).mo101123j(this.f83053b, bArr, i, i + i2, new C34382j.C34384b(g0Var));
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.m138422n();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }

        /* renamed from: O */
        public final void mo100466O(MessageType messagetype, MessageType messagetype2) {
            C34325a2.m138828a().mo100882j(messagetype).mo101114a(messagetype, messagetype2);
        }

        public final boolean isInitialized() {
            return GeneratedMessageLite.isInitialized(this.f83053b, false);
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$c */
    public static class C34264c<T extends GeneratedMessageLite<T, ?>> extends C34329b<T> {

        /* renamed from: b */
        public final T f83055b;

        public C34264c(T t) {
            this.f83055b = t;
        }

        /* renamed from: b0 */
        public T mo100482z(C34448s sVar, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parsePartialFrom(this.f83055b, sVar, g0Var);
        }

        /* renamed from: c0 */
        public T mo100481v(byte[] bArr, int i, int i2, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parsePartialFrom(this.f83055b, bArr, i, i2, g0Var);
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$d */
    public static abstract class C34265d<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends C34265d<MessageType, BuilderType>> extends C34263b<MessageType, BuilderType> implements C34266e<MessageType, BuilderType> {
        public C34265d(MessageType messagetype) {
            super(messagetype);
        }

        /* renamed from: T */
        private C34425o0<C34267f> m138379T() {
            C34425o0<C34267f> o0Var = ((ExtendableMessage) this.f83053b).extensions;
            if (!o0Var.mo101382D()) {
                return o0Var;
            }
            C34425o0<C34267f> k = o0Var.clone();
            ((ExtendableMessage) this.f83053b).extensions = k;
            return k;
        }

        /* renamed from: G */
        public void mo100458G() {
            super.mo100458G();
            MessageType messagetype = this.f83053b;
            ((ExtendableMessage) messagetype).extensions = ((ExtendableMessage) messagetype).extensions.clone();
        }

        /* renamed from: P */
        public final <Type> BuilderType mo100483P(C34355e0<MessageType, List<Type>> e0Var, Type type) {
            C34268g access$000 = GeneratedMessageLite.m138341b(e0Var);
            mo100489Z(access$000);
            mo100457F();
            m138379T().mo101396h(access$000.f83064d, access$000.mo100507j(type));
            return this;
        }

        /* renamed from: R */
        public final MessageType mo100467Q() {
            if (this.f83054c) {
                return (ExtendableMessage) this.f83053b;
            }
            ((ExtendableMessage) this.f83053b).extensions.mo101385I();
            return (ExtendableMessage) super.mo100467Q();
        }

        /* renamed from: S */
        public final BuilderType mo100485S(C34355e0<MessageType, ?> e0Var) {
            C34268g access$000 = GeneratedMessageLite.m138341b(e0Var);
            mo100489Z(access$000);
            mo100457F();
            m138379T().mo101399j(access$000.f83064d);
            return this;
        }

        /* renamed from: U */
        public void mo100486U(C34425o0<C34267f> o0Var) {
            mo100457F();
            ((ExtendableMessage) this.f83053b).extensions = o0Var;
        }

        /* renamed from: V */
        public final <Type> BuilderType mo100487V(C34355e0<MessageType, List<Type>> e0Var, int i, Type type) {
            C34268g access$000 = GeneratedMessageLite.m138341b(e0Var);
            mo100489Z(access$000);
            mo100457F();
            m138379T().mo101389P(access$000.f83064d, i, access$000.mo100507j(type));
            return this;
        }

        /* renamed from: Y */
        public final <Type> BuilderType mo100488Y(C34355e0<MessageType, Type> e0Var, Type type) {
            C34268g access$000 = GeneratedMessageLite.m138341b(e0Var);
            mo100489Z(access$000);
            mo100457F();
            m138379T().mo101388O(access$000.f83064d, access$000.mo100508k(type));
            return this;
        }

        /* renamed from: Z */
        public final void mo100489Z(C34268g<MessageType, ?> gVar) {
            if (gVar.mo100505h() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public final <Type> Type getExtension(C34355e0<MessageType, Type> e0Var) {
            return ((ExtendableMessage) this.f83053b).getExtension(e0Var);
        }

        public final <Type> int getExtensionCount(C34355e0<MessageType, List<Type>> e0Var) {
            return ((ExtendableMessage) this.f83053b).getExtensionCount(e0Var);
        }

        public final <Type> boolean hasExtension(C34355e0<MessageType, Type> e0Var) {
            return ((ExtendableMessage) this.f83053b).hasExtension(e0Var);
        }

        /* JADX WARNING: type inference failed for: r2v0, types: [com.google.protobuf.e0<MessageType, java.util.List<Type>>, com.google.protobuf.e0] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <Type> Type getExtension(com.google.protobuf.C34355e0<MessageType, java.util.List<Type>> r2, int r3) {
            /*
                r1 = this;
                MessageType r0 = r1.f83053b
                com.google.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (com.google.protobuf.GeneratedMessageLite.ExtendableMessage) r0
                java.lang.Object r2 = r0.getExtension(r2, r3)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.GeneratedMessageLite.C34265d.getExtension(com.google.protobuf.e0, int):java.lang.Object");
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$e */
    public interface C34266e<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends C34265d<MessageType, BuilderType>> extends C34417m1 {
        <Type> Type getExtension(C34355e0<MessageType, Type> e0Var);

        <Type> Type getExtension(C34355e0<MessageType, List<Type>> e0Var, int i);

        <Type> int getExtensionCount(C34355e0<MessageType, List<Type>> e0Var);

        <Type> boolean hasExtension(C34355e0<MessageType, Type> e0Var);
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$f */
    public static final class C34267f implements C34425o0.C34428c<C34267f> {

        /* renamed from: a */
        public final C34471v0.C34475d<?> f83056a;

        /* renamed from: b */
        public final int f83057b;

        /* renamed from: c */
        public final WireFormat.FieldType f83058c;

        /* renamed from: d */
        public final boolean f83059d;

        /* renamed from: e */
        public final boolean f83060e;

        public C34267f(C34471v0.C34475d<?> dVar, int i, WireFormat.FieldType fieldType, boolean z, boolean z2) {
            this.f83056a = dVar;
            this.f83057b = i;
            this.f83058c = fieldType;
            this.f83059d = z;
            this.f83060e = z2;
        }

        /* renamed from: B */
        public boolean mo100490B() {
            return this.f83059d;
        }

        /* renamed from: D */
        public WireFormat.FieldType mo100491D() {
            return this.f83058c;
        }

        /* renamed from: R */
        public WireFormat.JavaType mo100492R() {
            return this.f83058c.mo100782g();
        }

        /* renamed from: S */
        public boolean mo100493S() {
            return this.f83060e;
        }

        /* renamed from: b */
        public int compareTo(C34267f fVar) {
            return this.f83057b - fVar.f83057b;
        }

        /* renamed from: d0 */
        public C34412l1.C34413a mo100496d0(C34412l1.C34413a aVar, C34412l1 l1Var) {
            return ((C34263b) aVar).mo100463K((GeneratedMessageLite) l1Var);
        }

        public int getNumber() {
            return this.f83057b;
        }

        /* renamed from: s */
        public C34471v0.C34475d<?> mo100498s() {
            return this.f83056a;
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$g */
    public static class C34268g<ContainingType extends C34412l1, Type> extends C34355e0<ContainingType, Type> {

        /* renamed from: a */
        public final ContainingType f83061a;

        /* renamed from: b */
        public final Type f83062b;

        /* renamed from: c */
        public final C34412l1 f83063c;

        /* renamed from: d */
        public final C34267f f83064d;

        public C34268g(ContainingType containingtype, Type type, C34412l1 l1Var, C34267f fVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (fVar.mo100491D() == WireFormat.FieldType.MESSAGE && l1Var == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.f83061a = containingtype;
                this.f83062b = type;
                this.f83063c = l1Var;
                this.f83064d = fVar;
            }
        }

        /* renamed from: a */
        public Type mo100499a() {
            return this.f83062b;
        }

        /* renamed from: b */
        public WireFormat.FieldType mo100500b() {
            return this.f83064d.mo100491D();
        }

        /* renamed from: c */
        public C34412l1 mo100501c() {
            return this.f83063c;
        }

        /* renamed from: d */
        public int mo100502d() {
            return this.f83064d.getNumber();
        }

        /* renamed from: f */
        public boolean mo100503f() {
            return this.f83064d.f83059d;
        }

        /* renamed from: g */
        public Object mo100504g(Object obj) {
            if (!this.f83064d.mo100490B()) {
                return mo100506i(obj);
            }
            if (this.f83064d.mo100492R() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            for (Object i : (List) obj) {
                arrayList.add(mo100506i(i));
            }
            return arrayList;
        }

        /* renamed from: h */
        public ContainingType mo100505h() {
            return this.f83061a;
        }

        /* renamed from: i */
        public Object mo100506i(Object obj) {
            if (this.f83064d.mo100492R() == WireFormat.JavaType.ENUM) {
                return this.f83064d.f83056a.mo93187a(((Integer) obj).intValue());
            }
            return obj;
        }

        /* renamed from: j */
        public Object mo100507j(Object obj) {
            if (this.f83064d.mo100492R() == WireFormat.JavaType.ENUM) {
                return Integer.valueOf(((C34471v0.C34474c) obj).getNumber());
            }
            return obj;
        }

        /* renamed from: k */
        public Object mo100508k(Object obj) {
            if (!this.f83064d.mo100490B()) {
                return mo100507j(obj);
            }
            if (this.f83064d.mo100492R() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            for (Object j : (List) obj) {
                arrayList.add(mo100507j(j));
            }
            return arrayList;
        }
    }

    /* renamed from: b */
    public static <MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends C34265d<MessageType, BuilderType>, T> C34268g<MessageType, T> m138341b(C34355e0<MessageType, T> e0Var) {
        if (e0Var.mo101037e()) {
            return (C34268g) e0Var;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    /* renamed from: c */
    public static <T extends GeneratedMessageLite<T, ?>> T m138342c(T t) throws InvalidProtocolBufferException {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.newUninitializedMessageException().mo100731a().mo100518l(t);
    }

    /* renamed from: d */
    private final void m138343d() {
        if (this.unknownFields == C34505y2.m140700c()) {
            this.unknownFields = C34505y2.m140704n();
        }
    }

    /* renamed from: e */
    public static <T extends GeneratedMessageLite<T, ?>> T m138344e(T t, InputStream inputStream, C34368g0 g0Var) throws InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            C34448s j = C34448s.m140148j(new C34319a.C34320a.C34321a(inputStream, C34448s.m140144O(read, inputStream)));
            T parsePartialFrom = parsePartialFrom(t, j, g0Var);
            try {
                j.mo101527a(0);
                return parsePartialFrom;
            } catch (InvalidProtocolBufferException e) {
                throw e.mo100518l(parsePartialFrom);
            }
        } catch (InvalidProtocolBufferException e2) {
            e = e2;
            if (e.mo100515a()) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e;
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3);
        }
    }

    public static C34471v0.C34472a emptyBooleanList() {
        return C34419n.m139898q();
    }

    public static C34471v0.C34473b emptyDoubleList() {
        return C34470v.m140557q();
    }

    public static C34471v0.C34477f emptyFloatList() {
        return C34433p0.m140088q();
    }

    public static C34471v0.C34478g emptyIntList() {
        return C34467u0.m140542q();
    }

    public static C34471v0.C34481i emptyLongList() {
        return C34351d1.m139142q();
    }

    public static <E> C34471v0.C34488k<E> emptyProtobufList() {
        return C34335b2.m138927i();
    }

    /* renamed from: f */
    public static <T extends GeneratedMessageLite<T, ?>> T m138345f(T t, ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        C34448s v0 = byteString.mo99254v0();
        T parsePartialFrom = parsePartialFrom(t, v0, g0Var);
        try {
            v0.mo101527a(0);
            return parsePartialFrom;
        } catch (InvalidProtocolBufferException e) {
            throw e.mo100518l(parsePartialFrom);
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> T getDefaultInstance(Class<T> cls) {
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
            t = ((GeneratedMessageLite) C34341c3.m138999l(cls)).getDefaultInstanceForType();
            if (t != null) {
                defaultInstanceMap.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    /* renamed from: h */
    public static <T extends GeneratedMessageLite<T, ?>> T m138346h(T t, byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return m138342c(parsePartialFrom(t, bArr, 0, bArr.length, g0Var));
    }

    static Object invokeOrDie(Method method, Object obj, Object... objArr) {
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

    public static C34471v0.C34478g mutableCopy(C34471v0.C34478g gVar) {
        int size = gVar.size();
        return gVar.mo100962c(size == 0 ? 10 : size * 2);
    }

    public static Object newMessageInfo(C34412l1 l1Var, String str, Object[] objArr) {
        return new C34359e2(l1Var, str, objArr);
    }

    public static <ContainingType extends C34412l1, Type> C34268g<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, C34412l1 l1Var, C34471v0.C34475d<?> dVar, int i, WireFormat.FieldType fieldType, boolean z, Class cls) {
        return new C34268g(containingtype, Collections.emptyList(), l1Var, new C34267f(dVar, i, fieldType, true, z), cls);
    }

    public static <ContainingType extends C34412l1, Type> C34268g<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, C34412l1 l1Var, C34471v0.C34475d<?> dVar, int i, WireFormat.FieldType fieldType, Class cls) {
        return new C34268g(containingtype, type, l1Var, new C34267f(dVar, i, fieldType, false, false), cls);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return m138342c(m138344e(t, inputStream, C34368g0.m139242d()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return m138342c(parseFrom(t, C34448s.m140152n(byteBuffer), g0Var));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, C34448s sVar, C34368g0 g0Var) throws InvalidProtocolBufferException {
        T t2 = (GeneratedMessageLite) t.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            C34372g2 j = C34325a2.m138828a().mo100882j(t2);
            j.mo101122i(t2, C34460t.m140434T(sVar), g0Var);
            j.mo101115b(t2);
            return t2;
        } catch (InvalidProtocolBufferException e) {
            e = e;
            if (e.mo100515a()) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e.mo100518l(t2);
        } catch (IOException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw new InvalidProtocolBufferException(e2).mo100518l(t2);
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw e3;
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> void registerDefaultInstance(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    /* access modifiers changed from: package-private */
    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C34263b<MessageType, BuilderType>> BuilderType createBuilder() {
        return (C34263b) dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    public Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj) {
        return dynamicMethod(methodToInvoke, obj, (Object) null);
    }

    public abstract Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C34325a2.m138828a().mo100882j(this).mo101120g(this, (GeneratedMessageLite) obj);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize;
    }

    public final C34504y1<MessageType> getParserForType() {
        return (C34504y1) dynamicMethod(MethodToInvoke.GET_PARSER);
    }

    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = C34325a2.m138828a().mo100882j(this).mo101117d(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int f = C34325a2.m138828a().mo100882j(this).mo101119f(this);
        this.memoizedHashCode = f;
        return f;
    }

    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public void makeImmutable() {
        C34325a2.m138828a().mo100882j(this).mo101115b(this);
    }

    public void mergeLengthDelimitedField(int i, ByteString byteString) {
        m138343d();
        this.unknownFields.mo101715k(i, byteString);
    }

    public final void mergeUnknownFields(C34505y2 y2Var) {
        this.unknownFields = C34505y2.m140703m(this.unknownFields, y2Var);
    }

    public void mergeVarintField(int i, int i2) {
        m138343d();
        this.unknownFields.mo101716l(i, i2);
    }

    public boolean parseUnknownField(int i, C34448s sVar) throws IOException {
        if (WireFormat.m138722b(i) == 4) {
            return false;
        }
        m138343d();
        return this.unknownFields.mo101713i(i, sVar);
    }

    /* access modifiers changed from: package-private */
    public void setMemoizedSerializedSize(int i) {
        this.memoizedSerializedSize = i;
    }

    public String toString() {
        return C34421n1.m139916e(this, super.toString());
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        C34325a2.m138828a().mo100882j(this).mo101121h(this, C34465u.m140489T(codedOutputStream));
    }

    public static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T t, boolean z) {
        byte byteValue = ((Byte) t.dynamicMethod(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c = C34325a2.m138828a().mo100882j(t).mo101116c(t);
        if (z) {
            t.dynamicMethod(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, c ? t : null);
        }
        return c;
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C34263b<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        return createBuilder().mo100463K(messagetype);
    }

    public Object dynamicMethod(MethodToInvoke methodToInvoke) {
        return dynamicMethod(methodToInvoke, (Object) null, (Object) null);
    }

    public final MessageType getDefaultInstanceForType() {
        return (GeneratedMessageLite) dynamicMethod(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    public final BuilderType newBuilderForType() {
        return (C34263b) dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    public final BuilderType toBuilder() {
        BuilderType buildertype = (C34263b) dynamicMethod(MethodToInvoke.NEW_BUILDER);
        buildertype.mo100463K(this);
        return buildertype;
    }

    public static C34471v0.C34481i mutableCopy(C34471v0.C34481i iVar) {
        int size = iVar.size();
        return iVar.mo100962c(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return parseFrom(t, byteBuffer, C34368g0.m139242d());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return m138342c(m138344e(t, inputStream, g0Var));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteString byteString) throws InvalidProtocolBufferException {
        return m138342c(parseFrom(t, byteString, C34368g0.m139242d()));
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends C34265d<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements C34266e<MessageType, BuilderType> {
        protected C34425o0<C34267f> extensions = C34425o0.m139944s();

        /* renamed from: com.google.protobuf.GeneratedMessageLite$ExtendableMessage$a */
        public class C34261a {

            /* renamed from: a */
            public final Iterator<Map.Entry<C34267f, Object>> f83039a;

            /* renamed from: b */
            public Map.Entry<C34267f, Object> f83040b;

            /* renamed from: c */
            public final boolean f83041c;

            public /* synthetic */ C34261a(ExtendableMessage extendableMessage, boolean z, C34262a aVar) {
                this(z);
            }

            /* renamed from: a */
            public void mo100449a(int i, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<C34267f, Object> entry = this.f83040b;
                    if (entry != null && entry.getKey().getNumber() < i) {
                        C34267f key = this.f83040b.getKey();
                        if (!this.f83041c || key.mo100492R() != WireFormat.JavaType.MESSAGE || key.mo100490B()) {
                            C34425o0.m139930T(key, this.f83040b.getValue(), codedOutputStream);
                        } else {
                            codedOutputStream.mo99302P1(key.getNumber(), (C34412l1) this.f83040b.getValue());
                        }
                        if (this.f83039a.hasNext()) {
                            this.f83040b = this.f83039a.next();
                        } else {
                            this.f83040b = null;
                        }
                    } else {
                        return;
                    }
                }
            }

            public C34261a(boolean z) {
                Iterator<Map.Entry<C34267f, Object>> H = ExtendableMessage.this.extensions.mo101384H();
                this.f83039a = H;
                if (H.hasNext()) {
                    this.f83040b = H.next();
                }
                this.f83041c = z;
            }
        }

        private void eagerlyMergeMessageSetExtension(C34448s sVar, C34268g<?, ?> gVar, C34368g0 g0Var, int i) throws IOException {
            parseExtension(sVar, g0Var, gVar, WireFormat.m138723c(i, 2), i);
        }

        private void mergeMessageSetExtensionFromBytes(ByteString byteString, C34368g0 g0Var, C34268g<?, ?> gVar) throws IOException {
            C34412l1.C34413a aVar;
            C34412l1 l1Var = (C34412l1) this.extensions.mo101403u(gVar.f83064d);
            if (l1Var != null) {
                aVar = l1Var.toBuilder();
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = gVar.mo100501c().newBuilderForType();
            }
            aVar.mo100855y2(byteString, g0Var);
            ensureExtensionsAreMutable().mo101388O(gVar.f83064d, gVar.mo100507j(aVar.mo100473g()));
        }

        private <MessageType extends C34412l1> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, C34448s sVar, C34368g0 g0Var) throws IOException {
            int i = 0;
            ByteString byteString = null;
            C34268g gVar = null;
            while (true) {
                int Y = sVar.mo101525Y();
                if (Y == 0) {
                    break;
                } else if (Y == WireFormat.f83157s) {
                    i = sVar.mo101526Z();
                    if (i != 0) {
                        gVar = g0Var.mo101102c(messagetype, i);
                    }
                } else if (Y == WireFormat.f83158t) {
                    if (i == 0 || gVar == null) {
                        byteString = sVar.mo101551x();
                    } else {
                        eagerlyMergeMessageSetExtension(sVar, gVar, g0Var, i);
                        byteString = null;
                    }
                } else if (!sVar.mo101538g0(Y)) {
                    break;
                }
            }
            sVar.mo101527a(WireFormat.f83156r);
            if (byteString != null && i != 0) {
                if (gVar != null) {
                    mergeMessageSetExtensionFromBytes(byteString, g0Var, gVar);
                } else {
                    mergeLengthDelimitedField(i, byteString);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean parseExtension(com.google.protobuf.C34448s r6, com.google.protobuf.C34368g0 r7, com.google.protobuf.GeneratedMessageLite.C34268g<?, ?> r8, int r9, int r10) throws java.io.IOException {
            /*
                r5 = this;
                int r0 = com.google.protobuf.WireFormat.m138722b(r9)
                r1 = 1
                r2 = 0
                if (r8 != 0) goto L_0x000b
            L_0x0008:
                r0 = r1
                r3 = r2
                goto L_0x0036
            L_0x000b:
                com.google.protobuf.GeneratedMessageLite$f r3 = r8.f83064d
                com.google.protobuf.WireFormat$FieldType r3 = r3.mo100491D()
                int r3 = com.google.protobuf.C34425o0.m139922A(r3, r2)
                if (r0 != r3) goto L_0x001a
                r0 = r2
                r3 = r0
                goto L_0x0036
            L_0x001a:
                com.google.protobuf.GeneratedMessageLite$f r3 = r8.f83064d
                boolean r4 = r3.f83059d
                if (r4 == 0) goto L_0x0008
                com.google.protobuf.WireFormat$FieldType r3 = r3.f83058c
                boolean r3 = r3.mo100784r()
                if (r3 == 0) goto L_0x0008
                com.google.protobuf.GeneratedMessageLite$f r3 = r8.f83064d
                com.google.protobuf.WireFormat$FieldType r3 = r3.mo100491D()
                int r3 = com.google.protobuf.C34425o0.m139922A(r3, r1)
                if (r0 != r3) goto L_0x0008
                r3 = r1
                r0 = r2
            L_0x0036:
                if (r0 == 0) goto L_0x003d
                boolean r6 = r5.parseUnknownField(r9, r6)
                return r6
            L_0x003d:
                r5.ensureExtensionsAreMutable()
                if (r3 == 0) goto L_0x0094
                int r7 = r6.mo101516N()
                int r7 = r6.mo101547t(r7)
                com.google.protobuf.GeneratedMessageLite$f r9 = r8.f83064d
                com.google.protobuf.WireFormat$FieldType r9 = r9.mo100491D()
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.ENUM
                if (r9 != r10) goto L_0x0077
            L_0x0054:
                int r9 = r6.mo101535f()
                if (r9 <= 0) goto L_0x008f
                int r9 = r6.mo101553z()
                com.google.protobuf.GeneratedMessageLite$f r10 = r8.f83064d
                com.google.protobuf.v0$d r10 = r10.mo100498s()
                com.google.protobuf.v0$c r9 = r10.mo93187a(r9)
                if (r9 != 0) goto L_0x006b
                return r1
            L_0x006b:
                com.google.protobuf.o0<com.google.protobuf.GeneratedMessageLite$f> r10 = r5.extensions
                com.google.protobuf.GeneratedMessageLite$f r0 = r8.f83064d
                java.lang.Object r9 = r8.mo100507j(r9)
                r10.mo101396h(r0, r9)
                goto L_0x0054
            L_0x0077:
                int r9 = r6.mo101535f()
                if (r9 <= 0) goto L_0x008f
                com.google.protobuf.GeneratedMessageLite$f r9 = r8.f83064d
                com.google.protobuf.WireFormat$FieldType r9 = r9.mo100491D()
                java.lang.Object r9 = com.google.protobuf.C34425o0.m139927N(r6, r9, r2)
                com.google.protobuf.o0<com.google.protobuf.GeneratedMessageLite$f> r10 = r5.extensions
                com.google.protobuf.GeneratedMessageLite$f r0 = r8.f83064d
                r10.mo101396h(r0, r9)
                goto L_0x0077
            L_0x008f:
                r6.mo101546s(r7)
                goto L_0x0124
            L_0x0094:
                int[] r9 = com.google.protobuf.GeneratedMessageLite.C34262a.f83051a
                com.google.protobuf.GeneratedMessageLite$f r0 = r8.f83064d
                com.google.protobuf.WireFormat$JavaType r0 = r0.mo100492R()
                int r0 = r0.ordinal()
                r9 = r9[r0]
                if (r9 == r1) goto L_0x00c8
                r7 = 2
                if (r9 == r7) goto L_0x00b2
                com.google.protobuf.GeneratedMessageLite$f r7 = r8.f83064d
                com.google.protobuf.WireFormat$FieldType r7 = r7.mo100491D()
                java.lang.Object r6 = com.google.protobuf.C34425o0.m139927N(r6, r7, r2)
                goto L_0x0105
            L_0x00b2:
                int r6 = r6.mo101553z()
                com.google.protobuf.GeneratedMessageLite$f r7 = r8.f83064d
                com.google.protobuf.v0$d r7 = r7.mo100498s()
                com.google.protobuf.v0$c r7 = r7.mo93187a(r6)
                if (r7 != 0) goto L_0x00c6
                r5.mergeVarintField(r10, r6)
                return r1
            L_0x00c6:
                r6 = r7
                goto L_0x0105
            L_0x00c8:
                com.google.protobuf.GeneratedMessageLite$f r9 = r8.f83064d
                boolean r9 = r9.mo100490B()
                if (r9 != 0) goto L_0x00e1
                com.google.protobuf.o0<com.google.protobuf.GeneratedMessageLite$f> r9 = r5.extensions
                com.google.protobuf.GeneratedMessageLite$f r10 = r8.f83064d
                java.lang.Object r9 = r9.mo101403u(r10)
                com.google.protobuf.l1 r9 = (com.google.protobuf.C34412l1) r9
                if (r9 == 0) goto L_0x00e1
                com.google.protobuf.l1$a r9 = r9.toBuilder()
                goto L_0x00e2
            L_0x00e1:
                r9 = 0
            L_0x00e2:
                if (r9 != 0) goto L_0x00ec
                com.google.protobuf.l1 r9 = r8.mo100501c()
                com.google.protobuf.l1$a r9 = r9.newBuilderForType()
            L_0x00ec:
                com.google.protobuf.GeneratedMessageLite$f r10 = r8.f83064d
                com.google.protobuf.WireFormat$FieldType r10 = r10.mo100491D()
                com.google.protobuf.WireFormat$FieldType r0 = com.google.protobuf.WireFormat.FieldType.GROUP
                if (r10 != r0) goto L_0x00fe
                int r10 = r8.mo100502d()
                r6.mo101507E(r10, r9, r7)
                goto L_0x0101
            L_0x00fe:
                r6.mo101511I(r9, r7)
            L_0x0101:
                com.google.protobuf.l1 r6 = r9.mo100473g()
            L_0x0105:
                com.google.protobuf.GeneratedMessageLite$f r7 = r8.f83064d
                boolean r7 = r7.mo100490B()
                if (r7 == 0) goto L_0x0119
                com.google.protobuf.o0<com.google.protobuf.GeneratedMessageLite$f> r7 = r5.extensions
                com.google.protobuf.GeneratedMessageLite$f r9 = r8.f83064d
                java.lang.Object r6 = r8.mo100507j(r6)
                r7.mo101396h(r9, r6)
                goto L_0x0124
            L_0x0119:
                com.google.protobuf.o0<com.google.protobuf.GeneratedMessageLite$f> r7 = r5.extensions
                com.google.protobuf.GeneratedMessageLite$f r9 = r8.f83064d
                java.lang.Object r6 = r8.mo100507j(r6)
                r7.mo101388O(r9, r6)
            L_0x0124:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.GeneratedMessageLite.ExtendableMessage.parseExtension(com.google.protobuf.s, com.google.protobuf.g0, com.google.protobuf.GeneratedMessageLite$g, int, int):boolean");
        }

        private void verifyExtensionContainingType(C34268g<MessageType, ?> gVar) {
            if (gVar.mo100505h() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public C34425o0<C34267f> ensureExtensionsAreMutable() {
            if (this.extensions.mo101382D()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.mo101383E();
        }

        public int extensionsSerializedSize() {
            return this.extensions.mo101408z();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.mo101404v();
        }

        public /* bridge */ /* synthetic */ C34412l1 getDefaultInstanceForType() {
            return GeneratedMessageLite.super.getDefaultInstanceForType();
        }

        public final <Type> Type getExtension(C34355e0<MessageType, Type> e0Var) {
            C34268g access$000 = GeneratedMessageLite.m138341b(e0Var);
            verifyExtensionContainingType(access$000);
            Object u = this.extensions.mo101403u(access$000.f83064d);
            if (u == null) {
                return access$000.f83062b;
            }
            return access$000.mo100504g(u);
        }

        public final <Type> int getExtensionCount(C34355e0<MessageType, List<Type>> e0Var) {
            C34268g access$000 = GeneratedMessageLite.m138341b(e0Var);
            verifyExtensionContainingType(access$000);
            return this.extensions.mo101407y(access$000.f83064d);
        }

        public final <Type> boolean hasExtension(C34355e0<MessageType, Type> e0Var) {
            C34268g access$000 = GeneratedMessageLite.m138341b(e0Var);
            verifyExtensionContainingType(access$000);
            return this.extensions.mo101380B(access$000.f83064d);
        }

        public final void mergeExtensionFields(MessageType messagetype) {
            if (this.extensions.mo101382D()) {
                this.extensions = this.extensions.clone();
            }
            this.extensions.mo101386J(messagetype.extensions);
        }

        public /* bridge */ /* synthetic */ C34412l1.C34413a newBuilderForType() {
            return GeneratedMessageLite.super.newBuilderForType();
        }

        public ExtendableMessage<MessageType, BuilderType>.a newExtensionWriter() {
            return new C34261a(this, false, (C34262a) null);
        }

        public ExtendableMessage<MessageType, BuilderType>.a newMessageSetExtensionWriter() {
            return new C34261a(this, true, (C34262a) null);
        }

        public <MessageType extends C34412l1> boolean parseUnknownField(MessageType messagetype, C34448s sVar, C34368g0 g0Var, int i) throws IOException {
            int a = WireFormat.m138721a(i);
            return parseExtension(sVar, g0Var, g0Var.mo101102c(messagetype, a), i, a);
        }

        public <MessageType extends C34412l1> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, C34448s sVar, C34368g0 g0Var, int i) throws IOException {
            if (i == WireFormat.f83155q) {
                mergeMessageSetExtensionFromCodedStream(messagetype, sVar, g0Var);
                return true;
            } else if (WireFormat.m138722b(i) == 2) {
                return parseUnknownField(messagetype, sVar, g0Var, i);
            } else {
                return sVar.mo101538g0(i);
            }
        }

        public /* bridge */ /* synthetic */ C34412l1.C34413a toBuilder() {
            return GeneratedMessageLite.super.toBuilder();
        }

        public final <Type> Type getExtension(C34355e0<MessageType, List<Type>> e0Var, int i) {
            C34268g access$000 = GeneratedMessageLite.m138341b(e0Var);
            verifyExtensionContainingType(access$000);
            return access$000.mo100506i(this.extensions.mo101406x(access$000.f83064d, i));
        }
    }

    public static C34471v0.C34477f mutableCopy(C34471v0.C34477f fVar) {
        int size = fVar.size();
        return fVar.mo100962c(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return m138342c(m138345f(t, byteString, g0Var));
    }

    public static C34471v0.C34473b mutableCopy(C34471v0.C34473b bVar) {
        int size = bVar.size();
        return bVar.mo100962c(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr) throws InvalidProtocolBufferException {
        return m138342c(parsePartialFrom(t, bArr, 0, bArr.length, C34368g0.m139242d()));
    }

    public static C34471v0.C34472a mutableCopy(C34471v0.C34472a aVar) {
        int size = aVar.size();
        return aVar.mo100962c(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return m138342c(parsePartialFrom(t, bArr, 0, bArr.length, g0Var));
    }

    public static <E> C34471v0.C34488k<E> mutableCopy(C34471v0.C34488k<E> kVar) {
        int size = kVar.size();
        return kVar.mo100962c(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return m138342c(parsePartialFrom(t, C34448s.m140148j(inputStream), C34368g0.m139242d()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, byte[] bArr, int i, int i2, C34368g0 g0Var) throws InvalidProtocolBufferException {
        T t2 = (GeneratedMessageLite) t.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            C34372g2 j = C34325a2.m138828a().mo100882j(t2);
            j.mo101123j(t2, bArr, i, i + i2, new C34382j.C34384b(g0Var));
            j.mo101115b(t2);
            if (t2.memoizedHashCode == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (InvalidProtocolBufferException e) {
            e = e;
            if (e.mo100515a()) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e.mo100518l(t2);
        } catch (IOException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw new InvalidProtocolBufferException(e2).mo100518l(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.m138422n().mo100518l(t2);
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return m138342c(parsePartialFrom(t, C34448s.m140148j(inputStream), g0Var));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, C34448s sVar) throws InvalidProtocolBufferException {
        return parseFrom(t, sVar, C34368g0.m139242d());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, C34448s sVar, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return m138342c(parsePartialFrom(t, sVar, g0Var));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, C34448s sVar) throws InvalidProtocolBufferException {
        return parsePartialFrom(t, sVar, C34368g0.m139242d());
    }
}
