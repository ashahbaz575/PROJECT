// ORM class for table 'sensex_table'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Feb 17 02:35:05 PST 2018
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
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
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class sensex_table extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Double sensex_id;
  public Double get_sensex_id() {
    return sensex_id;
  }
  public void set_sensex_id(Double sensex_id) {
    this.sensex_id = sensex_id;
  }
  public sensex_table with_sensex_id(Double sensex_id) {
    this.sensex_id = sensex_id;
    return this;
  }
  private String sensex_name;
  public String get_sensex_name() {
    return sensex_name;
  }
  public void set_sensex_name(String sensex_name) {
    this.sensex_name = sensex_name;
  }
  public sensex_table with_sensex_name(String sensex_name) {
    this.sensex_name = sensex_name;
    return this;
  }
  private String sensex_trading;
  public String get_sensex_trading() {
    return sensex_trading;
  }
  public void set_sensex_trading(String sensex_trading) {
    this.sensex_trading = sensex_trading;
  }
  public sensex_table with_sensex_trading(String sensex_trading) {
    this.sensex_trading = sensex_trading;
    return this;
  }
  private String location;
  public String get_location() {
    return location;
  }
  public void set_location(String location) {
    this.location = location;
  }
  public sensex_table with_location(String location) {
    this.location = location;
    return this;
  }
  private Double opening_bal;
  public Double get_opening_bal() {
    return opening_bal;
  }
  public void set_opening_bal(Double opening_bal) {
    this.opening_bal = opening_bal;
  }
  public sensex_table with_opening_bal(Double opening_bal) {
    this.opening_bal = opening_bal;
    return this;
  }
  private Double closing_bal;
  public Double get_closing_bal() {
    return closing_bal;
  }
  public void set_closing_bal(Double closing_bal) {
    this.closing_bal = closing_bal;
  }
  public sensex_table with_closing_bal(Double closing_bal) {
    this.closing_bal = closing_bal;
    return this;
  }
  private Double fluctuation_rate;
  public Double get_fluctuation_rate() {
    return fluctuation_rate;
  }
  public void set_fluctuation_rate(Double fluctuation_rate) {
    this.fluctuation_rate = fluctuation_rate;
  }
  public sensex_table with_fluctuation_rate(Double fluctuation_rate) {
    this.fluctuation_rate = fluctuation_rate;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof sensex_table)) {
      return false;
    }
    sensex_table that = (sensex_table) o;
    boolean equal = true;
    equal = equal && (this.sensex_id == null ? that.sensex_id == null : this.sensex_id.equals(that.sensex_id));
    equal = equal && (this.sensex_name == null ? that.sensex_name == null : this.sensex_name.equals(that.sensex_name));
    equal = equal && (this.sensex_trading == null ? that.sensex_trading == null : this.sensex_trading.equals(that.sensex_trading));
    equal = equal && (this.location == null ? that.location == null : this.location.equals(that.location));
    equal = equal && (this.opening_bal == null ? that.opening_bal == null : this.opening_bal.equals(that.opening_bal));
    equal = equal && (this.closing_bal == null ? that.closing_bal == null : this.closing_bal.equals(that.closing_bal));
    equal = equal && (this.fluctuation_rate == null ? that.fluctuation_rate == null : this.fluctuation_rate.equals(that.fluctuation_rate));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof sensex_table)) {
      return false;
    }
    sensex_table that = (sensex_table) o;
    boolean equal = true;
    equal = equal && (this.sensex_id == null ? that.sensex_id == null : this.sensex_id.equals(that.sensex_id));
    equal = equal && (this.sensex_name == null ? that.sensex_name == null : this.sensex_name.equals(that.sensex_name));
    equal = equal && (this.sensex_trading == null ? that.sensex_trading == null : this.sensex_trading.equals(that.sensex_trading));
    equal = equal && (this.location == null ? that.location == null : this.location.equals(that.location));
    equal = equal && (this.opening_bal == null ? that.opening_bal == null : this.opening_bal.equals(that.opening_bal));
    equal = equal && (this.closing_bal == null ? that.closing_bal == null : this.closing_bal.equals(that.closing_bal));
    equal = equal && (this.fluctuation_rate == null ? that.fluctuation_rate == null : this.fluctuation_rate.equals(that.fluctuation_rate));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.sensex_id = JdbcWritableBridge.readDouble(1, __dbResults);
    this.sensex_name = JdbcWritableBridge.readString(2, __dbResults);
    this.sensex_trading = JdbcWritableBridge.readString(3, __dbResults);
    this.location = JdbcWritableBridge.readString(4, __dbResults);
    this.opening_bal = JdbcWritableBridge.readDouble(5, __dbResults);
    this.closing_bal = JdbcWritableBridge.readDouble(6, __dbResults);
    this.fluctuation_rate = JdbcWritableBridge.readDouble(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.sensex_id = JdbcWritableBridge.readDouble(1, __dbResults);
    this.sensex_name = JdbcWritableBridge.readString(2, __dbResults);
    this.sensex_trading = JdbcWritableBridge.readString(3, __dbResults);
    this.location = JdbcWritableBridge.readString(4, __dbResults);
    this.opening_bal = JdbcWritableBridge.readDouble(5, __dbResults);
    this.closing_bal = JdbcWritableBridge.readDouble(6, __dbResults);
    this.fluctuation_rate = JdbcWritableBridge.readDouble(7, __dbResults);
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
    JdbcWritableBridge.writeDouble(sensex_id, 1 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(sensex_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sensex_trading, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(location, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(opening_bal, 5 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(closing_bal, 6 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(fluctuation_rate, 7 + __off, 8, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDouble(sensex_id, 1 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(sensex_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sensex_trading, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(location, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(opening_bal, 5 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(closing_bal, 6 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(fluctuation_rate, 7 + __off, 8, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.sensex_id = null;
    } else {
    this.sensex_id = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.sensex_name = null;
    } else {
    this.sensex_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.sensex_trading = null;
    } else {
    this.sensex_trading = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.location = null;
    } else {
    this.location = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.opening_bal = null;
    } else {
    this.opening_bal = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.closing_bal = null;
    } else {
    this.closing_bal = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.fluctuation_rate = null;
    } else {
    this.fluctuation_rate = Double.valueOf(__dataIn.readDouble());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.sensex_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.sensex_id);
    }
    if (null == this.sensex_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sensex_name);
    }
    if (null == this.sensex_trading) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sensex_trading);
    }
    if (null == this.location) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, location);
    }
    if (null == this.opening_bal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.opening_bal);
    }
    if (null == this.closing_bal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.closing_bal);
    }
    if (null == this.fluctuation_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.fluctuation_rate);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.sensex_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.sensex_id);
    }
    if (null == this.sensex_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sensex_name);
    }
    if (null == this.sensex_trading) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sensex_trading);
    }
    if (null == this.location) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, location);
    }
    if (null == this.opening_bal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.opening_bal);
    }
    if (null == this.closing_bal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.closing_bal);
    }
    if (null == this.fluctuation_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.fluctuation_rate);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
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
    __sb.append(FieldFormatter.escapeAndEnclose(sensex_id==null?"null":"" + sensex_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sensex_name==null?"null":sensex_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sensex_trading==null?"null":sensex_trading, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(location==null?"null":location, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(opening_bal==null?"null":"" + opening_bal, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(closing_bal==null?"null":"" + closing_bal, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fluctuation_rate==null?"null":"" + fluctuation_rate, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(sensex_id==null?"null":"" + sensex_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sensex_name==null?"null":sensex_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sensex_trading==null?"null":sensex_trading, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(location==null?"null":location, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(opening_bal==null?"null":"" + opening_bal, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(closing_bal==null?"null":"" + closing_bal, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fluctuation_rate==null?"null":"" + fluctuation_rate, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 9, (char) 10, (char) 0, (char) 0, false);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sensex_id = null; } else {
      this.sensex_id = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sensex_name = null; } else {
      this.sensex_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sensex_trading = null; } else {
      this.sensex_trading = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.location = null; } else {
      this.location = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.opening_bal = null; } else {
      this.opening_bal = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.closing_bal = null; } else {
      this.closing_bal = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fluctuation_rate = null; } else {
      this.fluctuation_rate = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sensex_id = null; } else {
      this.sensex_id = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sensex_name = null; } else {
      this.sensex_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sensex_trading = null; } else {
      this.sensex_trading = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.location = null; } else {
      this.location = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.opening_bal = null; } else {
      this.opening_bal = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.closing_bal = null; } else {
      this.closing_bal = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fluctuation_rate = null; } else {
      this.fluctuation_rate = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    sensex_table o = (sensex_table) super.clone();
    return o;
  }

  public void clone0(sensex_table o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("sensex_id", this.sensex_id);
    __sqoop$field_map.put("sensex_name", this.sensex_name);
    __sqoop$field_map.put("sensex_trading", this.sensex_trading);
    __sqoop$field_map.put("location", this.location);
    __sqoop$field_map.put("opening_bal", this.opening_bal);
    __sqoop$field_map.put("closing_bal", this.closing_bal);
    __sqoop$field_map.put("fluctuation_rate", this.fluctuation_rate);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("sensex_id", this.sensex_id);
    __sqoop$field_map.put("sensex_name", this.sensex_name);
    __sqoop$field_map.put("sensex_trading", this.sensex_trading);
    __sqoop$field_map.put("location", this.location);
    __sqoop$field_map.put("opening_bal", this.opening_bal);
    __sqoop$field_map.put("closing_bal", this.closing_bal);
    __sqoop$field_map.put("fluctuation_rate", this.fluctuation_rate);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("sensex_id".equals(__fieldName)) {
      this.sensex_id = (Double) __fieldVal;
    }
    else    if ("sensex_name".equals(__fieldName)) {
      this.sensex_name = (String) __fieldVal;
    }
    else    if ("sensex_trading".equals(__fieldName)) {
      this.sensex_trading = (String) __fieldVal;
    }
    else    if ("location".equals(__fieldName)) {
      this.location = (String) __fieldVal;
    }
    else    if ("opening_bal".equals(__fieldName)) {
      this.opening_bal = (Double) __fieldVal;
    }
    else    if ("closing_bal".equals(__fieldName)) {
      this.closing_bal = (Double) __fieldVal;
    }
    else    if ("fluctuation_rate".equals(__fieldName)) {
      this.fluctuation_rate = (Double) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("sensex_id".equals(__fieldName)) {
      this.sensex_id = (Double) __fieldVal;
      return true;
    }
    else    if ("sensex_name".equals(__fieldName)) {
      this.sensex_name = (String) __fieldVal;
      return true;
    }
    else    if ("sensex_trading".equals(__fieldName)) {
      this.sensex_trading = (String) __fieldVal;
      return true;
    }
    else    if ("location".equals(__fieldName)) {
      this.location = (String) __fieldVal;
      return true;
    }
    else    if ("opening_bal".equals(__fieldName)) {
      this.opening_bal = (Double) __fieldVal;
      return true;
    }
    else    if ("closing_bal".equals(__fieldName)) {
      this.closing_bal = (Double) __fieldVal;
      return true;
    }
    else    if ("fluctuation_rate".equals(__fieldName)) {
      this.fluctuation_rate = (Double) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
