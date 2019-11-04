package com.hyphenate

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri
import com.hyphenate.chatview.DemoHelper

class InitContentProvider:ContentProvider() {
    override fun insert(p0: Uri, p1: ContentValues?): Uri? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun query(
        p0: Uri,
        p1: Array<String>?,
        p2: String?,
        p3: Array<String>?,
        p4: String?
    ): Cursor? {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return null
    }

    override fun onCreate(): Boolean {
        DemoHelper.getInstance().init(context)
        return true
    }

    override fun update(p0: Uri, p1: ContentValues?, p2: String?, p3: Array<String>?): Int {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return 0
    }

    override fun delete(p0: Uri, p1: String?, p2: Array<String>?): Int {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return 0
    }

    override fun getType(p0: Uri): String? {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            return null
    }
}