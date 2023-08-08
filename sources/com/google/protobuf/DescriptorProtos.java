package com.google.protobuf;

import com.google.protobuf.C34471v0;
import com.google.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class DescriptorProtos {

    public static final class DescriptorProto extends GeneratedMessageLite<DescriptorProto, C34175a> implements C34219b {
        /* access modifiers changed from: private */
        public static final DescriptorProto DEFAULT_INSTANCE;
        public static final int ENUM_TYPE_FIELD_NUMBER = 4;
        public static final int EXTENSION_FIELD_NUMBER = 6;
        public static final int EXTENSION_RANGE_FIELD_NUMBER = 5;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NESTED_TYPE_FIELD_NUMBER = 3;
        public static final int ONEOF_DECL_FIELD_NUMBER = 8;
        public static final int OPTIONS_FIELD_NUMBER = 7;
        private static volatile C34504y1<DescriptorProto> PARSER = null;
        public static final int RESERVED_NAME_FIELD_NUMBER = 10;
        public static final int RESERVED_RANGE_FIELD_NUMBER = 9;
        private int bitField0_;
        private C34471v0.C34488k<EnumDescriptorProto> enumType_ = GeneratedMessageLite.emptyProtobufList();
        private C34471v0.C34488k<ExtensionRange> extensionRange_ = GeneratedMessageLite.emptyProtobufList();
        private C34471v0.C34488k<FieldDescriptorProto> extension_ = GeneratedMessageLite.emptyProtobufList();
        private C34471v0.C34488k<FieldDescriptorProto> field_ = GeneratedMessageLite.emptyProtobufList();
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private C34471v0.C34488k<DescriptorProto> nestedType_ = GeneratedMessageLite.emptyProtobufList();
        private C34471v0.C34488k<OneofDescriptorProto> oneofDecl_ = GeneratedMessageLite.emptyProtobufList();
        private MessageOptions options_;
        private C34471v0.C34488k<String> reservedName_ = GeneratedMessageLite.emptyProtobufList();
        private C34471v0.C34488k<ReservedRange> reservedRange_ = GeneratedMessageLite.emptyProtobufList();

        public static final class ExtensionRange extends GeneratedMessageLite<ExtensionRange, C34173a> implements C34176b {
            /* access modifiers changed from: private */
            public static final ExtensionRange DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 2;
            public static final int OPTIONS_FIELD_NUMBER = 3;
            private static volatile C34504y1<ExtensionRange> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private byte memoizedIsInitialized = 2;
            private ExtensionRangeOptions options_;
            private int start_;

            /* renamed from: com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRange$a */
            public static final class C34173a extends GeneratedMessageLite.C34263b<ExtensionRange, C34173a> implements C34176b {
                public /* synthetic */ C34173a(C34218a aVar) {
                    this();
                }

                /* renamed from: P */
                public C34173a mo99417P() {
                    mo100457F();
                    ((ExtensionRange) this.f83053b).clearEnd();
                    return this;
                }

                /* renamed from: R */
                public C34173a mo99418R() {
                    mo100457F();
                    ((ExtensionRange) this.f83053b).clearOptions();
                    return this;
                }

                /* renamed from: S */
                public C34173a mo99419S() {
                    mo100457F();
                    ((ExtensionRange) this.f83053b).clearStart();
                    return this;
                }

                /* renamed from: T */
                public C34173a mo99420T(ExtensionRangeOptions extensionRangeOptions) {
                    mo100457F();
                    ((ExtensionRange) this.f83053b).mergeOptions(extensionRangeOptions);
                    return this;
                }

                /* renamed from: U */
                public C34173a mo99421U(int i) {
                    mo100457F();
                    ((ExtensionRange) this.f83053b).setEnd(i);
                    return this;
                }

                /* renamed from: V */
                public C34173a mo99422V(ExtensionRangeOptions.C34184a aVar) {
                    mo100457F();
                    ((ExtensionRange) this.f83053b).setOptions((ExtensionRangeOptions) aVar.mo100473g());
                    return this;
                }

                /* renamed from: Y */
                public C34173a mo99423Y(ExtensionRangeOptions extensionRangeOptions) {
                    mo100457F();
                    ((ExtensionRange) this.f83053b).setOptions(extensionRangeOptions);
                    return this;
                }

                /* renamed from: Z */
                public C34173a mo99424Z(int i) {
                    mo100457F();
                    ((ExtensionRange) this.f83053b).setStart(i);
                    return this;
                }

                public int getEnd() {
                    return ((ExtensionRange) this.f83053b).getEnd();
                }

                public ExtensionRangeOptions getOptions() {
                    return ((ExtensionRange) this.f83053b).getOptions();
                }

                public int getStart() {
                    return ((ExtensionRange) this.f83053b).getStart();
                }

                public boolean hasEnd() {
                    return ((ExtensionRange) this.f83053b).hasEnd();
                }

                public boolean hasOptions() {
                    return ((ExtensionRange) this.f83053b).hasOptions();
                }

                public boolean hasStart() {
                    return ((ExtensionRange) this.f83053b).hasStart();
                }

                public C34173a() {
                    super(ExtensionRange.DEFAULT_INSTANCE);
                }
            }

            static {
                ExtensionRange extensionRange = new ExtensionRange();
                DEFAULT_INSTANCE = extensionRange;
                GeneratedMessageLite.registerDefaultInstance(ExtensionRange.class, extensionRange);
            }

            private ExtensionRange() {
            }

            /* access modifiers changed from: private */
            public void clearEnd() {
                this.bitField0_ &= -3;
                this.end_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearOptions() {
                this.options_ = null;
                this.bitField0_ &= -5;
            }

            /* access modifiers changed from: private */
            public void clearStart() {
                this.bitField0_ &= -2;
                this.start_ = 0;
            }

            public static ExtensionRange getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* access modifiers changed from: private */
            public void mergeOptions(ExtensionRangeOptions extensionRangeOptions) {
                extensionRangeOptions.getClass();
                ExtensionRangeOptions extensionRangeOptions2 = this.options_;
                if (extensionRangeOptions2 == null || extensionRangeOptions2 == ExtensionRangeOptions.getDefaultInstance()) {
                    this.options_ = extensionRangeOptions;
                } else {
                    this.options_ = (ExtensionRangeOptions) ((ExtensionRangeOptions.C34184a) ExtensionRangeOptions.newBuilder(this.options_).mo100463K(extensionRangeOptions)).mo100467Q();
                }
                this.bitField0_ |= 4;
            }

            public static C34173a newBuilder() {
                return (C34173a) DEFAULT_INSTANCE.createBuilder();
            }

            public static ExtensionRange parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (ExtensionRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ExtensionRange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static C34504y1<ExtensionRange> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setEnd(int i) {
                this.bitField0_ |= 2;
                this.end_ = i;
            }

            /* access modifiers changed from: private */
            public void setOptions(ExtensionRangeOptions extensionRangeOptions) {
                extensionRangeOptions.getClass();
                this.options_ = extensionRangeOptions;
                this.bitField0_ |= 4;
            }

            /* access modifiers changed from: private */
            public void setStart(int i) {
                this.bitField0_ |= 1;
                this.start_ = i;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                int i = 1;
                switch (C34218a.f82914a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ExtensionRange();
                    case 2:
                        return new C34173a((C34218a) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "start_", "end_", "options_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        C34504y1<ExtensionRange> y1Var = PARSER;
                        if (y1Var == null) {
                            synchronized (ExtensionRange.class) {
                                y1Var = PARSER;
                                if (y1Var == null) {
                                    y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                                    PARSER = y1Var;
                                }
                            }
                        }
                        return y1Var;
                    case 6:
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        if (obj == null) {
                            i = 0;
                        }
                        this.memoizedIsInitialized = (byte) i;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public int getEnd() {
                return this.end_;
            }

            public ExtensionRangeOptions getOptions() {
                ExtensionRangeOptions extensionRangeOptions = this.options_;
                return extensionRangeOptions == null ? ExtensionRangeOptions.getDefaultInstance() : extensionRangeOptions;
            }

            public int getStart() {
                return this.start_;
            }

            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasOptions() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C34173a newBuilder(ExtensionRange extensionRange) {
                return (C34173a) DEFAULT_INSTANCE.createBuilder(extensionRange);
            }

            public static ExtensionRange parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
                return (ExtensionRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
            }

            public static ExtensionRange parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
            }

            public static ExtensionRange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ExtensionRange parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
            }

            public static ExtensionRange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ExtensionRange parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
            }

            public static ExtensionRange parseFrom(InputStream inputStream) throws IOException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ExtensionRange parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
            }

            public static ExtensionRange parseFrom(C34448s sVar) throws IOException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
            }

            public static ExtensionRange parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
            }
        }

        public static final class ReservedRange extends GeneratedMessageLite<ReservedRange, C34174a> implements C34177c {
            /* access modifiers changed from: private */
            public static final ReservedRange DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 2;
            private static volatile C34504y1<ReservedRange> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private int start_;

            /* renamed from: com.google.protobuf.DescriptorProtos$DescriptorProto$ReservedRange$a */
            public static final class C34174a extends GeneratedMessageLite.C34263b<ReservedRange, C34174a> implements C34177c {
                public /* synthetic */ C34174a(C34218a aVar) {
                    this();
                }

                /* renamed from: P */
                public C34174a mo99429P() {
                    mo100457F();
                    ((ReservedRange) this.f83053b).clearEnd();
                    return this;
                }

                /* renamed from: R */
                public C34174a mo99430R() {
                    mo100457F();
                    ((ReservedRange) this.f83053b).clearStart();
                    return this;
                }

                /* renamed from: S */
                public C34174a mo99431S(int i) {
                    mo100457F();
                    ((ReservedRange) this.f83053b).setEnd(i);
                    return this;
                }

                /* renamed from: T */
                public C34174a mo99432T(int i) {
                    mo100457F();
                    ((ReservedRange) this.f83053b).setStart(i);
                    return this;
                }

                public int getEnd() {
                    return ((ReservedRange) this.f83053b).getEnd();
                }

                public int getStart() {
                    return ((ReservedRange) this.f83053b).getStart();
                }

                public boolean hasEnd() {
                    return ((ReservedRange) this.f83053b).hasEnd();
                }

                public boolean hasStart() {
                    return ((ReservedRange) this.f83053b).hasStart();
                }

                public C34174a() {
                    super(ReservedRange.DEFAULT_INSTANCE);
                }
            }

            static {
                ReservedRange reservedRange = new ReservedRange();
                DEFAULT_INSTANCE = reservedRange;
                GeneratedMessageLite.registerDefaultInstance(ReservedRange.class, reservedRange);
            }

            private ReservedRange() {
            }

            /* access modifiers changed from: private */
            public void clearEnd() {
                this.bitField0_ &= -3;
                this.end_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearStart() {
                this.bitField0_ &= -2;
                this.start_ = 0;
            }

            public static ReservedRange getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C34174a newBuilder() {
                return (C34174a) DEFAULT_INSTANCE.createBuilder();
            }

            public static ReservedRange parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (ReservedRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ReservedRange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static C34504y1<ReservedRange> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setEnd(int i) {
                this.bitField0_ |= 2;
                this.end_ = i;
            }

            /* access modifiers changed from: private */
            public void setStart(int i) {
                this.bitField0_ |= 1;
                this.start_ = i;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C34218a.f82914a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ReservedRange();
                    case 2:
                        return new C34174a((C34218a) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        C34504y1<ReservedRange> y1Var = PARSER;
                        if (y1Var == null) {
                            synchronized (ReservedRange.class) {
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

            public int getEnd() {
                return this.end_;
            }

            public int getStart() {
                return this.start_;
            }

            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C34174a newBuilder(ReservedRange reservedRange) {
                return (C34174a) DEFAULT_INSTANCE.createBuilder(reservedRange);
            }

            public static ReservedRange parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
                return (ReservedRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
            }

            public static ReservedRange parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
            }

            public static ReservedRange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ReservedRange parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
            }

            public static ReservedRange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ReservedRange parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
            }

            public static ReservedRange parseFrom(InputStream inputStream) throws IOException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ReservedRange parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
            }

            public static ReservedRange parseFrom(C34448s sVar) throws IOException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
            }

            public static ReservedRange parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
            }
        }

        /* renamed from: com.google.protobuf.DescriptorProtos$DescriptorProto$a */
        public static final class C34175a extends GeneratedMessageLite.C34263b<DescriptorProto, C34175a> implements C34219b {
            public /* synthetic */ C34175a(C34218a aVar) {
                this();
            }

            /* renamed from: B0 */
            public C34175a mo99433B0(int i, OneofDescriptorProto oneofDescriptorProto) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addOneofDecl(i, oneofDescriptorProto);
                return this;
            }

            /* renamed from: D0 */
            public C34175a mo99434D0(OneofDescriptorProto.C34208a aVar) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addOneofDecl((OneofDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: E0 */
            public C34175a mo99435E0(OneofDescriptorProto oneofDescriptorProto) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addOneofDecl(oneofDescriptorProto);
                return this;
            }

            /* renamed from: F0 */
            public C34175a mo99436F0(String str) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addReservedName(str);
                return this;
            }

            /* renamed from: G0 */
            public C34175a mo99437G0(ByteString byteString) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addReservedNameBytes(byteString);
                return this;
            }

            /* renamed from: H0 */
            public C34175a mo99438H0(int i, ReservedRange.C34174a aVar) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addReservedRange(i, (ReservedRange) aVar.mo100473g());
                return this;
            }

            /* renamed from: I0 */
            public C34175a mo99439I0(int i, ReservedRange reservedRange) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addReservedRange(i, reservedRange);
                return this;
            }

            /* renamed from: J0 */
            public C34175a mo99440J0(ReservedRange.C34174a aVar) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addReservedRange((ReservedRange) aVar.mo100473g());
                return this;
            }

            /* renamed from: L0 */
            public C34175a mo99441L0(ReservedRange reservedRange) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addReservedRange(reservedRange);
                return this;
            }

            /* renamed from: M0 */
            public C34175a mo99442M0() {
                mo100457F();
                ((DescriptorProto) this.f83053b).clearEnumType();
                return this;
            }

            /* renamed from: O0 */
            public C34175a mo99443O0() {
                mo100457F();
                ((DescriptorProto) this.f83053b).clearExtension();
                return this;
            }

            /* renamed from: P */
            public C34175a mo99444P(Iterable<? extends EnumDescriptorProto> iterable) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addAllEnumType(iterable);
                return this;
            }

            /* renamed from: P0 */
            public C34175a mo99445P0() {
                mo100457F();
                ((DescriptorProto) this.f83053b).clearExtensionRange();
                return this;
            }

            /* renamed from: Q0 */
            public C34175a mo99446Q0() {
                mo100457F();
                ((DescriptorProto) this.f83053b).clearField();
                return this;
            }

            /* renamed from: R */
            public C34175a mo99447R(Iterable<? extends FieldDescriptorProto> iterable) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addAllExtension(iterable);
                return this;
            }

            /* renamed from: R0 */
            public C34175a mo99448R0() {
                mo100457F();
                ((DescriptorProto) this.f83053b).clearName();
                return this;
            }

            /* renamed from: S */
            public C34175a mo99449S(Iterable<? extends ExtensionRange> iterable) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addAllExtensionRange(iterable);
                return this;
            }

            /* renamed from: S0 */
            public C34175a mo99450S0() {
                mo100457F();
                ((DescriptorProto) this.f83053b).clearNestedType();
                return this;
            }

            /* renamed from: T */
            public C34175a mo99451T(Iterable<? extends FieldDescriptorProto> iterable) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addAllField(iterable);
                return this;
            }

            /* renamed from: T0 */
            public C34175a mo99452T0() {
                mo100457F();
                ((DescriptorProto) this.f83053b).clearOneofDecl();
                return this;
            }

            /* renamed from: U */
            public C34175a mo99453U(Iterable<? extends DescriptorProto> iterable) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addAllNestedType(iterable);
                return this;
            }

            /* renamed from: U0 */
            public C34175a mo99454U0() {
                mo100457F();
                ((DescriptorProto) this.f83053b).clearOptions();
                return this;
            }

            /* renamed from: V */
            public C34175a mo99455V(Iterable<? extends OneofDescriptorProto> iterable) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addAllOneofDecl(iterable);
                return this;
            }

            /* renamed from: V0 */
            public C34175a mo99456V0() {
                mo100457F();
                ((DescriptorProto) this.f83053b).clearReservedName();
                return this;
            }

            /* renamed from: W0 */
            public C34175a mo99457W0() {
                mo100457F();
                ((DescriptorProto) this.f83053b).clearReservedRange();
                return this;
            }

            /* renamed from: X0 */
            public C34175a mo99458X0(MessageOptions messageOptions) {
                mo100457F();
                ((DescriptorProto) this.f83053b).mergeOptions(messageOptions);
                return this;
            }

            /* renamed from: Y */
            public C34175a mo99459Y(Iterable<String> iterable) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addAllReservedName(iterable);
                return this;
            }

            /* renamed from: Y0 */
            public C34175a mo99460Y0(int i) {
                mo100457F();
                ((DescriptorProto) this.f83053b).removeEnumType(i);
                return this;
            }

            /* renamed from: Z */
            public C34175a mo99461Z(Iterable<? extends ReservedRange> iterable) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addAllReservedRange(iterable);
                return this;
            }

            /* renamed from: Z0 */
            public C34175a mo99462Z0(int i) {
                mo100457F();
                ((DescriptorProto) this.f83053b).removeExtension(i);
                return this;
            }

            /* renamed from: a0 */
            public C34175a mo99463a0(int i, EnumDescriptorProto.C34179a aVar) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addEnumType(i, (EnumDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: a1 */
            public C34175a mo99464a1(int i) {
                mo100457F();
                ((DescriptorProto) this.f83053b).removeExtensionRange(i);
                return this;
            }

            /* renamed from: b0 */
            public C34175a mo99465b0(int i, EnumDescriptorProto enumDescriptorProto) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addEnumType(i, enumDescriptorProto);
                return this;
            }

            /* renamed from: b1 */
            public C34175a mo99466b1(int i) {
                mo100457F();
                ((DescriptorProto) this.f83053b).removeField(i);
                return this;
            }

            /* renamed from: c0 */
            public C34175a mo99467c0(EnumDescriptorProto.C34179a aVar) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addEnumType((EnumDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: c1 */
            public C34175a mo99468c1(int i) {
                mo100457F();
                ((DescriptorProto) this.f83053b).removeNestedType(i);
                return this;
            }

            /* renamed from: d0 */
            public C34175a mo99469d0(EnumDescriptorProto enumDescriptorProto) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addEnumType(enumDescriptorProto);
                return this;
            }

            /* renamed from: d1 */
            public C34175a mo99470d1(int i) {
                mo100457F();
                ((DescriptorProto) this.f83053b).removeOneofDecl(i);
                return this;
            }

            /* renamed from: e1 */
            public C34175a mo99471e1(int i) {
                mo100457F();
                ((DescriptorProto) this.f83053b).removeReservedRange(i);
                return this;
            }

            /* renamed from: f1 */
            public C34175a mo99472f1(int i, EnumDescriptorProto.C34179a aVar) {
                mo100457F();
                ((DescriptorProto) this.f83053b).setEnumType(i, (EnumDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: g0 */
            public C34175a mo99473g0(int i, FieldDescriptorProto.C34189a aVar) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addExtension(i, (FieldDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: g1 */
            public C34175a mo99474g1(int i, EnumDescriptorProto enumDescriptorProto) {
                mo100457F();
                ((DescriptorProto) this.f83053b).setEnumType(i, enumDescriptorProto);
                return this;
            }

            public EnumDescriptorProto getEnumType(int i) {
                return ((DescriptorProto) this.f83053b).getEnumType(i);
            }

            public int getEnumTypeCount() {
                return ((DescriptorProto) this.f83053b).getEnumTypeCount();
            }

            public List<EnumDescriptorProto> getEnumTypeList() {
                return Collections.unmodifiableList(((DescriptorProto) this.f83053b).getEnumTypeList());
            }

            public FieldDescriptorProto getExtension(int i) {
                return ((DescriptorProto) this.f83053b).getExtension(i);
            }

            public int getExtensionCount() {
                return ((DescriptorProto) this.f83053b).getExtensionCount();
            }

            public List<FieldDescriptorProto> getExtensionList() {
                return Collections.unmodifiableList(((DescriptorProto) this.f83053b).getExtensionList());
            }

            public ExtensionRange getExtensionRange(int i) {
                return ((DescriptorProto) this.f83053b).getExtensionRange(i);
            }

            public int getExtensionRangeCount() {
                return ((DescriptorProto) this.f83053b).getExtensionRangeCount();
            }

            public List<ExtensionRange> getExtensionRangeList() {
                return Collections.unmodifiableList(((DescriptorProto) this.f83053b).getExtensionRangeList());
            }

            public FieldDescriptorProto getField(int i) {
                return ((DescriptorProto) this.f83053b).getField(i);
            }

            public int getFieldCount() {
                return ((DescriptorProto) this.f83053b).getFieldCount();
            }

            public List<FieldDescriptorProto> getFieldList() {
                return Collections.unmodifiableList(((DescriptorProto) this.f83053b).getFieldList());
            }

            public String getName() {
                return ((DescriptorProto) this.f83053b).getName();
            }

            public ByteString getNameBytes() {
                return ((DescriptorProto) this.f83053b).getNameBytes();
            }

            public DescriptorProto getNestedType(int i) {
                return ((DescriptorProto) this.f83053b).getNestedType(i);
            }

            public int getNestedTypeCount() {
                return ((DescriptorProto) this.f83053b).getNestedTypeCount();
            }

            public List<DescriptorProto> getNestedTypeList() {
                return Collections.unmodifiableList(((DescriptorProto) this.f83053b).getNestedTypeList());
            }

            public OneofDescriptorProto getOneofDecl(int i) {
                return ((DescriptorProto) this.f83053b).getOneofDecl(i);
            }

            public int getOneofDeclCount() {
                return ((DescriptorProto) this.f83053b).getOneofDeclCount();
            }

            public List<OneofDescriptorProto> getOneofDeclList() {
                return Collections.unmodifiableList(((DescriptorProto) this.f83053b).getOneofDeclList());
            }

            public MessageOptions getOptions() {
                return ((DescriptorProto) this.f83053b).getOptions();
            }

            public String getReservedName(int i) {
                return ((DescriptorProto) this.f83053b).getReservedName(i);
            }

            public ByteString getReservedNameBytes(int i) {
                return ((DescriptorProto) this.f83053b).getReservedNameBytes(i);
            }

            public int getReservedNameCount() {
                return ((DescriptorProto) this.f83053b).getReservedNameCount();
            }

            public List<String> getReservedNameList() {
                return Collections.unmodifiableList(((DescriptorProto) this.f83053b).getReservedNameList());
            }

            public ReservedRange getReservedRange(int i) {
                return ((DescriptorProto) this.f83053b).getReservedRange(i);
            }

            public int getReservedRangeCount() {
                return ((DescriptorProto) this.f83053b).getReservedRangeCount();
            }

            public List<ReservedRange> getReservedRangeList() {
                return Collections.unmodifiableList(((DescriptorProto) this.f83053b).getReservedRangeList());
            }

            /* renamed from: h0 */
            public C34175a mo99475h0(int i, FieldDescriptorProto fieldDescriptorProto) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addExtension(i, fieldDescriptorProto);
                return this;
            }

            /* renamed from: h1 */
            public C34175a mo99476h1(int i, FieldDescriptorProto.C34189a aVar) {
                mo100457F();
                ((DescriptorProto) this.f83053b).setExtension(i, (FieldDescriptorProto) aVar.mo100473g());
                return this;
            }

            public boolean hasName() {
                return ((DescriptorProto) this.f83053b).hasName();
            }

            public boolean hasOptions() {
                return ((DescriptorProto) this.f83053b).hasOptions();
            }

            /* renamed from: i0 */
            public C34175a mo99477i0(FieldDescriptorProto.C34189a aVar) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addExtension((FieldDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: i1 */
            public C34175a mo99478i1(int i, FieldDescriptorProto fieldDescriptorProto) {
                mo100457F();
                ((DescriptorProto) this.f83053b).setExtension(i, fieldDescriptorProto);
                return this;
            }

            /* renamed from: j0 */
            public C34175a mo99479j0(FieldDescriptorProto fieldDescriptorProto) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addExtension(fieldDescriptorProto);
                return this;
            }

            /* renamed from: k0 */
            public C34175a mo99480k0(int i, ExtensionRange.C34173a aVar) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addExtensionRange(i, (ExtensionRange) aVar.mo100473g());
                return this;
            }

            /* renamed from: l0 */
            public C34175a mo99481l0(int i, ExtensionRange extensionRange) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addExtensionRange(i, extensionRange);
                return this;
            }

            /* renamed from: l1 */
            public C34175a mo99482l1(int i, ExtensionRange.C34173a aVar) {
                mo100457F();
                ((DescriptorProto) this.f83053b).setExtensionRange(i, (ExtensionRange) aVar.mo100473g());
                return this;
            }

            /* renamed from: m0 */
            public C34175a mo99483m0(ExtensionRange.C34173a aVar) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addExtensionRange((ExtensionRange) aVar.mo100473g());
                return this;
            }

            /* renamed from: m1 */
            public C34175a mo99484m1(int i, ExtensionRange extensionRange) {
                mo100457F();
                ((DescriptorProto) this.f83053b).setExtensionRange(i, extensionRange);
                return this;
            }

            /* renamed from: n1 */
            public C34175a mo99485n1(int i, FieldDescriptorProto.C34189a aVar) {
                mo100457F();
                ((DescriptorProto) this.f83053b).setField(i, (FieldDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: o0 */
            public C34175a mo99486o0(ExtensionRange extensionRange) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addExtensionRange(extensionRange);
                return this;
            }

            /* renamed from: o1 */
            public C34175a mo99487o1(int i, FieldDescriptorProto fieldDescriptorProto) {
                mo100457F();
                ((DescriptorProto) this.f83053b).setField(i, fieldDescriptorProto);
                return this;
            }

            /* renamed from: p1 */
            public C34175a mo99488p1(String str) {
                mo100457F();
                ((DescriptorProto) this.f83053b).setName(str);
                return this;
            }

            /* renamed from: q0 */
            public C34175a mo99489q0(int i, FieldDescriptorProto.C34189a aVar) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addField(i, (FieldDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: q1 */
            public C34175a mo99490q1(ByteString byteString) {
                mo100457F();
                ((DescriptorProto) this.f83053b).setNameBytes(byteString);
                return this;
            }

            /* renamed from: r0 */
            public C34175a mo99491r0(int i, FieldDescriptorProto fieldDescriptorProto) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addField(i, fieldDescriptorProto);
                return this;
            }

            /* renamed from: r1 */
            public C34175a mo99492r1(int i, C34175a aVar) {
                mo100457F();
                ((DescriptorProto) this.f83053b).setNestedType(i, (DescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: s0 */
            public C34175a mo99493s0(FieldDescriptorProto.C34189a aVar) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addField((FieldDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: s1 */
            public C34175a mo99494s1(int i, DescriptorProto descriptorProto) {
                mo100457F();
                ((DescriptorProto) this.f83053b).setNestedType(i, descriptorProto);
                return this;
            }

            /* renamed from: t1 */
            public C34175a mo99495t1(int i, OneofDescriptorProto.C34208a aVar) {
                mo100457F();
                ((DescriptorProto) this.f83053b).setOneofDecl(i, (OneofDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: u0 */
            public C34175a mo99496u0(FieldDescriptorProto fieldDescriptorProto) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addField(fieldDescriptorProto);
                return this;
            }

            /* renamed from: u1 */
            public C34175a mo99497u1(int i, OneofDescriptorProto oneofDescriptorProto) {
                mo100457F();
                ((DescriptorProto) this.f83053b).setOneofDecl(i, oneofDescriptorProto);
                return this;
            }

            /* renamed from: v0 */
            public C34175a mo99498v0(int i, C34175a aVar) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addNestedType(i, (DescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: v1 */
            public C34175a mo99499v1(MessageOptions.C34203a aVar) {
                mo100457F();
                ((DescriptorProto) this.f83053b).setOptions((MessageOptions) aVar.mo100473g());
                return this;
            }

            /* renamed from: w0 */
            public C34175a mo99500w0(int i, DescriptorProto descriptorProto) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addNestedType(i, descriptorProto);
                return this;
            }

            /* renamed from: w1 */
            public C34175a mo99501w1(MessageOptions messageOptions) {
                mo100457F();
                ((DescriptorProto) this.f83053b).setOptions(messageOptions);
                return this;
            }

            /* renamed from: x0 */
            public C34175a mo99502x0(C34175a aVar) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addNestedType((DescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: x1 */
            public C34175a mo99503x1(int i, String str) {
                mo100457F();
                ((DescriptorProto) this.f83053b).setReservedName(i, str);
                return this;
            }

            /* renamed from: y0 */
            public C34175a mo99504y0(DescriptorProto descriptorProto) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addNestedType(descriptorProto);
                return this;
            }

            /* renamed from: y1 */
            public C34175a mo99505y1(int i, ReservedRange.C34174a aVar) {
                mo100457F();
                ((DescriptorProto) this.f83053b).setReservedRange(i, (ReservedRange) aVar.mo100473g());
                return this;
            }

            /* renamed from: z0 */
            public C34175a mo99506z0(int i, OneofDescriptorProto.C34208a aVar) {
                mo100457F();
                ((DescriptorProto) this.f83053b).addOneofDecl(i, (OneofDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: z1 */
            public C34175a mo99507z1(int i, ReservedRange reservedRange) {
                mo100457F();
                ((DescriptorProto) this.f83053b).setReservedRange(i, reservedRange);
                return this;
            }

            public C34175a() {
                super(DescriptorProto.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.google.protobuf.DescriptorProtos$DescriptorProto$b */
        public interface C34176b extends C34417m1 {
            int getEnd();

            ExtensionRangeOptions getOptions();

            int getStart();

            boolean hasEnd();

            boolean hasOptions();

            boolean hasStart();
        }

        /* renamed from: com.google.protobuf.DescriptorProtos$DescriptorProto$c */
        public interface C34177c extends C34417m1 {
            int getEnd();

            int getStart();

            boolean hasEnd();

            boolean hasStart();
        }

        static {
            DescriptorProto descriptorProto = new DescriptorProto();
            DEFAULT_INSTANCE = descriptorProto;
            GeneratedMessageLite.registerDefaultInstance(DescriptorProto.class, descriptorProto);
        }

        private DescriptorProto() {
        }

        /* access modifiers changed from: private */
        public void addAllEnumType(Iterable<? extends EnumDescriptorProto> iterable) {
            ensureEnumTypeIsMutable();
            C34319a.addAll(iterable, this.enumType_);
        }

        /* access modifiers changed from: private */
        public void addAllExtension(Iterable<? extends FieldDescriptorProto> iterable) {
            ensureExtensionIsMutable();
            C34319a.addAll(iterable, this.extension_);
        }

        /* access modifiers changed from: private */
        public void addAllExtensionRange(Iterable<? extends ExtensionRange> iterable) {
            ensureExtensionRangeIsMutable();
            C34319a.addAll(iterable, this.extensionRange_);
        }

        /* access modifiers changed from: private */
        public void addAllField(Iterable<? extends FieldDescriptorProto> iterable) {
            ensureFieldIsMutable();
            C34319a.addAll(iterable, this.field_);
        }

        /* access modifiers changed from: private */
        public void addAllNestedType(Iterable<? extends DescriptorProto> iterable) {
            ensureNestedTypeIsMutable();
            C34319a.addAll(iterable, this.nestedType_);
        }

        /* access modifiers changed from: private */
        public void addAllOneofDecl(Iterable<? extends OneofDescriptorProto> iterable) {
            ensureOneofDeclIsMutable();
            C34319a.addAll(iterable, this.oneofDecl_);
        }

        /* access modifiers changed from: private */
        public void addAllReservedName(Iterable<String> iterable) {
            ensureReservedNameIsMutable();
            C34319a.addAll(iterable, this.reservedName_);
        }

        /* access modifiers changed from: private */
        public void addAllReservedRange(Iterable<? extends ReservedRange> iterable) {
            ensureReservedRangeIsMutable();
            C34319a.addAll(iterable, this.reservedRange_);
        }

        /* access modifiers changed from: private */
        public void addEnumType(EnumDescriptorProto enumDescriptorProto) {
            enumDescriptorProto.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.add(enumDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addExtension(FieldDescriptorProto fieldDescriptorProto) {
            fieldDescriptorProto.getClass();
            ensureExtensionIsMutable();
            this.extension_.add(fieldDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addExtensionRange(ExtensionRange extensionRange) {
            extensionRange.getClass();
            ensureExtensionRangeIsMutable();
            this.extensionRange_.add(extensionRange);
        }

        /* access modifiers changed from: private */
        public void addField(FieldDescriptorProto fieldDescriptorProto) {
            fieldDescriptorProto.getClass();
            ensureFieldIsMutable();
            this.field_.add(fieldDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addNestedType(DescriptorProto descriptorProto) {
            descriptorProto.getClass();
            ensureNestedTypeIsMutable();
            this.nestedType_.add(descriptorProto);
        }

        /* access modifiers changed from: private */
        public void addOneofDecl(OneofDescriptorProto oneofDescriptorProto) {
            oneofDescriptorProto.getClass();
            ensureOneofDeclIsMutable();
            this.oneofDecl_.add(oneofDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addReservedName(String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.add(str);
        }

        /* access modifiers changed from: private */
        public void addReservedNameBytes(ByteString byteString) {
            ensureReservedNameIsMutable();
            this.reservedName_.add(byteString.mo99228S0());
        }

        /* access modifiers changed from: private */
        public void addReservedRange(ReservedRange reservedRange) {
            reservedRange.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(reservedRange);
        }

        /* access modifiers changed from: private */
        public void clearEnumType() {
            this.enumType_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearExtension() {
            this.extension_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearExtensionRange() {
            this.extensionRange_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearField() {
            this.field_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* access modifiers changed from: private */
        public void clearNestedType() {
            this.nestedType_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearOneofDecl() {
            this.oneofDecl_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        /* access modifiers changed from: private */
        public void clearReservedName() {
            this.reservedName_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearReservedRange() {
            this.reservedRange_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureEnumTypeIsMutable() {
            C34471v0.C34488k<EnumDescriptorProto> kVar = this.enumType_;
            if (!kVar.mo100971T()) {
                this.enumType_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        private void ensureExtensionIsMutable() {
            C34471v0.C34488k<FieldDescriptorProto> kVar = this.extension_;
            if (!kVar.mo100971T()) {
                this.extension_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        private void ensureExtensionRangeIsMutable() {
            C34471v0.C34488k<ExtensionRange> kVar = this.extensionRange_;
            if (!kVar.mo100971T()) {
                this.extensionRange_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        private void ensureFieldIsMutable() {
            C34471v0.C34488k<FieldDescriptorProto> kVar = this.field_;
            if (!kVar.mo100971T()) {
                this.field_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        private void ensureNestedTypeIsMutable() {
            C34471v0.C34488k<DescriptorProto> kVar = this.nestedType_;
            if (!kVar.mo100971T()) {
                this.nestedType_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        private void ensureOneofDeclIsMutable() {
            C34471v0.C34488k<OneofDescriptorProto> kVar = this.oneofDecl_;
            if (!kVar.mo100971T()) {
                this.oneofDecl_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        private void ensureReservedNameIsMutable() {
            C34471v0.C34488k<String> kVar = this.reservedName_;
            if (!kVar.mo100971T()) {
                this.reservedName_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        private void ensureReservedRangeIsMutable() {
            C34471v0.C34488k<ReservedRange> kVar = this.reservedRange_;
            if (!kVar.mo100971T()) {
                this.reservedRange_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        public static DescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeOptions(MessageOptions messageOptions) {
            messageOptions.getClass();
            MessageOptions messageOptions2 = this.options_;
            if (messageOptions2 == null || messageOptions2 == MessageOptions.getDefaultInstance()) {
                this.options_ = messageOptions;
            } else {
                this.options_ = (MessageOptions) ((MessageOptions.C34203a) MessageOptions.newBuilder(this.options_).mo100463K(messageOptions)).mo100467Q();
            }
            this.bitField0_ |= 2;
        }

        public static C34175a newBuilder() {
            return (C34175a) DEFAULT_INSTANCE.createBuilder();
        }

        public static DescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<DescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeEnumType(int i) {
            ensureEnumTypeIsMutable();
            this.enumType_.remove(i);
        }

        /* access modifiers changed from: private */
        public void removeExtension(int i) {
            ensureExtensionIsMutable();
            this.extension_.remove(i);
        }

        /* access modifiers changed from: private */
        public void removeExtensionRange(int i) {
            ensureExtensionRangeIsMutable();
            this.extensionRange_.remove(i);
        }

        /* access modifiers changed from: private */
        public void removeField(int i) {
            ensureFieldIsMutable();
            this.field_.remove(i);
        }

        /* access modifiers changed from: private */
        public void removeNestedType(int i) {
            ensureNestedTypeIsMutable();
            this.nestedType_.remove(i);
        }

        /* access modifiers changed from: private */
        public void removeOneofDecl(int i) {
            ensureOneofDeclIsMutable();
            this.oneofDecl_.remove(i);
        }

        /* access modifiers changed from: private */
        public void removeReservedRange(int i) {
            ensureReservedRangeIsMutable();
            this.reservedRange_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
            enumDescriptorProto.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.set(i, enumDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void setExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
            fieldDescriptorProto.getClass();
            ensureExtensionIsMutable();
            this.extension_.set(i, fieldDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void setExtensionRange(int i, ExtensionRange extensionRange) {
            extensionRange.getClass();
            ensureExtensionRangeIsMutable();
            this.extensionRange_.set(i, extensionRange);
        }

        /* access modifiers changed from: private */
        public void setField(int i, FieldDescriptorProto fieldDescriptorProto) {
            fieldDescriptorProto.getClass();
            ensureFieldIsMutable();
            this.field_.set(i, fieldDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            this.name_ = byteString.mo99228S0();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setNestedType(int i, DescriptorProto descriptorProto) {
            descriptorProto.getClass();
            ensureNestedTypeIsMutable();
            this.nestedType_.set(i, descriptorProto);
        }

        /* access modifiers changed from: private */
        public void setOneofDecl(int i, OneofDescriptorProto oneofDescriptorProto) {
            oneofDescriptorProto.getClass();
            ensureOneofDeclIsMutable();
            this.oneofDecl_.set(i, oneofDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void setOptions(MessageOptions messageOptions) {
            messageOptions.getClass();
            this.options_ = messageOptions;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setReservedName(int i, String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void setReservedRange(int i, ReservedRange reservedRange) {
            reservedRange.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.set(i, reservedRange);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 1;
            switch (C34218a.f82914a[methodToInvoke.ordinal()]) {
                case 1:
                    return new DescriptorProto();
                case 2:
                    return new C34175a((C34218a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\b\u0007\u0001ဈ\u0000\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007ᐉ\u0001\bЛ\t\u001b\n\u001a", new Object[]{"bitField0_", "name_", "field_", FieldDescriptorProto.class, "nestedType_", DescriptorProto.class, "enumType_", EnumDescriptorProto.class, "extensionRange_", ExtensionRange.class, "extension_", FieldDescriptorProto.class, "options_", "oneofDecl_", OneofDescriptorProto.class, "reservedRange_", ReservedRange.class, "reservedName_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<DescriptorProto> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (DescriptorProto.class) {
                            y1Var = PARSER;
                            if (y1Var == null) {
                                y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                                PARSER = y1Var;
                            }
                        }
                    }
                    return y1Var;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public EnumDescriptorProto getEnumType(int i) {
            return this.enumType_.get(i);
        }

        public int getEnumTypeCount() {
            return this.enumType_.size();
        }

        public List<EnumDescriptorProto> getEnumTypeList() {
            return this.enumType_;
        }

        public C34220c getEnumTypeOrBuilder(int i) {
            return this.enumType_.get(i);
        }

        public List<? extends C34220c> getEnumTypeOrBuilderList() {
            return this.enumType_;
        }

        public FieldDescriptorProto getExtension(int i) {
            return this.extension_.get(i);
        }

        public int getExtensionCount() {
            return this.extension_.size();
        }

        public List<FieldDescriptorProto> getExtensionList() {
            return this.extension_;
        }

        public C34225h getExtensionOrBuilder(int i) {
            return this.extension_.get(i);
        }

        public List<? extends C34225h> getExtensionOrBuilderList() {
            return this.extension_;
        }

        public ExtensionRange getExtensionRange(int i) {
            return this.extensionRange_.get(i);
        }

        public int getExtensionRangeCount() {
            return this.extensionRange_.size();
        }

        public List<ExtensionRange> getExtensionRangeList() {
            return this.extensionRange_;
        }

        public C34176b getExtensionRangeOrBuilder(int i) {
            return this.extensionRange_.get(i);
        }

        public List<? extends C34176b> getExtensionRangeOrBuilderList() {
            return this.extensionRange_;
        }

        public FieldDescriptorProto getField(int i) {
            return this.field_.get(i);
        }

        public int getFieldCount() {
            return this.field_.size();
        }

        public List<FieldDescriptorProto> getFieldList() {
            return this.field_;
        }

        public C34225h getFieldOrBuilder(int i) {
            return this.field_.get(i);
        }

        public List<? extends C34225h> getFieldOrBuilderList() {
            return this.field_;
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.m137260e0(this.name_);
        }

        public DescriptorProto getNestedType(int i) {
            return this.nestedType_.get(i);
        }

        public int getNestedTypeCount() {
            return this.nestedType_.size();
        }

        public List<DescriptorProto> getNestedTypeList() {
            return this.nestedType_;
        }

        public C34219b getNestedTypeOrBuilder(int i) {
            return this.nestedType_.get(i);
        }

        public List<? extends C34219b> getNestedTypeOrBuilderList() {
            return this.nestedType_;
        }

        public OneofDescriptorProto getOneofDecl(int i) {
            return this.oneofDecl_.get(i);
        }

        public int getOneofDeclCount() {
            return this.oneofDecl_.size();
        }

        public List<OneofDescriptorProto> getOneofDeclList() {
            return this.oneofDecl_;
        }

        public C34234q getOneofDeclOrBuilder(int i) {
            return this.oneofDecl_.get(i);
        }

        public List<? extends C34234q> getOneofDeclOrBuilderList() {
            return this.oneofDecl_;
        }

        public MessageOptions getOptions() {
            MessageOptions messageOptions = this.options_;
            return messageOptions == null ? MessageOptions.getDefaultInstance() : messageOptions;
        }

        public String getReservedName(int i) {
            return this.reservedName_.get(i);
        }

        public ByteString getReservedNameBytes(int i) {
            return ByteString.m137260e0(this.reservedName_.get(i));
        }

        public int getReservedNameCount() {
            return this.reservedName_.size();
        }

        public List<String> getReservedNameList() {
            return this.reservedName_;
        }

        public ReservedRange getReservedRange(int i) {
            return this.reservedRange_.get(i);
        }

        public int getReservedRangeCount() {
            return this.reservedRange_.size();
        }

        public List<ReservedRange> getReservedRangeList() {
            return this.reservedRange_;
        }

        public C34177c getReservedRangeOrBuilder(int i) {
            return this.reservedRange_.get(i);
        }

        public List<? extends C34177c> getReservedRangeOrBuilderList() {
            return this.reservedRange_;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        public static C34175a newBuilder(DescriptorProto descriptorProto) {
            return (C34175a) DEFAULT_INSTANCE.createBuilder(descriptorProto);
        }

        public static DescriptorProto parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (DescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static DescriptorProto parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static DescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
            enumDescriptorProto.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.add(i, enumDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
            fieldDescriptorProto.getClass();
            ensureExtensionIsMutable();
            this.extension_.add(i, fieldDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addExtensionRange(int i, ExtensionRange extensionRange) {
            extensionRange.getClass();
            ensureExtensionRangeIsMutable();
            this.extensionRange_.add(i, extensionRange);
        }

        /* access modifiers changed from: private */
        public void addField(int i, FieldDescriptorProto fieldDescriptorProto) {
            fieldDescriptorProto.getClass();
            ensureFieldIsMutable();
            this.field_.add(i, fieldDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addNestedType(int i, DescriptorProto descriptorProto) {
            descriptorProto.getClass();
            ensureNestedTypeIsMutable();
            this.nestedType_.add(i, descriptorProto);
        }

        /* access modifiers changed from: private */
        public void addOneofDecl(int i, OneofDescriptorProto oneofDescriptorProto) {
            oneofDescriptorProto.getClass();
            ensureOneofDeclIsMutable();
            this.oneofDecl_.add(i, oneofDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addReservedRange(int i, ReservedRange reservedRange) {
            reservedRange.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(i, reservedRange);
        }

        public static DescriptorProto parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static DescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DescriptorProto parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static DescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DescriptorProto parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static DescriptorProto parseFrom(C34448s sVar) throws IOException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static DescriptorProto parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    public static final class EnumDescriptorProto extends GeneratedMessageLite<EnumDescriptorProto, C34179a> implements C34220c {
        /* access modifiers changed from: private */
        public static final EnumDescriptorProto DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile C34504y1<EnumDescriptorProto> PARSER = null;
        public static final int RESERVED_NAME_FIELD_NUMBER = 5;
        public static final int RESERVED_RANGE_FIELD_NUMBER = 4;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private EnumOptions options_;
        private C34471v0.C34488k<String> reservedName_ = GeneratedMessageLite.emptyProtobufList();
        private C34471v0.C34488k<EnumReservedRange> reservedRange_ = GeneratedMessageLite.emptyProtobufList();
        private C34471v0.C34488k<EnumValueDescriptorProto> value_ = GeneratedMessageLite.emptyProtobufList();

        public static final class EnumReservedRange extends GeneratedMessageLite<EnumReservedRange, C34178a> implements C34180b {
            /* access modifiers changed from: private */
            public static final EnumReservedRange DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 2;
            private static volatile C34504y1<EnumReservedRange> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private int start_;

            /* renamed from: com.google.protobuf.DescriptorProtos$EnumDescriptorProto$EnumReservedRange$a */
            public static final class C34178a extends GeneratedMessageLite.C34263b<EnumReservedRange, C34178a> implements C34180b {
                public /* synthetic */ C34178a(C34218a aVar) {
                    this();
                }

                /* renamed from: P */
                public C34178a mo99531P() {
                    mo100457F();
                    ((EnumReservedRange) this.f83053b).clearEnd();
                    return this;
                }

                /* renamed from: R */
                public C34178a mo99532R() {
                    mo100457F();
                    ((EnumReservedRange) this.f83053b).clearStart();
                    return this;
                }

                /* renamed from: S */
                public C34178a mo99533S(int i) {
                    mo100457F();
                    ((EnumReservedRange) this.f83053b).setEnd(i);
                    return this;
                }

                /* renamed from: T */
                public C34178a mo99534T(int i) {
                    mo100457F();
                    ((EnumReservedRange) this.f83053b).setStart(i);
                    return this;
                }

                public int getEnd() {
                    return ((EnumReservedRange) this.f83053b).getEnd();
                }

                public int getStart() {
                    return ((EnumReservedRange) this.f83053b).getStart();
                }

                public boolean hasEnd() {
                    return ((EnumReservedRange) this.f83053b).hasEnd();
                }

                public boolean hasStart() {
                    return ((EnumReservedRange) this.f83053b).hasStart();
                }

                public C34178a() {
                    super(EnumReservedRange.DEFAULT_INSTANCE);
                }
            }

            static {
                EnumReservedRange enumReservedRange = new EnumReservedRange();
                DEFAULT_INSTANCE = enumReservedRange;
                GeneratedMessageLite.registerDefaultInstance(EnumReservedRange.class, enumReservedRange);
            }

            private EnumReservedRange() {
            }

            /* access modifiers changed from: private */
            public void clearEnd() {
                this.bitField0_ &= -3;
                this.end_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearStart() {
                this.bitField0_ &= -2;
                this.start_ = 0;
            }

            public static EnumReservedRange getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C34178a newBuilder() {
                return (C34178a) DEFAULT_INSTANCE.createBuilder();
            }

            public static EnumReservedRange parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (EnumReservedRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EnumReservedRange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static C34504y1<EnumReservedRange> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setEnd(int i) {
                this.bitField0_ |= 2;
                this.end_ = i;
            }

            /* access modifiers changed from: private */
            public void setStart(int i) {
                this.bitField0_ |= 1;
                this.start_ = i;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C34218a.f82914a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new EnumReservedRange();
                    case 2:
                        return new C34178a((C34218a) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        C34504y1<EnumReservedRange> y1Var = PARSER;
                        if (y1Var == null) {
                            synchronized (EnumReservedRange.class) {
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

            public int getEnd() {
                return this.end_;
            }

            public int getStart() {
                return this.start_;
            }

            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C34178a newBuilder(EnumReservedRange enumReservedRange) {
                return (C34178a) DEFAULT_INSTANCE.createBuilder(enumReservedRange);
            }

            public static EnumReservedRange parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
                return (EnumReservedRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
            }

            public static EnumReservedRange parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
            }

            public static EnumReservedRange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static EnumReservedRange parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
            }

            public static EnumReservedRange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static EnumReservedRange parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
            }

            public static EnumReservedRange parseFrom(InputStream inputStream) throws IOException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EnumReservedRange parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
            }

            public static EnumReservedRange parseFrom(C34448s sVar) throws IOException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
            }

            public static EnumReservedRange parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
            }
        }

        /* renamed from: com.google.protobuf.DescriptorProtos$EnumDescriptorProto$a */
        public static final class C34179a extends GeneratedMessageLite.C34263b<EnumDescriptorProto, C34179a> implements C34220c {
            public /* synthetic */ C34179a(C34218a aVar) {
                this();
            }

            /* renamed from: B0 */
            public C34179a mo99535B0(int i, EnumValueDescriptorProto enumValueDescriptorProto) {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).setValue(i, enumValueDescriptorProto);
                return this;
            }

            /* renamed from: P */
            public C34179a mo99536P(Iterable<String> iterable) {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).addAllReservedName(iterable);
                return this;
            }

            /* renamed from: R */
            public C34179a mo99537R(Iterable<? extends EnumReservedRange> iterable) {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).addAllReservedRange(iterable);
                return this;
            }

            /* renamed from: S */
            public C34179a mo99538S(Iterable<? extends EnumValueDescriptorProto> iterable) {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).addAllValue(iterable);
                return this;
            }

            /* renamed from: T */
            public C34179a mo99539T(String str) {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).addReservedName(str);
                return this;
            }

            /* renamed from: U */
            public C34179a mo99540U(ByteString byteString) {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).addReservedNameBytes(byteString);
                return this;
            }

            /* renamed from: V */
            public C34179a mo99541V(int i, EnumReservedRange.C34178a aVar) {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).addReservedRange(i, (EnumReservedRange) aVar.mo100473g());
                return this;
            }

            /* renamed from: Y */
            public C34179a mo99542Y(int i, EnumReservedRange enumReservedRange) {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).addReservedRange(i, enumReservedRange);
                return this;
            }

            /* renamed from: Z */
            public C34179a mo99543Z(EnumReservedRange.C34178a aVar) {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).addReservedRange((EnumReservedRange) aVar.mo100473g());
                return this;
            }

            /* renamed from: a0 */
            public C34179a mo99544a0(EnumReservedRange enumReservedRange) {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).addReservedRange(enumReservedRange);
                return this;
            }

            /* renamed from: b0 */
            public C34179a mo99545b0(int i, EnumValueDescriptorProto.C34182a aVar) {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).addValue(i, (EnumValueDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: c0 */
            public C34179a mo99546c0(int i, EnumValueDescriptorProto enumValueDescriptorProto) {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).addValue(i, enumValueDescriptorProto);
                return this;
            }

            /* renamed from: d0 */
            public C34179a mo99547d0(EnumValueDescriptorProto.C34182a aVar) {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).addValue((EnumValueDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: g0 */
            public C34179a mo99548g0(EnumValueDescriptorProto enumValueDescriptorProto) {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).addValue(enumValueDescriptorProto);
                return this;
            }

            public String getName() {
                return ((EnumDescriptorProto) this.f83053b).getName();
            }

            public ByteString getNameBytes() {
                return ((EnumDescriptorProto) this.f83053b).getNameBytes();
            }

            public EnumOptions getOptions() {
                return ((EnumDescriptorProto) this.f83053b).getOptions();
            }

            public String getReservedName(int i) {
                return ((EnumDescriptorProto) this.f83053b).getReservedName(i);
            }

            public ByteString getReservedNameBytes(int i) {
                return ((EnumDescriptorProto) this.f83053b).getReservedNameBytes(i);
            }

            public int getReservedNameCount() {
                return ((EnumDescriptorProto) this.f83053b).getReservedNameCount();
            }

            public List<String> getReservedNameList() {
                return Collections.unmodifiableList(((EnumDescriptorProto) this.f83053b).getReservedNameList());
            }

            public EnumReservedRange getReservedRange(int i) {
                return ((EnumDescriptorProto) this.f83053b).getReservedRange(i);
            }

            public int getReservedRangeCount() {
                return ((EnumDescriptorProto) this.f83053b).getReservedRangeCount();
            }

            public List<EnumReservedRange> getReservedRangeList() {
                return Collections.unmodifiableList(((EnumDescriptorProto) this.f83053b).getReservedRangeList());
            }

            public EnumValueDescriptorProto getValue(int i) {
                return ((EnumDescriptorProto) this.f83053b).getValue(i);
            }

            public int getValueCount() {
                return ((EnumDescriptorProto) this.f83053b).getValueCount();
            }

            public List<EnumValueDescriptorProto> getValueList() {
                return Collections.unmodifiableList(((EnumDescriptorProto) this.f83053b).getValueList());
            }

            /* renamed from: h0 */
            public C34179a mo99549h0() {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).clearName();
                return this;
            }

            public boolean hasName() {
                return ((EnumDescriptorProto) this.f83053b).hasName();
            }

            public boolean hasOptions() {
                return ((EnumDescriptorProto) this.f83053b).hasOptions();
            }

            /* renamed from: i0 */
            public C34179a mo99550i0() {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).clearOptions();
                return this;
            }

            /* renamed from: j0 */
            public C34179a mo99551j0() {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).clearReservedName();
                return this;
            }

            /* renamed from: k0 */
            public C34179a mo99552k0() {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).clearReservedRange();
                return this;
            }

            /* renamed from: l0 */
            public C34179a mo99553l0() {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).clearValue();
                return this;
            }

            /* renamed from: m0 */
            public C34179a mo99554m0(EnumOptions enumOptions) {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).mergeOptions(enumOptions);
                return this;
            }

            /* renamed from: o0 */
            public C34179a mo99555o0(int i) {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).removeReservedRange(i);
                return this;
            }

            /* renamed from: q0 */
            public C34179a mo99556q0(int i) {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).removeValue(i);
                return this;
            }

            /* renamed from: r0 */
            public C34179a mo99557r0(String str) {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).setName(str);
                return this;
            }

            /* renamed from: s0 */
            public C34179a mo99558s0(ByteString byteString) {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).setNameBytes(byteString);
                return this;
            }

            /* renamed from: u0 */
            public C34179a mo99559u0(EnumOptions.C34181a aVar) {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).setOptions((EnumOptions) aVar.mo100473g());
                return this;
            }

            /* renamed from: v0 */
            public C34179a mo99560v0(EnumOptions enumOptions) {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).setOptions(enumOptions);
                return this;
            }

            /* renamed from: w0 */
            public C34179a mo99561w0(int i, String str) {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).setReservedName(i, str);
                return this;
            }

            /* renamed from: x0 */
            public C34179a mo99562x0(int i, EnumReservedRange.C34178a aVar) {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).setReservedRange(i, (EnumReservedRange) aVar.mo100473g());
                return this;
            }

            /* renamed from: y0 */
            public C34179a mo99563y0(int i, EnumReservedRange enumReservedRange) {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).setReservedRange(i, enumReservedRange);
                return this;
            }

            /* renamed from: z0 */
            public C34179a mo99564z0(int i, EnumValueDescriptorProto.C34182a aVar) {
                mo100457F();
                ((EnumDescriptorProto) this.f83053b).setValue(i, (EnumValueDescriptorProto) aVar.mo100473g());
                return this;
            }

            public C34179a() {
                super(EnumDescriptorProto.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.google.protobuf.DescriptorProtos$EnumDescriptorProto$b */
        public interface C34180b extends C34417m1 {
            int getEnd();

            int getStart();

            boolean hasEnd();

            boolean hasStart();
        }

        static {
            EnumDescriptorProto enumDescriptorProto = new EnumDescriptorProto();
            DEFAULT_INSTANCE = enumDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(EnumDescriptorProto.class, enumDescriptorProto);
        }

        private EnumDescriptorProto() {
        }

        /* access modifiers changed from: private */
        public void addAllReservedName(Iterable<String> iterable) {
            ensureReservedNameIsMutable();
            C34319a.addAll(iterable, this.reservedName_);
        }

        /* access modifiers changed from: private */
        public void addAllReservedRange(Iterable<? extends EnumReservedRange> iterable) {
            ensureReservedRangeIsMutable();
            C34319a.addAll(iterable, this.reservedRange_);
        }

        /* access modifiers changed from: private */
        public void addAllValue(Iterable<? extends EnumValueDescriptorProto> iterable) {
            ensureValueIsMutable();
            C34319a.addAll(iterable, this.value_);
        }

        /* access modifiers changed from: private */
        public void addReservedName(String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.add(str);
        }

        /* access modifiers changed from: private */
        public void addReservedNameBytes(ByteString byteString) {
            ensureReservedNameIsMutable();
            this.reservedName_.add(byteString.mo99228S0());
        }

        /* access modifiers changed from: private */
        public void addReservedRange(EnumReservedRange enumReservedRange) {
            enumReservedRange.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(enumReservedRange);
        }

        /* access modifiers changed from: private */
        public void addValue(EnumValueDescriptorProto enumValueDescriptorProto) {
            enumValueDescriptorProto.getClass();
            ensureValueIsMutable();
            this.value_.add(enumValueDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        /* access modifiers changed from: private */
        public void clearReservedName() {
            this.reservedName_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearReservedRange() {
            this.reservedRange_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearValue() {
            this.value_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureReservedNameIsMutable() {
            C34471v0.C34488k<String> kVar = this.reservedName_;
            if (!kVar.mo100971T()) {
                this.reservedName_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        private void ensureReservedRangeIsMutable() {
            C34471v0.C34488k<EnumReservedRange> kVar = this.reservedRange_;
            if (!kVar.mo100971T()) {
                this.reservedRange_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        private void ensureValueIsMutable() {
            C34471v0.C34488k<EnumValueDescriptorProto> kVar = this.value_;
            if (!kVar.mo100971T()) {
                this.value_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        public static EnumDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeOptions(EnumOptions enumOptions) {
            enumOptions.getClass();
            EnumOptions enumOptions2 = this.options_;
            if (enumOptions2 == null || enumOptions2 == EnumOptions.getDefaultInstance()) {
                this.options_ = enumOptions;
            } else {
                this.options_ = (EnumOptions) ((EnumOptions.C34181a) EnumOptions.newBuilder(this.options_).mo100463K(enumOptions)).mo100467Q();
            }
            this.bitField0_ |= 2;
        }

        public static C34179a newBuilder() {
            return (C34179a) DEFAULT_INSTANCE.createBuilder();
        }

        public static EnumDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<EnumDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeReservedRange(int i) {
            ensureReservedRangeIsMutable();
            this.reservedRange_.remove(i);
        }

        /* access modifiers changed from: private */
        public void removeValue(int i) {
            ensureValueIsMutable();
            this.value_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            this.name_ = byteString.mo99228S0();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setOptions(EnumOptions enumOptions) {
            enumOptions.getClass();
            this.options_ = enumOptions;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setReservedName(int i, String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void setReservedRange(int i, EnumReservedRange enumReservedRange) {
            enumReservedRange.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.set(i, enumReservedRange);
        }

        /* access modifiers changed from: private */
        public void setValue(int i, EnumValueDescriptorProto enumValueDescriptorProto) {
            enumValueDescriptorProto.getClass();
            ensureValueIsMutable();
            this.value_.set(i, enumValueDescriptorProto);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 1;
            switch (C34218a.f82914a[methodToInvoke.ordinal()]) {
                case 1:
                    return new EnumDescriptorProto();
                case 2:
                    return new C34179a((C34218a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001\u0004\u001b\u0005\u001a", new Object[]{"bitField0_", "name_", "value_", EnumValueDescriptorProto.class, "options_", "reservedRange_", EnumReservedRange.class, "reservedName_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<EnumDescriptorProto> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (EnumDescriptorProto.class) {
                            y1Var = PARSER;
                            if (y1Var == null) {
                                y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                                PARSER = y1Var;
                            }
                        }
                    }
                    return y1Var;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.m137260e0(this.name_);
        }

        public EnumOptions getOptions() {
            EnumOptions enumOptions = this.options_;
            return enumOptions == null ? EnumOptions.getDefaultInstance() : enumOptions;
        }

        public String getReservedName(int i) {
            return this.reservedName_.get(i);
        }

        public ByteString getReservedNameBytes(int i) {
            return ByteString.m137260e0(this.reservedName_.get(i));
        }

        public int getReservedNameCount() {
            return this.reservedName_.size();
        }

        public List<String> getReservedNameList() {
            return this.reservedName_;
        }

        public EnumReservedRange getReservedRange(int i) {
            return this.reservedRange_.get(i);
        }

        public int getReservedRangeCount() {
            return this.reservedRange_.size();
        }

        public List<EnumReservedRange> getReservedRangeList() {
            return this.reservedRange_;
        }

        public C34180b getReservedRangeOrBuilder(int i) {
            return this.reservedRange_.get(i);
        }

        public List<? extends C34180b> getReservedRangeOrBuilderList() {
            return this.reservedRange_;
        }

        public EnumValueDescriptorProto getValue(int i) {
            return this.value_.get(i);
        }

        public int getValueCount() {
            return this.value_.size();
        }

        public List<EnumValueDescriptorProto> getValueList() {
            return this.value_;
        }

        public C34222e getValueOrBuilder(int i) {
            return this.value_.get(i);
        }

        public List<? extends C34222e> getValueOrBuilderList() {
            return this.value_;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        public static C34179a newBuilder(EnumDescriptorProto enumDescriptorProto) {
            return (C34179a) DEFAULT_INSTANCE.createBuilder(enumDescriptorProto);
        }

        public static EnumDescriptorProto parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static EnumDescriptorProto parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static EnumDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addReservedRange(int i, EnumReservedRange enumReservedRange) {
            enumReservedRange.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(i, enumReservedRange);
        }

        /* access modifiers changed from: private */
        public void addValue(int i, EnumValueDescriptorProto enumValueDescriptorProto) {
            enumValueDescriptorProto.getClass();
            ensureValueIsMutable();
            this.value_.add(i, enumValueDescriptorProto);
        }

        public static EnumDescriptorProto parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static EnumDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EnumDescriptorProto parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static EnumDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumDescriptorProto parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static EnumDescriptorProto parseFrom(C34448s sVar) throws IOException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static EnumDescriptorProto parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    public static final class EnumOptions extends GeneratedMessageLite.ExtendableMessage<EnumOptions, C34181a> implements C34221d {
        public static final int ALLOW_ALIAS_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final EnumOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        private static volatile C34504y1<EnumOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private boolean allowAlias_;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized = 2;
        private C34471v0.C34488k<UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: com.google.protobuf.DescriptorProtos$EnumOptions$a */
        public static final class C34181a extends GeneratedMessageLite.C34265d<EnumOptions, C34181a> implements C34221d {
            public /* synthetic */ C34181a(C34218a aVar) {
                this();
            }

            /* renamed from: a0 */
            public C34181a mo99574a0(Iterable<? extends UninterpretedOption> iterable) {
                mo100457F();
                ((EnumOptions) this.f83053b).addAllUninterpretedOption(iterable);
                return this;
            }

            /* renamed from: b0 */
            public C34181a mo99575b0(int i, UninterpretedOption.C34216a aVar) {
                mo100457F();
                ((EnumOptions) this.f83053b).addUninterpretedOption(i, (UninterpretedOption) aVar.mo100473g());
                return this;
            }

            /* renamed from: c0 */
            public C34181a mo99576c0(int i, UninterpretedOption uninterpretedOption) {
                mo100457F();
                ((EnumOptions) this.f83053b).addUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            /* renamed from: d0 */
            public C34181a mo99577d0(UninterpretedOption.C34216a aVar) {
                mo100457F();
                ((EnumOptions) this.f83053b).addUninterpretedOption((UninterpretedOption) aVar.mo100473g());
                return this;
            }

            /* renamed from: g0 */
            public C34181a mo99578g0(UninterpretedOption uninterpretedOption) {
                mo100457F();
                ((EnumOptions) this.f83053b).addUninterpretedOption(uninterpretedOption);
                return this;
            }

            public boolean getAllowAlias() {
                return ((EnumOptions) this.f83053b).getAllowAlias();
            }

            public boolean getDeprecated() {
                return ((EnumOptions) this.f83053b).getDeprecated();
            }

            public UninterpretedOption getUninterpretedOption(int i) {
                return ((EnumOptions) this.f83053b).getUninterpretedOption(i);
            }

            public int getUninterpretedOptionCount() {
                return ((EnumOptions) this.f83053b).getUninterpretedOptionCount();
            }

            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((EnumOptions) this.f83053b).getUninterpretedOptionList());
            }

            /* renamed from: h0 */
            public C34181a mo99579h0() {
                mo100457F();
                ((EnumOptions) this.f83053b).clearAllowAlias();
                return this;
            }

            public boolean hasAllowAlias() {
                return ((EnumOptions) this.f83053b).hasAllowAlias();
            }

            public boolean hasDeprecated() {
                return ((EnumOptions) this.f83053b).hasDeprecated();
            }

            /* renamed from: i0 */
            public C34181a mo99580i0() {
                mo100457F();
                ((EnumOptions) this.f83053b).clearDeprecated();
                return this;
            }

            /* renamed from: j0 */
            public C34181a mo99581j0() {
                mo100457F();
                ((EnumOptions) this.f83053b).clearUninterpretedOption();
                return this;
            }

            /* renamed from: k0 */
            public C34181a mo99582k0(int i) {
                mo100457F();
                ((EnumOptions) this.f83053b).removeUninterpretedOption(i);
                return this;
            }

            /* renamed from: l0 */
            public C34181a mo99583l0(boolean z) {
                mo100457F();
                ((EnumOptions) this.f83053b).setAllowAlias(z);
                return this;
            }

            /* renamed from: m0 */
            public C34181a mo99584m0(boolean z) {
                mo100457F();
                ((EnumOptions) this.f83053b).setDeprecated(z);
                return this;
            }

            /* renamed from: o0 */
            public C34181a mo99585o0(int i, UninterpretedOption.C34216a aVar) {
                mo100457F();
                ((EnumOptions) this.f83053b).setUninterpretedOption(i, (UninterpretedOption) aVar.mo100473g());
                return this;
            }

            /* renamed from: q0 */
            public C34181a mo99586q0(int i, UninterpretedOption uninterpretedOption) {
                mo100457F();
                ((EnumOptions) this.f83053b).setUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            public C34181a() {
                super(EnumOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            EnumOptions enumOptions = new EnumOptions();
            DEFAULT_INSTANCE = enumOptions;
            GeneratedMessageLite.registerDefaultInstance(EnumOptions.class, enumOptions);
        }

        private EnumOptions() {
        }

        /* access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            C34319a.addAll(iterable, this.uninterpretedOption_);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void clearAllowAlias() {
            this.bitField0_ &= -2;
            this.allowAlias_ = false;
        }

        /* access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -3;
            this.deprecated_ = false;
        }

        /* access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureUninterpretedOptionIsMutable() {
            C34471v0.C34488k<UninterpretedOption> kVar = this.uninterpretedOption_;
            if (!kVar.mo100971T()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        public static EnumOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C34181a newBuilder() {
            return (C34181a) DEFAULT_INSTANCE.createBuilder();
        }

        public static EnumOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EnumOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<EnumOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setAllowAlias(boolean z) {
            this.bitField0_ |= 1;
            this.allowAlias_ = z;
        }

        /* access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 2;
            this.deprecated_ = z;
        }

        /* access modifiers changed from: private */
        public void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, uninterpretedOption);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 1;
            switch (C34218a.f82914a[methodToInvoke.ordinal()]) {
                case 1:
                    return new EnumOptions();
                case 2:
                    return new C34181a((C34218a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0002ϧ\u0003\u0000\u0001\u0001\u0002ဇ\u0000\u0003ဇ\u0001ϧЛ", new Object[]{"bitField0_", "allowAlias_", "deprecated_", "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<EnumOptions> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (EnumOptions.class) {
                            y1Var = PARSER;
                            if (y1Var == null) {
                                y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                                PARSER = y1Var;
                            }
                        }
                    }
                    return y1Var;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public boolean getAllowAlias() {
            return this.allowAlias_;
        }

        public boolean getDeprecated() {
            return this.deprecated_;
        }

        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public C34239v getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends C34239v> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        public boolean hasAllowAlias() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasDeprecated() {
            return (this.bitField0_ & 2) != 0;
        }

        public static C34181a newBuilder(EnumOptions enumOptions) {
            return (C34181a) DEFAULT_INSTANCE.createBuilder(enumOptions);
        }

        public static EnumOptions parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (EnumOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static EnumOptions parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static EnumOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, uninterpretedOption);
        }

        public static EnumOptions parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static EnumOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EnumOptions parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static EnumOptions parseFrom(InputStream inputStream) throws IOException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumOptions parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static EnumOptions parseFrom(C34448s sVar) throws IOException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static EnumOptions parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    public static final class EnumValueDescriptorProto extends GeneratedMessageLite<EnumValueDescriptorProto, C34182a> implements C34222e {
        /* access modifiers changed from: private */
        public static final EnumValueDescriptorProto DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUMBER_FIELD_NUMBER = 2;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile C34504y1<EnumValueDescriptorProto> PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private int number_;
        private EnumValueOptions options_;

        /* renamed from: com.google.protobuf.DescriptorProtos$EnumValueDescriptorProto$a */
        public static final class C34182a extends GeneratedMessageLite.C34263b<EnumValueDescriptorProto, C34182a> implements C34222e {
            public /* synthetic */ C34182a(C34218a aVar) {
                this();
            }

            /* renamed from: P */
            public C34182a mo99594P() {
                mo100457F();
                ((EnumValueDescriptorProto) this.f83053b).clearName();
                return this;
            }

            /* renamed from: R */
            public C34182a mo99595R() {
                mo100457F();
                ((EnumValueDescriptorProto) this.f83053b).clearNumber();
                return this;
            }

            /* renamed from: S */
            public C34182a mo99596S() {
                mo100457F();
                ((EnumValueDescriptorProto) this.f83053b).clearOptions();
                return this;
            }

            /* renamed from: T */
            public C34182a mo99597T(EnumValueOptions enumValueOptions) {
                mo100457F();
                ((EnumValueDescriptorProto) this.f83053b).mergeOptions(enumValueOptions);
                return this;
            }

            /* renamed from: U */
            public C34182a mo99598U(String str) {
                mo100457F();
                ((EnumValueDescriptorProto) this.f83053b).setName(str);
                return this;
            }

            /* renamed from: V */
            public C34182a mo99599V(ByteString byteString) {
                mo100457F();
                ((EnumValueDescriptorProto) this.f83053b).setNameBytes(byteString);
                return this;
            }

            /* renamed from: Y */
            public C34182a mo99600Y(int i) {
                mo100457F();
                ((EnumValueDescriptorProto) this.f83053b).setNumber(i);
                return this;
            }

            /* renamed from: Z */
            public C34182a mo99601Z(EnumValueOptions.C34183a aVar) {
                mo100457F();
                ((EnumValueDescriptorProto) this.f83053b).setOptions((EnumValueOptions) aVar.mo100473g());
                return this;
            }

            /* renamed from: a0 */
            public C34182a mo99602a0(EnumValueOptions enumValueOptions) {
                mo100457F();
                ((EnumValueDescriptorProto) this.f83053b).setOptions(enumValueOptions);
                return this;
            }

            public String getName() {
                return ((EnumValueDescriptorProto) this.f83053b).getName();
            }

            public ByteString getNameBytes() {
                return ((EnumValueDescriptorProto) this.f83053b).getNameBytes();
            }

            public int getNumber() {
                return ((EnumValueDescriptorProto) this.f83053b).getNumber();
            }

            public EnumValueOptions getOptions() {
                return ((EnumValueDescriptorProto) this.f83053b).getOptions();
            }

            public boolean hasName() {
                return ((EnumValueDescriptorProto) this.f83053b).hasName();
            }

            public boolean hasNumber() {
                return ((EnumValueDescriptorProto) this.f83053b).hasNumber();
            }

            public boolean hasOptions() {
                return ((EnumValueDescriptorProto) this.f83053b).hasOptions();
            }

            public C34182a() {
                super(EnumValueDescriptorProto.DEFAULT_INSTANCE);
            }
        }

        static {
            EnumValueDescriptorProto enumValueDescriptorProto = new EnumValueDescriptorProto();
            DEFAULT_INSTANCE = enumValueDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(EnumValueDescriptorProto.class, enumValueDescriptorProto);
        }

        private EnumValueDescriptorProto() {
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* access modifiers changed from: private */
        public void clearNumber() {
            this.bitField0_ &= -3;
            this.number_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -5;
        }

        public static EnumValueDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeOptions(EnumValueOptions enumValueOptions) {
            enumValueOptions.getClass();
            EnumValueOptions enumValueOptions2 = this.options_;
            if (enumValueOptions2 == null || enumValueOptions2 == EnumValueOptions.getDefaultInstance()) {
                this.options_ = enumValueOptions;
            } else {
                this.options_ = (EnumValueOptions) ((EnumValueOptions.C34183a) EnumValueOptions.newBuilder(this.options_).mo100463K(enumValueOptions)).mo100467Q();
            }
            this.bitField0_ |= 4;
        }

        public static C34182a newBuilder() {
            return (C34182a) DEFAULT_INSTANCE.createBuilder();
        }

        public static EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumValueDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<EnumValueDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            this.name_ = byteString.mo99228S0();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setNumber(int i) {
            this.bitField0_ |= 2;
            this.number_ = i;
        }

        /* access modifiers changed from: private */
        public void setOptions(EnumValueOptions enumValueOptions) {
            enumValueOptions.getClass();
            this.options_ = enumValueOptions;
            this.bitField0_ |= 4;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 1;
            switch (C34218a.f82914a[methodToInvoke.ordinal()]) {
                case 1:
                    return new EnumValueDescriptorProto();
                case 2:
                    return new C34182a((C34218a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "name_", "number_", "options_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<EnumValueDescriptorProto> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (EnumValueDescriptorProto.class) {
                            y1Var = PARSER;
                            if (y1Var == null) {
                                y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                                PARSER = y1Var;
                            }
                        }
                    }
                    return y1Var;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.m137260e0(this.name_);
        }

        public int getNumber() {
            return this.number_;
        }

        public EnumValueOptions getOptions() {
            EnumValueOptions enumValueOptions = this.options_;
            return enumValueOptions == null ? EnumValueOptions.getDefaultInstance() : enumValueOptions;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        public static C34182a newBuilder(EnumValueDescriptorProto enumValueDescriptorProto) {
            return (C34182a) DEFAULT_INSTANCE.createBuilder(enumValueDescriptorProto);
        }

        public static EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static EnumValueDescriptorProto parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static EnumValueDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EnumValueDescriptorProto parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static EnumValueDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EnumValueDescriptorProto parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static EnumValueDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumValueDescriptorProto parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static EnumValueDescriptorProto parseFrom(C34448s sVar) throws IOException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static EnumValueDescriptorProto parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    public static final class EnumValueOptions extends GeneratedMessageLite.ExtendableMessage<EnumValueOptions, C34183a> implements C34223f {
        /* access modifiers changed from: private */
        public static final EnumValueOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 1;
        private static volatile C34504y1<EnumValueOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized = 2;
        private C34471v0.C34488k<UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: com.google.protobuf.DescriptorProtos$EnumValueOptions$a */
        public static final class C34183a extends GeneratedMessageLite.C34265d<EnumValueOptions, C34183a> implements C34223f {
            public /* synthetic */ C34183a(C34218a aVar) {
                this();
            }

            /* renamed from: a0 */
            public C34183a mo99610a0(Iterable<? extends UninterpretedOption> iterable) {
                mo100457F();
                ((EnumValueOptions) this.f83053b).addAllUninterpretedOption(iterable);
                return this;
            }

            /* renamed from: b0 */
            public C34183a mo99611b0(int i, UninterpretedOption.C34216a aVar) {
                mo100457F();
                ((EnumValueOptions) this.f83053b).addUninterpretedOption(i, (UninterpretedOption) aVar.mo100473g());
                return this;
            }

            /* renamed from: c0 */
            public C34183a mo99612c0(int i, UninterpretedOption uninterpretedOption) {
                mo100457F();
                ((EnumValueOptions) this.f83053b).addUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            /* renamed from: d0 */
            public C34183a mo99613d0(UninterpretedOption.C34216a aVar) {
                mo100457F();
                ((EnumValueOptions) this.f83053b).addUninterpretedOption((UninterpretedOption) aVar.mo100473g());
                return this;
            }

            /* renamed from: g0 */
            public C34183a mo99614g0(UninterpretedOption uninterpretedOption) {
                mo100457F();
                ((EnumValueOptions) this.f83053b).addUninterpretedOption(uninterpretedOption);
                return this;
            }

            public boolean getDeprecated() {
                return ((EnumValueOptions) this.f83053b).getDeprecated();
            }

            public UninterpretedOption getUninterpretedOption(int i) {
                return ((EnumValueOptions) this.f83053b).getUninterpretedOption(i);
            }

            public int getUninterpretedOptionCount() {
                return ((EnumValueOptions) this.f83053b).getUninterpretedOptionCount();
            }

            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((EnumValueOptions) this.f83053b).getUninterpretedOptionList());
            }

            /* renamed from: h0 */
            public C34183a mo99615h0() {
                mo100457F();
                ((EnumValueOptions) this.f83053b).clearDeprecated();
                return this;
            }

            public boolean hasDeprecated() {
                return ((EnumValueOptions) this.f83053b).hasDeprecated();
            }

            /* renamed from: i0 */
            public C34183a mo99616i0() {
                mo100457F();
                ((EnumValueOptions) this.f83053b).clearUninterpretedOption();
                return this;
            }

            /* renamed from: j0 */
            public C34183a mo99617j0(int i) {
                mo100457F();
                ((EnumValueOptions) this.f83053b).removeUninterpretedOption(i);
                return this;
            }

            /* renamed from: k0 */
            public C34183a mo99618k0(boolean z) {
                mo100457F();
                ((EnumValueOptions) this.f83053b).setDeprecated(z);
                return this;
            }

            /* renamed from: l0 */
            public C34183a mo99619l0(int i, UninterpretedOption.C34216a aVar) {
                mo100457F();
                ((EnumValueOptions) this.f83053b).setUninterpretedOption(i, (UninterpretedOption) aVar.mo100473g());
                return this;
            }

            /* renamed from: m0 */
            public C34183a mo99620m0(int i, UninterpretedOption uninterpretedOption) {
                mo100457F();
                ((EnumValueOptions) this.f83053b).setUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            public C34183a() {
                super(EnumValueOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            EnumValueOptions enumValueOptions = new EnumValueOptions();
            DEFAULT_INSTANCE = enumValueOptions;
            GeneratedMessageLite.registerDefaultInstance(EnumValueOptions.class, enumValueOptions);
        }

        private EnumValueOptions() {
        }

        /* access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            C34319a.addAll(iterable, this.uninterpretedOption_);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -2;
            this.deprecated_ = false;
        }

        /* access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureUninterpretedOptionIsMutable() {
            C34471v0.C34488k<UninterpretedOption> kVar = this.uninterpretedOption_;
            if (!kVar.mo100971T()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        public static EnumValueOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C34183a newBuilder() {
            return (C34183a) DEFAULT_INSTANCE.createBuilder();
        }

        public static EnumValueOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EnumValueOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumValueOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<EnumValueOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 1;
            this.deprecated_ = z;
        }

        /* access modifiers changed from: private */
        public void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, uninterpretedOption);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 1;
            switch (C34218a.f82914a[methodToInvoke.ordinal()]) {
                case 1:
                    return new EnumValueOptions();
                case 2:
                    return new C34183a((C34218a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001ϧ\u0002\u0000\u0001\u0001\u0001ဇ\u0000ϧЛ", new Object[]{"bitField0_", "deprecated_", "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<EnumValueOptions> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (EnumValueOptions.class) {
                            y1Var = PARSER;
                            if (y1Var == null) {
                                y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                                PARSER = y1Var;
                            }
                        }
                    }
                    return y1Var;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public boolean getDeprecated() {
            return this.deprecated_;
        }

        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public C34239v getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends C34239v> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        public boolean hasDeprecated() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C34183a newBuilder(EnumValueOptions enumValueOptions) {
            return (C34183a) DEFAULT_INSTANCE.createBuilder(enumValueOptions);
        }

        public static EnumValueOptions parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (EnumValueOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static EnumValueOptions parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static EnumValueOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, uninterpretedOption);
        }

        public static EnumValueOptions parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static EnumValueOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EnumValueOptions parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static EnumValueOptions parseFrom(InputStream inputStream) throws IOException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumValueOptions parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static EnumValueOptions parseFrom(C34448s sVar) throws IOException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static EnumValueOptions parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    public static final class ExtensionRangeOptions extends GeneratedMessageLite.ExtendableMessage<ExtensionRangeOptions, C34184a> implements C34224g {
        /* access modifiers changed from: private */
        public static final ExtensionRangeOptions DEFAULT_INSTANCE;
        private static volatile C34504y1<ExtensionRangeOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private byte memoizedIsInitialized = 2;
        private C34471v0.C34488k<UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: com.google.protobuf.DescriptorProtos$ExtensionRangeOptions$a */
        public static final class C34184a extends GeneratedMessageLite.C34265d<ExtensionRangeOptions, C34184a> implements C34224g {
            public /* synthetic */ C34184a(C34218a aVar) {
                this();
            }

            /* renamed from: a0 */
            public C34184a mo99626a0(Iterable<? extends UninterpretedOption> iterable) {
                mo100457F();
                ((ExtensionRangeOptions) this.f83053b).addAllUninterpretedOption(iterable);
                return this;
            }

            /* renamed from: b0 */
            public C34184a mo99627b0(int i, UninterpretedOption.C34216a aVar) {
                mo100457F();
                ((ExtensionRangeOptions) this.f83053b).addUninterpretedOption(i, (UninterpretedOption) aVar.mo100473g());
                return this;
            }

            /* renamed from: c0 */
            public C34184a mo99628c0(int i, UninterpretedOption uninterpretedOption) {
                mo100457F();
                ((ExtensionRangeOptions) this.f83053b).addUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            /* renamed from: d0 */
            public C34184a mo99629d0(UninterpretedOption.C34216a aVar) {
                mo100457F();
                ((ExtensionRangeOptions) this.f83053b).addUninterpretedOption((UninterpretedOption) aVar.mo100473g());
                return this;
            }

            /* renamed from: g0 */
            public C34184a mo99630g0(UninterpretedOption uninterpretedOption) {
                mo100457F();
                ((ExtensionRangeOptions) this.f83053b).addUninterpretedOption(uninterpretedOption);
                return this;
            }

            public UninterpretedOption getUninterpretedOption(int i) {
                return ((ExtensionRangeOptions) this.f83053b).getUninterpretedOption(i);
            }

            public int getUninterpretedOptionCount() {
                return ((ExtensionRangeOptions) this.f83053b).getUninterpretedOptionCount();
            }

            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((ExtensionRangeOptions) this.f83053b).getUninterpretedOptionList());
            }

            /* renamed from: h0 */
            public C34184a mo99631h0() {
                mo100457F();
                ((ExtensionRangeOptions) this.f83053b).clearUninterpretedOption();
                return this;
            }

            /* renamed from: i0 */
            public C34184a mo99632i0(int i) {
                mo100457F();
                ((ExtensionRangeOptions) this.f83053b).removeUninterpretedOption(i);
                return this;
            }

            /* renamed from: j0 */
            public C34184a mo99633j0(int i, UninterpretedOption.C34216a aVar) {
                mo100457F();
                ((ExtensionRangeOptions) this.f83053b).setUninterpretedOption(i, (UninterpretedOption) aVar.mo100473g());
                return this;
            }

            /* renamed from: k0 */
            public C34184a mo99634k0(int i, UninterpretedOption uninterpretedOption) {
                mo100457F();
                ((ExtensionRangeOptions) this.f83053b).setUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            public C34184a() {
                super(ExtensionRangeOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            ExtensionRangeOptions extensionRangeOptions = new ExtensionRangeOptions();
            DEFAULT_INSTANCE = extensionRangeOptions;
            GeneratedMessageLite.registerDefaultInstance(ExtensionRangeOptions.class, extensionRangeOptions);
        }

        private ExtensionRangeOptions() {
        }

        /* access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            C34319a.addAll(iterable, this.uninterpretedOption_);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureUninterpretedOptionIsMutable() {
            C34471v0.C34488k<UninterpretedOption> kVar = this.uninterpretedOption_;
            if (!kVar.mo100971T()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        public static ExtensionRangeOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C34184a newBuilder() {
            return (C34184a) DEFAULT_INSTANCE.createBuilder();
        }

        public static ExtensionRangeOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExtensionRangeOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<ExtensionRangeOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, uninterpretedOption);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 1;
            switch (C34218a.f82914a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ExtensionRangeOptions();
                case 2:
                    return new C34184a((C34218a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000ϧϧ\u0001\u0000\u0001\u0001ϧЛ", new Object[]{"uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<ExtensionRangeOptions> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (ExtensionRangeOptions.class) {
                            y1Var = PARSER;
                            if (y1Var == null) {
                                y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                                PARSER = y1Var;
                            }
                        }
                    }
                    return y1Var;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public C34239v getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends C34239v> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        public static C34184a newBuilder(ExtensionRangeOptions extensionRangeOptions) {
            return (C34184a) DEFAULT_INSTANCE.createBuilder(extensionRangeOptions);
        }

        public static ExtensionRangeOptions parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static ExtensionRangeOptions parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static ExtensionRangeOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, uninterpretedOption);
        }

        public static ExtensionRangeOptions parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static ExtensionRangeOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExtensionRangeOptions parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static ExtensionRangeOptions parseFrom(InputStream inputStream) throws IOException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExtensionRangeOptions parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static ExtensionRangeOptions parseFrom(C34448s sVar) throws IOException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static ExtensionRangeOptions parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    public static final class FieldDescriptorProto extends GeneratedMessageLite<FieldDescriptorProto, C34189a> implements C34225h {
        /* access modifiers changed from: private */
        public static final FieldDescriptorProto DEFAULT_INSTANCE;
        public static final int DEFAULT_VALUE_FIELD_NUMBER = 7;
        public static final int EXTENDEE_FIELD_NUMBER = 2;
        public static final int JSON_NAME_FIELD_NUMBER = 10;
        public static final int LABEL_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUMBER_FIELD_NUMBER = 3;
        public static final int ONEOF_INDEX_FIELD_NUMBER = 9;
        public static final int OPTIONS_FIELD_NUMBER = 8;
        private static volatile C34504y1<FieldDescriptorProto> PARSER = null;
        public static final int PROTO3_OPTIONAL_FIELD_NUMBER = 17;
        public static final int TYPE_FIELD_NUMBER = 5;
        public static final int TYPE_NAME_FIELD_NUMBER = 6;
        private int bitField0_;
        private String defaultValue_ = "";
        private String extendee_ = "";
        private String jsonName_ = "";
        private int label_ = 1;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private int number_;
        private int oneofIndex_;
        private FieldOptions options_;
        private boolean proto3Optional_;
        private String typeName_ = "";
        private int type_ = 1;

        public enum Label implements C34471v0.C34474c {
            LABEL_OPTIONAL(1),
            LABEL_REQUIRED(2),
            LABEL_REPEATED(3);
            

            /* renamed from: d */
            public static final int f82833d = 1;

            /* renamed from: e */
            public static final int f82834e = 2;

            /* renamed from: f */
            public static final int f82835f = 3;

            /* renamed from: g */
            public static final C34471v0.C34475d<Label> f82836g = null;
            private final int value;

            /* renamed from: com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Label$a */
            public class C34185a implements C34471v0.C34475d<Label> {
                /* renamed from: b */
                public Label mo93187a(int i) {
                    return Label.m137832b(i);
                }
            }

            /* renamed from: com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Label$b */
            public static final class C34186b implements C34471v0.C34476e {

                /* renamed from: a */
                public static final C34471v0.C34476e f82838a = null;

                static {
                    f82838a = new C34186b();
                }

                /* renamed from: a */
                public boolean mo93189a(int i) {
                    return Label.m137832b(i) != null;
                }
            }

            /* access modifiers changed from: public */
            static {
                f82836g = new C34185a();
            }

            /* access modifiers changed from: public */
            Label(int i) {
                this.value = i;
            }

            /* renamed from: b */
            public static Label m137832b(int i) {
                if (i == 1) {
                    return LABEL_OPTIONAL;
                }
                if (i == 2) {
                    return LABEL_REQUIRED;
                }
                if (i != 3) {
                    return null;
                }
                return LABEL_REPEATED;
            }

            /* renamed from: g */
            public static C34471v0.C34475d<Label> m137833g() {
                return f82836g;
            }

            /* renamed from: q */
            public static C34471v0.C34476e m137834q() {
                return C34186b.f82838a;
            }

            @Deprecated
            /* renamed from: r */
            public static Label m137835r(int i) {
                return m137832b(i);
            }

            public final int getNumber() {
                return this.value;
            }
        }

        public enum Type implements C34471v0.C34474c {
            TYPE_DOUBLE(1),
            TYPE_FLOAT(2),
            TYPE_INT64(3),
            TYPE_UINT64(4),
            TYPE_INT32(5),
            TYPE_FIXED64(6),
            TYPE_FIXED32(7),
            TYPE_BOOL(8),
            TYPE_STRING(9),
            TYPE_GROUP(10),
            TYPE_MESSAGE(11),
            TYPE_BYTES(12),
            TYPE_UINT32(13),
            TYPE_ENUM(14),
            TYPE_SFIXED32(15),
            TYPE_SFIXED64(16),
            TYPE_SINT32(17),
            TYPE_SINT64(18);
            

            /* renamed from: H0 */
            public static final int f82842H0 = 1;

            /* renamed from: I0 */
            public static final int f82843I0 = 2;

            /* renamed from: J0 */
            public static final int f82844J0 = 3;

            /* renamed from: K0 */
            public static final int f82845K0 = 4;

            /* renamed from: L0 */
            public static final int f82846L0 = 5;

            /* renamed from: M0 */
            public static final int f82847M0 = 6;

            /* renamed from: N0 */
            public static final int f82848N0 = 7;

            /* renamed from: O0 */
            public static final int f82849O0 = 8;

            /* renamed from: P0 */
            public static final int f82850P0 = 9;

            /* renamed from: Q0 */
            public static final int f82851Q0 = 10;

            /* renamed from: R0 */
            public static final int f82852R0 = 11;

            /* renamed from: S0 */
            public static final int f82853S0 = 12;

            /* renamed from: T0 */
            public static final int f82854T0 = 13;

            /* renamed from: U0 */
            public static final int f82855U0 = 14;

            /* renamed from: V0 */
            public static final int f82856V0 = 15;

            /* renamed from: W0 */
            public static final int f82857W0 = 16;

            /* renamed from: X0 */
            public static final int f82859X0 = 17;

            /* renamed from: Y0 */
            public static final int f82861Y0 = 18;

            /* renamed from: Z0 */
            public static final C34471v0.C34475d<Type> f82863Z0 = null;
            private final int value;

            /* renamed from: com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Type$a */
            public class C34187a implements C34471v0.C34475d<Type> {
                /* renamed from: b */
                public Type mo93187a(int i) {
                    return Type.m137839b(i);
                }
            }

            /* renamed from: com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Type$b */
            public static final class C34188b implements C34471v0.C34476e {

                /* renamed from: a */
                public static final C34471v0.C34476e f82877a = null;

                static {
                    f82877a = new C34188b();
                }

                /* renamed from: a */
                public boolean mo93189a(int i) {
                    return Type.m137839b(i) != null;
                }
            }

            /* access modifiers changed from: public */
            static {
                f82863Z0 = new C34187a();
            }

            /* access modifiers changed from: public */
            Type(int i) {
                this.value = i;
            }

            /* renamed from: b */
            public static Type m137839b(int i) {
                switch (i) {
                    case 1:
                        return TYPE_DOUBLE;
                    case 2:
                        return TYPE_FLOAT;
                    case 3:
                        return TYPE_INT64;
                    case 4:
                        return TYPE_UINT64;
                    case 5:
                        return TYPE_INT32;
                    case 6:
                        return TYPE_FIXED64;
                    case 7:
                        return TYPE_FIXED32;
                    case 8:
                        return TYPE_BOOL;
                    case 9:
                        return TYPE_STRING;
                    case 10:
                        return TYPE_GROUP;
                    case 11:
                        return TYPE_MESSAGE;
                    case 12:
                        return TYPE_BYTES;
                    case 13:
                        return TYPE_UINT32;
                    case 14:
                        return TYPE_ENUM;
                    case 15:
                        return TYPE_SFIXED32;
                    case 16:
                        return TYPE_SFIXED64;
                    case 17:
                        return TYPE_SINT32;
                    case 18:
                        return TYPE_SINT64;
                    default:
                        return null;
                }
            }

            /* renamed from: g */
            public static C34471v0.C34475d<Type> m137840g() {
                return f82863Z0;
            }

            /* renamed from: q */
            public static C34471v0.C34476e m137841q() {
                return C34188b.f82877a;
            }

            @Deprecated
            /* renamed from: r */
            public static Type m137842r(int i) {
                return m137839b(i);
            }

            public final int getNumber() {
                return this.value;
            }
        }

        /* renamed from: com.google.protobuf.DescriptorProtos$FieldDescriptorProto$a */
        public static final class C34189a extends GeneratedMessageLite.C34263b<FieldDescriptorProto, C34189a> implements C34225h {
            public /* synthetic */ C34189a(C34218a aVar) {
                this();
            }

            /* renamed from: P */
            public C34189a mo99664P() {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).clearDefaultValue();
                return this;
            }

            /* renamed from: R */
            public C34189a mo99665R() {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).clearExtendee();
                return this;
            }

            /* renamed from: S */
            public C34189a mo99666S() {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).clearJsonName();
                return this;
            }

            /* renamed from: T */
            public C34189a mo99667T() {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).clearLabel();
                return this;
            }

            /* renamed from: U */
            public C34189a mo99668U() {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).clearName();
                return this;
            }

            /* renamed from: V */
            public C34189a mo99669V() {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).clearNumber();
                return this;
            }

            /* renamed from: Y */
            public C34189a mo99670Y() {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).clearOneofIndex();
                return this;
            }

            /* renamed from: Z */
            public C34189a mo99671Z() {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).clearOptions();
                return this;
            }

            /* renamed from: a0 */
            public C34189a mo99672a0() {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).clearProto3Optional();
                return this;
            }

            /* renamed from: b0 */
            public C34189a mo99673b0() {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).clearType();
                return this;
            }

            /* renamed from: c0 */
            public C34189a mo99674c0() {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).clearTypeName();
                return this;
            }

            /* renamed from: d0 */
            public C34189a mo99675d0(FieldOptions fieldOptions) {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).mergeOptions(fieldOptions);
                return this;
            }

            /* renamed from: g0 */
            public C34189a mo99676g0(String str) {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).setDefaultValue(str);
                return this;
            }

            public String getDefaultValue() {
                return ((FieldDescriptorProto) this.f83053b).getDefaultValue();
            }

            public ByteString getDefaultValueBytes() {
                return ((FieldDescriptorProto) this.f83053b).getDefaultValueBytes();
            }

            public String getExtendee() {
                return ((FieldDescriptorProto) this.f83053b).getExtendee();
            }

            public ByteString getExtendeeBytes() {
                return ((FieldDescriptorProto) this.f83053b).getExtendeeBytes();
            }

            public String getJsonName() {
                return ((FieldDescriptorProto) this.f83053b).getJsonName();
            }

            public ByteString getJsonNameBytes() {
                return ((FieldDescriptorProto) this.f83053b).getJsonNameBytes();
            }

            public Label getLabel() {
                return ((FieldDescriptorProto) this.f83053b).getLabel();
            }

            public String getName() {
                return ((FieldDescriptorProto) this.f83053b).getName();
            }

            public ByteString getNameBytes() {
                return ((FieldDescriptorProto) this.f83053b).getNameBytes();
            }

            public int getNumber() {
                return ((FieldDescriptorProto) this.f83053b).getNumber();
            }

            public int getOneofIndex() {
                return ((FieldDescriptorProto) this.f83053b).getOneofIndex();
            }

            public FieldOptions getOptions() {
                return ((FieldDescriptorProto) this.f83053b).getOptions();
            }

            public boolean getProto3Optional() {
                return ((FieldDescriptorProto) this.f83053b).getProto3Optional();
            }

            public Type getType() {
                return ((FieldDescriptorProto) this.f83053b).getType();
            }

            public String getTypeName() {
                return ((FieldDescriptorProto) this.f83053b).getTypeName();
            }

            public ByteString getTypeNameBytes() {
                return ((FieldDescriptorProto) this.f83053b).getTypeNameBytes();
            }

            /* renamed from: h0 */
            public C34189a mo99677h0(ByteString byteString) {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).setDefaultValueBytes(byteString);
                return this;
            }

            public boolean hasDefaultValue() {
                return ((FieldDescriptorProto) this.f83053b).hasDefaultValue();
            }

            public boolean hasExtendee() {
                return ((FieldDescriptorProto) this.f83053b).hasExtendee();
            }

            public boolean hasJsonName() {
                return ((FieldDescriptorProto) this.f83053b).hasJsonName();
            }

            public boolean hasLabel() {
                return ((FieldDescriptorProto) this.f83053b).hasLabel();
            }

            public boolean hasName() {
                return ((FieldDescriptorProto) this.f83053b).hasName();
            }

            public boolean hasNumber() {
                return ((FieldDescriptorProto) this.f83053b).hasNumber();
            }

            public boolean hasOneofIndex() {
                return ((FieldDescriptorProto) this.f83053b).hasOneofIndex();
            }

            public boolean hasOptions() {
                return ((FieldDescriptorProto) this.f83053b).hasOptions();
            }

            public boolean hasProto3Optional() {
                return ((FieldDescriptorProto) this.f83053b).hasProto3Optional();
            }

            public boolean hasType() {
                return ((FieldDescriptorProto) this.f83053b).hasType();
            }

            public boolean hasTypeName() {
                return ((FieldDescriptorProto) this.f83053b).hasTypeName();
            }

            /* renamed from: i0 */
            public C34189a mo99678i0(String str) {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).setExtendee(str);
                return this;
            }

            /* renamed from: j0 */
            public C34189a mo99679j0(ByteString byteString) {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).setExtendeeBytes(byteString);
                return this;
            }

            /* renamed from: k0 */
            public C34189a mo99680k0(String str) {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).setJsonName(str);
                return this;
            }

            /* renamed from: l0 */
            public C34189a mo99681l0(ByteString byteString) {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).setJsonNameBytes(byteString);
                return this;
            }

            /* renamed from: m0 */
            public C34189a mo99682m0(Label label) {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).setLabel(label);
                return this;
            }

            /* renamed from: o0 */
            public C34189a mo99683o0(String str) {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).setName(str);
                return this;
            }

            /* renamed from: q0 */
            public C34189a mo99684q0(ByteString byteString) {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).setNameBytes(byteString);
                return this;
            }

            /* renamed from: r0 */
            public C34189a mo99685r0(int i) {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).setNumber(i);
                return this;
            }

            /* renamed from: s0 */
            public C34189a mo99686s0(int i) {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).setOneofIndex(i);
                return this;
            }

            /* renamed from: u0 */
            public C34189a mo99687u0(FieldOptions.C34194a aVar) {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).setOptions((FieldOptions) aVar.mo100473g());
                return this;
            }

            /* renamed from: v0 */
            public C34189a mo99688v0(FieldOptions fieldOptions) {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).setOptions(fieldOptions);
                return this;
            }

            /* renamed from: w0 */
            public C34189a mo99689w0(boolean z) {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).setProto3Optional(z);
                return this;
            }

            /* renamed from: x0 */
            public C34189a mo99690x0(Type type) {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).setType(type);
                return this;
            }

            /* renamed from: y0 */
            public C34189a mo99691y0(String str) {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).setTypeName(str);
                return this;
            }

            /* renamed from: z0 */
            public C34189a mo99692z0(ByteString byteString) {
                mo100457F();
                ((FieldDescriptorProto) this.f83053b).setTypeNameBytes(byteString);
                return this;
            }

            public C34189a() {
                super(FieldDescriptorProto.DEFAULT_INSTANCE);
            }
        }

        static {
            FieldDescriptorProto fieldDescriptorProto = new FieldDescriptorProto();
            DEFAULT_INSTANCE = fieldDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(FieldDescriptorProto.class, fieldDescriptorProto);
        }

        private FieldDescriptorProto() {
        }

        /* access modifiers changed from: private */
        public void clearDefaultValue() {
            this.bitField0_ &= -65;
            this.defaultValue_ = getDefaultInstance().getDefaultValue();
        }

        /* access modifiers changed from: private */
        public void clearExtendee() {
            this.bitField0_ &= -33;
            this.extendee_ = getDefaultInstance().getExtendee();
        }

        /* access modifiers changed from: private */
        public void clearJsonName() {
            this.bitField0_ &= -257;
            this.jsonName_ = getDefaultInstance().getJsonName();
        }

        /* access modifiers changed from: private */
        public void clearLabel() {
            this.bitField0_ &= -5;
            this.label_ = 1;
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* access modifiers changed from: private */
        public void clearNumber() {
            this.bitField0_ &= -3;
            this.number_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearOneofIndex() {
            this.bitField0_ &= -129;
            this.oneofIndex_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -513;
        }

        /* access modifiers changed from: private */
        public void clearProto3Optional() {
            this.bitField0_ &= -1025;
            this.proto3Optional_ = false;
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -9;
            this.type_ = 1;
        }

        /* access modifiers changed from: private */
        public void clearTypeName() {
            this.bitField0_ &= -17;
            this.typeName_ = getDefaultInstance().getTypeName();
        }

        public static FieldDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeOptions(FieldOptions fieldOptions) {
            fieldOptions.getClass();
            FieldOptions fieldOptions2 = this.options_;
            if (fieldOptions2 == null || fieldOptions2 == FieldOptions.getDefaultInstance()) {
                this.options_ = fieldOptions;
            } else {
                this.options_ = (FieldOptions) ((FieldOptions.C34194a) FieldOptions.newBuilder(this.options_).mo100463K(fieldOptions)).mo100467Q();
            }
            this.bitField0_ |= 512;
        }

        public static C34189a newBuilder() {
            return (C34189a) DEFAULT_INSTANCE.createBuilder();
        }

        public static FieldDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<FieldDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDefaultValue(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.defaultValue_ = str;
        }

        /* access modifiers changed from: private */
        public void setDefaultValueBytes(ByteString byteString) {
            this.defaultValue_ = byteString.mo99228S0();
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void setExtendee(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.extendee_ = str;
        }

        /* access modifiers changed from: private */
        public void setExtendeeBytes(ByteString byteString) {
            this.extendee_ = byteString.mo99228S0();
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setJsonName(String str) {
            str.getClass();
            this.bitField0_ |= 256;
            this.jsonName_ = str;
        }

        /* access modifiers changed from: private */
        public void setJsonNameBytes(ByteString byteString) {
            this.jsonName_ = byteString.mo99228S0();
            this.bitField0_ |= 256;
        }

        /* access modifiers changed from: private */
        public void setLabel(Label label) {
            this.label_ = label.getNumber();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            this.name_ = byteString.mo99228S0();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setNumber(int i) {
            this.bitField0_ |= 2;
            this.number_ = i;
        }

        /* access modifiers changed from: private */
        public void setOneofIndex(int i) {
            this.bitField0_ |= 128;
            this.oneofIndex_ = i;
        }

        /* access modifiers changed from: private */
        public void setOptions(FieldOptions fieldOptions) {
            fieldOptions.getClass();
            this.options_ = fieldOptions;
            this.bitField0_ |= 512;
        }

        /* access modifiers changed from: private */
        public void setProto3Optional(boolean z) {
            this.bitField0_ |= 1024;
            this.proto3Optional_ = z;
        }

        /* access modifiers changed from: private */
        public void setType(Type type) {
            this.type_ = type.getNumber();
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setTypeName(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.typeName_ = str;
        }

        /* access modifiers changed from: private */
        public void setTypeNameBytes(ByteString byteString) {
            this.typeName_ = byteString.mo99228S0();
            this.bitField0_ |= 16;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 1;
            switch (C34218a.f82914a[methodToInvoke.ordinal()]) {
                case 1:
                    return new FieldDescriptorProto();
                case 2:
                    return new C34189a((C34218a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u0011\u000b\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0005\u0003င\u0001\u0004ဌ\u0002\u0005ဌ\u0003\u0006ဈ\u0004\u0007ဈ\u0006\bᐉ\t\tင\u0007\nဈ\b\u0011ဇ\n", new Object[]{"bitField0_", "name_", "extendee_", "number_", "label_", Label.m137834q(), "type_", Type.m137841q(), "typeName_", "defaultValue_", "options_", "oneofIndex_", "jsonName_", "proto3Optional_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<FieldDescriptorProto> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (FieldDescriptorProto.class) {
                            y1Var = PARSER;
                            if (y1Var == null) {
                                y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                                PARSER = y1Var;
                            }
                        }
                    }
                    return y1Var;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getDefaultValue() {
            return this.defaultValue_;
        }

        public ByteString getDefaultValueBytes() {
            return ByteString.m137260e0(this.defaultValue_);
        }

        public String getExtendee() {
            return this.extendee_;
        }

        public ByteString getExtendeeBytes() {
            return ByteString.m137260e0(this.extendee_);
        }

        public String getJsonName() {
            return this.jsonName_;
        }

        public ByteString getJsonNameBytes() {
            return ByteString.m137260e0(this.jsonName_);
        }

        public Label getLabel() {
            Label b = Label.m137832b(this.label_);
            if (b == null) {
                return Label.LABEL_OPTIONAL;
            }
            return b;
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.m137260e0(this.name_);
        }

        public int getNumber() {
            return this.number_;
        }

        public int getOneofIndex() {
            return this.oneofIndex_;
        }

        public FieldOptions getOptions() {
            FieldOptions fieldOptions = this.options_;
            return fieldOptions == null ? FieldOptions.getDefaultInstance() : fieldOptions;
        }

        public boolean getProto3Optional() {
            return this.proto3Optional_;
        }

        public Type getType() {
            Type b = Type.m137839b(this.type_);
            if (b == null) {
                return Type.TYPE_DOUBLE;
            }
            return b;
        }

        public String getTypeName() {
            return this.typeName_;
        }

        public ByteString getTypeNameBytes() {
            return ByteString.m137260e0(this.typeName_);
        }

        public boolean hasDefaultValue() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasExtendee() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasJsonName() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasLabel() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasOneofIndex() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasProto3Optional() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasTypeName() {
            return (this.bitField0_ & 16) != 0;
        }

        public static C34189a newBuilder(FieldDescriptorProto fieldDescriptorProto) {
            return (C34189a) DEFAULT_INSTANCE.createBuilder(fieldDescriptorProto);
        }

        public static FieldDescriptorProto parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static FieldDescriptorProto parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static FieldDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FieldDescriptorProto parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static FieldDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FieldDescriptorProto parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static FieldDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldDescriptorProto parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static FieldDescriptorProto parseFrom(C34448s sVar) throws IOException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static FieldDescriptorProto parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    public static final class FieldOptions extends GeneratedMessageLite.ExtendableMessage<FieldOptions, C34194a> implements C34226i {
        public static final int CTYPE_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final FieldOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int JSTYPE_FIELD_NUMBER = 6;
        public static final int LAZY_FIELD_NUMBER = 5;
        public static final int PACKED_FIELD_NUMBER = 2;
        private static volatile C34504y1<FieldOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        public static final int WEAK_FIELD_NUMBER = 10;
        private int bitField0_;
        private int ctype_;
        private boolean deprecated_;
        private int jstype_;
        private boolean lazy_;
        private byte memoizedIsInitialized = 2;
        private boolean packed_;
        private C34471v0.C34488k<UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        private boolean weak_;

        public enum CType implements C34471v0.C34474c {
            STRING(0),
            CORD(1),
            STRING_PIECE(2);
            

            /* renamed from: d */
            public static final int f82881d = 0;

            /* renamed from: e */
            public static final int f82882e = 1;

            /* renamed from: f */
            public static final int f82883f = 2;

            /* renamed from: g */
            public static final C34471v0.C34475d<CType> f82884g = null;
            private final int value;

            /* renamed from: com.google.protobuf.DescriptorProtos$FieldOptions$CType$a */
            public class C34190a implements C34471v0.C34475d<CType> {
                /* renamed from: b */
                public CType mo93187a(int i) {
                    return CType.m137875b(i);
                }
            }

            /* renamed from: com.google.protobuf.DescriptorProtos$FieldOptions$CType$b */
            public static final class C34191b implements C34471v0.C34476e {

                /* renamed from: a */
                public static final C34471v0.C34476e f82886a = null;

                static {
                    f82886a = new C34191b();
                }

                /* renamed from: a */
                public boolean mo93189a(int i) {
                    return CType.m137875b(i) != null;
                }
            }

            /* access modifiers changed from: public */
            static {
                f82884g = new C34190a();
            }

            /* access modifiers changed from: public */
            CType(int i) {
                this.value = i;
            }

            /* renamed from: b */
            public static CType m137875b(int i) {
                if (i == 0) {
                    return STRING;
                }
                if (i == 1) {
                    return CORD;
                }
                if (i != 2) {
                    return null;
                }
                return STRING_PIECE;
            }

            /* renamed from: g */
            public static C34471v0.C34475d<CType> m137876g() {
                return f82884g;
            }

            /* renamed from: q */
            public static C34471v0.C34476e m137877q() {
                return C34191b.f82886a;
            }

            @Deprecated
            /* renamed from: r */
            public static CType m137878r(int i) {
                return m137875b(i);
            }

            public final int getNumber() {
                return this.value;
            }
        }

        public enum JSType implements C34471v0.C34474c {
            JS_NORMAL(0),
            JS_STRING(1),
            JS_NUMBER(2);
            

            /* renamed from: d */
            public static final int f82890d = 0;

            /* renamed from: e */
            public static final int f82891e = 1;

            /* renamed from: f */
            public static final int f82892f = 2;

            /* renamed from: g */
            public static final C34471v0.C34475d<JSType> f82893g = null;
            private final int value;

            /* renamed from: com.google.protobuf.DescriptorProtos$FieldOptions$JSType$a */
            public class C34192a implements C34471v0.C34475d<JSType> {
                /* renamed from: b */
                public JSType mo93187a(int i) {
                    return JSType.m137882b(i);
                }
            }

            /* renamed from: com.google.protobuf.DescriptorProtos$FieldOptions$JSType$b */
            public static final class C34193b implements C34471v0.C34476e {

                /* renamed from: a */
                public static final C34471v0.C34476e f82895a = null;

                static {
                    f82895a = new C34193b();
                }

                /* renamed from: a */
                public boolean mo93189a(int i) {
                    return JSType.m137882b(i) != null;
                }
            }

            /* access modifiers changed from: public */
            static {
                f82893g = new C34192a();
            }

            /* access modifiers changed from: public */
            JSType(int i) {
                this.value = i;
            }

            /* renamed from: b */
            public static JSType m137882b(int i) {
                if (i == 0) {
                    return JS_NORMAL;
                }
                if (i == 1) {
                    return JS_STRING;
                }
                if (i != 2) {
                    return null;
                }
                return JS_NUMBER;
            }

            /* renamed from: g */
            public static C34471v0.C34475d<JSType> m137883g() {
                return f82893g;
            }

            /* renamed from: q */
            public static C34471v0.C34476e m137884q() {
                return C34193b.f82895a;
            }

            @Deprecated
            /* renamed from: r */
            public static JSType m137885r(int i) {
                return m137882b(i);
            }

            public final int getNumber() {
                return this.value;
            }
        }

        /* renamed from: com.google.protobuf.DescriptorProtos$FieldOptions$a */
        public static final class C34194a extends GeneratedMessageLite.C34265d<FieldOptions, C34194a> implements C34226i {
            public /* synthetic */ C34194a(C34218a aVar) {
                this();
            }

            /* renamed from: a0 */
            public C34194a mo99712a0(Iterable<? extends UninterpretedOption> iterable) {
                mo100457F();
                ((FieldOptions) this.f83053b).addAllUninterpretedOption(iterable);
                return this;
            }

            /* renamed from: b0 */
            public C34194a mo99713b0(int i, UninterpretedOption.C34216a aVar) {
                mo100457F();
                ((FieldOptions) this.f83053b).addUninterpretedOption(i, (UninterpretedOption) aVar.mo100473g());
                return this;
            }

            /* renamed from: c0 */
            public C34194a mo99714c0(int i, UninterpretedOption uninterpretedOption) {
                mo100457F();
                ((FieldOptions) this.f83053b).addUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            /* renamed from: d0 */
            public C34194a mo99715d0(UninterpretedOption.C34216a aVar) {
                mo100457F();
                ((FieldOptions) this.f83053b).addUninterpretedOption((UninterpretedOption) aVar.mo100473g());
                return this;
            }

            /* renamed from: g0 */
            public C34194a mo99716g0(UninterpretedOption uninterpretedOption) {
                mo100457F();
                ((FieldOptions) this.f83053b).addUninterpretedOption(uninterpretedOption);
                return this;
            }

            public CType getCtype() {
                return ((FieldOptions) this.f83053b).getCtype();
            }

            public boolean getDeprecated() {
                return ((FieldOptions) this.f83053b).getDeprecated();
            }

            public JSType getJstype() {
                return ((FieldOptions) this.f83053b).getJstype();
            }

            public boolean getLazy() {
                return ((FieldOptions) this.f83053b).getLazy();
            }

            public boolean getPacked() {
                return ((FieldOptions) this.f83053b).getPacked();
            }

            public UninterpretedOption getUninterpretedOption(int i) {
                return ((FieldOptions) this.f83053b).getUninterpretedOption(i);
            }

            public int getUninterpretedOptionCount() {
                return ((FieldOptions) this.f83053b).getUninterpretedOptionCount();
            }

            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((FieldOptions) this.f83053b).getUninterpretedOptionList());
            }

            public boolean getWeak() {
                return ((FieldOptions) this.f83053b).getWeak();
            }

            /* renamed from: h0 */
            public C34194a mo99717h0() {
                mo100457F();
                ((FieldOptions) this.f83053b).clearCtype();
                return this;
            }

            public boolean hasCtype() {
                return ((FieldOptions) this.f83053b).hasCtype();
            }

            public boolean hasDeprecated() {
                return ((FieldOptions) this.f83053b).hasDeprecated();
            }

            public boolean hasJstype() {
                return ((FieldOptions) this.f83053b).hasJstype();
            }

            public boolean hasLazy() {
                return ((FieldOptions) this.f83053b).hasLazy();
            }

            public boolean hasPacked() {
                return ((FieldOptions) this.f83053b).hasPacked();
            }

            public boolean hasWeak() {
                return ((FieldOptions) this.f83053b).hasWeak();
            }

            /* renamed from: i0 */
            public C34194a mo99718i0() {
                mo100457F();
                ((FieldOptions) this.f83053b).clearDeprecated();
                return this;
            }

            /* renamed from: j0 */
            public C34194a mo99719j0() {
                mo100457F();
                ((FieldOptions) this.f83053b).clearJstype();
                return this;
            }

            /* renamed from: k0 */
            public C34194a mo99720k0() {
                mo100457F();
                ((FieldOptions) this.f83053b).clearLazy();
                return this;
            }

            /* renamed from: l0 */
            public C34194a mo99721l0() {
                mo100457F();
                ((FieldOptions) this.f83053b).clearPacked();
                return this;
            }

            /* renamed from: m0 */
            public C34194a mo99722m0() {
                mo100457F();
                ((FieldOptions) this.f83053b).clearUninterpretedOption();
                return this;
            }

            /* renamed from: o0 */
            public C34194a mo99723o0() {
                mo100457F();
                ((FieldOptions) this.f83053b).clearWeak();
                return this;
            }

            /* renamed from: q0 */
            public C34194a mo99724q0(int i) {
                mo100457F();
                ((FieldOptions) this.f83053b).removeUninterpretedOption(i);
                return this;
            }

            /* renamed from: r0 */
            public C34194a mo99725r0(CType cType) {
                mo100457F();
                ((FieldOptions) this.f83053b).setCtype(cType);
                return this;
            }

            /* renamed from: s0 */
            public C34194a mo99726s0(boolean z) {
                mo100457F();
                ((FieldOptions) this.f83053b).setDeprecated(z);
                return this;
            }

            /* renamed from: u0 */
            public C34194a mo99727u0(JSType jSType) {
                mo100457F();
                ((FieldOptions) this.f83053b).setJstype(jSType);
                return this;
            }

            /* renamed from: v0 */
            public C34194a mo99728v0(boolean z) {
                mo100457F();
                ((FieldOptions) this.f83053b).setLazy(z);
                return this;
            }

            /* renamed from: w0 */
            public C34194a mo99729w0(boolean z) {
                mo100457F();
                ((FieldOptions) this.f83053b).setPacked(z);
                return this;
            }

            /* renamed from: x0 */
            public C34194a mo99730x0(int i, UninterpretedOption.C34216a aVar) {
                mo100457F();
                ((FieldOptions) this.f83053b).setUninterpretedOption(i, (UninterpretedOption) aVar.mo100473g());
                return this;
            }

            /* renamed from: y0 */
            public C34194a mo99731y0(int i, UninterpretedOption uninterpretedOption) {
                mo100457F();
                ((FieldOptions) this.f83053b).setUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            /* renamed from: z0 */
            public C34194a mo99732z0(boolean z) {
                mo100457F();
                ((FieldOptions) this.f83053b).setWeak(z);
                return this;
            }

            public C34194a() {
                super(FieldOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            FieldOptions fieldOptions = new FieldOptions();
            DEFAULT_INSTANCE = fieldOptions;
            GeneratedMessageLite.registerDefaultInstance(FieldOptions.class, fieldOptions);
        }

        private FieldOptions() {
        }

        /* access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            C34319a.addAll(iterable, this.uninterpretedOption_);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void clearCtype() {
            this.bitField0_ &= -2;
            this.ctype_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -17;
            this.deprecated_ = false;
        }

        /* access modifiers changed from: private */
        public void clearJstype() {
            this.bitField0_ &= -5;
            this.jstype_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLazy() {
            this.bitField0_ &= -9;
            this.lazy_ = false;
        }

        /* access modifiers changed from: private */
        public void clearPacked() {
            this.bitField0_ &= -3;
            this.packed_ = false;
        }

        /* access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearWeak() {
            this.bitField0_ &= -33;
            this.weak_ = false;
        }

        private void ensureUninterpretedOptionIsMutable() {
            C34471v0.C34488k<UninterpretedOption> kVar = this.uninterpretedOption_;
            if (!kVar.mo100971T()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        public static FieldOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C34194a newBuilder() {
            return (C34194a) DEFAULT_INSTANCE.createBuilder();
        }

        public static FieldOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FieldOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<FieldOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setCtype(CType cType) {
            this.ctype_ = cType.getNumber();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 16;
            this.deprecated_ = z;
        }

        /* access modifiers changed from: private */
        public void setJstype(JSType jSType) {
            this.jstype_ = jSType.getNumber();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setLazy(boolean z) {
            this.bitField0_ |= 8;
            this.lazy_ = z;
        }

        /* access modifiers changed from: private */
        public void setPacked(boolean z) {
            this.bitField0_ |= 2;
            this.packed_ = z;
        }

        /* access modifiers changed from: private */
        public void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void setWeak(boolean z) {
            this.bitField0_ |= 32;
            this.weak_ = z;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 1;
            switch (C34218a.f82914a[methodToInvoke.ordinal()]) {
                case 1:
                    return new FieldOptions();
                case 2:
                    return new C34194a((C34218a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001ϧ\u0007\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0004\u0005ဇ\u0003\u0006ဌ\u0002\nဇ\u0005ϧЛ", new Object[]{"bitField0_", "ctype_", CType.m137877q(), "packed_", "deprecated_", "lazy_", "jstype_", JSType.m137884q(), "weak_", "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<FieldOptions> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (FieldOptions.class) {
                            y1Var = PARSER;
                            if (y1Var == null) {
                                y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                                PARSER = y1Var;
                            }
                        }
                    }
                    return y1Var;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public CType getCtype() {
            CType b = CType.m137875b(this.ctype_);
            if (b == null) {
                return CType.STRING;
            }
            return b;
        }

        public boolean getDeprecated() {
            return this.deprecated_;
        }

        public JSType getJstype() {
            JSType b = JSType.m137882b(this.jstype_);
            if (b == null) {
                return JSType.JS_NORMAL;
            }
            return b;
        }

        public boolean getLazy() {
            return this.lazy_;
        }

        public boolean getPacked() {
            return this.packed_;
        }

        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public C34239v getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends C34239v> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        public boolean getWeak() {
            return this.weak_;
        }

        public boolean hasCtype() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasDeprecated() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasJstype() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasLazy() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasPacked() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasWeak() {
            return (this.bitField0_ & 32) != 0;
        }

        public static C34194a newBuilder(FieldOptions fieldOptions) {
            return (C34194a) DEFAULT_INSTANCE.createBuilder(fieldOptions);
        }

        public static FieldOptions parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (FieldOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static FieldOptions parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static FieldOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, uninterpretedOption);
        }

        public static FieldOptions parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static FieldOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FieldOptions parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static FieldOptions parseFrom(InputStream inputStream) throws IOException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldOptions parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static FieldOptions parseFrom(C34448s sVar) throws IOException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static FieldOptions parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    public static final class FileDescriptorProto extends GeneratedMessageLite<FileDescriptorProto, C34195a> implements C34227j {
        /* access modifiers changed from: private */
        public static final FileDescriptorProto DEFAULT_INSTANCE;
        public static final int DEPENDENCY_FIELD_NUMBER = 3;
        public static final int ENUM_TYPE_FIELD_NUMBER = 5;
        public static final int EXTENSION_FIELD_NUMBER = 7;
        public static final int MESSAGE_TYPE_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 8;
        public static final int PACKAGE_FIELD_NUMBER = 2;
        private static volatile C34504y1<FileDescriptorProto> PARSER = null;
        public static final int PUBLIC_DEPENDENCY_FIELD_NUMBER = 10;
        public static final int SERVICE_FIELD_NUMBER = 6;
        public static final int SOURCE_CODE_INFO_FIELD_NUMBER = 9;
        public static final int SYNTAX_FIELD_NUMBER = 12;
        public static final int WEAK_DEPENDENCY_FIELD_NUMBER = 11;
        private int bitField0_;
        private C34471v0.C34488k<String> dependency_ = GeneratedMessageLite.emptyProtobufList();
        private C34471v0.C34488k<EnumDescriptorProto> enumType_ = GeneratedMessageLite.emptyProtobufList();
        private C34471v0.C34488k<FieldDescriptorProto> extension_ = GeneratedMessageLite.emptyProtobufList();
        private byte memoizedIsInitialized = 2;
        private C34471v0.C34488k<DescriptorProto> messageType_ = GeneratedMessageLite.emptyProtobufList();
        private String name_ = "";
        private FileOptions options_;
        private String package_ = "";
        private C34471v0.C34478g publicDependency_ = GeneratedMessageLite.emptyIntList();
        private C34471v0.C34488k<ServiceDescriptorProto> service_ = GeneratedMessageLite.emptyProtobufList();
        private SourceCodeInfo sourceCodeInfo_;
        private String syntax_ = "";
        private C34471v0.C34478g weakDependency_ = GeneratedMessageLite.emptyIntList();

        /* renamed from: com.google.protobuf.DescriptorProtos$FileDescriptorProto$a */
        public static final class C34195a extends GeneratedMessageLite.C34263b<FileDescriptorProto, C34195a> implements C34227j {
            public /* synthetic */ C34195a(C34218a aVar) {
                this();
            }

            /* renamed from: B0 */
            public C34195a mo99776B0() {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).clearExtension();
                return this;
            }

            /* renamed from: D0 */
            public C34195a mo99777D0() {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).clearMessageType();
                return this;
            }

            /* renamed from: E0 */
            public C34195a mo99778E0() {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).clearName();
                return this;
            }

            /* renamed from: F0 */
            public C34195a mo99779F0() {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).clearOptions();
                return this;
            }

            /* renamed from: G0 */
            public C34195a mo99780G0() {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).clearPackage();
                return this;
            }

            /* renamed from: H0 */
            public C34195a mo99781H0() {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).clearPublicDependency();
                return this;
            }

            /* renamed from: I0 */
            public C34195a mo99782I0() {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).clearService();
                return this;
            }

            /* renamed from: J0 */
            public C34195a mo99783J0() {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).clearSourceCodeInfo();
                return this;
            }

            /* renamed from: L0 */
            public C34195a mo99784L0() {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).clearSyntax();
                return this;
            }

            /* renamed from: M0 */
            public C34195a mo99785M0() {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).clearWeakDependency();
                return this;
            }

            /* renamed from: O0 */
            public C34195a mo99786O0(FileOptions fileOptions) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).mergeOptions(fileOptions);
                return this;
            }

            /* renamed from: P */
            public C34195a mo99787P(Iterable<String> iterable) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).addAllDependency(iterable);
                return this;
            }

            /* renamed from: P0 */
            public C34195a mo99788P0(SourceCodeInfo sourceCodeInfo) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).mergeSourceCodeInfo(sourceCodeInfo);
                return this;
            }

            /* renamed from: Q0 */
            public C34195a mo99789Q0(int i) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).removeEnumType(i);
                return this;
            }

            /* renamed from: R */
            public C34195a mo99790R(Iterable<? extends EnumDescriptorProto> iterable) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).addAllEnumType(iterable);
                return this;
            }

            /* renamed from: R0 */
            public C34195a mo99791R0(int i) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).removeExtension(i);
                return this;
            }

            /* renamed from: S */
            public C34195a mo99792S(Iterable<? extends FieldDescriptorProto> iterable) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).addAllExtension(iterable);
                return this;
            }

            /* renamed from: S0 */
            public C34195a mo99793S0(int i) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).removeMessageType(i);
                return this;
            }

            /* renamed from: T */
            public C34195a mo99794T(Iterable<? extends DescriptorProto> iterable) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).addAllMessageType(iterable);
                return this;
            }

            /* renamed from: T0 */
            public C34195a mo99795T0(int i) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).removeService(i);
                return this;
            }

            /* renamed from: U */
            public C34195a mo99796U(Iterable<? extends Integer> iterable) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).addAllPublicDependency(iterable);
                return this;
            }

            /* renamed from: U0 */
            public C34195a mo99797U0(int i, String str) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).setDependency(i, str);
                return this;
            }

            /* renamed from: V */
            public C34195a mo99798V(Iterable<? extends ServiceDescriptorProto> iterable) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).addAllService(iterable);
                return this;
            }

            /* renamed from: V0 */
            public C34195a mo99799V0(int i, EnumDescriptorProto.C34179a aVar) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).setEnumType(i, (EnumDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: W0 */
            public C34195a mo99800W0(int i, EnumDescriptorProto enumDescriptorProto) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).setEnumType(i, enumDescriptorProto);
                return this;
            }

            /* renamed from: X0 */
            public C34195a mo99801X0(int i, FieldDescriptorProto.C34189a aVar) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).setExtension(i, (FieldDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: Y */
            public C34195a mo99802Y(Iterable<? extends Integer> iterable) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).addAllWeakDependency(iterable);
                return this;
            }

            /* renamed from: Y0 */
            public C34195a mo99803Y0(int i, FieldDescriptorProto fieldDescriptorProto) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).setExtension(i, fieldDescriptorProto);
                return this;
            }

            /* renamed from: Z */
            public C34195a mo99804Z(String str) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).addDependency(str);
                return this;
            }

            /* renamed from: Z0 */
            public C34195a mo99805Z0(int i, DescriptorProto.C34175a aVar) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).setMessageType(i, (DescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: a0 */
            public C34195a mo99806a0(ByteString byteString) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).addDependencyBytes(byteString);
                return this;
            }

            /* renamed from: a1 */
            public C34195a mo99807a1(int i, DescriptorProto descriptorProto) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).setMessageType(i, descriptorProto);
                return this;
            }

            /* renamed from: b0 */
            public C34195a mo99808b0(int i, EnumDescriptorProto.C34179a aVar) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).addEnumType(i, (EnumDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: b1 */
            public C34195a mo99809b1(String str) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).setName(str);
                return this;
            }

            /* renamed from: c0 */
            public C34195a mo99810c0(int i, EnumDescriptorProto enumDescriptorProto) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).addEnumType(i, enumDescriptorProto);
                return this;
            }

            /* renamed from: c1 */
            public C34195a mo99811c1(ByteString byteString) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).setNameBytes(byteString);
                return this;
            }

            /* renamed from: d0 */
            public C34195a mo99812d0(EnumDescriptorProto.C34179a aVar) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).addEnumType((EnumDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: d1 */
            public C34195a mo99813d1(FileOptions.C34199a aVar) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).setOptions((FileOptions) aVar.mo100473g());
                return this;
            }

            /* renamed from: e1 */
            public C34195a mo99814e1(FileOptions fileOptions) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).setOptions(fileOptions);
                return this;
            }

            /* renamed from: f1 */
            public C34195a mo99815f1(String str) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).setPackage(str);
                return this;
            }

            /* renamed from: g0 */
            public C34195a mo99816g0(EnumDescriptorProto enumDescriptorProto) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).addEnumType(enumDescriptorProto);
                return this;
            }

            /* renamed from: g1 */
            public C34195a mo99817g1(ByteString byteString) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).setPackageBytes(byteString);
                return this;
            }

            public String getDependency(int i) {
                return ((FileDescriptorProto) this.f83053b).getDependency(i);
            }

            public ByteString getDependencyBytes(int i) {
                return ((FileDescriptorProto) this.f83053b).getDependencyBytes(i);
            }

            public int getDependencyCount() {
                return ((FileDescriptorProto) this.f83053b).getDependencyCount();
            }

            public List<String> getDependencyList() {
                return Collections.unmodifiableList(((FileDescriptorProto) this.f83053b).getDependencyList());
            }

            public EnumDescriptorProto getEnumType(int i) {
                return ((FileDescriptorProto) this.f83053b).getEnumType(i);
            }

            public int getEnumTypeCount() {
                return ((FileDescriptorProto) this.f83053b).getEnumTypeCount();
            }

            public List<EnumDescriptorProto> getEnumTypeList() {
                return Collections.unmodifiableList(((FileDescriptorProto) this.f83053b).getEnumTypeList());
            }

            public FieldDescriptorProto getExtension(int i) {
                return ((FileDescriptorProto) this.f83053b).getExtension(i);
            }

            public int getExtensionCount() {
                return ((FileDescriptorProto) this.f83053b).getExtensionCount();
            }

            public List<FieldDescriptorProto> getExtensionList() {
                return Collections.unmodifiableList(((FileDescriptorProto) this.f83053b).getExtensionList());
            }

            public DescriptorProto getMessageType(int i) {
                return ((FileDescriptorProto) this.f83053b).getMessageType(i);
            }

            public int getMessageTypeCount() {
                return ((FileDescriptorProto) this.f83053b).getMessageTypeCount();
            }

            public List<DescriptorProto> getMessageTypeList() {
                return Collections.unmodifiableList(((FileDescriptorProto) this.f83053b).getMessageTypeList());
            }

            public String getName() {
                return ((FileDescriptorProto) this.f83053b).getName();
            }

            public ByteString getNameBytes() {
                return ((FileDescriptorProto) this.f83053b).getNameBytes();
            }

            public FileOptions getOptions() {
                return ((FileDescriptorProto) this.f83053b).getOptions();
            }

            public String getPackage() {
                return ((FileDescriptorProto) this.f83053b).getPackage();
            }

            public ByteString getPackageBytes() {
                return ((FileDescriptorProto) this.f83053b).getPackageBytes();
            }

            public int getPublicDependency(int i) {
                return ((FileDescriptorProto) this.f83053b).getPublicDependency(i);
            }

            public int getPublicDependencyCount() {
                return ((FileDescriptorProto) this.f83053b).getPublicDependencyCount();
            }

            public List<Integer> getPublicDependencyList() {
                return Collections.unmodifiableList(((FileDescriptorProto) this.f83053b).getPublicDependencyList());
            }

            public ServiceDescriptorProto getService(int i) {
                return ((FileDescriptorProto) this.f83053b).getService(i);
            }

            public int getServiceCount() {
                return ((FileDescriptorProto) this.f83053b).getServiceCount();
            }

            public List<ServiceDescriptorProto> getServiceList() {
                return Collections.unmodifiableList(((FileDescriptorProto) this.f83053b).getServiceList());
            }

            public SourceCodeInfo getSourceCodeInfo() {
                return ((FileDescriptorProto) this.f83053b).getSourceCodeInfo();
            }

            public String getSyntax() {
                return ((FileDescriptorProto) this.f83053b).getSyntax();
            }

            public ByteString getSyntaxBytes() {
                return ((FileDescriptorProto) this.f83053b).getSyntaxBytes();
            }

            public int getWeakDependency(int i) {
                return ((FileDescriptorProto) this.f83053b).getWeakDependency(i);
            }

            public int getWeakDependencyCount() {
                return ((FileDescriptorProto) this.f83053b).getWeakDependencyCount();
            }

            public List<Integer> getWeakDependencyList() {
                return Collections.unmodifiableList(((FileDescriptorProto) this.f83053b).getWeakDependencyList());
            }

            /* renamed from: h0 */
            public C34195a mo99818h0(int i, FieldDescriptorProto.C34189a aVar) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).addExtension(i, (FieldDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: h1 */
            public C34195a mo99819h1(int i, int i2) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).setPublicDependency(i, i2);
                return this;
            }

            public boolean hasName() {
                return ((FileDescriptorProto) this.f83053b).hasName();
            }

            public boolean hasOptions() {
                return ((FileDescriptorProto) this.f83053b).hasOptions();
            }

            public boolean hasPackage() {
                return ((FileDescriptorProto) this.f83053b).hasPackage();
            }

            public boolean hasSourceCodeInfo() {
                return ((FileDescriptorProto) this.f83053b).hasSourceCodeInfo();
            }

            public boolean hasSyntax() {
                return ((FileDescriptorProto) this.f83053b).hasSyntax();
            }

            /* renamed from: i0 */
            public C34195a mo99820i0(int i, FieldDescriptorProto fieldDescriptorProto) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).addExtension(i, fieldDescriptorProto);
                return this;
            }

            /* renamed from: i1 */
            public C34195a mo99821i1(int i, ServiceDescriptorProto.C34210a aVar) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).setService(i, (ServiceDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: j0 */
            public C34195a mo99822j0(FieldDescriptorProto.C34189a aVar) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).addExtension((FieldDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: k0 */
            public C34195a mo99823k0(FieldDescriptorProto fieldDescriptorProto) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).addExtension(fieldDescriptorProto);
                return this;
            }

            /* renamed from: l0 */
            public C34195a mo99824l0(int i, DescriptorProto.C34175a aVar) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).addMessageType(i, (DescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: l1 */
            public C34195a mo99825l1(int i, ServiceDescriptorProto serviceDescriptorProto) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).setService(i, serviceDescriptorProto);
                return this;
            }

            /* renamed from: m0 */
            public C34195a mo99826m0(int i, DescriptorProto descriptorProto) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).addMessageType(i, descriptorProto);
                return this;
            }

            /* renamed from: m1 */
            public C34195a mo99827m1(SourceCodeInfo.C34213a aVar) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).setSourceCodeInfo((SourceCodeInfo) aVar.mo100473g());
                return this;
            }

            /* renamed from: n1 */
            public C34195a mo99828n1(SourceCodeInfo sourceCodeInfo) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).setSourceCodeInfo(sourceCodeInfo);
                return this;
            }

            /* renamed from: o0 */
            public C34195a mo99829o0(DescriptorProto.C34175a aVar) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).addMessageType((DescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: o1 */
            public C34195a mo99830o1(String str) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).setSyntax(str);
                return this;
            }

            /* renamed from: p1 */
            public C34195a mo99831p1(ByteString byteString) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).setSyntaxBytes(byteString);
                return this;
            }

            /* renamed from: q0 */
            public C34195a mo99832q0(DescriptorProto descriptorProto) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).addMessageType(descriptorProto);
                return this;
            }

            /* renamed from: q1 */
            public C34195a mo99833q1(int i, int i2) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).setWeakDependency(i, i2);
                return this;
            }

            /* renamed from: r0 */
            public C34195a mo99834r0(int i) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).addPublicDependency(i);
                return this;
            }

            /* renamed from: s0 */
            public C34195a mo99835s0(int i, ServiceDescriptorProto.C34210a aVar) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).addService(i, (ServiceDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: u0 */
            public C34195a mo99836u0(int i, ServiceDescriptorProto serviceDescriptorProto) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).addService(i, serviceDescriptorProto);
                return this;
            }

            /* renamed from: v0 */
            public C34195a mo99837v0(ServiceDescriptorProto.C34210a aVar) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).addService((ServiceDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: w0 */
            public C34195a mo99838w0(ServiceDescriptorProto serviceDescriptorProto) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).addService(serviceDescriptorProto);
                return this;
            }

            /* renamed from: x0 */
            public C34195a mo99839x0(int i) {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).addWeakDependency(i);
                return this;
            }

            /* renamed from: y0 */
            public C34195a mo99840y0() {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).clearDependency();
                return this;
            }

            /* renamed from: z0 */
            public C34195a mo99841z0() {
                mo100457F();
                ((FileDescriptorProto) this.f83053b).clearEnumType();
                return this;
            }

            public C34195a() {
                super(FileDescriptorProto.DEFAULT_INSTANCE);
            }
        }

        static {
            FileDescriptorProto fileDescriptorProto = new FileDescriptorProto();
            DEFAULT_INSTANCE = fileDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(FileDescriptorProto.class, fileDescriptorProto);
        }

        private FileDescriptorProto() {
        }

        /* access modifiers changed from: private */
        public void addAllDependency(Iterable<String> iterable) {
            ensureDependencyIsMutable();
            C34319a.addAll(iterable, this.dependency_);
        }

        /* access modifiers changed from: private */
        public void addAllEnumType(Iterable<? extends EnumDescriptorProto> iterable) {
            ensureEnumTypeIsMutable();
            C34319a.addAll(iterable, this.enumType_);
        }

        /* access modifiers changed from: private */
        public void addAllExtension(Iterable<? extends FieldDescriptorProto> iterable) {
            ensureExtensionIsMutable();
            C34319a.addAll(iterable, this.extension_);
        }

        /* access modifiers changed from: private */
        public void addAllMessageType(Iterable<? extends DescriptorProto> iterable) {
            ensureMessageTypeIsMutable();
            C34319a.addAll(iterable, this.messageType_);
        }

        /* access modifiers changed from: private */
        public void addAllPublicDependency(Iterable<? extends Integer> iterable) {
            ensurePublicDependencyIsMutable();
            C34319a.addAll(iterable, this.publicDependency_);
        }

        /* access modifiers changed from: private */
        public void addAllService(Iterable<? extends ServiceDescriptorProto> iterable) {
            ensureServiceIsMutable();
            C34319a.addAll(iterable, this.service_);
        }

        /* access modifiers changed from: private */
        public void addAllWeakDependency(Iterable<? extends Integer> iterable) {
            ensureWeakDependencyIsMutable();
            C34319a.addAll(iterable, this.weakDependency_);
        }

        /* access modifiers changed from: private */
        public void addDependency(String str) {
            str.getClass();
            ensureDependencyIsMutable();
            this.dependency_.add(str);
        }

        /* access modifiers changed from: private */
        public void addDependencyBytes(ByteString byteString) {
            ensureDependencyIsMutable();
            this.dependency_.add(byteString.mo99228S0());
        }

        /* access modifiers changed from: private */
        public void addEnumType(EnumDescriptorProto enumDescriptorProto) {
            enumDescriptorProto.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.add(enumDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addExtension(FieldDescriptorProto fieldDescriptorProto) {
            fieldDescriptorProto.getClass();
            ensureExtensionIsMutable();
            this.extension_.add(fieldDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addMessageType(DescriptorProto descriptorProto) {
            descriptorProto.getClass();
            ensureMessageTypeIsMutable();
            this.messageType_.add(descriptorProto);
        }

        /* access modifiers changed from: private */
        public void addPublicDependency(int i) {
            ensurePublicDependencyIsMutable();
            this.publicDependency_.mo101605V(i);
        }

        /* access modifiers changed from: private */
        public void addService(ServiceDescriptorProto serviceDescriptorProto) {
            serviceDescriptorProto.getClass();
            ensureServiceIsMutable();
            this.service_.add(serviceDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addWeakDependency(int i) {
            ensureWeakDependencyIsMutable();
            this.weakDependency_.mo101605V(i);
        }

        /* access modifiers changed from: private */
        public void clearDependency() {
            this.dependency_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearEnumType() {
            this.enumType_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearExtension() {
            this.extension_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearMessageType() {
            this.messageType_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -5;
        }

        /* access modifiers changed from: private */
        public void clearPackage() {
            this.bitField0_ &= -3;
            this.package_ = getDefaultInstance().getPackage();
        }

        /* access modifiers changed from: private */
        public void clearPublicDependency() {
            this.publicDependency_ = GeneratedMessageLite.emptyIntList();
        }

        /* access modifiers changed from: private */
        public void clearService() {
            this.service_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearSourceCodeInfo() {
            this.sourceCodeInfo_ = null;
            this.bitField0_ &= -9;
        }

        /* access modifiers changed from: private */
        public void clearSyntax() {
            this.bitField0_ &= -17;
            this.syntax_ = getDefaultInstance().getSyntax();
        }

        /* access modifiers changed from: private */
        public void clearWeakDependency() {
            this.weakDependency_ = GeneratedMessageLite.emptyIntList();
        }

        private void ensureDependencyIsMutable() {
            C34471v0.C34488k<String> kVar = this.dependency_;
            if (!kVar.mo100971T()) {
                this.dependency_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        private void ensureEnumTypeIsMutable() {
            C34471v0.C34488k<EnumDescriptorProto> kVar = this.enumType_;
            if (!kVar.mo100971T()) {
                this.enumType_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        private void ensureExtensionIsMutable() {
            C34471v0.C34488k<FieldDescriptorProto> kVar = this.extension_;
            if (!kVar.mo100971T()) {
                this.extension_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        private void ensureMessageTypeIsMutable() {
            C34471v0.C34488k<DescriptorProto> kVar = this.messageType_;
            if (!kVar.mo100971T()) {
                this.messageType_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        private void ensurePublicDependencyIsMutable() {
            C34471v0.C34478g gVar = this.publicDependency_;
            if (!gVar.mo100971T()) {
                this.publicDependency_ = GeneratedMessageLite.mutableCopy(gVar);
            }
        }

        private void ensureServiceIsMutable() {
            C34471v0.C34488k<ServiceDescriptorProto> kVar = this.service_;
            if (!kVar.mo100971T()) {
                this.service_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        private void ensureWeakDependencyIsMutable() {
            C34471v0.C34478g gVar = this.weakDependency_;
            if (!gVar.mo100971T()) {
                this.weakDependency_ = GeneratedMessageLite.mutableCopy(gVar);
            }
        }

        public static FileDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeOptions(FileOptions fileOptions) {
            fileOptions.getClass();
            FileOptions fileOptions2 = this.options_;
            if (fileOptions2 == null || fileOptions2 == FileOptions.getDefaultInstance()) {
                this.options_ = fileOptions;
            } else {
                this.options_ = (FileOptions) ((FileOptions.C34199a) FileOptions.newBuilder(this.options_).mo100463K(fileOptions)).mo100467Q();
            }
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void mergeSourceCodeInfo(SourceCodeInfo sourceCodeInfo) {
            sourceCodeInfo.getClass();
            SourceCodeInfo sourceCodeInfo2 = this.sourceCodeInfo_;
            if (sourceCodeInfo2 == null || sourceCodeInfo2 == SourceCodeInfo.getDefaultInstance()) {
                this.sourceCodeInfo_ = sourceCodeInfo;
            } else {
                this.sourceCodeInfo_ = (SourceCodeInfo) ((SourceCodeInfo.C34213a) SourceCodeInfo.newBuilder(this.sourceCodeInfo_).mo100463K(sourceCodeInfo)).mo100467Q();
            }
            this.bitField0_ |= 8;
        }

        public static C34195a newBuilder() {
            return (C34195a) DEFAULT_INSTANCE.createBuilder();
        }

        public static FileDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FileDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FileDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<FileDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeEnumType(int i) {
            ensureEnumTypeIsMutable();
            this.enumType_.remove(i);
        }

        /* access modifiers changed from: private */
        public void removeExtension(int i) {
            ensureExtensionIsMutable();
            this.extension_.remove(i);
        }

        /* access modifiers changed from: private */
        public void removeMessageType(int i) {
            ensureMessageTypeIsMutable();
            this.messageType_.remove(i);
        }

        /* access modifiers changed from: private */
        public void removeService(int i) {
            ensureServiceIsMutable();
            this.service_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setDependency(int i, String str) {
            str.getClass();
            ensureDependencyIsMutable();
            this.dependency_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void setEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
            enumDescriptorProto.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.set(i, enumDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void setExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
            fieldDescriptorProto.getClass();
            ensureExtensionIsMutable();
            this.extension_.set(i, fieldDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void setMessageType(int i, DescriptorProto descriptorProto) {
            descriptorProto.getClass();
            ensureMessageTypeIsMutable();
            this.messageType_.set(i, descriptorProto);
        }

        /* access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            this.name_ = byteString.mo99228S0();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setOptions(FileOptions fileOptions) {
            fileOptions.getClass();
            this.options_ = fileOptions;
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setPackage(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.package_ = str;
        }

        /* access modifiers changed from: private */
        public void setPackageBytes(ByteString byteString) {
            this.package_ = byteString.mo99228S0();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setPublicDependency(int i, int i2) {
            ensurePublicDependencyIsMutable();
            this.publicDependency_.mo101613o(i, i2);
        }

        /* access modifiers changed from: private */
        public void setService(int i, ServiceDescriptorProto serviceDescriptorProto) {
            serviceDescriptorProto.getClass();
            ensureServiceIsMutable();
            this.service_.set(i, serviceDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void setSourceCodeInfo(SourceCodeInfo sourceCodeInfo) {
            sourceCodeInfo.getClass();
            this.sourceCodeInfo_ = sourceCodeInfo;
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setSyntax(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.syntax_ = str;
        }

        /* access modifiers changed from: private */
        public void setSyntaxBytes(ByteString byteString) {
            this.syntax_ = byteString.mo99228S0();
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setWeakDependency(int i, int i2) {
            ensureWeakDependencyIsMutable();
            this.weakDependency_.mo101613o(i, i2);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 1;
            switch (C34218a.f82914a[methodToInvoke.ordinal()]) {
                case 1:
                    return new FileDescriptorProto();
                case 2:
                    return new C34195a((C34218a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0007\u0005\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004Л\u0005Л\u0006Л\u0007Л\bᐉ\u0002\tဉ\u0003\n\u0016\u000b\u0016\fဈ\u0004", new Object[]{"bitField0_", "name_", "package_", "dependency_", "messageType_", DescriptorProto.class, "enumType_", EnumDescriptorProto.class, "service_", ServiceDescriptorProto.class, "extension_", FieldDescriptorProto.class, "options_", "sourceCodeInfo_", "publicDependency_", "weakDependency_", "syntax_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<FileDescriptorProto> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (FileDescriptorProto.class) {
                            y1Var = PARSER;
                            if (y1Var == null) {
                                y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                                PARSER = y1Var;
                            }
                        }
                    }
                    return y1Var;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getDependency(int i) {
            return this.dependency_.get(i);
        }

        public ByteString getDependencyBytes(int i) {
            return ByteString.m137260e0(this.dependency_.get(i));
        }

        public int getDependencyCount() {
            return this.dependency_.size();
        }

        public List<String> getDependencyList() {
            return this.dependency_;
        }

        public EnumDescriptorProto getEnumType(int i) {
            return this.enumType_.get(i);
        }

        public int getEnumTypeCount() {
            return this.enumType_.size();
        }

        public List<EnumDescriptorProto> getEnumTypeList() {
            return this.enumType_;
        }

        public C34220c getEnumTypeOrBuilder(int i) {
            return this.enumType_.get(i);
        }

        public List<? extends C34220c> getEnumTypeOrBuilderList() {
            return this.enumType_;
        }

        public FieldDescriptorProto getExtension(int i) {
            return this.extension_.get(i);
        }

        public int getExtensionCount() {
            return this.extension_.size();
        }

        public List<FieldDescriptorProto> getExtensionList() {
            return this.extension_;
        }

        public C34225h getExtensionOrBuilder(int i) {
            return this.extension_.get(i);
        }

        public List<? extends C34225h> getExtensionOrBuilderList() {
            return this.extension_;
        }

        public DescriptorProto getMessageType(int i) {
            return this.messageType_.get(i);
        }

        public int getMessageTypeCount() {
            return this.messageType_.size();
        }

        public List<DescriptorProto> getMessageTypeList() {
            return this.messageType_;
        }

        public C34219b getMessageTypeOrBuilder(int i) {
            return this.messageType_.get(i);
        }

        public List<? extends C34219b> getMessageTypeOrBuilderList() {
            return this.messageType_;
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.m137260e0(this.name_);
        }

        public FileOptions getOptions() {
            FileOptions fileOptions = this.options_;
            return fileOptions == null ? FileOptions.getDefaultInstance() : fileOptions;
        }

        public String getPackage() {
            return this.package_;
        }

        public ByteString getPackageBytes() {
            return ByteString.m137260e0(this.package_);
        }

        public int getPublicDependency(int i) {
            return this.publicDependency_.getInt(i);
        }

        public int getPublicDependencyCount() {
            return this.publicDependency_.size();
        }

        public List<Integer> getPublicDependencyList() {
            return this.publicDependency_;
        }

        public ServiceDescriptorProto getService(int i) {
            return this.service_.get(i);
        }

        public int getServiceCount() {
            return this.service_.size();
        }

        public List<ServiceDescriptorProto> getServiceList() {
            return this.service_;
        }

        public C34236s getServiceOrBuilder(int i) {
            return this.service_.get(i);
        }

        public List<? extends C34236s> getServiceOrBuilderList() {
            return this.service_;
        }

        public SourceCodeInfo getSourceCodeInfo() {
            SourceCodeInfo sourceCodeInfo = this.sourceCodeInfo_;
            return sourceCodeInfo == null ? SourceCodeInfo.getDefaultInstance() : sourceCodeInfo;
        }

        public String getSyntax() {
            return this.syntax_;
        }

        public ByteString getSyntaxBytes() {
            return ByteString.m137260e0(this.syntax_);
        }

        public int getWeakDependency(int i) {
            return this.weakDependency_.getInt(i);
        }

        public int getWeakDependencyCount() {
            return this.weakDependency_.size();
        }

        public List<Integer> getWeakDependencyList() {
            return this.weakDependency_;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasPackage() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasSourceCodeInfo() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasSyntax() {
            return (this.bitField0_ & 16) != 0;
        }

        public static C34195a newBuilder(FileDescriptorProto fileDescriptorProto) {
            return (C34195a) DEFAULT_INSTANCE.createBuilder(fileDescriptorProto);
        }

        public static FileDescriptorProto parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (FileDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static FileDescriptorProto parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static FileDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
            enumDescriptorProto.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.add(i, enumDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
            fieldDescriptorProto.getClass();
            ensureExtensionIsMutable();
            this.extension_.add(i, fieldDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void addMessageType(int i, DescriptorProto descriptorProto) {
            descriptorProto.getClass();
            ensureMessageTypeIsMutable();
            this.messageType_.add(i, descriptorProto);
        }

        /* access modifiers changed from: private */
        public void addService(int i, ServiceDescriptorProto serviceDescriptorProto) {
            serviceDescriptorProto.getClass();
            ensureServiceIsMutable();
            this.service_.add(i, serviceDescriptorProto);
        }

        public static FileDescriptorProto parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static FileDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FileDescriptorProto parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static FileDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FileDescriptorProto parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static FileDescriptorProto parseFrom(C34448s sVar) throws IOException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static FileDescriptorProto parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    public static final class FileDescriptorSet extends GeneratedMessageLite<FileDescriptorSet, C34196a> implements C34228k {
        /* access modifiers changed from: private */
        public static final FileDescriptorSet DEFAULT_INSTANCE;
        public static final int FILE_FIELD_NUMBER = 1;
        private static volatile C34504y1<FileDescriptorSet> PARSER;
        private C34471v0.C34488k<FileDescriptorProto> file_ = GeneratedMessageLite.emptyProtobufList();
        private byte memoizedIsInitialized = 2;

        /* renamed from: com.google.protobuf.DescriptorProtos$FileDescriptorSet$a */
        public static final class C34196a extends GeneratedMessageLite.C34263b<FileDescriptorSet, C34196a> implements C34228k {
            public /* synthetic */ C34196a(C34218a aVar) {
                this();
            }

            /* renamed from: P */
            public C34196a mo99847P(Iterable<? extends FileDescriptorProto> iterable) {
                mo100457F();
                ((FileDescriptorSet) this.f83053b).addAllFile(iterable);
                return this;
            }

            /* renamed from: R */
            public C34196a mo99848R(int i, FileDescriptorProto.C34195a aVar) {
                mo100457F();
                ((FileDescriptorSet) this.f83053b).addFile(i, (FileDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: S */
            public C34196a mo99849S(int i, FileDescriptorProto fileDescriptorProto) {
                mo100457F();
                ((FileDescriptorSet) this.f83053b).addFile(i, fileDescriptorProto);
                return this;
            }

            /* renamed from: T */
            public C34196a mo99850T(FileDescriptorProto.C34195a aVar) {
                mo100457F();
                ((FileDescriptorSet) this.f83053b).addFile((FileDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: U */
            public C34196a mo99851U(FileDescriptorProto fileDescriptorProto) {
                mo100457F();
                ((FileDescriptorSet) this.f83053b).addFile(fileDescriptorProto);
                return this;
            }

            /* renamed from: V */
            public C34196a mo99852V() {
                mo100457F();
                ((FileDescriptorSet) this.f83053b).clearFile();
                return this;
            }

            /* renamed from: Y */
            public C34196a mo99853Y(int i) {
                mo100457F();
                ((FileDescriptorSet) this.f83053b).removeFile(i);
                return this;
            }

            /* renamed from: Z */
            public C34196a mo99854Z(int i, FileDescriptorProto.C34195a aVar) {
                mo100457F();
                ((FileDescriptorSet) this.f83053b).setFile(i, (FileDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: a0 */
            public C34196a mo99855a0(int i, FileDescriptorProto fileDescriptorProto) {
                mo100457F();
                ((FileDescriptorSet) this.f83053b).setFile(i, fileDescriptorProto);
                return this;
            }

            public FileDescriptorProto getFile(int i) {
                return ((FileDescriptorSet) this.f83053b).getFile(i);
            }

            public int getFileCount() {
                return ((FileDescriptorSet) this.f83053b).getFileCount();
            }

            public List<FileDescriptorProto> getFileList() {
                return Collections.unmodifiableList(((FileDescriptorSet) this.f83053b).getFileList());
            }

            public C34196a() {
                super(FileDescriptorSet.DEFAULT_INSTANCE);
            }
        }

        static {
            FileDescriptorSet fileDescriptorSet = new FileDescriptorSet();
            DEFAULT_INSTANCE = fileDescriptorSet;
            GeneratedMessageLite.registerDefaultInstance(FileDescriptorSet.class, fileDescriptorSet);
        }

        private FileDescriptorSet() {
        }

        /* access modifiers changed from: private */
        public void addAllFile(Iterable<? extends FileDescriptorProto> iterable) {
            ensureFileIsMutable();
            C34319a.addAll(iterable, this.file_);
        }

        /* access modifiers changed from: private */
        public void addFile(FileDescriptorProto fileDescriptorProto) {
            fileDescriptorProto.getClass();
            ensureFileIsMutable();
            this.file_.add(fileDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void clearFile() {
            this.file_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureFileIsMutable() {
            C34471v0.C34488k<FileDescriptorProto> kVar = this.file_;
            if (!kVar.mo100971T()) {
                this.file_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        public static FileDescriptorSet getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C34196a newBuilder() {
            return (C34196a) DEFAULT_INSTANCE.createBuilder();
        }

        public static FileDescriptorSet parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FileDescriptorSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FileDescriptorSet parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<FileDescriptorSet> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeFile(int i) {
            ensureFileIsMutable();
            this.file_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setFile(int i, FileDescriptorProto fileDescriptorProto) {
            fileDescriptorProto.getClass();
            ensureFileIsMutable();
            this.file_.set(i, fileDescriptorProto);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 1;
            switch (C34218a.f82914a[methodToInvoke.ordinal()]) {
                case 1:
                    return new FileDescriptorSet();
                case 2:
                    return new C34196a((C34218a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"file_", FileDescriptorProto.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<FileDescriptorSet> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (FileDescriptorSet.class) {
                            y1Var = PARSER;
                            if (y1Var == null) {
                                y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                                PARSER = y1Var;
                            }
                        }
                    }
                    return y1Var;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public FileDescriptorProto getFile(int i) {
            return this.file_.get(i);
        }

        public int getFileCount() {
            return this.file_.size();
        }

        public List<FileDescriptorProto> getFileList() {
            return this.file_;
        }

        public C34227j getFileOrBuilder(int i) {
            return this.file_.get(i);
        }

        public List<? extends C34227j> getFileOrBuilderList() {
            return this.file_;
        }

        public static C34196a newBuilder(FileDescriptorSet fileDescriptorSet) {
            return (C34196a) DEFAULT_INSTANCE.createBuilder(fileDescriptorSet);
        }

        public static FileDescriptorSet parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (FileDescriptorSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static FileDescriptorSet parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static FileDescriptorSet parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addFile(int i, FileDescriptorProto fileDescriptorProto) {
            fileDescriptorProto.getClass();
            ensureFileIsMutable();
            this.file_.add(i, fileDescriptorProto);
        }

        public static FileDescriptorSet parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static FileDescriptorSet parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FileDescriptorSet parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static FileDescriptorSet parseFrom(InputStream inputStream) throws IOException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FileDescriptorSet parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static FileDescriptorSet parseFrom(C34448s sVar) throws IOException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static FileDescriptorSet parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    public static final class FileOptions extends GeneratedMessageLite.ExtendableMessage<FileOptions, C34199a> implements C34229l {
        public static final int CC_ENABLE_ARENAS_FIELD_NUMBER = 31;
        public static final int CC_GENERIC_SERVICES_FIELD_NUMBER = 16;
        public static final int CSHARP_NAMESPACE_FIELD_NUMBER = 37;
        /* access modifiers changed from: private */
        public static final FileOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 23;
        public static final int GO_PACKAGE_FIELD_NUMBER = 11;
        public static final int JAVA_GENERATE_EQUALS_AND_HASH_FIELD_NUMBER = 20;
        public static final int JAVA_GENERIC_SERVICES_FIELD_NUMBER = 17;
        public static final int JAVA_MULTIPLE_FILES_FIELD_NUMBER = 10;
        public static final int JAVA_OUTER_CLASSNAME_FIELD_NUMBER = 8;
        public static final int JAVA_PACKAGE_FIELD_NUMBER = 1;
        public static final int JAVA_STRING_CHECK_UTF8_FIELD_NUMBER = 27;
        public static final int OBJC_CLASS_PREFIX_FIELD_NUMBER = 36;
        public static final int OPTIMIZE_FOR_FIELD_NUMBER = 9;
        private static volatile C34504y1<FileOptions> PARSER = null;
        public static final int PHP_CLASS_PREFIX_FIELD_NUMBER = 40;
        public static final int PHP_GENERIC_SERVICES_FIELD_NUMBER = 42;
        public static final int PHP_METADATA_NAMESPACE_FIELD_NUMBER = 44;
        public static final int PHP_NAMESPACE_FIELD_NUMBER = 41;
        public static final int PY_GENERIC_SERVICES_FIELD_NUMBER = 18;
        public static final int RUBY_PACKAGE_FIELD_NUMBER = 45;
        public static final int SWIFT_PREFIX_FIELD_NUMBER = 39;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean ccEnableArenas_ = true;
        private boolean ccGenericServices_;
        private String csharpNamespace_ = "";
        private boolean deprecated_;
        private String goPackage_ = "";
        private boolean javaGenerateEqualsAndHash_;
        private boolean javaGenericServices_;
        private boolean javaMultipleFiles_;
        private String javaOuterClassname_ = "";
        private String javaPackage_ = "";
        private boolean javaStringCheckUtf8_;
        private byte memoizedIsInitialized = 2;
        private String objcClassPrefix_ = "";
        private int optimizeFor_ = 1;
        private String phpClassPrefix_ = "";
        private boolean phpGenericServices_;
        private String phpMetadataNamespace_ = "";
        private String phpNamespace_ = "";
        private boolean pyGenericServices_;
        private String rubyPackage_ = "";
        private String swiftPrefix_ = "";
        private C34471v0.C34488k<UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

        public enum OptimizeMode implements C34471v0.C34474c {
            SPEED(1),
            CODE_SIZE(2),
            LITE_RUNTIME(3);
            

            /* renamed from: d */
            public static final int f82899d = 1;

            /* renamed from: e */
            public static final int f82900e = 2;

            /* renamed from: f */
            public static final int f82901f = 3;

            /* renamed from: g */
            public static final C34471v0.C34475d<OptimizeMode> f82902g = null;
            private final int value;

            /* renamed from: com.google.protobuf.DescriptorProtos$FileOptions$OptimizeMode$a */
            public class C34197a implements C34471v0.C34475d<OptimizeMode> {
                /* renamed from: b */
                public OptimizeMode mo93187a(int i) {
                    return OptimizeMode.m137985b(i);
                }
            }

            /* renamed from: com.google.protobuf.DescriptorProtos$FileOptions$OptimizeMode$b */
            public static final class C34198b implements C34471v0.C34476e {

                /* renamed from: a */
                public static final C34471v0.C34476e f82904a = null;

                static {
                    f82904a = new C34198b();
                }

                /* renamed from: a */
                public boolean mo93189a(int i) {
                    return OptimizeMode.m137985b(i) != null;
                }
            }

            /* access modifiers changed from: public */
            static {
                f82902g = new C34197a();
            }

            /* access modifiers changed from: public */
            OptimizeMode(int i) {
                this.value = i;
            }

            /* renamed from: b */
            public static OptimizeMode m137985b(int i) {
                if (i == 1) {
                    return SPEED;
                }
                if (i == 2) {
                    return CODE_SIZE;
                }
                if (i != 3) {
                    return null;
                }
                return LITE_RUNTIME;
            }

            /* renamed from: g */
            public static C34471v0.C34475d<OptimizeMode> m137986g() {
                return f82902g;
            }

            /* renamed from: q */
            public static C34471v0.C34476e m137987q() {
                return C34198b.f82904a;
            }

            @Deprecated
            /* renamed from: r */
            public static OptimizeMode m137988r(int i) {
                return m137985b(i);
            }

            public final int getNumber() {
                return this.value;
            }
        }

        /* renamed from: com.google.protobuf.DescriptorProtos$FileOptions$a */
        public static final class C34199a extends GeneratedMessageLite.C34265d<FileOptions, C34199a> implements C34229l {
            public /* synthetic */ C34199a(C34218a aVar) {
                this();
            }

            /* renamed from: B0 */
            public C34199a mo99912B0() {
                mo100457F();
                ((FileOptions) this.f83053b).clearPhpNamespace();
                return this;
            }

            /* renamed from: D0 */
            public C34199a mo99913D0() {
                mo100457F();
                ((FileOptions) this.f83053b).clearPyGenericServices();
                return this;
            }

            /* renamed from: E0 */
            public C34199a mo99914E0() {
                mo100457F();
                ((FileOptions) this.f83053b).clearRubyPackage();
                return this;
            }

            /* renamed from: F0 */
            public C34199a mo99915F0() {
                mo100457F();
                ((FileOptions) this.f83053b).clearSwiftPrefix();
                return this;
            }

            /* renamed from: G0 */
            public C34199a mo99916G0() {
                mo100457F();
                ((FileOptions) this.f83053b).clearUninterpretedOption();
                return this;
            }

            /* renamed from: H0 */
            public C34199a mo99917H0(int i) {
                mo100457F();
                ((FileOptions) this.f83053b).removeUninterpretedOption(i);
                return this;
            }

            /* renamed from: I0 */
            public C34199a mo99918I0(boolean z) {
                mo100457F();
                ((FileOptions) this.f83053b).setCcEnableArenas(z);
                return this;
            }

            /* renamed from: J0 */
            public C34199a mo99919J0(boolean z) {
                mo100457F();
                ((FileOptions) this.f83053b).setCcGenericServices(z);
                return this;
            }

            /* renamed from: L0 */
            public C34199a mo99920L0(String str) {
                mo100457F();
                ((FileOptions) this.f83053b).setCsharpNamespace(str);
                return this;
            }

            /* renamed from: M0 */
            public C34199a mo99921M0(ByteString byteString) {
                mo100457F();
                ((FileOptions) this.f83053b).setCsharpNamespaceBytes(byteString);
                return this;
            }

            /* renamed from: O0 */
            public C34199a mo99922O0(boolean z) {
                mo100457F();
                ((FileOptions) this.f83053b).setDeprecated(z);
                return this;
            }

            /* renamed from: P0 */
            public C34199a mo99923P0(String str) {
                mo100457F();
                ((FileOptions) this.f83053b).setGoPackage(str);
                return this;
            }

            /* renamed from: Q0 */
            public C34199a mo99924Q0(ByteString byteString) {
                mo100457F();
                ((FileOptions) this.f83053b).setGoPackageBytes(byteString);
                return this;
            }

            @Deprecated
            /* renamed from: R0 */
            public C34199a mo99925R0(boolean z) {
                mo100457F();
                ((FileOptions) this.f83053b).setJavaGenerateEqualsAndHash(z);
                return this;
            }

            /* renamed from: S0 */
            public C34199a mo99926S0(boolean z) {
                mo100457F();
                ((FileOptions) this.f83053b).setJavaGenericServices(z);
                return this;
            }

            /* renamed from: T0 */
            public C34199a mo99927T0(boolean z) {
                mo100457F();
                ((FileOptions) this.f83053b).setJavaMultipleFiles(z);
                return this;
            }

            /* renamed from: U0 */
            public C34199a mo99928U0(String str) {
                mo100457F();
                ((FileOptions) this.f83053b).setJavaOuterClassname(str);
                return this;
            }

            /* renamed from: V0 */
            public C34199a mo99929V0(ByteString byteString) {
                mo100457F();
                ((FileOptions) this.f83053b).setJavaOuterClassnameBytes(byteString);
                return this;
            }

            /* renamed from: W0 */
            public C34199a mo99930W0(String str) {
                mo100457F();
                ((FileOptions) this.f83053b).setJavaPackage(str);
                return this;
            }

            /* renamed from: X0 */
            public C34199a mo99931X0(ByteString byteString) {
                mo100457F();
                ((FileOptions) this.f83053b).setJavaPackageBytes(byteString);
                return this;
            }

            /* renamed from: Y0 */
            public C34199a mo99932Y0(boolean z) {
                mo100457F();
                ((FileOptions) this.f83053b).setJavaStringCheckUtf8(z);
                return this;
            }

            /* renamed from: Z0 */
            public C34199a mo99933Z0(String str) {
                mo100457F();
                ((FileOptions) this.f83053b).setObjcClassPrefix(str);
                return this;
            }

            /* renamed from: a0 */
            public C34199a mo99934a0(Iterable<? extends UninterpretedOption> iterable) {
                mo100457F();
                ((FileOptions) this.f83053b).addAllUninterpretedOption(iterable);
                return this;
            }

            /* renamed from: a1 */
            public C34199a mo99935a1(ByteString byteString) {
                mo100457F();
                ((FileOptions) this.f83053b).setObjcClassPrefixBytes(byteString);
                return this;
            }

            /* renamed from: b0 */
            public C34199a mo99936b0(int i, UninterpretedOption.C34216a aVar) {
                mo100457F();
                ((FileOptions) this.f83053b).addUninterpretedOption(i, (UninterpretedOption) aVar.mo100473g());
                return this;
            }

            /* renamed from: b1 */
            public C34199a mo99937b1(OptimizeMode optimizeMode) {
                mo100457F();
                ((FileOptions) this.f83053b).setOptimizeFor(optimizeMode);
                return this;
            }

            /* renamed from: c0 */
            public C34199a mo99938c0(int i, UninterpretedOption uninterpretedOption) {
                mo100457F();
                ((FileOptions) this.f83053b).addUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            /* renamed from: c1 */
            public C34199a mo99939c1(String str) {
                mo100457F();
                ((FileOptions) this.f83053b).setPhpClassPrefix(str);
                return this;
            }

            /* renamed from: d0 */
            public C34199a mo99940d0(UninterpretedOption.C34216a aVar) {
                mo100457F();
                ((FileOptions) this.f83053b).addUninterpretedOption((UninterpretedOption) aVar.mo100473g());
                return this;
            }

            /* renamed from: d1 */
            public C34199a mo99941d1(ByteString byteString) {
                mo100457F();
                ((FileOptions) this.f83053b).setPhpClassPrefixBytes(byteString);
                return this;
            }

            /* renamed from: e1 */
            public C34199a mo99942e1(boolean z) {
                mo100457F();
                ((FileOptions) this.f83053b).setPhpGenericServices(z);
                return this;
            }

            /* renamed from: f1 */
            public C34199a mo99943f1(String str) {
                mo100457F();
                ((FileOptions) this.f83053b).setPhpMetadataNamespace(str);
                return this;
            }

            /* renamed from: g0 */
            public C34199a mo99944g0(UninterpretedOption uninterpretedOption) {
                mo100457F();
                ((FileOptions) this.f83053b).addUninterpretedOption(uninterpretedOption);
                return this;
            }

            /* renamed from: g1 */
            public C34199a mo99945g1(ByteString byteString) {
                mo100457F();
                ((FileOptions) this.f83053b).setPhpMetadataNamespaceBytes(byteString);
                return this;
            }

            public boolean getCcEnableArenas() {
                return ((FileOptions) this.f83053b).getCcEnableArenas();
            }

            public boolean getCcGenericServices() {
                return ((FileOptions) this.f83053b).getCcGenericServices();
            }

            public String getCsharpNamespace() {
                return ((FileOptions) this.f83053b).getCsharpNamespace();
            }

            public ByteString getCsharpNamespaceBytes() {
                return ((FileOptions) this.f83053b).getCsharpNamespaceBytes();
            }

            public boolean getDeprecated() {
                return ((FileOptions) this.f83053b).getDeprecated();
            }

            public String getGoPackage() {
                return ((FileOptions) this.f83053b).getGoPackage();
            }

            public ByteString getGoPackageBytes() {
                return ((FileOptions) this.f83053b).getGoPackageBytes();
            }

            @Deprecated
            public boolean getJavaGenerateEqualsAndHash() {
                return ((FileOptions) this.f83053b).getJavaGenerateEqualsAndHash();
            }

            public boolean getJavaGenericServices() {
                return ((FileOptions) this.f83053b).getJavaGenericServices();
            }

            public boolean getJavaMultipleFiles() {
                return ((FileOptions) this.f83053b).getJavaMultipleFiles();
            }

            public String getJavaOuterClassname() {
                return ((FileOptions) this.f83053b).getJavaOuterClassname();
            }

            public ByteString getJavaOuterClassnameBytes() {
                return ((FileOptions) this.f83053b).getJavaOuterClassnameBytes();
            }

            public String getJavaPackage() {
                return ((FileOptions) this.f83053b).getJavaPackage();
            }

            public ByteString getJavaPackageBytes() {
                return ((FileOptions) this.f83053b).getJavaPackageBytes();
            }

            public boolean getJavaStringCheckUtf8() {
                return ((FileOptions) this.f83053b).getJavaStringCheckUtf8();
            }

            public String getObjcClassPrefix() {
                return ((FileOptions) this.f83053b).getObjcClassPrefix();
            }

            public ByteString getObjcClassPrefixBytes() {
                return ((FileOptions) this.f83053b).getObjcClassPrefixBytes();
            }

            public OptimizeMode getOptimizeFor() {
                return ((FileOptions) this.f83053b).getOptimizeFor();
            }

            public String getPhpClassPrefix() {
                return ((FileOptions) this.f83053b).getPhpClassPrefix();
            }

            public ByteString getPhpClassPrefixBytes() {
                return ((FileOptions) this.f83053b).getPhpClassPrefixBytes();
            }

            public boolean getPhpGenericServices() {
                return ((FileOptions) this.f83053b).getPhpGenericServices();
            }

            public String getPhpMetadataNamespace() {
                return ((FileOptions) this.f83053b).getPhpMetadataNamespace();
            }

            public ByteString getPhpMetadataNamespaceBytes() {
                return ((FileOptions) this.f83053b).getPhpMetadataNamespaceBytes();
            }

            public String getPhpNamespace() {
                return ((FileOptions) this.f83053b).getPhpNamespace();
            }

            public ByteString getPhpNamespaceBytes() {
                return ((FileOptions) this.f83053b).getPhpNamespaceBytes();
            }

            public boolean getPyGenericServices() {
                return ((FileOptions) this.f83053b).getPyGenericServices();
            }

            public String getRubyPackage() {
                return ((FileOptions) this.f83053b).getRubyPackage();
            }

            public ByteString getRubyPackageBytes() {
                return ((FileOptions) this.f83053b).getRubyPackageBytes();
            }

            public String getSwiftPrefix() {
                return ((FileOptions) this.f83053b).getSwiftPrefix();
            }

            public ByteString getSwiftPrefixBytes() {
                return ((FileOptions) this.f83053b).getSwiftPrefixBytes();
            }

            public UninterpretedOption getUninterpretedOption(int i) {
                return ((FileOptions) this.f83053b).getUninterpretedOption(i);
            }

            public int getUninterpretedOptionCount() {
                return ((FileOptions) this.f83053b).getUninterpretedOptionCount();
            }

            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((FileOptions) this.f83053b).getUninterpretedOptionList());
            }

            /* renamed from: h0 */
            public C34199a mo99946h0() {
                mo100457F();
                ((FileOptions) this.f83053b).clearCcEnableArenas();
                return this;
            }

            /* renamed from: h1 */
            public C34199a mo99947h1(String str) {
                mo100457F();
                ((FileOptions) this.f83053b).setPhpNamespace(str);
                return this;
            }

            public boolean hasCcEnableArenas() {
                return ((FileOptions) this.f83053b).hasCcEnableArenas();
            }

            public boolean hasCcGenericServices() {
                return ((FileOptions) this.f83053b).hasCcGenericServices();
            }

            public boolean hasCsharpNamespace() {
                return ((FileOptions) this.f83053b).hasCsharpNamespace();
            }

            public boolean hasDeprecated() {
                return ((FileOptions) this.f83053b).hasDeprecated();
            }

            public boolean hasGoPackage() {
                return ((FileOptions) this.f83053b).hasGoPackage();
            }

            @Deprecated
            public boolean hasJavaGenerateEqualsAndHash() {
                return ((FileOptions) this.f83053b).hasJavaGenerateEqualsAndHash();
            }

            public boolean hasJavaGenericServices() {
                return ((FileOptions) this.f83053b).hasJavaGenericServices();
            }

            public boolean hasJavaMultipleFiles() {
                return ((FileOptions) this.f83053b).hasJavaMultipleFiles();
            }

            public boolean hasJavaOuterClassname() {
                return ((FileOptions) this.f83053b).hasJavaOuterClassname();
            }

            public boolean hasJavaPackage() {
                return ((FileOptions) this.f83053b).hasJavaPackage();
            }

            public boolean hasJavaStringCheckUtf8() {
                return ((FileOptions) this.f83053b).hasJavaStringCheckUtf8();
            }

            public boolean hasObjcClassPrefix() {
                return ((FileOptions) this.f83053b).hasObjcClassPrefix();
            }

            public boolean hasOptimizeFor() {
                return ((FileOptions) this.f83053b).hasOptimizeFor();
            }

            public boolean hasPhpClassPrefix() {
                return ((FileOptions) this.f83053b).hasPhpClassPrefix();
            }

            public boolean hasPhpGenericServices() {
                return ((FileOptions) this.f83053b).hasPhpGenericServices();
            }

            public boolean hasPhpMetadataNamespace() {
                return ((FileOptions) this.f83053b).hasPhpMetadataNamespace();
            }

            public boolean hasPhpNamespace() {
                return ((FileOptions) this.f83053b).hasPhpNamespace();
            }

            public boolean hasPyGenericServices() {
                return ((FileOptions) this.f83053b).hasPyGenericServices();
            }

            public boolean hasRubyPackage() {
                return ((FileOptions) this.f83053b).hasRubyPackage();
            }

            public boolean hasSwiftPrefix() {
                return ((FileOptions) this.f83053b).hasSwiftPrefix();
            }

            /* renamed from: i0 */
            public C34199a mo99948i0() {
                mo100457F();
                ((FileOptions) this.f83053b).clearCcGenericServices();
                return this;
            }

            /* renamed from: i1 */
            public C34199a mo99949i1(ByteString byteString) {
                mo100457F();
                ((FileOptions) this.f83053b).setPhpNamespaceBytes(byteString);
                return this;
            }

            /* renamed from: j0 */
            public C34199a mo99950j0() {
                mo100457F();
                ((FileOptions) this.f83053b).clearCsharpNamespace();
                return this;
            }

            /* renamed from: k0 */
            public C34199a mo99951k0() {
                mo100457F();
                ((FileOptions) this.f83053b).clearDeprecated();
                return this;
            }

            /* renamed from: l0 */
            public C34199a mo99952l0() {
                mo100457F();
                ((FileOptions) this.f83053b).clearGoPackage();
                return this;
            }

            /* renamed from: l1 */
            public C34199a mo99953l1(boolean z) {
                mo100457F();
                ((FileOptions) this.f83053b).setPyGenericServices(z);
                return this;
            }

            @Deprecated
            /* renamed from: m0 */
            public C34199a mo99954m0() {
                mo100457F();
                ((FileOptions) this.f83053b).clearJavaGenerateEqualsAndHash();
                return this;
            }

            /* renamed from: m1 */
            public C34199a mo99955m1(String str) {
                mo100457F();
                ((FileOptions) this.f83053b).setRubyPackage(str);
                return this;
            }

            /* renamed from: n1 */
            public C34199a mo99956n1(ByteString byteString) {
                mo100457F();
                ((FileOptions) this.f83053b).setRubyPackageBytes(byteString);
                return this;
            }

            /* renamed from: o0 */
            public C34199a mo99957o0() {
                mo100457F();
                ((FileOptions) this.f83053b).clearJavaGenericServices();
                return this;
            }

            /* renamed from: o1 */
            public C34199a mo99958o1(String str) {
                mo100457F();
                ((FileOptions) this.f83053b).setSwiftPrefix(str);
                return this;
            }

            /* renamed from: p1 */
            public C34199a mo99959p1(ByteString byteString) {
                mo100457F();
                ((FileOptions) this.f83053b).setSwiftPrefixBytes(byteString);
                return this;
            }

            /* renamed from: q0 */
            public C34199a mo99960q0() {
                mo100457F();
                ((FileOptions) this.f83053b).clearJavaMultipleFiles();
                return this;
            }

            /* renamed from: q1 */
            public C34199a mo99961q1(int i, UninterpretedOption.C34216a aVar) {
                mo100457F();
                ((FileOptions) this.f83053b).setUninterpretedOption(i, (UninterpretedOption) aVar.mo100473g());
                return this;
            }

            /* renamed from: r0 */
            public C34199a mo99962r0() {
                mo100457F();
                ((FileOptions) this.f83053b).clearJavaOuterClassname();
                return this;
            }

            /* renamed from: r1 */
            public C34199a mo99963r1(int i, UninterpretedOption uninterpretedOption) {
                mo100457F();
                ((FileOptions) this.f83053b).setUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            /* renamed from: s0 */
            public C34199a mo99964s0() {
                mo100457F();
                ((FileOptions) this.f83053b).clearJavaPackage();
                return this;
            }

            /* renamed from: u0 */
            public C34199a mo99965u0() {
                mo100457F();
                ((FileOptions) this.f83053b).clearJavaStringCheckUtf8();
                return this;
            }

            /* renamed from: v0 */
            public C34199a mo99966v0() {
                mo100457F();
                ((FileOptions) this.f83053b).clearObjcClassPrefix();
                return this;
            }

            /* renamed from: w0 */
            public C34199a mo99967w0() {
                mo100457F();
                ((FileOptions) this.f83053b).clearOptimizeFor();
                return this;
            }

            /* renamed from: x0 */
            public C34199a mo99968x0() {
                mo100457F();
                ((FileOptions) this.f83053b).clearPhpClassPrefix();
                return this;
            }

            /* renamed from: y0 */
            public C34199a mo99969y0() {
                mo100457F();
                ((FileOptions) this.f83053b).clearPhpGenericServices();
                return this;
            }

            /* renamed from: z0 */
            public C34199a mo99970z0() {
                mo100457F();
                ((FileOptions) this.f83053b).clearPhpMetadataNamespace();
                return this;
            }

            public C34199a() {
                super(FileOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            FileOptions fileOptions = new FileOptions();
            DEFAULT_INSTANCE = fileOptions;
            GeneratedMessageLite.registerDefaultInstance(FileOptions.class, fileOptions);
        }

        private FileOptions() {
        }

        /* access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            C34319a.addAll(iterable, this.uninterpretedOption_);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void clearCcEnableArenas() {
            this.bitField0_ &= -4097;
            this.ccEnableArenas_ = true;
        }

        /* access modifiers changed from: private */
        public void clearCcGenericServices() {
            this.bitField0_ &= -129;
            this.ccGenericServices_ = false;
        }

        /* access modifiers changed from: private */
        public void clearCsharpNamespace() {
            this.bitField0_ &= -16385;
            this.csharpNamespace_ = getDefaultInstance().getCsharpNamespace();
        }

        /* access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -2049;
            this.deprecated_ = false;
        }

        /* access modifiers changed from: private */
        public void clearGoPackage() {
            this.bitField0_ &= -65;
            this.goPackage_ = getDefaultInstance().getGoPackage();
        }

        /* access modifiers changed from: private */
        public void clearJavaGenerateEqualsAndHash() {
            this.bitField0_ &= -9;
            this.javaGenerateEqualsAndHash_ = false;
        }

        /* access modifiers changed from: private */
        public void clearJavaGenericServices() {
            this.bitField0_ &= -257;
            this.javaGenericServices_ = false;
        }

        /* access modifiers changed from: private */
        public void clearJavaMultipleFiles() {
            this.bitField0_ &= -5;
            this.javaMultipleFiles_ = false;
        }

        /* access modifiers changed from: private */
        public void clearJavaOuterClassname() {
            this.bitField0_ &= -3;
            this.javaOuterClassname_ = getDefaultInstance().getJavaOuterClassname();
        }

        /* access modifiers changed from: private */
        public void clearJavaPackage() {
            this.bitField0_ &= -2;
            this.javaPackage_ = getDefaultInstance().getJavaPackage();
        }

        /* access modifiers changed from: private */
        public void clearJavaStringCheckUtf8() {
            this.bitField0_ &= -17;
            this.javaStringCheckUtf8_ = false;
        }

        /* access modifiers changed from: private */
        public void clearObjcClassPrefix() {
            this.bitField0_ &= -8193;
            this.objcClassPrefix_ = getDefaultInstance().getObjcClassPrefix();
        }

        /* access modifiers changed from: private */
        public void clearOptimizeFor() {
            this.bitField0_ &= -33;
            this.optimizeFor_ = 1;
        }

        /* access modifiers changed from: private */
        public void clearPhpClassPrefix() {
            this.bitField0_ &= -65537;
            this.phpClassPrefix_ = getDefaultInstance().getPhpClassPrefix();
        }

        /* access modifiers changed from: private */
        public void clearPhpGenericServices() {
            this.bitField0_ &= -1025;
            this.phpGenericServices_ = false;
        }

        /* access modifiers changed from: private */
        public void clearPhpMetadataNamespace() {
            this.bitField0_ &= -262145;
            this.phpMetadataNamespace_ = getDefaultInstance().getPhpMetadataNamespace();
        }

        /* access modifiers changed from: private */
        public void clearPhpNamespace() {
            this.bitField0_ &= -131073;
            this.phpNamespace_ = getDefaultInstance().getPhpNamespace();
        }

        /* access modifiers changed from: private */
        public void clearPyGenericServices() {
            this.bitField0_ &= -513;
            this.pyGenericServices_ = false;
        }

        /* access modifiers changed from: private */
        public void clearRubyPackage() {
            this.bitField0_ &= -524289;
            this.rubyPackage_ = getDefaultInstance().getRubyPackage();
        }

        /* access modifiers changed from: private */
        public void clearSwiftPrefix() {
            this.bitField0_ &= -32769;
            this.swiftPrefix_ = getDefaultInstance().getSwiftPrefix();
        }

        /* access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureUninterpretedOptionIsMutable() {
            C34471v0.C34488k<UninterpretedOption> kVar = this.uninterpretedOption_;
            if (!kVar.mo100971T()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        public static FileOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C34199a newBuilder() {
            return (C34199a) DEFAULT_INSTANCE.createBuilder();
        }

        public static FileOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FileOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FileOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<FileOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setCcEnableArenas(boolean z) {
            this.bitField0_ |= 4096;
            this.ccEnableArenas_ = z;
        }

        /* access modifiers changed from: private */
        public void setCcGenericServices(boolean z) {
            this.bitField0_ |= 128;
            this.ccGenericServices_ = z;
        }

        /* access modifiers changed from: private */
        public void setCsharpNamespace(String str) {
            str.getClass();
            this.bitField0_ |= 16384;
            this.csharpNamespace_ = str;
        }

        /* access modifiers changed from: private */
        public void setCsharpNamespaceBytes(ByteString byteString) {
            this.csharpNamespace_ = byteString.mo99228S0();
            this.bitField0_ |= 16384;
        }

        /* access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 2048;
            this.deprecated_ = z;
        }

        /* access modifiers changed from: private */
        public void setGoPackage(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.goPackage_ = str;
        }

        /* access modifiers changed from: private */
        public void setGoPackageBytes(ByteString byteString) {
            this.goPackage_ = byteString.mo99228S0();
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void setJavaGenerateEqualsAndHash(boolean z) {
            this.bitField0_ |= 8;
            this.javaGenerateEqualsAndHash_ = z;
        }

        /* access modifiers changed from: private */
        public void setJavaGenericServices(boolean z) {
            this.bitField0_ |= 256;
            this.javaGenericServices_ = z;
        }

        /* access modifiers changed from: private */
        public void setJavaMultipleFiles(boolean z) {
            this.bitField0_ |= 4;
            this.javaMultipleFiles_ = z;
        }

        /* access modifiers changed from: private */
        public void setJavaOuterClassname(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.javaOuterClassname_ = str;
        }

        /* access modifiers changed from: private */
        public void setJavaOuterClassnameBytes(ByteString byteString) {
            this.javaOuterClassname_ = byteString.mo99228S0();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setJavaPackage(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.javaPackage_ = str;
        }

        /* access modifiers changed from: private */
        public void setJavaPackageBytes(ByteString byteString) {
            this.javaPackage_ = byteString.mo99228S0();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setJavaStringCheckUtf8(boolean z) {
            this.bitField0_ |= 16;
            this.javaStringCheckUtf8_ = z;
        }

        /* access modifiers changed from: private */
        public void setObjcClassPrefix(String str) {
            str.getClass();
            this.bitField0_ |= 8192;
            this.objcClassPrefix_ = str;
        }

        /* access modifiers changed from: private */
        public void setObjcClassPrefixBytes(ByteString byteString) {
            this.objcClassPrefix_ = byteString.mo99228S0();
            this.bitField0_ |= 8192;
        }

        /* access modifiers changed from: private */
        public void setOptimizeFor(OptimizeMode optimizeMode) {
            this.optimizeFor_ = optimizeMode.getNumber();
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setPhpClassPrefix(String str) {
            str.getClass();
            this.bitField0_ |= 65536;
            this.phpClassPrefix_ = str;
        }

        /* access modifiers changed from: private */
        public void setPhpClassPrefixBytes(ByteString byteString) {
            this.phpClassPrefix_ = byteString.mo99228S0();
            this.bitField0_ |= 65536;
        }

        /* access modifiers changed from: private */
        public void setPhpGenericServices(boolean z) {
            this.bitField0_ |= 1024;
            this.phpGenericServices_ = z;
        }

        /* access modifiers changed from: private */
        public void setPhpMetadataNamespace(String str) {
            str.getClass();
            this.bitField0_ |= 262144;
            this.phpMetadataNamespace_ = str;
        }

        /* access modifiers changed from: private */
        public void setPhpMetadataNamespaceBytes(ByteString byteString) {
            this.phpMetadataNamespace_ = byteString.mo99228S0();
            this.bitField0_ |= 262144;
        }

        /* access modifiers changed from: private */
        public void setPhpNamespace(String str) {
            str.getClass();
            this.bitField0_ |= 131072;
            this.phpNamespace_ = str;
        }

        /* access modifiers changed from: private */
        public void setPhpNamespaceBytes(ByteString byteString) {
            this.phpNamespace_ = byteString.mo99228S0();
            this.bitField0_ |= 131072;
        }

        /* access modifiers changed from: private */
        public void setPyGenericServices(boolean z) {
            this.bitField0_ |= 512;
            this.pyGenericServices_ = z;
        }

        /* access modifiers changed from: private */
        public void setRubyPackage(String str) {
            str.getClass();
            this.bitField0_ |= 524288;
            this.rubyPackage_ = str;
        }

        /* access modifiers changed from: private */
        public void setRubyPackageBytes(ByteString byteString) {
            this.rubyPackage_ = byteString.mo99228S0();
            this.bitField0_ |= 524288;
        }

        /* access modifiers changed from: private */
        public void setSwiftPrefix(String str) {
            str.getClass();
            this.bitField0_ |= 32768;
            this.swiftPrefix_ = str;
        }

        /* access modifiers changed from: private */
        public void setSwiftPrefixBytes(ByteString byteString) {
            this.swiftPrefix_ = byteString.mo99228S0();
            this.bitField0_ |= 32768;
        }

        /* access modifiers changed from: private */
        public void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, uninterpretedOption);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 1;
            switch (C34218a.f82914a[methodToInvoke.ordinal()]) {
                case 1:
                    return new FileOptions();
                case 2:
                    return new C34199a((C34218a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001ϧ\u0015\u0000\u0001\u0001\u0001ဈ\u0000\bဈ\u0001\tဌ\u0005\nဇ\u0002\u000bဈ\u0006\u0010ဇ\u0007\u0011ဇ\b\u0012ဇ\t\u0014ဇ\u0003\u0017ဇ\u000b\u001bဇ\u0004\u001fဇ\f$ဈ\r%ဈ\u000e'ဈ\u000f(ဈ\u0010)ဈ\u0011*ဇ\n,ဈ\u0012-ဈ\u0013ϧЛ", new Object[]{"bitField0_", "javaPackage_", "javaOuterClassname_", "optimizeFor_", OptimizeMode.m137987q(), "javaMultipleFiles_", "goPackage_", "ccGenericServices_", "javaGenericServices_", "pyGenericServices_", "javaGenerateEqualsAndHash_", "deprecated_", "javaStringCheckUtf8_", "ccEnableArenas_", "objcClassPrefix_", "csharpNamespace_", "swiftPrefix_", "phpClassPrefix_", "phpNamespace_", "phpGenericServices_", "phpMetadataNamespace_", "rubyPackage_", "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<FileOptions> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (FileOptions.class) {
                            y1Var = PARSER;
                            if (y1Var == null) {
                                y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                                PARSER = y1Var;
                            }
                        }
                    }
                    return y1Var;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public boolean getCcEnableArenas() {
            return this.ccEnableArenas_;
        }

        public boolean getCcGenericServices() {
            return this.ccGenericServices_;
        }

        public String getCsharpNamespace() {
            return this.csharpNamespace_;
        }

        public ByteString getCsharpNamespaceBytes() {
            return ByteString.m137260e0(this.csharpNamespace_);
        }

        public boolean getDeprecated() {
            return this.deprecated_;
        }

        public String getGoPackage() {
            return this.goPackage_;
        }

        public ByteString getGoPackageBytes() {
            return ByteString.m137260e0(this.goPackage_);
        }

        @Deprecated
        public boolean getJavaGenerateEqualsAndHash() {
            return this.javaGenerateEqualsAndHash_;
        }

        public boolean getJavaGenericServices() {
            return this.javaGenericServices_;
        }

        public boolean getJavaMultipleFiles() {
            return this.javaMultipleFiles_;
        }

        public String getJavaOuterClassname() {
            return this.javaOuterClassname_;
        }

        public ByteString getJavaOuterClassnameBytes() {
            return ByteString.m137260e0(this.javaOuterClassname_);
        }

        public String getJavaPackage() {
            return this.javaPackage_;
        }

        public ByteString getJavaPackageBytes() {
            return ByteString.m137260e0(this.javaPackage_);
        }

        public boolean getJavaStringCheckUtf8() {
            return this.javaStringCheckUtf8_;
        }

        public String getObjcClassPrefix() {
            return this.objcClassPrefix_;
        }

        public ByteString getObjcClassPrefixBytes() {
            return ByteString.m137260e0(this.objcClassPrefix_);
        }

        public OptimizeMode getOptimizeFor() {
            OptimizeMode b = OptimizeMode.m137985b(this.optimizeFor_);
            if (b == null) {
                return OptimizeMode.SPEED;
            }
            return b;
        }

        public String getPhpClassPrefix() {
            return this.phpClassPrefix_;
        }

        public ByteString getPhpClassPrefixBytes() {
            return ByteString.m137260e0(this.phpClassPrefix_);
        }

        public boolean getPhpGenericServices() {
            return this.phpGenericServices_;
        }

        public String getPhpMetadataNamespace() {
            return this.phpMetadataNamespace_;
        }

        public ByteString getPhpMetadataNamespaceBytes() {
            return ByteString.m137260e0(this.phpMetadataNamespace_);
        }

        public String getPhpNamespace() {
            return this.phpNamespace_;
        }

        public ByteString getPhpNamespaceBytes() {
            return ByteString.m137260e0(this.phpNamespace_);
        }

        public boolean getPyGenericServices() {
            return this.pyGenericServices_;
        }

        public String getRubyPackage() {
            return this.rubyPackage_;
        }

        public ByteString getRubyPackageBytes() {
            return ByteString.m137260e0(this.rubyPackage_);
        }

        public String getSwiftPrefix() {
            return this.swiftPrefix_;
        }

        public ByteString getSwiftPrefixBytes() {
            return ByteString.m137260e0(this.swiftPrefix_);
        }

        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public C34239v getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends C34239v> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        public boolean hasCcEnableArenas() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasCcGenericServices() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasCsharpNamespace() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasDeprecated() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasGoPackage() {
            return (this.bitField0_ & 64) != 0;
        }

        @Deprecated
        public boolean hasJavaGenerateEqualsAndHash() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasJavaGenericServices() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasJavaMultipleFiles() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasJavaOuterClassname() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasJavaPackage() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasJavaStringCheckUtf8() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasObjcClassPrefix() {
            return (this.bitField0_ & 8192) != 0;
        }

        public boolean hasOptimizeFor() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasPhpClassPrefix() {
            return (this.bitField0_ & 65536) != 0;
        }

        public boolean hasPhpGenericServices() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasPhpMetadataNamespace() {
            return (this.bitField0_ & 262144) != 0;
        }

        public boolean hasPhpNamespace() {
            return (this.bitField0_ & 131072) != 0;
        }

        public boolean hasPyGenericServices() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasRubyPackage() {
            return (this.bitField0_ & 524288) != 0;
        }

        public boolean hasSwiftPrefix() {
            return (this.bitField0_ & 32768) != 0;
        }

        public static C34199a newBuilder(FileOptions fileOptions) {
            return (C34199a) DEFAULT_INSTANCE.createBuilder(fileOptions);
        }

        public static FileOptions parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (FileOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static FileOptions parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static FileOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, uninterpretedOption);
        }

        public static FileOptions parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static FileOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FileOptions parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static FileOptions parseFrom(InputStream inputStream) throws IOException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FileOptions parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static FileOptions parseFrom(C34448s sVar) throws IOException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static FileOptions parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    public static final class GeneratedCodeInfo extends GeneratedMessageLite<GeneratedCodeInfo, C34202b> implements C34230m {
        public static final int ANNOTATION_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final GeneratedCodeInfo DEFAULT_INSTANCE;
        private static volatile C34504y1<GeneratedCodeInfo> PARSER;
        private C34471v0.C34488k<Annotation> annotation_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Annotation extends GeneratedMessageLite<Annotation, C34200a> implements C34201a {
            public static final int BEGIN_FIELD_NUMBER = 3;
            /* access modifiers changed from: private */
            public static final Annotation DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 4;
            private static volatile C34504y1<Annotation> PARSER = null;
            public static final int PATH_FIELD_NUMBER = 1;
            public static final int SOURCE_FILE_FIELD_NUMBER = 2;
            private int begin_;
            private int bitField0_;
            private int end_;
            private int pathMemoizedSerializedSize = -1;
            private C34471v0.C34478g path_ = GeneratedMessageLite.emptyIntList();
            private String sourceFile_ = "";

            /* renamed from: com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$Annotation$a */
            public static final class C34200a extends GeneratedMessageLite.C34263b<Annotation, C34200a> implements C34201a {
                public /* synthetic */ C34200a(C34218a aVar) {
                    this();
                }

                /* renamed from: P */
                public C34200a mo99986P(Iterable<? extends Integer> iterable) {
                    mo100457F();
                    ((Annotation) this.f83053b).addAllPath(iterable);
                    return this;
                }

                /* renamed from: R */
                public C34200a mo99987R(int i) {
                    mo100457F();
                    ((Annotation) this.f83053b).addPath(i);
                    return this;
                }

                /* renamed from: S */
                public C34200a mo99988S() {
                    mo100457F();
                    ((Annotation) this.f83053b).clearBegin();
                    return this;
                }

                /* renamed from: T */
                public C34200a mo99989T() {
                    mo100457F();
                    ((Annotation) this.f83053b).clearEnd();
                    return this;
                }

                /* renamed from: U */
                public C34200a mo99990U() {
                    mo100457F();
                    ((Annotation) this.f83053b).clearPath();
                    return this;
                }

                /* renamed from: V */
                public C34200a mo99991V() {
                    mo100457F();
                    ((Annotation) this.f83053b).clearSourceFile();
                    return this;
                }

                /* renamed from: Y */
                public C34200a mo99992Y(int i) {
                    mo100457F();
                    ((Annotation) this.f83053b).setBegin(i);
                    return this;
                }

                /* renamed from: Z */
                public C34200a mo99993Z(int i) {
                    mo100457F();
                    ((Annotation) this.f83053b).setEnd(i);
                    return this;
                }

                /* renamed from: a0 */
                public C34200a mo99994a0(int i, int i2) {
                    mo100457F();
                    ((Annotation) this.f83053b).setPath(i, i2);
                    return this;
                }

                /* renamed from: b0 */
                public C34200a mo99995b0(String str) {
                    mo100457F();
                    ((Annotation) this.f83053b).setSourceFile(str);
                    return this;
                }

                /* renamed from: c0 */
                public C34200a mo99996c0(ByteString byteString) {
                    mo100457F();
                    ((Annotation) this.f83053b).setSourceFileBytes(byteString);
                    return this;
                }

                public int getBegin() {
                    return ((Annotation) this.f83053b).getBegin();
                }

                public int getEnd() {
                    return ((Annotation) this.f83053b).getEnd();
                }

                public int getPath(int i) {
                    return ((Annotation) this.f83053b).getPath(i);
                }

                public int getPathCount() {
                    return ((Annotation) this.f83053b).getPathCount();
                }

                public List<Integer> getPathList() {
                    return Collections.unmodifiableList(((Annotation) this.f83053b).getPathList());
                }

                public String getSourceFile() {
                    return ((Annotation) this.f83053b).getSourceFile();
                }

                public ByteString getSourceFileBytes() {
                    return ((Annotation) this.f83053b).getSourceFileBytes();
                }

                public boolean hasBegin() {
                    return ((Annotation) this.f83053b).hasBegin();
                }

                public boolean hasEnd() {
                    return ((Annotation) this.f83053b).hasEnd();
                }

                public boolean hasSourceFile() {
                    return ((Annotation) this.f83053b).hasSourceFile();
                }

                public C34200a() {
                    super(Annotation.DEFAULT_INSTANCE);
                }
            }

            static {
                Annotation annotation = new Annotation();
                DEFAULT_INSTANCE = annotation;
                GeneratedMessageLite.registerDefaultInstance(Annotation.class, annotation);
            }

            private Annotation() {
            }

            /* access modifiers changed from: private */
            public void addAllPath(Iterable<? extends Integer> iterable) {
                ensurePathIsMutable();
                C34319a.addAll(iterable, this.path_);
            }

            /* access modifiers changed from: private */
            public void addPath(int i) {
                ensurePathIsMutable();
                this.path_.mo101605V(i);
            }

            /* access modifiers changed from: private */
            public void clearBegin() {
                this.bitField0_ &= -3;
                this.begin_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearEnd() {
                this.bitField0_ &= -5;
                this.end_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearPath() {
                this.path_ = GeneratedMessageLite.emptyIntList();
            }

            /* access modifiers changed from: private */
            public void clearSourceFile() {
                this.bitField0_ &= -2;
                this.sourceFile_ = getDefaultInstance().getSourceFile();
            }

            private void ensurePathIsMutable() {
                C34471v0.C34478g gVar = this.path_;
                if (!gVar.mo100971T()) {
                    this.path_ = GeneratedMessageLite.mutableCopy(gVar);
                }
            }

            public static Annotation getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C34200a newBuilder() {
                return (C34200a) DEFAULT_INSTANCE.createBuilder();
            }

            public static Annotation parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Annotation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Annotation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static C34504y1<Annotation> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setBegin(int i) {
                this.bitField0_ |= 2;
                this.begin_ = i;
            }

            /* access modifiers changed from: private */
            public void setEnd(int i) {
                this.bitField0_ |= 4;
                this.end_ = i;
            }

            /* access modifiers changed from: private */
            public void setPath(int i, int i2) {
                ensurePathIsMutable();
                this.path_.mo101613o(i, i2);
            }

            /* access modifiers changed from: private */
            public void setSourceFile(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.sourceFile_ = str;
            }

            /* access modifiers changed from: private */
            public void setSourceFileBytes(ByteString byteString) {
                this.sourceFile_ = byteString.mo99228S0();
                this.bitField0_ |= 1;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C34218a.f82914a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Annotation();
                    case 2:
                        return new C34200a((C34218a) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001'\u0002ဈ\u0000\u0003င\u0001\u0004င\u0002", new Object[]{"bitField0_", "path_", "sourceFile_", "begin_", "end_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        C34504y1<Annotation> y1Var = PARSER;
                        if (y1Var == null) {
                            synchronized (Annotation.class) {
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

            public int getBegin() {
                return this.begin_;
            }

            public int getEnd() {
                return this.end_;
            }

            public int getPath(int i) {
                return this.path_.getInt(i);
            }

            public int getPathCount() {
                return this.path_.size();
            }

            public List<Integer> getPathList() {
                return this.path_;
            }

            public String getSourceFile() {
                return this.sourceFile_;
            }

            public ByteString getSourceFileBytes() {
                return ByteString.m137260e0(this.sourceFile_);
            }

            public boolean hasBegin() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasEnd() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasSourceFile() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C34200a newBuilder(Annotation annotation) {
                return (C34200a) DEFAULT_INSTANCE.createBuilder(annotation);
            }

            public static Annotation parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
                return (Annotation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
            }

            public static Annotation parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
            }

            public static Annotation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Annotation parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
            }

            public static Annotation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Annotation parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
            }

            public static Annotation parseFrom(InputStream inputStream) throws IOException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Annotation parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
            }

            public static Annotation parseFrom(C34448s sVar) throws IOException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
            }

            public static Annotation parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
            }
        }

        /* renamed from: com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$a */
        public interface C34201a extends C34417m1 {
            int getBegin();

            int getEnd();

            int getPath(int i);

            int getPathCount();

            List<Integer> getPathList();

            String getSourceFile();

            ByteString getSourceFileBytes();

            boolean hasBegin();

            boolean hasEnd();

            boolean hasSourceFile();
        }

        /* renamed from: com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$b */
        public static final class C34202b extends GeneratedMessageLite.C34263b<GeneratedCodeInfo, C34202b> implements C34230m {
            public /* synthetic */ C34202b(C34218a aVar) {
                this();
            }

            /* renamed from: P */
            public C34202b mo99997P(Iterable<? extends Annotation> iterable) {
                mo100457F();
                ((GeneratedCodeInfo) this.f83053b).addAllAnnotation(iterable);
                return this;
            }

            /* renamed from: R */
            public C34202b mo99998R(int i, Annotation.C34200a aVar) {
                mo100457F();
                ((GeneratedCodeInfo) this.f83053b).addAnnotation(i, (Annotation) aVar.mo100473g());
                return this;
            }

            /* renamed from: S */
            public C34202b mo99999S(int i, Annotation annotation) {
                mo100457F();
                ((GeneratedCodeInfo) this.f83053b).addAnnotation(i, annotation);
                return this;
            }

            /* renamed from: T */
            public C34202b mo100000T(Annotation.C34200a aVar) {
                mo100457F();
                ((GeneratedCodeInfo) this.f83053b).addAnnotation((Annotation) aVar.mo100473g());
                return this;
            }

            /* renamed from: U */
            public C34202b mo100001U(Annotation annotation) {
                mo100457F();
                ((GeneratedCodeInfo) this.f83053b).addAnnotation(annotation);
                return this;
            }

            /* renamed from: V */
            public C34202b mo100002V() {
                mo100457F();
                ((GeneratedCodeInfo) this.f83053b).clearAnnotation();
                return this;
            }

            /* renamed from: Y */
            public C34202b mo100003Y(int i) {
                mo100457F();
                ((GeneratedCodeInfo) this.f83053b).removeAnnotation(i);
                return this;
            }

            /* renamed from: Z */
            public C34202b mo100004Z(int i, Annotation.C34200a aVar) {
                mo100457F();
                ((GeneratedCodeInfo) this.f83053b).setAnnotation(i, (Annotation) aVar.mo100473g());
                return this;
            }

            /* renamed from: a0 */
            public C34202b mo100005a0(int i, Annotation annotation) {
                mo100457F();
                ((GeneratedCodeInfo) this.f83053b).setAnnotation(i, annotation);
                return this;
            }

            public Annotation getAnnotation(int i) {
                return ((GeneratedCodeInfo) this.f83053b).getAnnotation(i);
            }

            public int getAnnotationCount() {
                return ((GeneratedCodeInfo) this.f83053b).getAnnotationCount();
            }

            public List<Annotation> getAnnotationList() {
                return Collections.unmodifiableList(((GeneratedCodeInfo) this.f83053b).getAnnotationList());
            }

            public C34202b() {
                super(GeneratedCodeInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            GeneratedCodeInfo generatedCodeInfo = new GeneratedCodeInfo();
            DEFAULT_INSTANCE = generatedCodeInfo;
            GeneratedMessageLite.registerDefaultInstance(GeneratedCodeInfo.class, generatedCodeInfo);
        }

        private GeneratedCodeInfo() {
        }

        /* access modifiers changed from: private */
        public void addAllAnnotation(Iterable<? extends Annotation> iterable) {
            ensureAnnotationIsMutable();
            C34319a.addAll(iterable, this.annotation_);
        }

        /* access modifiers changed from: private */
        public void addAnnotation(Annotation annotation) {
            annotation.getClass();
            ensureAnnotationIsMutable();
            this.annotation_.add(annotation);
        }

        /* access modifiers changed from: private */
        public void clearAnnotation() {
            this.annotation_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureAnnotationIsMutable() {
            C34471v0.C34488k<Annotation> kVar = this.annotation_;
            if (!kVar.mo100971T()) {
                this.annotation_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        public static GeneratedCodeInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C34202b newBuilder() {
            return (C34202b) DEFAULT_INSTANCE.createBuilder();
        }

        public static GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<GeneratedCodeInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeAnnotation(int i) {
            ensureAnnotationIsMutable();
            this.annotation_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setAnnotation(int i, Annotation annotation) {
            annotation.getClass();
            ensureAnnotationIsMutable();
            this.annotation_.set(i, annotation);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C34218a.f82914a[methodToInvoke.ordinal()]) {
                case 1:
                    return new GeneratedCodeInfo();
                case 2:
                    return new C34202b((C34218a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"annotation_", Annotation.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<GeneratedCodeInfo> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (GeneratedCodeInfo.class) {
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

        public Annotation getAnnotation(int i) {
            return this.annotation_.get(i);
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public C34201a getAnnotationOrBuilder(int i) {
            return this.annotation_.get(i);
        }

        public List<? extends C34201a> getAnnotationOrBuilderList() {
            return this.annotation_;
        }

        public static C34202b newBuilder(GeneratedCodeInfo generatedCodeInfo) {
            return (C34202b) DEFAULT_INSTANCE.createBuilder(generatedCodeInfo);
        }

        public static GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static GeneratedCodeInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addAnnotation(int i, Annotation annotation) {
            annotation.getClass();
            ensureAnnotationIsMutable();
            this.annotation_.add(i, annotation);
        }

        public static GeneratedCodeInfo parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static GeneratedCodeInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GeneratedCodeInfo parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static GeneratedCodeInfo parseFrom(InputStream inputStream) throws IOException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GeneratedCodeInfo parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static GeneratedCodeInfo parseFrom(C34448s sVar) throws IOException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static GeneratedCodeInfo parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    public static final class MessageOptions extends GeneratedMessageLite.ExtendableMessage<MessageOptions, C34203a> implements C34231n {
        /* access modifiers changed from: private */
        public static final MessageOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int MAP_ENTRY_FIELD_NUMBER = 7;
        public static final int MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER = 1;
        public static final int NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER = 2;
        private static volatile C34504y1<MessageOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private boolean mapEntry_;
        private byte memoizedIsInitialized = 2;
        private boolean messageSetWireFormat_;
        private boolean noStandardDescriptorAccessor_;
        private C34471v0.C34488k<UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: com.google.protobuf.DescriptorProtos$MessageOptions$a */
        public static final class C34203a extends GeneratedMessageLite.C34265d<MessageOptions, C34203a> implements C34231n {
            public /* synthetic */ C34203a(C34218a aVar) {
                this();
            }

            /* renamed from: a0 */
            public C34203a mo100019a0(Iterable<? extends UninterpretedOption> iterable) {
                mo100457F();
                ((MessageOptions) this.f83053b).addAllUninterpretedOption(iterable);
                return this;
            }

            /* renamed from: b0 */
            public C34203a mo100020b0(int i, UninterpretedOption.C34216a aVar) {
                mo100457F();
                ((MessageOptions) this.f83053b).addUninterpretedOption(i, (UninterpretedOption) aVar.mo100473g());
                return this;
            }

            /* renamed from: c0 */
            public C34203a mo100021c0(int i, UninterpretedOption uninterpretedOption) {
                mo100457F();
                ((MessageOptions) this.f83053b).addUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            /* renamed from: d0 */
            public C34203a mo100022d0(UninterpretedOption.C34216a aVar) {
                mo100457F();
                ((MessageOptions) this.f83053b).addUninterpretedOption((UninterpretedOption) aVar.mo100473g());
                return this;
            }

            /* renamed from: g0 */
            public C34203a mo100023g0(UninterpretedOption uninterpretedOption) {
                mo100457F();
                ((MessageOptions) this.f83053b).addUninterpretedOption(uninterpretedOption);
                return this;
            }

            public boolean getDeprecated() {
                return ((MessageOptions) this.f83053b).getDeprecated();
            }

            public boolean getMapEntry() {
                return ((MessageOptions) this.f83053b).getMapEntry();
            }

            public boolean getMessageSetWireFormat() {
                return ((MessageOptions) this.f83053b).getMessageSetWireFormat();
            }

            public boolean getNoStandardDescriptorAccessor() {
                return ((MessageOptions) this.f83053b).getNoStandardDescriptorAccessor();
            }

            public UninterpretedOption getUninterpretedOption(int i) {
                return ((MessageOptions) this.f83053b).getUninterpretedOption(i);
            }

            public int getUninterpretedOptionCount() {
                return ((MessageOptions) this.f83053b).getUninterpretedOptionCount();
            }

            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((MessageOptions) this.f83053b).getUninterpretedOptionList());
            }

            /* renamed from: h0 */
            public C34203a mo100024h0() {
                mo100457F();
                ((MessageOptions) this.f83053b).clearDeprecated();
                return this;
            }

            public boolean hasDeprecated() {
                return ((MessageOptions) this.f83053b).hasDeprecated();
            }

            public boolean hasMapEntry() {
                return ((MessageOptions) this.f83053b).hasMapEntry();
            }

            public boolean hasMessageSetWireFormat() {
                return ((MessageOptions) this.f83053b).hasMessageSetWireFormat();
            }

            public boolean hasNoStandardDescriptorAccessor() {
                return ((MessageOptions) this.f83053b).hasNoStandardDescriptorAccessor();
            }

            /* renamed from: i0 */
            public C34203a mo100025i0() {
                mo100457F();
                ((MessageOptions) this.f83053b).clearMapEntry();
                return this;
            }

            /* renamed from: j0 */
            public C34203a mo100026j0() {
                mo100457F();
                ((MessageOptions) this.f83053b).clearMessageSetWireFormat();
                return this;
            }

            /* renamed from: k0 */
            public C34203a mo100027k0() {
                mo100457F();
                ((MessageOptions) this.f83053b).clearNoStandardDescriptorAccessor();
                return this;
            }

            /* renamed from: l0 */
            public C34203a mo100028l0() {
                mo100457F();
                ((MessageOptions) this.f83053b).clearUninterpretedOption();
                return this;
            }

            /* renamed from: m0 */
            public C34203a mo100029m0(int i) {
                mo100457F();
                ((MessageOptions) this.f83053b).removeUninterpretedOption(i);
                return this;
            }

            /* renamed from: o0 */
            public C34203a mo100030o0(boolean z) {
                mo100457F();
                ((MessageOptions) this.f83053b).setDeprecated(z);
                return this;
            }

            /* renamed from: q0 */
            public C34203a mo100031q0(boolean z) {
                mo100457F();
                ((MessageOptions) this.f83053b).setMapEntry(z);
                return this;
            }

            /* renamed from: r0 */
            public C34203a mo100032r0(boolean z) {
                mo100457F();
                ((MessageOptions) this.f83053b).setMessageSetWireFormat(z);
                return this;
            }

            /* renamed from: s0 */
            public C34203a mo100033s0(boolean z) {
                mo100457F();
                ((MessageOptions) this.f83053b).setNoStandardDescriptorAccessor(z);
                return this;
            }

            /* renamed from: u0 */
            public C34203a mo100034u0(int i, UninterpretedOption.C34216a aVar) {
                mo100457F();
                ((MessageOptions) this.f83053b).setUninterpretedOption(i, (UninterpretedOption) aVar.mo100473g());
                return this;
            }

            /* renamed from: v0 */
            public C34203a mo100035v0(int i, UninterpretedOption uninterpretedOption) {
                mo100457F();
                ((MessageOptions) this.f83053b).setUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            public C34203a() {
                super(MessageOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            MessageOptions messageOptions = new MessageOptions();
            DEFAULT_INSTANCE = messageOptions;
            GeneratedMessageLite.registerDefaultInstance(MessageOptions.class, messageOptions);
        }

        private MessageOptions() {
        }

        /* access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            C34319a.addAll(iterable, this.uninterpretedOption_);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -5;
            this.deprecated_ = false;
        }

        /* access modifiers changed from: private */
        public void clearMapEntry() {
            this.bitField0_ &= -9;
            this.mapEntry_ = false;
        }

        /* access modifiers changed from: private */
        public void clearMessageSetWireFormat() {
            this.bitField0_ &= -2;
            this.messageSetWireFormat_ = false;
        }

        /* access modifiers changed from: private */
        public void clearNoStandardDescriptorAccessor() {
            this.bitField0_ &= -3;
            this.noStandardDescriptorAccessor_ = false;
        }

        /* access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureUninterpretedOptionIsMutable() {
            C34471v0.C34488k<UninterpretedOption> kVar = this.uninterpretedOption_;
            if (!kVar.mo100971T()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        public static MessageOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C34203a newBuilder() {
            return (C34203a) DEFAULT_INSTANCE.createBuilder();
        }

        public static MessageOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MessageOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MessageOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<MessageOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 4;
            this.deprecated_ = z;
        }

        /* access modifiers changed from: private */
        public void setMapEntry(boolean z) {
            this.bitField0_ |= 8;
            this.mapEntry_ = z;
        }

        /* access modifiers changed from: private */
        public void setMessageSetWireFormat(boolean z) {
            this.bitField0_ |= 1;
            this.messageSetWireFormat_ = z;
        }

        /* access modifiers changed from: private */
        public void setNoStandardDescriptorAccessor(boolean z) {
            this.bitField0_ |= 2;
            this.noStandardDescriptorAccessor_ = z;
        }

        /* access modifiers changed from: private */
        public void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, uninterpretedOption);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 1;
            switch (C34218a.f82914a[methodToInvoke.ordinal()]) {
                case 1:
                    return new MessageOptions();
                case 2:
                    return new C34203a((C34218a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001ϧ\u0005\u0000\u0001\u0001\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0007ဇ\u0003ϧЛ", new Object[]{"bitField0_", "messageSetWireFormat_", "noStandardDescriptorAccessor_", "deprecated_", "mapEntry_", "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<MessageOptions> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (MessageOptions.class) {
                            y1Var = PARSER;
                            if (y1Var == null) {
                                y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                                PARSER = y1Var;
                            }
                        }
                    }
                    return y1Var;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public boolean getDeprecated() {
            return this.deprecated_;
        }

        public boolean getMapEntry() {
            return this.mapEntry_;
        }

        public boolean getMessageSetWireFormat() {
            return this.messageSetWireFormat_;
        }

        public boolean getNoStandardDescriptorAccessor() {
            return this.noStandardDescriptorAccessor_;
        }

        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public C34239v getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends C34239v> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        public boolean hasDeprecated() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasMapEntry() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasMessageSetWireFormat() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasNoStandardDescriptorAccessor() {
            return (this.bitField0_ & 2) != 0;
        }

        public static C34203a newBuilder(MessageOptions messageOptions) {
            return (C34203a) DEFAULT_INSTANCE.createBuilder(messageOptions);
        }

        public static MessageOptions parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (MessageOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static MessageOptions parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static MessageOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, uninterpretedOption);
        }

        public static MessageOptions parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static MessageOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MessageOptions parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static MessageOptions parseFrom(InputStream inputStream) throws IOException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MessageOptions parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static MessageOptions parseFrom(C34448s sVar) throws IOException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static MessageOptions parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    public static final class MethodDescriptorProto extends GeneratedMessageLite<MethodDescriptorProto, C34204a> implements C34232o {
        public static final int CLIENT_STREAMING_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final MethodDescriptorProto DEFAULT_INSTANCE;
        public static final int INPUT_TYPE_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 4;
        public static final int OUTPUT_TYPE_FIELD_NUMBER = 3;
        private static volatile C34504y1<MethodDescriptorProto> PARSER = null;
        public static final int SERVER_STREAMING_FIELD_NUMBER = 6;
        private int bitField0_;
        private boolean clientStreaming_;
        private String inputType_ = "";
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private MethodOptions options_;
        private String outputType_ = "";
        private boolean serverStreaming_;

        /* renamed from: com.google.protobuf.DescriptorProtos$MethodDescriptorProto$a */
        public static final class C34204a extends GeneratedMessageLite.C34263b<MethodDescriptorProto, C34204a> implements C34232o {
            public /* synthetic */ C34204a(C34218a aVar) {
                this();
            }

            /* renamed from: P */
            public C34204a mo100051P() {
                mo100457F();
                ((MethodDescriptorProto) this.f83053b).clearClientStreaming();
                return this;
            }

            /* renamed from: R */
            public C34204a mo100052R() {
                mo100457F();
                ((MethodDescriptorProto) this.f83053b).clearInputType();
                return this;
            }

            /* renamed from: S */
            public C34204a mo100053S() {
                mo100457F();
                ((MethodDescriptorProto) this.f83053b).clearName();
                return this;
            }

            /* renamed from: T */
            public C34204a mo100054T() {
                mo100457F();
                ((MethodDescriptorProto) this.f83053b).clearOptions();
                return this;
            }

            /* renamed from: U */
            public C34204a mo100055U() {
                mo100457F();
                ((MethodDescriptorProto) this.f83053b).clearOutputType();
                return this;
            }

            /* renamed from: V */
            public C34204a mo100056V() {
                mo100457F();
                ((MethodDescriptorProto) this.f83053b).clearServerStreaming();
                return this;
            }

            /* renamed from: Y */
            public C34204a mo100057Y(MethodOptions methodOptions) {
                mo100457F();
                ((MethodDescriptorProto) this.f83053b).mergeOptions(methodOptions);
                return this;
            }

            /* renamed from: Z */
            public C34204a mo100058Z(boolean z) {
                mo100457F();
                ((MethodDescriptorProto) this.f83053b).setClientStreaming(z);
                return this;
            }

            /* renamed from: a0 */
            public C34204a mo100059a0(String str) {
                mo100457F();
                ((MethodDescriptorProto) this.f83053b).setInputType(str);
                return this;
            }

            /* renamed from: b0 */
            public C34204a mo100060b0(ByteString byteString) {
                mo100457F();
                ((MethodDescriptorProto) this.f83053b).setInputTypeBytes(byteString);
                return this;
            }

            /* renamed from: c0 */
            public C34204a mo100061c0(String str) {
                mo100457F();
                ((MethodDescriptorProto) this.f83053b).setName(str);
                return this;
            }

            /* renamed from: d0 */
            public C34204a mo100062d0(ByteString byteString) {
                mo100457F();
                ((MethodDescriptorProto) this.f83053b).setNameBytes(byteString);
                return this;
            }

            /* renamed from: g0 */
            public C34204a mo100063g0(MethodOptions.C34207a aVar) {
                mo100457F();
                ((MethodDescriptorProto) this.f83053b).setOptions((MethodOptions) aVar.mo100473g());
                return this;
            }

            public boolean getClientStreaming() {
                return ((MethodDescriptorProto) this.f83053b).getClientStreaming();
            }

            public String getInputType() {
                return ((MethodDescriptorProto) this.f83053b).getInputType();
            }

            public ByteString getInputTypeBytes() {
                return ((MethodDescriptorProto) this.f83053b).getInputTypeBytes();
            }

            public String getName() {
                return ((MethodDescriptorProto) this.f83053b).getName();
            }

            public ByteString getNameBytes() {
                return ((MethodDescriptorProto) this.f83053b).getNameBytes();
            }

            public MethodOptions getOptions() {
                return ((MethodDescriptorProto) this.f83053b).getOptions();
            }

            public String getOutputType() {
                return ((MethodDescriptorProto) this.f83053b).getOutputType();
            }

            public ByteString getOutputTypeBytes() {
                return ((MethodDescriptorProto) this.f83053b).getOutputTypeBytes();
            }

            public boolean getServerStreaming() {
                return ((MethodDescriptorProto) this.f83053b).getServerStreaming();
            }

            /* renamed from: h0 */
            public C34204a mo100064h0(MethodOptions methodOptions) {
                mo100457F();
                ((MethodDescriptorProto) this.f83053b).setOptions(methodOptions);
                return this;
            }

            public boolean hasClientStreaming() {
                return ((MethodDescriptorProto) this.f83053b).hasClientStreaming();
            }

            public boolean hasInputType() {
                return ((MethodDescriptorProto) this.f83053b).hasInputType();
            }

            public boolean hasName() {
                return ((MethodDescriptorProto) this.f83053b).hasName();
            }

            public boolean hasOptions() {
                return ((MethodDescriptorProto) this.f83053b).hasOptions();
            }

            public boolean hasOutputType() {
                return ((MethodDescriptorProto) this.f83053b).hasOutputType();
            }

            public boolean hasServerStreaming() {
                return ((MethodDescriptorProto) this.f83053b).hasServerStreaming();
            }

            /* renamed from: i0 */
            public C34204a mo100065i0(String str) {
                mo100457F();
                ((MethodDescriptorProto) this.f83053b).setOutputType(str);
                return this;
            }

            /* renamed from: j0 */
            public C34204a mo100066j0(ByteString byteString) {
                mo100457F();
                ((MethodDescriptorProto) this.f83053b).setOutputTypeBytes(byteString);
                return this;
            }

            /* renamed from: k0 */
            public C34204a mo100067k0(boolean z) {
                mo100457F();
                ((MethodDescriptorProto) this.f83053b).setServerStreaming(z);
                return this;
            }

            public C34204a() {
                super(MethodDescriptorProto.DEFAULT_INSTANCE);
            }
        }

        static {
            MethodDescriptorProto methodDescriptorProto = new MethodDescriptorProto();
            DEFAULT_INSTANCE = methodDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(MethodDescriptorProto.class, methodDescriptorProto);
        }

        private MethodDescriptorProto() {
        }

        /* access modifiers changed from: private */
        public void clearClientStreaming() {
            this.bitField0_ &= -17;
            this.clientStreaming_ = false;
        }

        /* access modifiers changed from: private */
        public void clearInputType() {
            this.bitField0_ &= -3;
            this.inputType_ = getDefaultInstance().getInputType();
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -9;
        }

        /* access modifiers changed from: private */
        public void clearOutputType() {
            this.bitField0_ &= -5;
            this.outputType_ = getDefaultInstance().getOutputType();
        }

        /* access modifiers changed from: private */
        public void clearServerStreaming() {
            this.bitField0_ &= -33;
            this.serverStreaming_ = false;
        }

        public static MethodDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeOptions(MethodOptions methodOptions) {
            methodOptions.getClass();
            MethodOptions methodOptions2 = this.options_;
            if (methodOptions2 == null || methodOptions2 == MethodOptions.getDefaultInstance()) {
                this.options_ = methodOptions;
            } else {
                this.options_ = (MethodOptions) ((MethodOptions.C34207a) MethodOptions.newBuilder(this.options_).mo100463K(methodOptions)).mo100467Q();
            }
            this.bitField0_ |= 8;
        }

        public static C34204a newBuilder() {
            return (C34204a) DEFAULT_INSTANCE.createBuilder();
        }

        public static MethodDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MethodDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<MethodDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setClientStreaming(boolean z) {
            this.bitField0_ |= 16;
            this.clientStreaming_ = z;
        }

        /* access modifiers changed from: private */
        public void setInputType(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.inputType_ = str;
        }

        /* access modifiers changed from: private */
        public void setInputTypeBytes(ByteString byteString) {
            this.inputType_ = byteString.mo99228S0();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            this.name_ = byteString.mo99228S0();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setOptions(MethodOptions methodOptions) {
            methodOptions.getClass();
            this.options_ = methodOptions;
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setOutputType(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.outputType_ = str;
        }

        /* access modifiers changed from: private */
        public void setOutputTypeBytes(ByteString byteString) {
            this.outputType_ = byteString.mo99228S0();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setServerStreaming(boolean z) {
            this.bitField0_ |= 32;
            this.serverStreaming_ = z;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 1;
            switch (C34218a.f82914a[methodToInvoke.ordinal()]) {
                case 1:
                    return new MethodDescriptorProto();
                case 2:
                    return new C34204a((C34218a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "name_", "inputType_", "outputType_", "options_", "clientStreaming_", "serverStreaming_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<MethodDescriptorProto> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (MethodDescriptorProto.class) {
                            y1Var = PARSER;
                            if (y1Var == null) {
                                y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                                PARSER = y1Var;
                            }
                        }
                    }
                    return y1Var;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public boolean getClientStreaming() {
            return this.clientStreaming_;
        }

        public String getInputType() {
            return this.inputType_;
        }

        public ByteString getInputTypeBytes() {
            return ByteString.m137260e0(this.inputType_);
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.m137260e0(this.name_);
        }

        public MethodOptions getOptions() {
            MethodOptions methodOptions = this.options_;
            return methodOptions == null ? MethodOptions.getDefaultInstance() : methodOptions;
        }

        public String getOutputType() {
            return this.outputType_;
        }

        public ByteString getOutputTypeBytes() {
            return ByteString.m137260e0(this.outputType_);
        }

        public boolean getServerStreaming() {
            return this.serverStreaming_;
        }

        public boolean hasClientStreaming() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasInputType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasOutputType() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasServerStreaming() {
            return (this.bitField0_ & 32) != 0;
        }

        public static C34204a newBuilder(MethodDescriptorProto methodDescriptorProto) {
            return (C34204a) DEFAULT_INSTANCE.createBuilder(methodDescriptorProto);
        }

        public static MethodDescriptorProto parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static MethodDescriptorProto parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static MethodDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MethodDescriptorProto parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static MethodDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MethodDescriptorProto parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static MethodDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MethodDescriptorProto parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static MethodDescriptorProto parseFrom(C34448s sVar) throws IOException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static MethodDescriptorProto parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    public static final class MethodOptions extends GeneratedMessageLite.ExtendableMessage<MethodOptions, C34207a> implements C34233p {
        /* access modifiers changed from: private */
        public static final MethodOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        public static final int IDEMPOTENCY_LEVEL_FIELD_NUMBER = 34;
        private static volatile C34504y1<MethodOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private int idempotencyLevel_;
        private byte memoizedIsInitialized = 2;
        private C34471v0.C34488k<UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

        public enum IdempotencyLevel implements C34471v0.C34474c {
            IDEMPOTENCY_UNKNOWN(0),
            NO_SIDE_EFFECTS(1),
            IDEMPOTENT(2);
            

            /* renamed from: d */
            public static final int f82908d = 0;

            /* renamed from: e */
            public static final int f82909e = 1;

            /* renamed from: f */
            public static final int f82910f = 2;

            /* renamed from: g */
            public static final C34471v0.C34475d<IdempotencyLevel> f82911g = null;
            private final int value;

            /* renamed from: com.google.protobuf.DescriptorProtos$MethodOptions$IdempotencyLevel$a */
            public class C34205a implements C34471v0.C34475d<IdempotencyLevel> {
                /* renamed from: b */
                public IdempotencyLevel mo93187a(int i) {
                    return IdempotencyLevel.m138105b(i);
                }
            }

            /* renamed from: com.google.protobuf.DescriptorProtos$MethodOptions$IdempotencyLevel$b */
            public static final class C34206b implements C34471v0.C34476e {

                /* renamed from: a */
                public static final C34471v0.C34476e f82913a = null;

                static {
                    f82913a = new C34206b();
                }

                /* renamed from: a */
                public boolean mo93189a(int i) {
                    return IdempotencyLevel.m138105b(i) != null;
                }
            }

            /* access modifiers changed from: public */
            static {
                f82911g = new C34205a();
            }

            /* access modifiers changed from: public */
            IdempotencyLevel(int i) {
                this.value = i;
            }

            /* renamed from: b */
            public static IdempotencyLevel m138105b(int i) {
                if (i == 0) {
                    return IDEMPOTENCY_UNKNOWN;
                }
                if (i == 1) {
                    return NO_SIDE_EFFECTS;
                }
                if (i != 2) {
                    return null;
                }
                return IDEMPOTENT;
            }

            /* renamed from: g */
            public static C34471v0.C34475d<IdempotencyLevel> m138106g() {
                return f82911g;
            }

            /* renamed from: q */
            public static C34471v0.C34476e m138107q() {
                return C34206b.f82913a;
            }

            @Deprecated
            /* renamed from: r */
            public static IdempotencyLevel m138108r(int i) {
                return m138105b(i);
            }

            public final int getNumber() {
                return this.value;
            }
        }

        /* renamed from: com.google.protobuf.DescriptorProtos$MethodOptions$a */
        public static final class C34207a extends GeneratedMessageLite.C34265d<MethodOptions, C34207a> implements C34233p {
            public /* synthetic */ C34207a(C34218a aVar) {
                this();
            }

            /* renamed from: a0 */
            public C34207a mo100078a0(Iterable<? extends UninterpretedOption> iterable) {
                mo100457F();
                ((MethodOptions) this.f83053b).addAllUninterpretedOption(iterable);
                return this;
            }

            /* renamed from: b0 */
            public C34207a mo100079b0(int i, UninterpretedOption.C34216a aVar) {
                mo100457F();
                ((MethodOptions) this.f83053b).addUninterpretedOption(i, (UninterpretedOption) aVar.mo100473g());
                return this;
            }

            /* renamed from: c0 */
            public C34207a mo100080c0(int i, UninterpretedOption uninterpretedOption) {
                mo100457F();
                ((MethodOptions) this.f83053b).addUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            /* renamed from: d0 */
            public C34207a mo100081d0(UninterpretedOption.C34216a aVar) {
                mo100457F();
                ((MethodOptions) this.f83053b).addUninterpretedOption((UninterpretedOption) aVar.mo100473g());
                return this;
            }

            /* renamed from: g0 */
            public C34207a mo100082g0(UninterpretedOption uninterpretedOption) {
                mo100457F();
                ((MethodOptions) this.f83053b).addUninterpretedOption(uninterpretedOption);
                return this;
            }

            public boolean getDeprecated() {
                return ((MethodOptions) this.f83053b).getDeprecated();
            }

            public IdempotencyLevel getIdempotencyLevel() {
                return ((MethodOptions) this.f83053b).getIdempotencyLevel();
            }

            public UninterpretedOption getUninterpretedOption(int i) {
                return ((MethodOptions) this.f83053b).getUninterpretedOption(i);
            }

            public int getUninterpretedOptionCount() {
                return ((MethodOptions) this.f83053b).getUninterpretedOptionCount();
            }

            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((MethodOptions) this.f83053b).getUninterpretedOptionList());
            }

            /* renamed from: h0 */
            public C34207a mo100083h0() {
                mo100457F();
                ((MethodOptions) this.f83053b).clearDeprecated();
                return this;
            }

            public boolean hasDeprecated() {
                return ((MethodOptions) this.f83053b).hasDeprecated();
            }

            public boolean hasIdempotencyLevel() {
                return ((MethodOptions) this.f83053b).hasIdempotencyLevel();
            }

            /* renamed from: i0 */
            public C34207a mo100084i0() {
                mo100457F();
                ((MethodOptions) this.f83053b).clearIdempotencyLevel();
                return this;
            }

            /* renamed from: j0 */
            public C34207a mo100085j0() {
                mo100457F();
                ((MethodOptions) this.f83053b).clearUninterpretedOption();
                return this;
            }

            /* renamed from: k0 */
            public C34207a mo100086k0(int i) {
                mo100457F();
                ((MethodOptions) this.f83053b).removeUninterpretedOption(i);
                return this;
            }

            /* renamed from: l0 */
            public C34207a mo100087l0(boolean z) {
                mo100457F();
                ((MethodOptions) this.f83053b).setDeprecated(z);
                return this;
            }

            /* renamed from: m0 */
            public C34207a mo100088m0(IdempotencyLevel idempotencyLevel) {
                mo100457F();
                ((MethodOptions) this.f83053b).setIdempotencyLevel(idempotencyLevel);
                return this;
            }

            /* renamed from: o0 */
            public C34207a mo100089o0(int i, UninterpretedOption.C34216a aVar) {
                mo100457F();
                ((MethodOptions) this.f83053b).setUninterpretedOption(i, (UninterpretedOption) aVar.mo100473g());
                return this;
            }

            /* renamed from: q0 */
            public C34207a mo100090q0(int i, UninterpretedOption uninterpretedOption) {
                mo100457F();
                ((MethodOptions) this.f83053b).setUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            public C34207a() {
                super(MethodOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            MethodOptions methodOptions = new MethodOptions();
            DEFAULT_INSTANCE = methodOptions;
            GeneratedMessageLite.registerDefaultInstance(MethodOptions.class, methodOptions);
        }

        private MethodOptions() {
        }

        /* access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            C34319a.addAll(iterable, this.uninterpretedOption_);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -2;
            this.deprecated_ = false;
        }

        /* access modifiers changed from: private */
        public void clearIdempotencyLevel() {
            this.bitField0_ &= -3;
            this.idempotencyLevel_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureUninterpretedOptionIsMutable() {
            C34471v0.C34488k<UninterpretedOption> kVar = this.uninterpretedOption_;
            if (!kVar.mo100971T()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        public static MethodOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C34207a newBuilder() {
            return (C34207a) DEFAULT_INSTANCE.createBuilder();
        }

        public static MethodOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MethodOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MethodOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<MethodOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 1;
            this.deprecated_ = z;
        }

        /* access modifiers changed from: private */
        public void setIdempotencyLevel(IdempotencyLevel idempotencyLevel) {
            this.idempotencyLevel_ = idempotencyLevel.getNumber();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, uninterpretedOption);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 1;
            switch (C34218a.f82914a[methodToInvoke.ordinal()]) {
                case 1:
                    return new MethodOptions();
                case 2:
                    return new C34207a((C34218a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001!ϧ\u0003\u0000\u0001\u0001!ဇ\u0000\"ဌ\u0001ϧЛ", new Object[]{"bitField0_", "deprecated_", "idempotencyLevel_", IdempotencyLevel.m138107q(), "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<MethodOptions> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (MethodOptions.class) {
                            y1Var = PARSER;
                            if (y1Var == null) {
                                y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                                PARSER = y1Var;
                            }
                        }
                    }
                    return y1Var;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public boolean getDeprecated() {
            return this.deprecated_;
        }

        public IdempotencyLevel getIdempotencyLevel() {
            IdempotencyLevel b = IdempotencyLevel.m138105b(this.idempotencyLevel_);
            if (b == null) {
                return IdempotencyLevel.IDEMPOTENCY_UNKNOWN;
            }
            return b;
        }

        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public C34239v getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends C34239v> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        public boolean hasDeprecated() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasIdempotencyLevel() {
            return (this.bitField0_ & 2) != 0;
        }

        public static C34207a newBuilder(MethodOptions methodOptions) {
            return (C34207a) DEFAULT_INSTANCE.createBuilder(methodOptions);
        }

        public static MethodOptions parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (MethodOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static MethodOptions parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static MethodOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, uninterpretedOption);
        }

        public static MethodOptions parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static MethodOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MethodOptions parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static MethodOptions parseFrom(InputStream inputStream) throws IOException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MethodOptions parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static MethodOptions parseFrom(C34448s sVar) throws IOException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static MethodOptions parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    public static final class OneofDescriptorProto extends GeneratedMessageLite<OneofDescriptorProto, C34208a> implements C34234q {
        /* access modifiers changed from: private */
        public static final OneofDescriptorProto DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 2;
        private static volatile C34504y1<OneofDescriptorProto> PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private OneofOptions options_;

        /* renamed from: com.google.protobuf.DescriptorProtos$OneofDescriptorProto$a */
        public static final class C34208a extends GeneratedMessageLite.C34263b<OneofDescriptorProto, C34208a> implements C34234q {
            public /* synthetic */ C34208a(C34218a aVar) {
                this();
            }

            /* renamed from: P */
            public C34208a mo100096P() {
                mo100457F();
                ((OneofDescriptorProto) this.f83053b).clearName();
                return this;
            }

            /* renamed from: R */
            public C34208a mo100097R() {
                mo100457F();
                ((OneofDescriptorProto) this.f83053b).clearOptions();
                return this;
            }

            /* renamed from: S */
            public C34208a mo100098S(OneofOptions oneofOptions) {
                mo100457F();
                ((OneofDescriptorProto) this.f83053b).mergeOptions(oneofOptions);
                return this;
            }

            /* renamed from: T */
            public C34208a mo100099T(String str) {
                mo100457F();
                ((OneofDescriptorProto) this.f83053b).setName(str);
                return this;
            }

            /* renamed from: U */
            public C34208a mo100100U(ByteString byteString) {
                mo100457F();
                ((OneofDescriptorProto) this.f83053b).setNameBytes(byteString);
                return this;
            }

            /* renamed from: V */
            public C34208a mo100101V(OneofOptions.C34209a aVar) {
                mo100457F();
                ((OneofDescriptorProto) this.f83053b).setOptions((OneofOptions) aVar.mo100473g());
                return this;
            }

            /* renamed from: Y */
            public C34208a mo100102Y(OneofOptions oneofOptions) {
                mo100457F();
                ((OneofDescriptorProto) this.f83053b).setOptions(oneofOptions);
                return this;
            }

            public String getName() {
                return ((OneofDescriptorProto) this.f83053b).getName();
            }

            public ByteString getNameBytes() {
                return ((OneofDescriptorProto) this.f83053b).getNameBytes();
            }

            public OneofOptions getOptions() {
                return ((OneofDescriptorProto) this.f83053b).getOptions();
            }

            public boolean hasName() {
                return ((OneofDescriptorProto) this.f83053b).hasName();
            }

            public boolean hasOptions() {
                return ((OneofDescriptorProto) this.f83053b).hasOptions();
            }

            public C34208a() {
                super(OneofDescriptorProto.DEFAULT_INSTANCE);
            }
        }

        static {
            OneofDescriptorProto oneofDescriptorProto = new OneofDescriptorProto();
            DEFAULT_INSTANCE = oneofDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(OneofDescriptorProto.class, oneofDescriptorProto);
        }

        private OneofDescriptorProto() {
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        public static OneofDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeOptions(OneofOptions oneofOptions) {
            oneofOptions.getClass();
            OneofOptions oneofOptions2 = this.options_;
            if (oneofOptions2 == null || oneofOptions2 == OneofOptions.getDefaultInstance()) {
                this.options_ = oneofOptions;
            } else {
                this.options_ = (OneofOptions) ((OneofOptions.C34209a) OneofOptions.newBuilder(this.options_).mo100463K(oneofOptions)).mo100467Q();
            }
            this.bitField0_ |= 2;
        }

        public static C34208a newBuilder() {
            return (C34208a) DEFAULT_INSTANCE.createBuilder();
        }

        public static OneofDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OneofDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<OneofDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            this.name_ = byteString.mo99228S0();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setOptions(OneofOptions oneofOptions) {
            oneofOptions.getClass();
            this.options_ = oneofOptions;
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 1;
            switch (C34218a.f82914a[methodToInvoke.ordinal()]) {
                case 1:
                    return new OneofDescriptorProto();
                case 2:
                    return new C34208a((C34218a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"bitField0_", "name_", "options_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<OneofDescriptorProto> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (OneofDescriptorProto.class) {
                            y1Var = PARSER;
                            if (y1Var == null) {
                                y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                                PARSER = y1Var;
                            }
                        }
                    }
                    return y1Var;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.m137260e0(this.name_);
        }

        public OneofOptions getOptions() {
            OneofOptions oneofOptions = this.options_;
            return oneofOptions == null ? OneofOptions.getDefaultInstance() : oneofOptions;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        public static C34208a newBuilder(OneofDescriptorProto oneofDescriptorProto) {
            return (C34208a) DEFAULT_INSTANCE.createBuilder(oneofDescriptorProto);
        }

        public static OneofDescriptorProto parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static OneofDescriptorProto parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static OneofDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OneofDescriptorProto parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static OneofDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OneofDescriptorProto parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static OneofDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OneofDescriptorProto parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static OneofDescriptorProto parseFrom(C34448s sVar) throws IOException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static OneofDescriptorProto parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    public static final class OneofOptions extends GeneratedMessageLite.ExtendableMessage<OneofOptions, C34209a> implements C34235r {
        /* access modifiers changed from: private */
        public static final OneofOptions DEFAULT_INSTANCE;
        private static volatile C34504y1<OneofOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private byte memoizedIsInitialized = 2;
        private C34471v0.C34488k<UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: com.google.protobuf.DescriptorProtos$OneofOptions$a */
        public static final class C34209a extends GeneratedMessageLite.C34265d<OneofOptions, C34209a> implements C34235r {
            public /* synthetic */ C34209a(C34218a aVar) {
                this();
            }

            /* renamed from: a0 */
            public C34209a mo100108a0(Iterable<? extends UninterpretedOption> iterable) {
                mo100457F();
                ((OneofOptions) this.f83053b).addAllUninterpretedOption(iterable);
                return this;
            }

            /* renamed from: b0 */
            public C34209a mo100109b0(int i, UninterpretedOption.C34216a aVar) {
                mo100457F();
                ((OneofOptions) this.f83053b).addUninterpretedOption(i, (UninterpretedOption) aVar.mo100473g());
                return this;
            }

            /* renamed from: c0 */
            public C34209a mo100110c0(int i, UninterpretedOption uninterpretedOption) {
                mo100457F();
                ((OneofOptions) this.f83053b).addUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            /* renamed from: d0 */
            public C34209a mo100111d0(UninterpretedOption.C34216a aVar) {
                mo100457F();
                ((OneofOptions) this.f83053b).addUninterpretedOption((UninterpretedOption) aVar.mo100473g());
                return this;
            }

            /* renamed from: g0 */
            public C34209a mo100112g0(UninterpretedOption uninterpretedOption) {
                mo100457F();
                ((OneofOptions) this.f83053b).addUninterpretedOption(uninterpretedOption);
                return this;
            }

            public UninterpretedOption getUninterpretedOption(int i) {
                return ((OneofOptions) this.f83053b).getUninterpretedOption(i);
            }

            public int getUninterpretedOptionCount() {
                return ((OneofOptions) this.f83053b).getUninterpretedOptionCount();
            }

            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((OneofOptions) this.f83053b).getUninterpretedOptionList());
            }

            /* renamed from: h0 */
            public C34209a mo100113h0() {
                mo100457F();
                ((OneofOptions) this.f83053b).clearUninterpretedOption();
                return this;
            }

            /* renamed from: i0 */
            public C34209a mo100114i0(int i) {
                mo100457F();
                ((OneofOptions) this.f83053b).removeUninterpretedOption(i);
                return this;
            }

            /* renamed from: j0 */
            public C34209a mo100115j0(int i, UninterpretedOption.C34216a aVar) {
                mo100457F();
                ((OneofOptions) this.f83053b).setUninterpretedOption(i, (UninterpretedOption) aVar.mo100473g());
                return this;
            }

            /* renamed from: k0 */
            public C34209a mo100116k0(int i, UninterpretedOption uninterpretedOption) {
                mo100457F();
                ((OneofOptions) this.f83053b).setUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            public C34209a() {
                super(OneofOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            OneofOptions oneofOptions = new OneofOptions();
            DEFAULT_INSTANCE = oneofOptions;
            GeneratedMessageLite.registerDefaultInstance(OneofOptions.class, oneofOptions);
        }

        private OneofOptions() {
        }

        /* access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            C34319a.addAll(iterable, this.uninterpretedOption_);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureUninterpretedOptionIsMutable() {
            C34471v0.C34488k<UninterpretedOption> kVar = this.uninterpretedOption_;
            if (!kVar.mo100971T()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        public static OneofOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C34209a newBuilder() {
            return (C34209a) DEFAULT_INSTANCE.createBuilder();
        }

        public static OneofOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OneofOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OneofOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<OneofOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, uninterpretedOption);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 1;
            switch (C34218a.f82914a[methodToInvoke.ordinal()]) {
                case 1:
                    return new OneofOptions();
                case 2:
                    return new C34209a((C34218a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000ϧϧ\u0001\u0000\u0001\u0001ϧЛ", new Object[]{"uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<OneofOptions> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (OneofOptions.class) {
                            y1Var = PARSER;
                            if (y1Var == null) {
                                y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                                PARSER = y1Var;
                            }
                        }
                    }
                    return y1Var;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public C34239v getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends C34239v> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        public static C34209a newBuilder(OneofOptions oneofOptions) {
            return (C34209a) DEFAULT_INSTANCE.createBuilder(oneofOptions);
        }

        public static OneofOptions parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (OneofOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static OneofOptions parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static OneofOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, uninterpretedOption);
        }

        public static OneofOptions parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static OneofOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OneofOptions parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static OneofOptions parseFrom(InputStream inputStream) throws IOException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OneofOptions parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static OneofOptions parseFrom(C34448s sVar) throws IOException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static OneofOptions parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    public static final class ServiceDescriptorProto extends GeneratedMessageLite<ServiceDescriptorProto, C34210a> implements C34236s {
        /* access modifiers changed from: private */
        public static final ServiceDescriptorProto DEFAULT_INSTANCE;
        public static final int METHOD_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile C34504y1<ServiceDescriptorProto> PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private C34471v0.C34488k<MethodDescriptorProto> method_ = GeneratedMessageLite.emptyProtobufList();
        private String name_ = "";
        private ServiceOptions options_;

        /* renamed from: com.google.protobuf.DescriptorProtos$ServiceDescriptorProto$a */
        public static final class C34210a extends GeneratedMessageLite.C34263b<ServiceDescriptorProto, C34210a> implements C34236s {
            public /* synthetic */ C34210a(C34218a aVar) {
                this();
            }

            /* renamed from: P */
            public C34210a mo100127P(Iterable<? extends MethodDescriptorProto> iterable) {
                mo100457F();
                ((ServiceDescriptorProto) this.f83053b).addAllMethod(iterable);
                return this;
            }

            /* renamed from: R */
            public C34210a mo100128R(int i, MethodDescriptorProto.C34204a aVar) {
                mo100457F();
                ((ServiceDescriptorProto) this.f83053b).addMethod(i, (MethodDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: S */
            public C34210a mo100129S(int i, MethodDescriptorProto methodDescriptorProto) {
                mo100457F();
                ((ServiceDescriptorProto) this.f83053b).addMethod(i, methodDescriptorProto);
                return this;
            }

            /* renamed from: T */
            public C34210a mo100130T(MethodDescriptorProto.C34204a aVar) {
                mo100457F();
                ((ServiceDescriptorProto) this.f83053b).addMethod((MethodDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: U */
            public C34210a mo100131U(MethodDescriptorProto methodDescriptorProto) {
                mo100457F();
                ((ServiceDescriptorProto) this.f83053b).addMethod(methodDescriptorProto);
                return this;
            }

            /* renamed from: V */
            public C34210a mo100132V() {
                mo100457F();
                ((ServiceDescriptorProto) this.f83053b).clearMethod();
                return this;
            }

            /* renamed from: Y */
            public C34210a mo100133Y() {
                mo100457F();
                ((ServiceDescriptorProto) this.f83053b).clearName();
                return this;
            }

            /* renamed from: Z */
            public C34210a mo100134Z() {
                mo100457F();
                ((ServiceDescriptorProto) this.f83053b).clearOptions();
                return this;
            }

            /* renamed from: a0 */
            public C34210a mo100135a0(ServiceOptions serviceOptions) {
                mo100457F();
                ((ServiceDescriptorProto) this.f83053b).mergeOptions(serviceOptions);
                return this;
            }

            /* renamed from: b0 */
            public C34210a mo100136b0(int i) {
                mo100457F();
                ((ServiceDescriptorProto) this.f83053b).removeMethod(i);
                return this;
            }

            /* renamed from: c0 */
            public C34210a mo100137c0(int i, MethodDescriptorProto.C34204a aVar) {
                mo100457F();
                ((ServiceDescriptorProto) this.f83053b).setMethod(i, (MethodDescriptorProto) aVar.mo100473g());
                return this;
            }

            /* renamed from: d0 */
            public C34210a mo100138d0(int i, MethodDescriptorProto methodDescriptorProto) {
                mo100457F();
                ((ServiceDescriptorProto) this.f83053b).setMethod(i, methodDescriptorProto);
                return this;
            }

            /* renamed from: g0 */
            public C34210a mo100139g0(String str) {
                mo100457F();
                ((ServiceDescriptorProto) this.f83053b).setName(str);
                return this;
            }

            public MethodDescriptorProto getMethod(int i) {
                return ((ServiceDescriptorProto) this.f83053b).getMethod(i);
            }

            public int getMethodCount() {
                return ((ServiceDescriptorProto) this.f83053b).getMethodCount();
            }

            public List<MethodDescriptorProto> getMethodList() {
                return Collections.unmodifiableList(((ServiceDescriptorProto) this.f83053b).getMethodList());
            }

            public String getName() {
                return ((ServiceDescriptorProto) this.f83053b).getName();
            }

            public ByteString getNameBytes() {
                return ((ServiceDescriptorProto) this.f83053b).getNameBytes();
            }

            public ServiceOptions getOptions() {
                return ((ServiceDescriptorProto) this.f83053b).getOptions();
            }

            /* renamed from: h0 */
            public C34210a mo100140h0(ByteString byteString) {
                mo100457F();
                ((ServiceDescriptorProto) this.f83053b).setNameBytes(byteString);
                return this;
            }

            public boolean hasName() {
                return ((ServiceDescriptorProto) this.f83053b).hasName();
            }

            public boolean hasOptions() {
                return ((ServiceDescriptorProto) this.f83053b).hasOptions();
            }

            /* renamed from: i0 */
            public C34210a mo100141i0(ServiceOptions.C34211a aVar) {
                mo100457F();
                ((ServiceDescriptorProto) this.f83053b).setOptions((ServiceOptions) aVar.mo100473g());
                return this;
            }

            /* renamed from: j0 */
            public C34210a mo100142j0(ServiceOptions serviceOptions) {
                mo100457F();
                ((ServiceDescriptorProto) this.f83053b).setOptions(serviceOptions);
                return this;
            }

            public C34210a() {
                super(ServiceDescriptorProto.DEFAULT_INSTANCE);
            }
        }

        static {
            ServiceDescriptorProto serviceDescriptorProto = new ServiceDescriptorProto();
            DEFAULT_INSTANCE = serviceDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(ServiceDescriptorProto.class, serviceDescriptorProto);
        }

        private ServiceDescriptorProto() {
        }

        /* access modifiers changed from: private */
        public void addAllMethod(Iterable<? extends MethodDescriptorProto> iterable) {
            ensureMethodIsMutable();
            C34319a.addAll(iterable, this.method_);
        }

        /* access modifiers changed from: private */
        public void addMethod(MethodDescriptorProto methodDescriptorProto) {
            methodDescriptorProto.getClass();
            ensureMethodIsMutable();
            this.method_.add(methodDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void clearMethod() {
            this.method_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        private void ensureMethodIsMutable() {
            C34471v0.C34488k<MethodDescriptorProto> kVar = this.method_;
            if (!kVar.mo100971T()) {
                this.method_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        public static ServiceDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeOptions(ServiceOptions serviceOptions) {
            serviceOptions.getClass();
            ServiceOptions serviceOptions2 = this.options_;
            if (serviceOptions2 == null || serviceOptions2 == ServiceOptions.getDefaultInstance()) {
                this.options_ = serviceOptions;
            } else {
                this.options_ = (ServiceOptions) ((ServiceOptions.C34211a) ServiceOptions.newBuilder(this.options_).mo100463K(serviceOptions)).mo100467Q();
            }
            this.bitField0_ |= 2;
        }

        public static C34210a newBuilder() {
            return (C34210a) DEFAULT_INSTANCE.createBuilder();
        }

        public static ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<ServiceDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeMethod(int i) {
            ensureMethodIsMutable();
            this.method_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setMethod(int i, MethodDescriptorProto methodDescriptorProto) {
            methodDescriptorProto.getClass();
            ensureMethodIsMutable();
            this.method_.set(i, methodDescriptorProto);
        }

        /* access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            this.name_ = byteString.mo99228S0();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setOptions(ServiceOptions serviceOptions) {
            serviceOptions.getClass();
            this.options_ = serviceOptions;
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 1;
            switch (C34218a.f82914a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ServiceDescriptorProto();
                case 2:
                    return new C34210a((C34218a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001", new Object[]{"bitField0_", "name_", "method_", MethodDescriptorProto.class, "options_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<ServiceDescriptorProto> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (ServiceDescriptorProto.class) {
                            y1Var = PARSER;
                            if (y1Var == null) {
                                y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                                PARSER = y1Var;
                            }
                        }
                    }
                    return y1Var;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public MethodDescriptorProto getMethod(int i) {
            return this.method_.get(i);
        }

        public int getMethodCount() {
            return this.method_.size();
        }

        public List<MethodDescriptorProto> getMethodList() {
            return this.method_;
        }

        public C34232o getMethodOrBuilder(int i) {
            return this.method_.get(i);
        }

        public List<? extends C34232o> getMethodOrBuilderList() {
            return this.method_;
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.m137260e0(this.name_);
        }

        public ServiceOptions getOptions() {
            ServiceOptions serviceOptions = this.options_;
            return serviceOptions == null ? ServiceOptions.getDefaultInstance() : serviceOptions;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        public static C34210a newBuilder(ServiceDescriptorProto serviceDescriptorProto) {
            return (C34210a) DEFAULT_INSTANCE.createBuilder(serviceDescriptorProto);
        }

        public static ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static ServiceDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addMethod(int i, MethodDescriptorProto methodDescriptorProto) {
            methodDescriptorProto.getClass();
            ensureMethodIsMutable();
            this.method_.add(i, methodDescriptorProto);
        }

        public static ServiceDescriptorProto parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static ServiceDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ServiceDescriptorProto parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static ServiceDescriptorProto parseFrom(InputStream inputStream) throws IOException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServiceDescriptorProto parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static ServiceDescriptorProto parseFrom(C34448s sVar) throws IOException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static ServiceDescriptorProto parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    public static final class ServiceOptions extends GeneratedMessageLite.ExtendableMessage<ServiceOptions, C34211a> implements C34237t {
        /* access modifiers changed from: private */
        public static final ServiceOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        private static volatile C34504y1<ServiceOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized = 2;
        private C34471v0.C34488k<UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: com.google.protobuf.DescriptorProtos$ServiceOptions$a */
        public static final class C34211a extends GeneratedMessageLite.C34265d<ServiceOptions, C34211a> implements C34237t {
            public /* synthetic */ C34211a(C34218a aVar) {
                this();
            }

            /* renamed from: a0 */
            public C34211a mo100150a0(Iterable<? extends UninterpretedOption> iterable) {
                mo100457F();
                ((ServiceOptions) this.f83053b).addAllUninterpretedOption(iterable);
                return this;
            }

            /* renamed from: b0 */
            public C34211a mo100151b0(int i, UninterpretedOption.C34216a aVar) {
                mo100457F();
                ((ServiceOptions) this.f83053b).addUninterpretedOption(i, (UninterpretedOption) aVar.mo100473g());
                return this;
            }

            /* renamed from: c0 */
            public C34211a mo100152c0(int i, UninterpretedOption uninterpretedOption) {
                mo100457F();
                ((ServiceOptions) this.f83053b).addUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            /* renamed from: d0 */
            public C34211a mo100153d0(UninterpretedOption.C34216a aVar) {
                mo100457F();
                ((ServiceOptions) this.f83053b).addUninterpretedOption((UninterpretedOption) aVar.mo100473g());
                return this;
            }

            /* renamed from: g0 */
            public C34211a mo100154g0(UninterpretedOption uninterpretedOption) {
                mo100457F();
                ((ServiceOptions) this.f83053b).addUninterpretedOption(uninterpretedOption);
                return this;
            }

            public boolean getDeprecated() {
                return ((ServiceOptions) this.f83053b).getDeprecated();
            }

            public UninterpretedOption getUninterpretedOption(int i) {
                return ((ServiceOptions) this.f83053b).getUninterpretedOption(i);
            }

            public int getUninterpretedOptionCount() {
                return ((ServiceOptions) this.f83053b).getUninterpretedOptionCount();
            }

            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((ServiceOptions) this.f83053b).getUninterpretedOptionList());
            }

            /* renamed from: h0 */
            public C34211a mo100155h0() {
                mo100457F();
                ((ServiceOptions) this.f83053b).clearDeprecated();
                return this;
            }

            public boolean hasDeprecated() {
                return ((ServiceOptions) this.f83053b).hasDeprecated();
            }

            /* renamed from: i0 */
            public C34211a mo100156i0() {
                mo100457F();
                ((ServiceOptions) this.f83053b).clearUninterpretedOption();
                return this;
            }

            /* renamed from: j0 */
            public C34211a mo100157j0(int i) {
                mo100457F();
                ((ServiceOptions) this.f83053b).removeUninterpretedOption(i);
                return this;
            }

            /* renamed from: k0 */
            public C34211a mo100158k0(boolean z) {
                mo100457F();
                ((ServiceOptions) this.f83053b).setDeprecated(z);
                return this;
            }

            /* renamed from: l0 */
            public C34211a mo100159l0(int i, UninterpretedOption.C34216a aVar) {
                mo100457F();
                ((ServiceOptions) this.f83053b).setUninterpretedOption(i, (UninterpretedOption) aVar.mo100473g());
                return this;
            }

            /* renamed from: m0 */
            public C34211a mo100160m0(int i, UninterpretedOption uninterpretedOption) {
                mo100457F();
                ((ServiceOptions) this.f83053b).setUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            public C34211a() {
                super(ServiceOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            ServiceOptions serviceOptions = new ServiceOptions();
            DEFAULT_INSTANCE = serviceOptions;
            GeneratedMessageLite.registerDefaultInstance(ServiceOptions.class, serviceOptions);
        }

        private ServiceOptions() {
        }

        /* access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            C34319a.addAll(iterable, this.uninterpretedOption_);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -2;
            this.deprecated_ = false;
        }

        /* access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureUninterpretedOptionIsMutable() {
            C34471v0.C34488k<UninterpretedOption> kVar = this.uninterpretedOption_;
            if (!kVar.mo100971T()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        public static ServiceOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C34211a newBuilder() {
            return (C34211a) DEFAULT_INSTANCE.createBuilder();
        }

        public static ServiceOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ServiceOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServiceOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<ServiceOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 1;
            this.deprecated_ = z;
        }

        /* access modifiers changed from: private */
        public void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, uninterpretedOption);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 1;
            switch (C34218a.f82914a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ServiceOptions();
                case 2:
                    return new C34211a((C34218a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001!ϧ\u0002\u0000\u0001\u0001!ဇ\u0000ϧЛ", new Object[]{"bitField0_", "deprecated_", "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<ServiceOptions> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (ServiceOptions.class) {
                            y1Var = PARSER;
                            if (y1Var == null) {
                                y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                                PARSER = y1Var;
                            }
                        }
                    }
                    return y1Var;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public boolean getDeprecated() {
            return this.deprecated_;
        }

        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public C34239v getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends C34239v> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        public boolean hasDeprecated() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C34211a newBuilder(ServiceOptions serviceOptions) {
            return (C34211a) DEFAULT_INSTANCE.createBuilder(serviceOptions);
        }

        public static ServiceOptions parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (ServiceOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static ServiceOptions parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static ServiceOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, uninterpretedOption);
        }

        public static ServiceOptions parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static ServiceOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ServiceOptions parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static ServiceOptions parseFrom(InputStream inputStream) throws IOException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServiceOptions parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static ServiceOptions parseFrom(C34448s sVar) throws IOException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static ServiceOptions parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    public static final class SourceCodeInfo extends GeneratedMessageLite<SourceCodeInfo, C34213a> implements C34238u {
        /* access modifiers changed from: private */
        public static final SourceCodeInfo DEFAULT_INSTANCE;
        public static final int LOCATION_FIELD_NUMBER = 1;
        private static volatile C34504y1<SourceCodeInfo> PARSER;
        private C34471v0.C34488k<Location> location_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Location extends GeneratedMessageLite<Location, C34212a> implements C34214b {
            /* access modifiers changed from: private */
            public static final Location DEFAULT_INSTANCE;
            public static final int LEADING_COMMENTS_FIELD_NUMBER = 3;
            public static final int LEADING_DETACHED_COMMENTS_FIELD_NUMBER = 6;
            private static volatile C34504y1<Location> PARSER = null;
            public static final int PATH_FIELD_NUMBER = 1;
            public static final int SPAN_FIELD_NUMBER = 2;
            public static final int TRAILING_COMMENTS_FIELD_NUMBER = 4;
            private int bitField0_;
            private String leadingComments_ = "";
            private C34471v0.C34488k<String> leadingDetachedComments_ = GeneratedMessageLite.emptyProtobufList();
            private int pathMemoizedSerializedSize = -1;
            private C34471v0.C34478g path_ = GeneratedMessageLite.emptyIntList();
            private int spanMemoizedSerializedSize = -1;
            private C34471v0.C34478g span_ = GeneratedMessageLite.emptyIntList();
            private String trailingComments_ = "";

            /* renamed from: com.google.protobuf.DescriptorProtos$SourceCodeInfo$Location$a */
            public static final class C34212a extends GeneratedMessageLite.C34263b<Location, C34212a> implements C34214b {
                public /* synthetic */ C34212a(C34218a aVar) {
                    this();
                }

                /* renamed from: P */
                public C34212a mo100182P(Iterable<String> iterable) {
                    mo100457F();
                    ((Location) this.f83053b).addAllLeadingDetachedComments(iterable);
                    return this;
                }

                /* renamed from: R */
                public C34212a mo100183R(Iterable<? extends Integer> iterable) {
                    mo100457F();
                    ((Location) this.f83053b).addAllPath(iterable);
                    return this;
                }

                /* renamed from: S */
                public C34212a mo100184S(Iterable<? extends Integer> iterable) {
                    mo100457F();
                    ((Location) this.f83053b).addAllSpan(iterable);
                    return this;
                }

                /* renamed from: T */
                public C34212a mo100185T(String str) {
                    mo100457F();
                    ((Location) this.f83053b).addLeadingDetachedComments(str);
                    return this;
                }

                /* renamed from: U */
                public C34212a mo100186U(ByteString byteString) {
                    mo100457F();
                    ((Location) this.f83053b).addLeadingDetachedCommentsBytes(byteString);
                    return this;
                }

                /* renamed from: V */
                public C34212a mo100187V(int i) {
                    mo100457F();
                    ((Location) this.f83053b).addPath(i);
                    return this;
                }

                /* renamed from: Y */
                public C34212a mo100188Y(int i) {
                    mo100457F();
                    ((Location) this.f83053b).addSpan(i);
                    return this;
                }

                /* renamed from: Z */
                public C34212a mo100189Z() {
                    mo100457F();
                    ((Location) this.f83053b).clearLeadingComments();
                    return this;
                }

                /* renamed from: a0 */
                public C34212a mo100190a0() {
                    mo100457F();
                    ((Location) this.f83053b).clearLeadingDetachedComments();
                    return this;
                }

                /* renamed from: b0 */
                public C34212a mo100191b0() {
                    mo100457F();
                    ((Location) this.f83053b).clearPath();
                    return this;
                }

                /* renamed from: c0 */
                public C34212a mo100192c0() {
                    mo100457F();
                    ((Location) this.f83053b).clearSpan();
                    return this;
                }

                /* renamed from: d0 */
                public C34212a mo100193d0() {
                    mo100457F();
                    ((Location) this.f83053b).clearTrailingComments();
                    return this;
                }

                /* renamed from: g0 */
                public C34212a mo100194g0(String str) {
                    mo100457F();
                    ((Location) this.f83053b).setLeadingComments(str);
                    return this;
                }

                public String getLeadingComments() {
                    return ((Location) this.f83053b).getLeadingComments();
                }

                public ByteString getLeadingCommentsBytes() {
                    return ((Location) this.f83053b).getLeadingCommentsBytes();
                }

                public String getLeadingDetachedComments(int i) {
                    return ((Location) this.f83053b).getLeadingDetachedComments(i);
                }

                public ByteString getLeadingDetachedCommentsBytes(int i) {
                    return ((Location) this.f83053b).getLeadingDetachedCommentsBytes(i);
                }

                public int getLeadingDetachedCommentsCount() {
                    return ((Location) this.f83053b).getLeadingDetachedCommentsCount();
                }

                public List<String> getLeadingDetachedCommentsList() {
                    return Collections.unmodifiableList(((Location) this.f83053b).getLeadingDetachedCommentsList());
                }

                public int getPath(int i) {
                    return ((Location) this.f83053b).getPath(i);
                }

                public int getPathCount() {
                    return ((Location) this.f83053b).getPathCount();
                }

                public List<Integer> getPathList() {
                    return Collections.unmodifiableList(((Location) this.f83053b).getPathList());
                }

                public int getSpan(int i) {
                    return ((Location) this.f83053b).getSpan(i);
                }

                public int getSpanCount() {
                    return ((Location) this.f83053b).getSpanCount();
                }

                public List<Integer> getSpanList() {
                    return Collections.unmodifiableList(((Location) this.f83053b).getSpanList());
                }

                public String getTrailingComments() {
                    return ((Location) this.f83053b).getTrailingComments();
                }

                public ByteString getTrailingCommentsBytes() {
                    return ((Location) this.f83053b).getTrailingCommentsBytes();
                }

                /* renamed from: h0 */
                public C34212a mo100195h0(ByteString byteString) {
                    mo100457F();
                    ((Location) this.f83053b).setLeadingCommentsBytes(byteString);
                    return this;
                }

                public boolean hasLeadingComments() {
                    return ((Location) this.f83053b).hasLeadingComments();
                }

                public boolean hasTrailingComments() {
                    return ((Location) this.f83053b).hasTrailingComments();
                }

                /* renamed from: i0 */
                public C34212a mo100196i0(int i, String str) {
                    mo100457F();
                    ((Location) this.f83053b).setLeadingDetachedComments(i, str);
                    return this;
                }

                /* renamed from: j0 */
                public C34212a mo100197j0(int i, int i2) {
                    mo100457F();
                    ((Location) this.f83053b).setPath(i, i2);
                    return this;
                }

                /* renamed from: k0 */
                public C34212a mo100198k0(int i, int i2) {
                    mo100457F();
                    ((Location) this.f83053b).setSpan(i, i2);
                    return this;
                }

                /* renamed from: l0 */
                public C34212a mo100199l0(String str) {
                    mo100457F();
                    ((Location) this.f83053b).setTrailingComments(str);
                    return this;
                }

                /* renamed from: m0 */
                public C34212a mo100200m0(ByteString byteString) {
                    mo100457F();
                    ((Location) this.f83053b).setTrailingCommentsBytes(byteString);
                    return this;
                }

                public C34212a() {
                    super(Location.DEFAULT_INSTANCE);
                }
            }

            static {
                Location location = new Location();
                DEFAULT_INSTANCE = location;
                GeneratedMessageLite.registerDefaultInstance(Location.class, location);
            }

            private Location() {
            }

            /* access modifiers changed from: private */
            public void addAllLeadingDetachedComments(Iterable<String> iterable) {
                ensureLeadingDetachedCommentsIsMutable();
                C34319a.addAll(iterable, this.leadingDetachedComments_);
            }

            /* access modifiers changed from: private */
            public void addAllPath(Iterable<? extends Integer> iterable) {
                ensurePathIsMutable();
                C34319a.addAll(iterable, this.path_);
            }

            /* access modifiers changed from: private */
            public void addAllSpan(Iterable<? extends Integer> iterable) {
                ensureSpanIsMutable();
                C34319a.addAll(iterable, this.span_);
            }

            /* access modifiers changed from: private */
            public void addLeadingDetachedComments(String str) {
                str.getClass();
                ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.add(str);
            }

            /* access modifiers changed from: private */
            public void addLeadingDetachedCommentsBytes(ByteString byteString) {
                ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.add(byteString.mo99228S0());
            }

            /* access modifiers changed from: private */
            public void addPath(int i) {
                ensurePathIsMutable();
                this.path_.mo101605V(i);
            }

            /* access modifiers changed from: private */
            public void addSpan(int i) {
                ensureSpanIsMutable();
                this.span_.mo101605V(i);
            }

            /* access modifiers changed from: private */
            public void clearLeadingComments() {
                this.bitField0_ &= -2;
                this.leadingComments_ = getDefaultInstance().getLeadingComments();
            }

            /* access modifiers changed from: private */
            public void clearLeadingDetachedComments() {
                this.leadingDetachedComments_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* access modifiers changed from: private */
            public void clearPath() {
                this.path_ = GeneratedMessageLite.emptyIntList();
            }

            /* access modifiers changed from: private */
            public void clearSpan() {
                this.span_ = GeneratedMessageLite.emptyIntList();
            }

            /* access modifiers changed from: private */
            public void clearTrailingComments() {
                this.bitField0_ &= -3;
                this.trailingComments_ = getDefaultInstance().getTrailingComments();
            }

            private void ensureLeadingDetachedCommentsIsMutable() {
                C34471v0.C34488k<String> kVar = this.leadingDetachedComments_;
                if (!kVar.mo100971T()) {
                    this.leadingDetachedComments_ = GeneratedMessageLite.mutableCopy(kVar);
                }
            }

            private void ensurePathIsMutable() {
                C34471v0.C34478g gVar = this.path_;
                if (!gVar.mo100971T()) {
                    this.path_ = GeneratedMessageLite.mutableCopy(gVar);
                }
            }

            private void ensureSpanIsMutable() {
                C34471v0.C34478g gVar = this.span_;
                if (!gVar.mo100971T()) {
                    this.span_ = GeneratedMessageLite.mutableCopy(gVar);
                }
            }

            public static Location getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C34212a newBuilder() {
                return (C34212a) DEFAULT_INSTANCE.createBuilder();
            }

            public static Location parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Location) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Location parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static C34504y1<Location> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setLeadingComments(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.leadingComments_ = str;
            }

            /* access modifiers changed from: private */
            public void setLeadingCommentsBytes(ByteString byteString) {
                this.leadingComments_ = byteString.mo99228S0();
                this.bitField0_ |= 1;
            }

            /* access modifiers changed from: private */
            public void setLeadingDetachedComments(int i, String str) {
                str.getClass();
                ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.set(i, str);
            }

            /* access modifiers changed from: private */
            public void setPath(int i, int i2) {
                ensurePathIsMutable();
                this.path_.mo101613o(i, i2);
            }

            /* access modifiers changed from: private */
            public void setSpan(int i, int i2) {
                ensureSpanIsMutable();
                this.span_.mo101613o(i, i2);
            }

            /* access modifiers changed from: private */
            public void setTrailingComments(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.trailingComments_ = str;
            }

            /* access modifiers changed from: private */
            public void setTrailingCommentsBytes(ByteString byteString) {
                this.trailingComments_ = byteString.mo99228S0();
                this.bitField0_ |= 2;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C34218a.f82914a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Location();
                    case 2:
                        return new C34212a((C34218a) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001'\u0002'\u0003ဈ\u0000\u0004ဈ\u0001\u0006\u001a", new Object[]{"bitField0_", "path_", "span_", "leadingComments_", "trailingComments_", "leadingDetachedComments_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        C34504y1<Location> y1Var = PARSER;
                        if (y1Var == null) {
                            synchronized (Location.class) {
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

            public String getLeadingComments() {
                return this.leadingComments_;
            }

            public ByteString getLeadingCommentsBytes() {
                return ByteString.m137260e0(this.leadingComments_);
            }

            public String getLeadingDetachedComments(int i) {
                return this.leadingDetachedComments_.get(i);
            }

            public ByteString getLeadingDetachedCommentsBytes(int i) {
                return ByteString.m137260e0(this.leadingDetachedComments_.get(i));
            }

            public int getLeadingDetachedCommentsCount() {
                return this.leadingDetachedComments_.size();
            }

            public List<String> getLeadingDetachedCommentsList() {
                return this.leadingDetachedComments_;
            }

            public int getPath(int i) {
                return this.path_.getInt(i);
            }

            public int getPathCount() {
                return this.path_.size();
            }

            public List<Integer> getPathList() {
                return this.path_;
            }

            public int getSpan(int i) {
                return this.span_.getInt(i);
            }

            public int getSpanCount() {
                return this.span_.size();
            }

            public List<Integer> getSpanList() {
                return this.span_;
            }

            public String getTrailingComments() {
                return this.trailingComments_;
            }

            public ByteString getTrailingCommentsBytes() {
                return ByteString.m137260e0(this.trailingComments_);
            }

            public boolean hasLeadingComments() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasTrailingComments() {
                return (this.bitField0_ & 2) != 0;
            }

            public static C34212a newBuilder(Location location) {
                return (C34212a) DEFAULT_INSTANCE.createBuilder(location);
            }

            public static Location parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
                return (Location) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
            }

            public static Location parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
            }

            public static Location parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Location parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
            }

            public static Location parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Location parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
            }

            public static Location parseFrom(InputStream inputStream) throws IOException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Location parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
            }

            public static Location parseFrom(C34448s sVar) throws IOException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
            }

            public static Location parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
            }
        }

        /* renamed from: com.google.protobuf.DescriptorProtos$SourceCodeInfo$a */
        public static final class C34213a extends GeneratedMessageLite.C34263b<SourceCodeInfo, C34213a> implements C34238u {
            public /* synthetic */ C34213a(C34218a aVar) {
                this();
            }

            /* renamed from: P */
            public C34213a mo100201P(Iterable<? extends Location> iterable) {
                mo100457F();
                ((SourceCodeInfo) this.f83053b).addAllLocation(iterable);
                return this;
            }

            /* renamed from: R */
            public C34213a mo100202R(int i, Location.C34212a aVar) {
                mo100457F();
                ((SourceCodeInfo) this.f83053b).addLocation(i, (Location) aVar.mo100473g());
                return this;
            }

            /* renamed from: S */
            public C34213a mo100203S(int i, Location location) {
                mo100457F();
                ((SourceCodeInfo) this.f83053b).addLocation(i, location);
                return this;
            }

            /* renamed from: T */
            public C34213a mo100204T(Location.C34212a aVar) {
                mo100457F();
                ((SourceCodeInfo) this.f83053b).addLocation((Location) aVar.mo100473g());
                return this;
            }

            /* renamed from: U */
            public C34213a mo100205U(Location location) {
                mo100457F();
                ((SourceCodeInfo) this.f83053b).addLocation(location);
                return this;
            }

            /* renamed from: V */
            public C34213a mo100206V() {
                mo100457F();
                ((SourceCodeInfo) this.f83053b).clearLocation();
                return this;
            }

            /* renamed from: Y */
            public C34213a mo100207Y(int i) {
                mo100457F();
                ((SourceCodeInfo) this.f83053b).removeLocation(i);
                return this;
            }

            /* renamed from: Z */
            public C34213a mo100208Z(int i, Location.C34212a aVar) {
                mo100457F();
                ((SourceCodeInfo) this.f83053b).setLocation(i, (Location) aVar.mo100473g());
                return this;
            }

            /* renamed from: a0 */
            public C34213a mo100209a0(int i, Location location) {
                mo100457F();
                ((SourceCodeInfo) this.f83053b).setLocation(i, location);
                return this;
            }

            public Location getLocation(int i) {
                return ((SourceCodeInfo) this.f83053b).getLocation(i);
            }

            public int getLocationCount() {
                return ((SourceCodeInfo) this.f83053b).getLocationCount();
            }

            public List<Location> getLocationList() {
                return Collections.unmodifiableList(((SourceCodeInfo) this.f83053b).getLocationList());
            }

            public C34213a() {
                super(SourceCodeInfo.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.google.protobuf.DescriptorProtos$SourceCodeInfo$b */
        public interface C34214b extends C34417m1 {
            String getLeadingComments();

            ByteString getLeadingCommentsBytes();

            String getLeadingDetachedComments(int i);

            ByteString getLeadingDetachedCommentsBytes(int i);

            int getLeadingDetachedCommentsCount();

            List<String> getLeadingDetachedCommentsList();

            int getPath(int i);

            int getPathCount();

            List<Integer> getPathList();

            int getSpan(int i);

            int getSpanCount();

            List<Integer> getSpanList();

            String getTrailingComments();

            ByteString getTrailingCommentsBytes();

            boolean hasLeadingComments();

            boolean hasTrailingComments();
        }

        static {
            SourceCodeInfo sourceCodeInfo = new SourceCodeInfo();
            DEFAULT_INSTANCE = sourceCodeInfo;
            GeneratedMessageLite.registerDefaultInstance(SourceCodeInfo.class, sourceCodeInfo);
        }

        private SourceCodeInfo() {
        }

        /* access modifiers changed from: private */
        public void addAllLocation(Iterable<? extends Location> iterable) {
            ensureLocationIsMutable();
            C34319a.addAll(iterable, this.location_);
        }

        /* access modifiers changed from: private */
        public void addLocation(Location location) {
            location.getClass();
            ensureLocationIsMutable();
            this.location_.add(location);
        }

        /* access modifiers changed from: private */
        public void clearLocation() {
            this.location_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureLocationIsMutable() {
            C34471v0.C34488k<Location> kVar = this.location_;
            if (!kVar.mo100971T()) {
                this.location_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        public static SourceCodeInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C34213a newBuilder() {
            return (C34213a) DEFAULT_INSTANCE.createBuilder();
        }

        public static SourceCodeInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SourceCodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SourceCodeInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<SourceCodeInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeLocation(int i) {
            ensureLocationIsMutable();
            this.location_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setLocation(int i, Location location) {
            location.getClass();
            ensureLocationIsMutable();
            this.location_.set(i, location);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C34218a.f82914a[methodToInvoke.ordinal()]) {
                case 1:
                    return new SourceCodeInfo();
                case 2:
                    return new C34213a((C34218a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"location_", Location.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<SourceCodeInfo> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (SourceCodeInfo.class) {
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

        public Location getLocation(int i) {
            return this.location_.get(i);
        }

        public int getLocationCount() {
            return this.location_.size();
        }

        public List<Location> getLocationList() {
            return this.location_;
        }

        public C34214b getLocationOrBuilder(int i) {
            return this.location_.get(i);
        }

        public List<? extends C34214b> getLocationOrBuilderList() {
            return this.location_;
        }

        public static C34213a newBuilder(SourceCodeInfo sourceCodeInfo) {
            return (C34213a) DEFAULT_INSTANCE.createBuilder(sourceCodeInfo);
        }

        public static SourceCodeInfo parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (SourceCodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static SourceCodeInfo parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static SourceCodeInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addLocation(int i, Location location) {
            location.getClass();
            ensureLocationIsMutable();
            this.location_.add(i, location);
        }

        public static SourceCodeInfo parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static SourceCodeInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SourceCodeInfo parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static SourceCodeInfo parseFrom(InputStream inputStream) throws IOException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SourceCodeInfo parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static SourceCodeInfo parseFrom(C34448s sVar) throws IOException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static SourceCodeInfo parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    public static final class UninterpretedOption extends GeneratedMessageLite<UninterpretedOption, C34216a> implements C34239v {
        public static final int AGGREGATE_VALUE_FIELD_NUMBER = 8;
        /* access modifiers changed from: private */
        public static final UninterpretedOption DEFAULT_INSTANCE;
        public static final int DOUBLE_VALUE_FIELD_NUMBER = 6;
        public static final int IDENTIFIER_VALUE_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int NEGATIVE_INT_VALUE_FIELD_NUMBER = 5;
        private static volatile C34504y1<UninterpretedOption> PARSER = null;
        public static final int POSITIVE_INT_VALUE_FIELD_NUMBER = 4;
        public static final int STRING_VALUE_FIELD_NUMBER = 7;
        private String aggregateValue_ = "";
        private int bitField0_;
        private double doubleValue_;
        private String identifierValue_ = "";
        private byte memoizedIsInitialized = 2;
        private C34471v0.C34488k<NamePart> name_ = GeneratedMessageLite.emptyProtobufList();
        private long negativeIntValue_;
        private long positiveIntValue_;
        private ByteString stringValue_ = ByteString.f82785d;

        public static final class NamePart extends GeneratedMessageLite<NamePart, C34215a> implements C34217b {
            /* access modifiers changed from: private */
            public static final NamePart DEFAULT_INSTANCE;
            public static final int IS_EXTENSION_FIELD_NUMBER = 2;
            public static final int NAME_PART_FIELD_NUMBER = 1;
            private static volatile C34504y1<NamePart> PARSER;
            private int bitField0_;
            private boolean isExtension_;
            private byte memoizedIsInitialized = 2;
            private String namePart_ = "";

            /* renamed from: com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePart$a */
            public static final class C34215a extends GeneratedMessageLite.C34263b<NamePart, C34215a> implements C34217b {
                public /* synthetic */ C34215a(C34218a aVar) {
                    this();
                }

                /* renamed from: P */
                public C34215a mo100234P() {
                    mo100457F();
                    ((NamePart) this.f83053b).clearIsExtension();
                    return this;
                }

                /* renamed from: R */
                public C34215a mo100235R() {
                    mo100457F();
                    ((NamePart) this.f83053b).clearNamePart();
                    return this;
                }

                /* renamed from: S */
                public C34215a mo100236S(boolean z) {
                    mo100457F();
                    ((NamePart) this.f83053b).setIsExtension(z);
                    return this;
                }

                /* renamed from: T */
                public C34215a mo100237T(String str) {
                    mo100457F();
                    ((NamePart) this.f83053b).setNamePart(str);
                    return this;
                }

                /* renamed from: U */
                public C34215a mo100238U(ByteString byteString) {
                    mo100457F();
                    ((NamePart) this.f83053b).setNamePartBytes(byteString);
                    return this;
                }

                public boolean getIsExtension() {
                    return ((NamePart) this.f83053b).getIsExtension();
                }

                public String getNamePart() {
                    return ((NamePart) this.f83053b).getNamePart();
                }

                public ByteString getNamePartBytes() {
                    return ((NamePart) this.f83053b).getNamePartBytes();
                }

                public boolean hasIsExtension() {
                    return ((NamePart) this.f83053b).hasIsExtension();
                }

                public boolean hasNamePart() {
                    return ((NamePart) this.f83053b).hasNamePart();
                }

                public C34215a() {
                    super(NamePart.DEFAULT_INSTANCE);
                }
            }

            static {
                NamePart namePart = new NamePart();
                DEFAULT_INSTANCE = namePart;
                GeneratedMessageLite.registerDefaultInstance(NamePart.class, namePart);
            }

            private NamePart() {
            }

            /* access modifiers changed from: private */
            public void clearIsExtension() {
                this.bitField0_ &= -3;
                this.isExtension_ = false;
            }

            /* access modifiers changed from: private */
            public void clearNamePart() {
                this.bitField0_ &= -2;
                this.namePart_ = getDefaultInstance().getNamePart();
            }

            public static NamePart getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C34215a newBuilder() {
                return (C34215a) DEFAULT_INSTANCE.createBuilder();
            }

            public static NamePart parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (NamePart) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static NamePart parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static C34504y1<NamePart> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setIsExtension(boolean z) {
                this.bitField0_ |= 2;
                this.isExtension_ = z;
            }

            /* access modifiers changed from: private */
            public void setNamePart(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.namePart_ = str;
            }

            /* access modifiers changed from: private */
            public void setNamePartBytes(ByteString byteString) {
                this.namePart_ = byteString.mo99228S0();
                this.bitField0_ |= 1;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                int i = 1;
                switch (C34218a.f82914a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new NamePart();
                    case 2:
                        return new C34215a((C34218a) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"bitField0_", "namePart_", "isExtension_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        C34504y1<NamePart> y1Var = PARSER;
                        if (y1Var == null) {
                            synchronized (NamePart.class) {
                                y1Var = PARSER;
                                if (y1Var == null) {
                                    y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                                    PARSER = y1Var;
                                }
                            }
                        }
                        return y1Var;
                    case 6:
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        if (obj == null) {
                            i = 0;
                        }
                        this.memoizedIsInitialized = (byte) i;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public boolean getIsExtension() {
                return this.isExtension_;
            }

            public String getNamePart() {
                return this.namePart_;
            }

            public ByteString getNamePartBytes() {
                return ByteString.m137260e0(this.namePart_);
            }

            public boolean hasIsExtension() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasNamePart() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C34215a newBuilder(NamePart namePart) {
                return (C34215a) DEFAULT_INSTANCE.createBuilder(namePart);
            }

            public static NamePart parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
                return (NamePart) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
            }

            public static NamePart parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
            }

            public static NamePart parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static NamePart parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
            }

            public static NamePart parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static NamePart parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
            }

            public static NamePart parseFrom(InputStream inputStream) throws IOException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static NamePart parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
            }

            public static NamePart parseFrom(C34448s sVar) throws IOException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
            }

            public static NamePart parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
            }
        }

        /* renamed from: com.google.protobuf.DescriptorProtos$UninterpretedOption$a */
        public static final class C34216a extends GeneratedMessageLite.C34263b<UninterpretedOption, C34216a> implements C34239v {
            public /* synthetic */ C34216a(C34218a aVar) {
                this();
            }

            /* renamed from: P */
            public C34216a mo100239P(Iterable<? extends NamePart> iterable) {
                mo100457F();
                ((UninterpretedOption) this.f83053b).addAllName(iterable);
                return this;
            }

            /* renamed from: R */
            public C34216a mo100240R(int i, NamePart.C34215a aVar) {
                mo100457F();
                ((UninterpretedOption) this.f83053b).addName(i, (NamePart) aVar.mo100473g());
                return this;
            }

            /* renamed from: S */
            public C34216a mo100241S(int i, NamePart namePart) {
                mo100457F();
                ((UninterpretedOption) this.f83053b).addName(i, namePart);
                return this;
            }

            /* renamed from: T */
            public C34216a mo100242T(NamePart.C34215a aVar) {
                mo100457F();
                ((UninterpretedOption) this.f83053b).addName((NamePart) aVar.mo100473g());
                return this;
            }

            /* renamed from: U */
            public C34216a mo100243U(NamePart namePart) {
                mo100457F();
                ((UninterpretedOption) this.f83053b).addName(namePart);
                return this;
            }

            /* renamed from: V */
            public C34216a mo100244V() {
                mo100457F();
                ((UninterpretedOption) this.f83053b).clearAggregateValue();
                return this;
            }

            /* renamed from: Y */
            public C34216a mo100245Y() {
                mo100457F();
                ((UninterpretedOption) this.f83053b).clearDoubleValue();
                return this;
            }

            /* renamed from: Z */
            public C34216a mo100246Z() {
                mo100457F();
                ((UninterpretedOption) this.f83053b).clearIdentifierValue();
                return this;
            }

            /* renamed from: a0 */
            public C34216a mo100247a0() {
                mo100457F();
                ((UninterpretedOption) this.f83053b).clearName();
                return this;
            }

            /* renamed from: b0 */
            public C34216a mo100248b0() {
                mo100457F();
                ((UninterpretedOption) this.f83053b).clearNegativeIntValue();
                return this;
            }

            /* renamed from: c0 */
            public C34216a mo100249c0() {
                mo100457F();
                ((UninterpretedOption) this.f83053b).clearPositiveIntValue();
                return this;
            }

            /* renamed from: d0 */
            public C34216a mo100250d0() {
                mo100457F();
                ((UninterpretedOption) this.f83053b).clearStringValue();
                return this;
            }

            /* renamed from: g0 */
            public C34216a mo100251g0(int i) {
                mo100457F();
                ((UninterpretedOption) this.f83053b).removeName(i);
                return this;
            }

            public String getAggregateValue() {
                return ((UninterpretedOption) this.f83053b).getAggregateValue();
            }

            public ByteString getAggregateValueBytes() {
                return ((UninterpretedOption) this.f83053b).getAggregateValueBytes();
            }

            public double getDoubleValue() {
                return ((UninterpretedOption) this.f83053b).getDoubleValue();
            }

            public String getIdentifierValue() {
                return ((UninterpretedOption) this.f83053b).getIdentifierValue();
            }

            public ByteString getIdentifierValueBytes() {
                return ((UninterpretedOption) this.f83053b).getIdentifierValueBytes();
            }

            public NamePart getName(int i) {
                return ((UninterpretedOption) this.f83053b).getName(i);
            }

            public int getNameCount() {
                return ((UninterpretedOption) this.f83053b).getNameCount();
            }

            public List<NamePart> getNameList() {
                return Collections.unmodifiableList(((UninterpretedOption) this.f83053b).getNameList());
            }

            public long getNegativeIntValue() {
                return ((UninterpretedOption) this.f83053b).getNegativeIntValue();
            }

            public long getPositiveIntValue() {
                return ((UninterpretedOption) this.f83053b).getPositiveIntValue();
            }

            public ByteString getStringValue() {
                return ((UninterpretedOption) this.f83053b).getStringValue();
            }

            /* renamed from: h0 */
            public C34216a mo100252h0(String str) {
                mo100457F();
                ((UninterpretedOption) this.f83053b).setAggregateValue(str);
                return this;
            }

            public boolean hasAggregateValue() {
                return ((UninterpretedOption) this.f83053b).hasAggregateValue();
            }

            public boolean hasDoubleValue() {
                return ((UninterpretedOption) this.f83053b).hasDoubleValue();
            }

            public boolean hasIdentifierValue() {
                return ((UninterpretedOption) this.f83053b).hasIdentifierValue();
            }

            public boolean hasNegativeIntValue() {
                return ((UninterpretedOption) this.f83053b).hasNegativeIntValue();
            }

            public boolean hasPositiveIntValue() {
                return ((UninterpretedOption) this.f83053b).hasPositiveIntValue();
            }

            public boolean hasStringValue() {
                return ((UninterpretedOption) this.f83053b).hasStringValue();
            }

            /* renamed from: i0 */
            public C34216a mo100253i0(ByteString byteString) {
                mo100457F();
                ((UninterpretedOption) this.f83053b).setAggregateValueBytes(byteString);
                return this;
            }

            /* renamed from: j0 */
            public C34216a mo100254j0(double d) {
                mo100457F();
                ((UninterpretedOption) this.f83053b).setDoubleValue(d);
                return this;
            }

            /* renamed from: k0 */
            public C34216a mo100255k0(String str) {
                mo100457F();
                ((UninterpretedOption) this.f83053b).setIdentifierValue(str);
                return this;
            }

            /* renamed from: l0 */
            public C34216a mo100256l0(ByteString byteString) {
                mo100457F();
                ((UninterpretedOption) this.f83053b).setIdentifierValueBytes(byteString);
                return this;
            }

            /* renamed from: m0 */
            public C34216a mo100257m0(int i, NamePart.C34215a aVar) {
                mo100457F();
                ((UninterpretedOption) this.f83053b).setName(i, (NamePart) aVar.mo100473g());
                return this;
            }

            /* renamed from: o0 */
            public C34216a mo100258o0(int i, NamePart namePart) {
                mo100457F();
                ((UninterpretedOption) this.f83053b).setName(i, namePart);
                return this;
            }

            /* renamed from: q0 */
            public C34216a mo100259q0(long j) {
                mo100457F();
                ((UninterpretedOption) this.f83053b).setNegativeIntValue(j);
                return this;
            }

            /* renamed from: r0 */
            public C34216a mo100260r0(long j) {
                mo100457F();
                ((UninterpretedOption) this.f83053b).setPositiveIntValue(j);
                return this;
            }

            /* renamed from: s0 */
            public C34216a mo100261s0(ByteString byteString) {
                mo100457F();
                ((UninterpretedOption) this.f83053b).setStringValue(byteString);
                return this;
            }

            public C34216a() {
                super(UninterpretedOption.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.google.protobuf.DescriptorProtos$UninterpretedOption$b */
        public interface C34217b extends C34417m1 {
            boolean getIsExtension();

            String getNamePart();

            ByteString getNamePartBytes();

            boolean hasIsExtension();

            boolean hasNamePart();
        }

        static {
            UninterpretedOption uninterpretedOption = new UninterpretedOption();
            DEFAULT_INSTANCE = uninterpretedOption;
            GeneratedMessageLite.registerDefaultInstance(UninterpretedOption.class, uninterpretedOption);
        }

        private UninterpretedOption() {
        }

        /* access modifiers changed from: private */
        public void addAllName(Iterable<? extends NamePart> iterable) {
            ensureNameIsMutable();
            C34319a.addAll(iterable, this.name_);
        }

        /* access modifiers changed from: private */
        public void addName(NamePart namePart) {
            namePart.getClass();
            ensureNameIsMutable();
            this.name_.add(namePart);
        }

        /* access modifiers changed from: private */
        public void clearAggregateValue() {
            this.bitField0_ &= -33;
            this.aggregateValue_ = getDefaultInstance().getAggregateValue();
        }

        /* access modifiers changed from: private */
        public void clearDoubleValue() {
            this.bitField0_ &= -9;
            this.doubleValue_ = 0.0d;
        }

        /* access modifiers changed from: private */
        public void clearIdentifierValue() {
            this.bitField0_ &= -2;
            this.identifierValue_ = getDefaultInstance().getIdentifierValue();
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.name_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearNegativeIntValue() {
            this.bitField0_ &= -5;
            this.negativeIntValue_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPositiveIntValue() {
            this.bitField0_ &= -3;
            this.positiveIntValue_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearStringValue() {
            this.bitField0_ &= -17;
            this.stringValue_ = getDefaultInstance().getStringValue();
        }

        private void ensureNameIsMutable() {
            C34471v0.C34488k<NamePart> kVar = this.name_;
            if (!kVar.mo100971T()) {
                this.name_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        public static UninterpretedOption getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C34216a newBuilder() {
            return (C34216a) DEFAULT_INSTANCE.createBuilder();
        }

        public static UninterpretedOption parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UninterpretedOption) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UninterpretedOption parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<UninterpretedOption> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeName(int i) {
            ensureNameIsMutable();
            this.name_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setAggregateValue(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.aggregateValue_ = str;
        }

        /* access modifiers changed from: private */
        public void setAggregateValueBytes(ByteString byteString) {
            this.aggregateValue_ = byteString.mo99228S0();
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setDoubleValue(double d) {
            this.bitField0_ |= 8;
            this.doubleValue_ = d;
        }

        /* access modifiers changed from: private */
        public void setIdentifierValue(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.identifierValue_ = str;
        }

        /* access modifiers changed from: private */
        public void setIdentifierValueBytes(ByteString byteString) {
            this.identifierValue_ = byteString.mo99228S0();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setName(int i, NamePart namePart) {
            namePart.getClass();
            ensureNameIsMutable();
            this.name_.set(i, namePart);
        }

        /* access modifiers changed from: private */
        public void setNegativeIntValue(long j) {
            this.bitField0_ |= 4;
            this.negativeIntValue_ = j;
        }

        /* access modifiers changed from: private */
        public void setPositiveIntValue(long j) {
            this.bitField0_ |= 2;
            this.positiveIntValue_ = j;
        }

        /* access modifiers changed from: private */
        public void setStringValue(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 16;
            this.stringValue_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 1;
            switch (C34218a.f82914a[methodToInvoke.ordinal()]) {
                case 1:
                    return new UninterpretedOption();
                case 2:
                    return new C34216a((C34218a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"bitField0_", "name_", NamePart.class, "identifierValue_", "positiveIntValue_", "negativeIntValue_", "doubleValue_", "stringValue_", "aggregateValue_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<UninterpretedOption> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (UninterpretedOption.class) {
                            y1Var = PARSER;
                            if (y1Var == null) {
                                y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                                PARSER = y1Var;
                            }
                        }
                    }
                    return y1Var;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getAggregateValue() {
            return this.aggregateValue_;
        }

        public ByteString getAggregateValueBytes() {
            return ByteString.m137260e0(this.aggregateValue_);
        }

        public double getDoubleValue() {
            return this.doubleValue_;
        }

        public String getIdentifierValue() {
            return this.identifierValue_;
        }

        public ByteString getIdentifierValueBytes() {
            return ByteString.m137260e0(this.identifierValue_);
        }

        public NamePart getName(int i) {
            return this.name_.get(i);
        }

        public int getNameCount() {
            return this.name_.size();
        }

        public List<NamePart> getNameList() {
            return this.name_;
        }

        public C34217b getNameOrBuilder(int i) {
            return this.name_.get(i);
        }

        public List<? extends C34217b> getNameOrBuilderList() {
            return this.name_;
        }

        public long getNegativeIntValue() {
            return this.negativeIntValue_;
        }

        public long getPositiveIntValue() {
            return this.positiveIntValue_;
        }

        public ByteString getStringValue() {
            return this.stringValue_;
        }

        public boolean hasAggregateValue() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasDoubleValue() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasIdentifierValue() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasNegativeIntValue() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasPositiveIntValue() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasStringValue() {
            return (this.bitField0_ & 16) != 0;
        }

        public static C34216a newBuilder(UninterpretedOption uninterpretedOption) {
            return (C34216a) DEFAULT_INSTANCE.createBuilder(uninterpretedOption);
        }

        public static UninterpretedOption parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (UninterpretedOption) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static UninterpretedOption parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static UninterpretedOption parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addName(int i, NamePart namePart) {
            namePart.getClass();
            ensureNameIsMutable();
            this.name_.add(i, namePart);
        }

        public static UninterpretedOption parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static UninterpretedOption parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UninterpretedOption parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static UninterpretedOption parseFrom(InputStream inputStream) throws IOException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UninterpretedOption parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static UninterpretedOption parseFrom(C34448s sVar) throws IOException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static UninterpretedOption parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$a */
    public static /* synthetic */ class C34218a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f82914a;

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
                f82914a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f82914a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f82914a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f82914a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f82914a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f82914a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f82914a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.DescriptorProtos.C34218a.<clinit>():void");
        }
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$b */
    public interface C34219b extends C34417m1 {
        EnumDescriptorProto getEnumType(int i);

        int getEnumTypeCount();

        List<EnumDescriptorProto> getEnumTypeList();

        FieldDescriptorProto getExtension(int i);

        int getExtensionCount();

        List<FieldDescriptorProto> getExtensionList();

        DescriptorProto.ExtensionRange getExtensionRange(int i);

        int getExtensionRangeCount();

        List<DescriptorProto.ExtensionRange> getExtensionRangeList();

        FieldDescriptorProto getField(int i);

        int getFieldCount();

        List<FieldDescriptorProto> getFieldList();

        String getName();

        ByteString getNameBytes();

        DescriptorProto getNestedType(int i);

        int getNestedTypeCount();

        List<DescriptorProto> getNestedTypeList();

        OneofDescriptorProto getOneofDecl(int i);

        int getOneofDeclCount();

        List<OneofDescriptorProto> getOneofDeclList();

        MessageOptions getOptions();

        String getReservedName(int i);

        ByteString getReservedNameBytes(int i);

        int getReservedNameCount();

        List<String> getReservedNameList();

        DescriptorProto.ReservedRange getReservedRange(int i);

        int getReservedRangeCount();

        List<DescriptorProto.ReservedRange> getReservedRangeList();

        boolean hasName();

        boolean hasOptions();
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$c */
    public interface C34220c extends C34417m1 {
        String getName();

        ByteString getNameBytes();

        EnumOptions getOptions();

        String getReservedName(int i);

        ByteString getReservedNameBytes(int i);

        int getReservedNameCount();

        List<String> getReservedNameList();

        EnumDescriptorProto.EnumReservedRange getReservedRange(int i);

        int getReservedRangeCount();

        List<EnumDescriptorProto.EnumReservedRange> getReservedRangeList();

        EnumValueDescriptorProto getValue(int i);

        int getValueCount();

        List<EnumValueDescriptorProto> getValueList();

        boolean hasName();

        boolean hasOptions();
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$d */
    public interface C34221d extends GeneratedMessageLite.C34266e<EnumOptions, EnumOptions.C34181a> {
        boolean getAllowAlias();

        boolean getDeprecated();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean hasAllowAlias();

        boolean hasDeprecated();
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$e */
    public interface C34222e extends C34417m1 {
        String getName();

        ByteString getNameBytes();

        int getNumber();

        EnumValueOptions getOptions();

        boolean hasName();

        boolean hasNumber();

        boolean hasOptions();
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$f */
    public interface C34223f extends GeneratedMessageLite.C34266e<EnumValueOptions, EnumValueOptions.C34183a> {
        boolean getDeprecated();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean hasDeprecated();
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$g */
    public interface C34224g extends GeneratedMessageLite.C34266e<ExtensionRangeOptions, ExtensionRangeOptions.C34184a> {
        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$h */
    public interface C34225h extends C34417m1 {
        String getDefaultValue();

        ByteString getDefaultValueBytes();

        String getExtendee();

        ByteString getExtendeeBytes();

        String getJsonName();

        ByteString getJsonNameBytes();

        FieldDescriptorProto.Label getLabel();

        String getName();

        ByteString getNameBytes();

        int getNumber();

        int getOneofIndex();

        FieldOptions getOptions();

        boolean getProto3Optional();

        FieldDescriptorProto.Type getType();

        String getTypeName();

        ByteString getTypeNameBytes();

        boolean hasDefaultValue();

        boolean hasExtendee();

        boolean hasJsonName();

        boolean hasLabel();

        boolean hasName();

        boolean hasNumber();

        boolean hasOneofIndex();

        boolean hasOptions();

        boolean hasProto3Optional();

        boolean hasType();

        boolean hasTypeName();
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$i */
    public interface C34226i extends GeneratedMessageLite.C34266e<FieldOptions, FieldOptions.C34194a> {
        FieldOptions.CType getCtype();

        boolean getDeprecated();

        FieldOptions.JSType getJstype();

        boolean getLazy();

        boolean getPacked();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean getWeak();

        boolean hasCtype();

        boolean hasDeprecated();

        boolean hasJstype();

        boolean hasLazy();

        boolean hasPacked();

        boolean hasWeak();
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$j */
    public interface C34227j extends C34417m1 {
        String getDependency(int i);

        ByteString getDependencyBytes(int i);

        int getDependencyCount();

        List<String> getDependencyList();

        EnumDescriptorProto getEnumType(int i);

        int getEnumTypeCount();

        List<EnumDescriptorProto> getEnumTypeList();

        FieldDescriptorProto getExtension(int i);

        int getExtensionCount();

        List<FieldDescriptorProto> getExtensionList();

        DescriptorProto getMessageType(int i);

        int getMessageTypeCount();

        List<DescriptorProto> getMessageTypeList();

        String getName();

        ByteString getNameBytes();

        FileOptions getOptions();

        String getPackage();

        ByteString getPackageBytes();

        int getPublicDependency(int i);

        int getPublicDependencyCount();

        List<Integer> getPublicDependencyList();

        ServiceDescriptorProto getService(int i);

        int getServiceCount();

        List<ServiceDescriptorProto> getServiceList();

        SourceCodeInfo getSourceCodeInfo();

        String getSyntax();

        ByteString getSyntaxBytes();

        int getWeakDependency(int i);

        int getWeakDependencyCount();

        List<Integer> getWeakDependencyList();

        boolean hasName();

        boolean hasOptions();

        boolean hasPackage();

        boolean hasSourceCodeInfo();

        boolean hasSyntax();
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$k */
    public interface C34228k extends C34417m1 {
        FileDescriptorProto getFile(int i);

        int getFileCount();

        List<FileDescriptorProto> getFileList();
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$l */
    public interface C34229l extends GeneratedMessageLite.C34266e<FileOptions, FileOptions.C34199a> {
        boolean getCcEnableArenas();

        boolean getCcGenericServices();

        String getCsharpNamespace();

        ByteString getCsharpNamespaceBytes();

        boolean getDeprecated();

        String getGoPackage();

        ByteString getGoPackageBytes();

        @Deprecated
        boolean getJavaGenerateEqualsAndHash();

        boolean getJavaGenericServices();

        boolean getJavaMultipleFiles();

        String getJavaOuterClassname();

        ByteString getJavaOuterClassnameBytes();

        String getJavaPackage();

        ByteString getJavaPackageBytes();

        boolean getJavaStringCheckUtf8();

        String getObjcClassPrefix();

        ByteString getObjcClassPrefixBytes();

        FileOptions.OptimizeMode getOptimizeFor();

        String getPhpClassPrefix();

        ByteString getPhpClassPrefixBytes();

        boolean getPhpGenericServices();

        String getPhpMetadataNamespace();

        ByteString getPhpMetadataNamespaceBytes();

        String getPhpNamespace();

        ByteString getPhpNamespaceBytes();

        boolean getPyGenericServices();

        String getRubyPackage();

        ByteString getRubyPackageBytes();

        String getSwiftPrefix();

        ByteString getSwiftPrefixBytes();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean hasCcEnableArenas();

        boolean hasCcGenericServices();

        boolean hasCsharpNamespace();

        boolean hasDeprecated();

        boolean hasGoPackage();

        @Deprecated
        boolean hasJavaGenerateEqualsAndHash();

        boolean hasJavaGenericServices();

        boolean hasJavaMultipleFiles();

        boolean hasJavaOuterClassname();

        boolean hasJavaPackage();

        boolean hasJavaStringCheckUtf8();

        boolean hasObjcClassPrefix();

        boolean hasOptimizeFor();

        boolean hasPhpClassPrefix();

        boolean hasPhpGenericServices();

        boolean hasPhpMetadataNamespace();

        boolean hasPhpNamespace();

        boolean hasPyGenericServices();

        boolean hasRubyPackage();

        boolean hasSwiftPrefix();
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$m */
    public interface C34230m extends C34417m1 {
        GeneratedCodeInfo.Annotation getAnnotation(int i);

        int getAnnotationCount();

        List<GeneratedCodeInfo.Annotation> getAnnotationList();
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$n */
    public interface C34231n extends GeneratedMessageLite.C34266e<MessageOptions, MessageOptions.C34203a> {
        boolean getDeprecated();

        boolean getMapEntry();

        boolean getMessageSetWireFormat();

        boolean getNoStandardDescriptorAccessor();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean hasDeprecated();

        boolean hasMapEntry();

        boolean hasMessageSetWireFormat();

        boolean hasNoStandardDescriptorAccessor();
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$o */
    public interface C34232o extends C34417m1 {
        boolean getClientStreaming();

        String getInputType();

        ByteString getInputTypeBytes();

        String getName();

        ByteString getNameBytes();

        MethodOptions getOptions();

        String getOutputType();

        ByteString getOutputTypeBytes();

        boolean getServerStreaming();

        boolean hasClientStreaming();

        boolean hasInputType();

        boolean hasName();

        boolean hasOptions();

        boolean hasOutputType();

        boolean hasServerStreaming();
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$p */
    public interface C34233p extends GeneratedMessageLite.C34266e<MethodOptions, MethodOptions.C34207a> {
        boolean getDeprecated();

        MethodOptions.IdempotencyLevel getIdempotencyLevel();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean hasDeprecated();

        boolean hasIdempotencyLevel();
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$q */
    public interface C34234q extends C34417m1 {
        String getName();

        ByteString getNameBytes();

        OneofOptions getOptions();

        boolean hasName();

        boolean hasOptions();
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$r */
    public interface C34235r extends GeneratedMessageLite.C34266e<OneofOptions, OneofOptions.C34209a> {
        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$s */
    public interface C34236s extends C34417m1 {
        MethodDescriptorProto getMethod(int i);

        int getMethodCount();

        List<MethodDescriptorProto> getMethodList();

        String getName();

        ByteString getNameBytes();

        ServiceOptions getOptions();

        boolean hasName();

        boolean hasOptions();
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$t */
    public interface C34237t extends GeneratedMessageLite.C34266e<ServiceOptions, ServiceOptions.C34211a> {
        boolean getDeprecated();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean hasDeprecated();
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$u */
    public interface C34238u extends C34417m1 {
        SourceCodeInfo.Location getLocation(int i);

        int getLocationCount();

        List<SourceCodeInfo.Location> getLocationList();
    }

    /* renamed from: com.google.protobuf.DescriptorProtos$v */
    public interface C34239v extends C34417m1 {
        String getAggregateValue();

        ByteString getAggregateValueBytes();

        double getDoubleValue();

        String getIdentifierValue();

        ByteString getIdentifierValueBytes();

        UninterpretedOption.NamePart getName(int i);

        int getNameCount();

        List<UninterpretedOption.NamePart> getNameList();

        long getNegativeIntValue();

        long getPositiveIntValue();

        ByteString getStringValue();

        boolean hasAggregateValue();

        boolean hasDoubleValue();

        boolean hasIdentifierValue();

        boolean hasNegativeIntValue();

        boolean hasPositiveIntValue();

        boolean hasStringValue();
    }

    /* renamed from: a */
    public static void m137668a(C34368g0 g0Var) {
    }
}
