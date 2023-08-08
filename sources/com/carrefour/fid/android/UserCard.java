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

public final class UserCard extends GeneratedMessageLite<UserCard, C13133b> implements C14076v0 {
    public static final int CATEGORY_FIELD_NUMBER = 3;
    public static final int DATE_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final UserCard DEFAULT_INSTANCE;
    public static final int ISSECURED_FIELD_NUMBER = 4;
    public static final int KEY_FIELD_NUMBER = 5;
    public static final int NUM_FIELD_NUMBER = 2;
    private static volatile C34504y1<UserCard> PARSER;
    private String category_ = "";
    private String date_ = "";
    private boolean isSecured_;
    private int key_;
    private String num_ = "";

    /* renamed from: com.carrefour.fid.android.UserCard$a */
    public static /* synthetic */ class C13132a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32255a;

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
                f32255a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32255a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32255a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32255a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f32255a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f32255a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f32255a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.UserCard.C13132a.<clinit>():void");
        }
    }

    /* renamed from: com.carrefour.fid.android.UserCard$b */
    public static final class C13133b extends GeneratedMessageLite.C34263b<UserCard, C13133b> implements C14076v0 {
        /* renamed from: P */
        public C13133b mo30993P() {
            mo100457F();
            ((UserCard) this.f83053b).clearCategory();
            return this;
        }

        /* renamed from: R */
        public C13133b mo30994R() {
            mo100457F();
            ((UserCard) this.f83053b).clearDate();
            return this;
        }

        /* renamed from: S */
        public C13133b mo30995S() {
            mo100457F();
            ((UserCard) this.f83053b).clearIsSecured();
            return this;
        }

        /* renamed from: T */
        public C13133b mo30996T() {
            mo100457F();
            ((UserCard) this.f83053b).clearKey();
            return this;
        }

        /* renamed from: U */
        public C13133b mo30997U() {
            mo100457F();
            ((UserCard) this.f83053b).clearNum();
            return this;
        }

        /* renamed from: V */
        public C13133b mo30998V(String str) {
            mo100457F();
            ((UserCard) this.f83053b).setCategory(str);
            return this;
        }

        /* renamed from: Y */
        public C13133b mo30999Y(ByteString byteString) {
            mo100457F();
            ((UserCard) this.f83053b).setCategoryBytes(byteString);
            return this;
        }

        /* renamed from: Z */
        public C13133b mo31000Z(String str) {
            mo100457F();
            ((UserCard) this.f83053b).setDate(str);
            return this;
        }

        /* renamed from: a0 */
        public C13133b mo31001a0(ByteString byteString) {
            mo100457F();
            ((UserCard) this.f83053b).setDateBytes(byteString);
            return this;
        }

        /* renamed from: b0 */
        public C13133b mo31002b0(boolean z) {
            mo100457F();
            ((UserCard) this.f83053b).setIsSecured(z);
            return this;
        }

        /* renamed from: c0 */
        public C13133b mo31003c0(int i) {
            mo100457F();
            ((UserCard) this.f83053b).setKey(i);
            return this;
        }

        /* renamed from: d0 */
        public C13133b mo31004d0(String str) {
            mo100457F();
            ((UserCard) this.f83053b).setNum(str);
            return this;
        }

        /* renamed from: g0 */
        public C13133b mo31005g0(ByteString byteString) {
            mo100457F();
            ((UserCard) this.f83053b).setNumBytes(byteString);
            return this;
        }

        public String getCategory() {
            return ((UserCard) this.f83053b).getCategory();
        }

        public ByteString getCategoryBytes() {
            return ((UserCard) this.f83053b).getCategoryBytes();
        }

        public String getDate() {
            return ((UserCard) this.f83053b).getDate();
        }

        public ByteString getDateBytes() {
            return ((UserCard) this.f83053b).getDateBytes();
        }

        public boolean getIsSecured() {
            return ((UserCard) this.f83053b).getIsSecured();
        }

        public int getKey() {
            return ((UserCard) this.f83053b).getKey();
        }

        public String getNum() {
            return ((UserCard) this.f83053b).getNum();
        }

        public ByteString getNumBytes() {
            return ((UserCard) this.f83053b).getNumBytes();
        }

        public C13133b() {
            super(UserCard.DEFAULT_INSTANCE);
        }
    }

    static {
        UserCard userCard = new UserCard();
        DEFAULT_INSTANCE = userCard;
        GeneratedMessageLite.registerDefaultInstance(UserCard.class, userCard);
    }

    private UserCard() {
    }

    /* access modifiers changed from: private */
    public void clearCategory() {
        this.category_ = getDefaultInstance().getCategory();
    }

    /* access modifiers changed from: private */
    public void clearDate() {
        this.date_ = getDefaultInstance().getDate();
    }

    /* access modifiers changed from: private */
    public void clearIsSecured() {
        this.isSecured_ = false;
    }

    /* access modifiers changed from: private */
    public void clearKey() {
        this.key_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearNum() {
        this.num_ = getDefaultInstance().getNum();
    }

    public static UserCard getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C13133b newBuilder() {
        return (C13133b) DEFAULT_INSTANCE.createBuilder();
    }

    public static UserCard parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UserCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserCard parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UserCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<UserCard> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setCategory(String str) {
        str.getClass();
        this.category_ = str;
    }

    /* access modifiers changed from: private */
    public void setCategoryBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.category_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setDate(String str) {
        str.getClass();
        this.date_ = str;
    }

    /* access modifiers changed from: private */
    public void setDateBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.date_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setIsSecured(boolean z) {
        this.isSecured_ = z;
    }

    /* access modifiers changed from: private */
    public void setKey(int i) {
        this.key_ = i;
    }

    /* access modifiers changed from: private */
    public void setNum(String str) {
        str.getClass();
        this.num_ = str;
    }

    /* access modifiers changed from: private */
    public void setNumBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.num_ = byteString.mo99228S0();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C13132a.f32255a[methodToInvoke.ordinal()]) {
            case 1:
                return new UserCard();
            case 2:
                return new C13133b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0007\u0005\u0004", new Object[]{"date_", "num_", "category_", "isSecured_", "key_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<UserCard> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (UserCard.class) {
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

    public String getCategory() {
        return this.category_;
    }

    public ByteString getCategoryBytes() {
        return ByteString.m137260e0(this.category_);
    }

    public String getDate() {
        return this.date_;
    }

    public ByteString getDateBytes() {
        return ByteString.m137260e0(this.date_);
    }

    public boolean getIsSecured() {
        return this.isSecured_;
    }

    public int getKey() {
        return this.key_;
    }

    public String getNum() {
        return this.num_;
    }

    public ByteString getNumBytes() {
        return ByteString.m137260e0(this.num_);
    }

    public static C13133b newBuilder(UserCard userCard) {
        return (C13133b) DEFAULT_INSTANCE.createBuilder(userCard);
    }

    public static UserCard parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (UserCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static UserCard parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (UserCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static UserCard parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UserCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UserCard parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (UserCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static UserCard parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UserCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UserCard parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (UserCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static UserCard parseFrom(InputStream inputStream) throws IOException {
        return (UserCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserCard parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (UserCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static UserCard parseFrom(C34448s sVar) throws IOException {
        return (UserCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static UserCard parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (UserCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
