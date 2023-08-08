package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonStreamContext;

public class JsonWriteContext extends JsonStreamContext {
    public static final int STATUS_EXPECT_NAME = 5;
    public static final int STATUS_EXPECT_VALUE = 4;
    public static final int STATUS_OK_AFTER_COLON = 2;
    public static final int STATUS_OK_AFTER_COMMA = 1;
    public static final int STATUS_OK_AFTER_SPACE = 3;
    public static final int STATUS_OK_AS_IS = 0;
    protected JsonWriteContext _child;
    protected String _currentName;
    protected Object _currentValue;
    protected DupDetector _dups;
    protected boolean _gotName;
    protected final JsonWriteContext _parent;

    public JsonWriteContext(int i, JsonWriteContext jsonWriteContext, DupDetector dupDetector) {
        this._type = i;
        this._parent = jsonWriteContext;
        this._dups = dupDetector;
        this._index = -1;
    }

    private final void _checkDup(DupDetector dupDetector, String str) throws JsonProcessingException {
        JsonGenerator jsonGenerator;
        if (dupDetector.isDup(str)) {
            Object source = dupDetector.getSource();
            String str2 = "Duplicate field '" + str + "'";
            if (source instanceof JsonGenerator) {
                jsonGenerator = (JsonGenerator) source;
            } else {
                jsonGenerator = null;
            }
            throw new JsonGenerationException(str2, jsonGenerator);
        }
    }

    @Deprecated
    public static JsonWriteContext createRootContext() {
        return createRootContext((DupDetector) null);
    }

    public JsonWriteContext clearAndGetParent() {
        this._currentValue = null;
        return this._parent;
    }

    public JsonWriteContext createChildArrayContext() {
        DupDetector dupDetector;
        JsonWriteContext jsonWriteContext = this._child;
        if (jsonWriteContext != null) {
            return jsonWriteContext.reset(1);
        }
        DupDetector dupDetector2 = this._dups;
        if (dupDetector2 == null) {
            dupDetector = null;
        } else {
            dupDetector = dupDetector2.child();
        }
        JsonWriteContext jsonWriteContext2 = new JsonWriteContext(1, this, dupDetector);
        this._child = jsonWriteContext2;
        return jsonWriteContext2;
    }

    public JsonWriteContext createChildObjectContext() {
        DupDetector dupDetector;
        JsonWriteContext jsonWriteContext = this._child;
        if (jsonWriteContext != null) {
            return jsonWriteContext.reset(2);
        }
        DupDetector dupDetector2 = this._dups;
        if (dupDetector2 == null) {
            dupDetector = null;
        } else {
            dupDetector = dupDetector2.child();
        }
        JsonWriteContext jsonWriteContext2 = new JsonWriteContext(2, this, dupDetector);
        this._child = jsonWriteContext2;
        return jsonWriteContext2;
    }

    public final String getCurrentName() {
        return this._currentName;
    }

    public Object getCurrentValue() {
        return this._currentValue;
    }

    public DupDetector getDupDetector() {
        return this._dups;
    }

    public boolean hasCurrentName() {
        return this._currentName != null;
    }

    public JsonWriteContext reset(int i) {
        this._type = i;
        this._index = -1;
        this._currentName = null;
        this._gotName = false;
        this._currentValue = null;
        DupDetector dupDetector = this._dups;
        if (dupDetector != null) {
            dupDetector.reset();
        }
        return this;
    }

    public void setCurrentValue(Object obj) {
        this._currentValue = obj;
    }

    public JsonWriteContext withDupDetector(DupDetector dupDetector) {
        this._dups = dupDetector;
        return this;
    }

    public int writeFieldName(String str) throws JsonProcessingException {
        if (this._type != 2 || this._gotName) {
            return 4;
        }
        this._gotName = true;
        this._currentName = str;
        DupDetector dupDetector = this._dups;
        if (dupDetector != null) {
            _checkDup(dupDetector, str);
        }
        if (this._index < 0) {
            return 0;
        }
        return 1;
    }

    public int writeValue() {
        int i = this._type;
        if (i == 2) {
            if (!this._gotName) {
                return 5;
            }
            this._gotName = false;
            this._index++;
            return 2;
        } else if (i == 1) {
            int i2 = this._index;
            this._index = i2 + 1;
            if (i2 < 0) {
                return 0;
            }
            return 1;
        } else {
            int i3 = this._index + 1;
            this._index = i3;
            if (i3 == 0) {
                return 0;
            }
            return 3;
        }
    }

    public static JsonWriteContext createRootContext(DupDetector dupDetector) {
        return new JsonWriteContext(0, (JsonWriteContext) null, dupDetector);
    }

    public final JsonWriteContext getParent() {
        return this._parent;
    }

    public JsonWriteContext createChildArrayContext(Object obj) {
        DupDetector dupDetector;
        JsonWriteContext jsonWriteContext = this._child;
        if (jsonWriteContext != null) {
            return jsonWriteContext.reset(1, obj);
        }
        DupDetector dupDetector2 = this._dups;
        if (dupDetector2 == null) {
            dupDetector = null;
        } else {
            dupDetector = dupDetector2.child();
        }
        JsonWriteContext jsonWriteContext2 = new JsonWriteContext(1, this, dupDetector, obj);
        this._child = jsonWriteContext2;
        return jsonWriteContext2;
    }

    public JsonWriteContext createChildObjectContext(Object obj) {
        DupDetector dupDetector;
        JsonWriteContext jsonWriteContext = this._child;
        if (jsonWriteContext != null) {
            return jsonWriteContext.reset(2, obj);
        }
        DupDetector dupDetector2 = this._dups;
        if (dupDetector2 == null) {
            dupDetector = null;
        } else {
            dupDetector = dupDetector2.child();
        }
        JsonWriteContext jsonWriteContext2 = new JsonWriteContext(2, this, dupDetector, obj);
        this._child = jsonWriteContext2;
        return jsonWriteContext2;
    }

    public JsonWriteContext(int i, JsonWriteContext jsonWriteContext, DupDetector dupDetector, Object obj) {
        this._type = i;
        this._parent = jsonWriteContext;
        this._dups = dupDetector;
        this._index = -1;
        this._currentValue = obj;
    }

    public JsonWriteContext reset(int i, Object obj) {
        this._type = i;
        this._index = -1;
        this._currentName = null;
        this._gotName = false;
        this._currentValue = obj;
        DupDetector dupDetector = this._dups;
        if (dupDetector != null) {
            dupDetector.reset();
        }
        return this;
    }
}
