import android.content.Context
import android.content.pm.PackageManager
import android.util.Log
import android.widget.Toast

object Network{
    fun getInstance(context: Context){
        val keyUser = context.packageManager.getApplicationInfo(context.packageName, PackageManager.GET_META_DATA)
        Toast.makeText(context,"KeyUser: ${keyUser}",Toast.LENGTH_LONG).show()
        Log.e("getInstance","getInstance()=>keyUser = "+keyUser.metaData.getString("lib"))
    }
}