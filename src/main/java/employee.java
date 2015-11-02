// ORM class for table 'employee'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Apr 22 03:33:56 EDT 2015
// For connector: org.apache.sqoop.manager.DirectMySQLManager
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class employee extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String FIRST_NAME;
  public String get_FIRST_NAME() {
    return FIRST_NAME;
  }
  public void set_FIRST_NAME(String FIRST_NAME) {
    this.FIRST_NAME = FIRST_NAME;
  }
  public employee with_FIRST_NAME(String FIRST_NAME) {
    this.FIRST_NAME = FIRST_NAME;
    return this;
  }
  private String LAST_NAME;
  public String get_LAST_NAME() {
    return LAST_NAME;
  }
  public void set_LAST_NAME(String LAST_NAME) {
    this.LAST_NAME = LAST_NAME;
  }
  public employee with_LAST_NAME(String LAST_NAME) {
    this.LAST_NAME = LAST_NAME;
    return this;
  }
  private String AGE;
  public String get_AGE() {
    return AGE;
  }
  public void set_AGE(String AGE) {
    this.AGE = AGE;
  }
  public employee with_AGE(String AGE) {
    this.AGE = AGE;
    return this;
  }
  private String SEX;
  public String get_SEX() {
    return SEX;
  }
  public void set_SEX(String SEX) {
    this.SEX = SEX;
  }
  public employee with_SEX(String SEX) {
    this.SEX = SEX;
    return this;
  }
  private String INCOME;
  public String get_INCOME() {
    return INCOME;
  }
  public void set_INCOME(String INCOME) {
    this.INCOME = INCOME;
  }
  public employee with_INCOME(String INCOME) {
    this.INCOME = INCOME;
    return this;
  }
  private java.sql.Timestamp testtime;
  public java.sql.Timestamp get_testtime() {
    return testtime;
  }
  public void set_testtime(java.sql.Timestamp testtime) {
    this.testtime = testtime;
  }
  public employee with_testtime(java.sql.Timestamp testtime) {
    this.testtime = testtime;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof employee)) {
      return false;
    }
    employee that = (employee) o;
    boolean equal = true;
    equal = equal && (this.FIRST_NAME == null ? that.FIRST_NAME == null : this.FIRST_NAME.equals(that.FIRST_NAME));
    equal = equal && (this.LAST_NAME == null ? that.LAST_NAME == null : this.LAST_NAME.equals(that.LAST_NAME));
    equal = equal && (this.AGE == null ? that.AGE == null : this.AGE.equals(that.AGE));
    equal = equal && (this.SEX == null ? that.SEX == null : this.SEX.equals(that.SEX));
    equal = equal && (this.INCOME == null ? that.INCOME == null : this.INCOME.equals(that.INCOME));
    equal = equal && (this.testtime == null ? that.testtime == null : this.testtime.equals(that.testtime));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof employee)) {
      return false;
    }
    employee that = (employee) o;
    boolean equal = true;
    equal = equal && (this.FIRST_NAME == null ? that.FIRST_NAME == null : this.FIRST_NAME.equals(that.FIRST_NAME));
    equal = equal && (this.LAST_NAME == null ? that.LAST_NAME == null : this.LAST_NAME.equals(that.LAST_NAME));
    equal = equal && (this.AGE == null ? that.AGE == null : this.AGE.equals(that.AGE));
    equal = equal && (this.SEX == null ? that.SEX == null : this.SEX.equals(that.SEX));
    equal = equal && (this.INCOME == null ? that.INCOME == null : this.INCOME.equals(that.INCOME));
    equal = equal && (this.testtime == null ? that.testtime == null : this.testtime.equals(that.testtime));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.FIRST_NAME = JdbcWritableBridge.readString(1, __dbResults);
    this.LAST_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.AGE = JdbcWritableBridge.readString(3, __dbResults);
    this.SEX = JdbcWritableBridge.readString(4, __dbResults);
    this.INCOME = JdbcWritableBridge.readString(5, __dbResults);
    this.testtime = JdbcWritableBridge.readTimestamp(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.FIRST_NAME = JdbcWritableBridge.readString(1, __dbResults);
    this.LAST_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.AGE = JdbcWritableBridge.readString(3, __dbResults);
    this.SEX = JdbcWritableBridge.readString(4, __dbResults);
    this.INCOME = JdbcWritableBridge.readString(5, __dbResults);
    this.testtime = JdbcWritableBridge.readTimestamp(6, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(FIRST_NAME, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LAST_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AGE, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SEX, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(INCOME, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(testtime, 6 + __off, 93, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(FIRST_NAME, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LAST_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AGE, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SEX, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(INCOME, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(testtime, 6 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.FIRST_NAME = null;
    } else {
    this.FIRST_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LAST_NAME = null;
    } else {
    this.LAST_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AGE = null;
    } else {
    this.AGE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SEX = null;
    } else {
    this.SEX = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INCOME = null;
    } else {
    this.INCOME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.testtime = null;
    } else {
    this.testtime = new Timestamp(__dataIn.readLong());
    this.testtime.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.FIRST_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FIRST_NAME);
    }
    if (null == this.LAST_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LAST_NAME);
    }
    if (null == this.AGE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, AGE);
    }
    if (null == this.SEX) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SEX);
    }
    if (null == this.INCOME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INCOME);
    }
    if (null == this.testtime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.testtime.getTime());
    __dataOut.writeInt(this.testtime.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.FIRST_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FIRST_NAME);
    }
    if (null == this.LAST_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LAST_NAME);
    }
    if (null == this.AGE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, AGE);
    }
    if (null == this.SEX) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SEX);
    }
    if (null == this.INCOME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INCOME);
    }
    if (null == this.testtime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.testtime.getTime());
    __dataOut.writeInt(this.testtime.getNanos());
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 59, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(FIRST_NAME==null?"null":FIRST_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAST_NAME==null?"null":LAST_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AGE==null?"null":AGE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SEX==null?"null":SEX, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INCOME==null?"null":INCOME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(testtime==null?"null":"" + testtime, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(FIRST_NAME==null?"null":FIRST_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAST_NAME==null?"null":LAST_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AGE==null?"null":AGE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SEX==null?"null":SEX, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INCOME==null?"null":INCOME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(testtime==null?"null":"" + testtime, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 59, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FIRST_NAME = null; } else {
      this.FIRST_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LAST_NAME = null; } else {
      this.LAST_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.AGE = null; } else {
      this.AGE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SEX = null; } else {
      this.SEX = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.INCOME = null; } else {
      this.INCOME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.testtime = null; } else {
      this.testtime = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FIRST_NAME = null; } else {
      this.FIRST_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LAST_NAME = null; } else {
      this.LAST_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.AGE = null; } else {
      this.AGE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SEX = null; } else {
      this.SEX = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.INCOME = null; } else {
      this.INCOME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.testtime = null; } else {
      this.testtime = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    employee o = (employee) super.clone();
    o.testtime = (o.testtime != null) ? (java.sql.Timestamp) o.testtime.clone() : null;
    return o;
  }

  public void clone0(employee o) throws CloneNotSupportedException {
    o.testtime = (o.testtime != null) ? (java.sql.Timestamp) o.testtime.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("FIRST_NAME", this.FIRST_NAME);
    __sqoop$field_map.put("LAST_NAME", this.LAST_NAME);
    __sqoop$field_map.put("AGE", this.AGE);
    __sqoop$field_map.put("SEX", this.SEX);
    __sqoop$field_map.put("INCOME", this.INCOME);
    __sqoop$field_map.put("testtime", this.testtime);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("FIRST_NAME", this.FIRST_NAME);
    __sqoop$field_map.put("LAST_NAME", this.LAST_NAME);
    __sqoop$field_map.put("AGE", this.AGE);
    __sqoop$field_map.put("SEX", this.SEX);
    __sqoop$field_map.put("INCOME", this.INCOME);
    __sqoop$field_map.put("testtime", this.testtime);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("FIRST_NAME".equals(__fieldName)) {
      this.FIRST_NAME = (String) __fieldVal;
    }
    else    if ("LAST_NAME".equals(__fieldName)) {
      this.LAST_NAME = (String) __fieldVal;
    }
    else    if ("AGE".equals(__fieldName)) {
      this.AGE = (String) __fieldVal;
    }
    else    if ("SEX".equals(__fieldName)) {
      this.SEX = (String) __fieldVal;
    }
    else    if ("INCOME".equals(__fieldName)) {
      this.INCOME = (String) __fieldVal;
    }
    else    if ("testtime".equals(__fieldName)) {
      this.testtime = (java.sql.Timestamp) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("FIRST_NAME".equals(__fieldName)) {
      this.FIRST_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("LAST_NAME".equals(__fieldName)) {
      this.LAST_NAME = (String) __fieldVal;
      return true;
    }
    else    if ("AGE".equals(__fieldName)) {
      this.AGE = (String) __fieldVal;
      return true;
    }
    else    if ("SEX".equals(__fieldName)) {
      this.SEX = (String) __fieldVal;
      return true;
    }
    else    if ("INCOME".equals(__fieldName)) {
      this.INCOME = (String) __fieldVal;
      return true;
    }
    else    if ("testtime".equals(__fieldName)) {
      this.testtime = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
