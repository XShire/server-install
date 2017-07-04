package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/ServerNotRegisteredHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u102/7268/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Wednesday, June 22, 2016 1:16:37 PM PDT
*/

abstract public class ServerNotRegisteredHelper
{
  private static String  _id = "IDL:PortableActivationIDL/ServerNotRegistered:1.0";

  public static void insert (org.omg.CORBA.Any a, com.sun.corba.se.PortableActivationIDL.ServerNotRegistered that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static com.sun.corba.se.PortableActivationIDL.ServerNotRegistered extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [1];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (org.omg.PortableInterceptor.ServerIdHelper.id (), "ServerId", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "serverId",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (com.sun.corba.se.PortableActivationIDL.ServerNotRegisteredHelper.id (), "ServerNotRegistered", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static com.sun.corba.se.PortableActivationIDL.ServerNotRegistered read (org.omg.CORBA.portable.InputStream istream)
  {
    com.sun.corba.se.PortableActivationIDL.ServerNotRegistered value = new com.sun.corba.se.PortableActivationIDL.ServerNotRegistered ();
    // read and discard the repository ID
    istream.read_string ();
    value.serverId = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, com.sun.corba.se.PortableActivationIDL.ServerNotRegistered value)
  {
    // write the repository ID
    ostream.write_string (id ());
    ostream.write_string (value.serverId);
  }

}
