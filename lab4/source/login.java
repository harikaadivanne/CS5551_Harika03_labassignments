<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.example.harika.firstassignment.register"
    tools:layout_editor_absoluteY="89dp"
    tools:layout_editor_absoluteX="0dp">

    <RelativeLayout
        android:layout_width="fill_parent"
        android:layout_height="fill_parent"
        android:background="@drawable/h7"
        tools:layout_editor_absoluteX="0dp"
        tools:layout_editor_absoluteY="0dp">

        <EditText
            android:id="@+id/editText6"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginStart="28dp"
            android:layout_marginTop="37dp"
            android:ems="10"
            android:inputType="textPersonName"
            android:text="Name"
            android:textColor="#000080"
            android:layout_alignParentTop="true"
            android:layout_alignParentStart="true" />

        <EditText
            android:id="@+id/editText7"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignStart="@+id/editText6"
            android:layout_below="@+id/editText6"
            android:layout_marginTop="25dp"
            android:ems="10"
            android:inputType="textPassword"
            android:text="password"
            android:textColor="#000080"/>

        <EditText
            android:id="@+id/editText8"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignStart="@+id/editText7"
            android:layout_below="@+id/editText7"
            android:layout_marginTop="34dp"
            android:ems="10"
            android:inputType="textPassword"
            android:text="password"
            android:textColor="#000080" />

        <EditText
            android:id="@+id/editText9"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="36dp"
            android:ems="10"
            android:inputType="textEmailAddress"
            android:text="harika.adivanne@GMAIL.COM"
            android:textColor="#000080"
            android:layout_below="@+id/editText8"
            android:layout_alignStart="@+id/editText8" />

        <EditText
            android:id="@+id/editText10"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignStart="@+id/editText9"
            android:layout_below="@+id/editText9"
            android:layout_marginTop="39dp"
            android:ems="10"
            android:inputType="phone"
            android:text="+18333857215"
            android:textColor="#000080" />

        <Button
            android:id="@+id/button4"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignStart="@+id/editText10"
            android:layout_below="@+id/editText10"
            android:layout_marginStart="59dp"
            android:layout_marginTop="52dp"
            android:textColor="#000080"
            android:text="Sign in" />

    </RelativeLayout>
</android.support.constraint.ConstraintLayout>
