package bootcamp.cl.ejemplo.retrofit.logica

import bootcamp.cl.ejemplo.retrofit.Constants
import com.google.gson.annotations.SerializedName

class UserInfo(
    @SerializedName(Constants.EMAIL_PARAM) val email:String,
    @SerializedName(Constants.PASSWORD_PARAM) val pass:String,
)