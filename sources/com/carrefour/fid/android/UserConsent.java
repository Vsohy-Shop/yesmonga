package com.carrefour.fid.android;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34319a;
import com.google.protobuf.C34368g0;
import com.google.protobuf.C34448s;
import com.google.protobuf.C34504y1;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UserConsent extends GeneratedMessageLite<UserConsent, C13135b> implements C14080x0 {
    public static final int CHOICE_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final UserConsent DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile C34504y1<UserConsent> PARSER;
    private String choice_ = "";
    private String key_ = "";

    /* renamed from: com.carrefour.fid.android.UserConsent$a */
    public static /* synthetic */ class C13134a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32256a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32256a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32256a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32256a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32256a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f32256a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f32256a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f32256a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.UserConsent.C13134a.<clinit>():void");
        }
    }

    /* renamed from: com.carrefour.fid.android.UserConsent$b */
    public static final class C13135b extends GeneratedMessageLite.C34263b<UserConsent, C13135b> implements C14080x0 {
        /* renamed from: P */
        public C13135b mo31010P() {
            mo100457F();
            ((UserConsent) this.f83053b).clearChoice();
            return this;
        }

        /* renamed from: R */
        public C13135b mo31011R() {
            mo100457F();
            ((UserConsent) this.f83053b).clearKey();
            return this;
        }

        /* renamed from: S */
        public C13135b mo31012S(String str) {
            mo100457F();
            ((UserConsent) this.f83053b).setChoice(str);
            return this;
        }

        /* renamed from: T */
        public C13135b mo31013T(ByteString byteString) {
            mo100457F();
            ((UserConsent) this.f83053b).setChoiceBytes(byteString);
            return this;
        }

        /* renamed from: U */
        public C13135b mo31014U(String str) {
            mo100457F();
            ((UserConsent) this.f83053b).setKey(str);
            return this;
        }

        /* renamed from: V */
        public C13135b mo31015V(ByteString byteString) {
            mo100457F();
            ((UserConsent) this.f83053b).setKeyBytes(byteString);
            return this;
        }

        public String getChoice() {
            return ((UserConsent) this.f83053b).getChoice();
        }

        public ByteString getChoiceBytes() {
            return ((UserConsent) this.f83053b).getChoiceBytes();
        }

        public String getKey() {
            return ((UserConsent) this.f83053b).getKey();
        }

        public ByteString getKeyBytes() {
            return ((UserConsent) this.f83053b).getKeyBytes();
        }

        public C13135b() {
            super(UserConsent.DEFAULT_INSTANCE);
        }
    }

    static {
        UserConsent userConsent = new UserConsent();
        DEFAULT_INSTANCE = userConsent;
        GeneratedMessageLite.registerDefaultInstance(UserConsent.class, userConsent);
    }

    private UserConsent() {
    }

    /* access modifiers changed from: private */
    public void clearChoice() {
        this.choice_ = getDefaultInstance().getChoice();
    }

    /* access modifiers changed from: private */
    public void clearKey() {
        this.key_ = getDefaultInstance().getKey();
    }

    public static UserConsent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C13135b newBuilder() {
        return (C13135b) DEFAULT_INSTANCE.createBuilder();
    }

    public static UserConsent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UserConsent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserConsent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UserConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<UserConsent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setChoice(String str) {
        str.getClass();
        this.choice_ = str;
    }

    /* access modifiers changed from: private */
    public void setChoiceBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.choice_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setKey(String str) {
        str.getClass();
        this.key_ = str;
    }

    /* access modifiers changed from: private */
    public void setKeyBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.key_ = byteString.mo99228S0();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C13134a.f32256a[methodToInvoke.ordinal()]) {
            case 1:
                return new UserConsent();
            case 2:
                return new C13135b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"key_", "choice_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<UserConsent> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (UserConsent.class) {
                        y1Var = PARSER;
                        if (y1Var == null) {
                            y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                            PARSER = y1Var;
                        }
                    }
                }
                return y1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String getChoice() {
        return this.choice_;
    }

    public ByteString getChoiceBytes() {
        return ByteString.m137260e0(this.choice_);
    }

    public String getKey() {
        return this.key_;
    }

    public ByteString getKeyBytes() {
        return ByteString.m137260e0(this.key_);
    }

    public static C13135b newBuilder(UserConsent userConsent) {
        return (C13135b) DEFAULT_INSTANCE.createBuilder(userConsent);
    }

    public static UserConsent parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (UserConsent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static UserConsent parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (UserConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static UserConsent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UserConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UserConsent parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (UserConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static UserConsent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UserConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UserConsent parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (UserConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static UserConsent parseFrom(InputStream inputStream) throws IOException {
        return (UserConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserConsent parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (UserConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static UserConsent parseFrom(C34448s sVar) throws IOException {
        return (UserConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static UserConsent parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (UserConsent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
