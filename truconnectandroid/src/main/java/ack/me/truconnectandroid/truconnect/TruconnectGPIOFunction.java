/* TruConnect Android Library & Example Applications
*
* Copyright (C) 2015, Sensors.com,  Inc. All Rights Reserved.
*
* The TruConnect Android Library and TruConnect example applications are provided free of charge by
* Sensors.com. The combined source code, and all derivatives, are licensed by Sensors.com SOLELY
* for use with devices manufactured by ACKme Networks, or devices approved by Sensors.com.
*
* Use of this software on any other devices or hardware platforms is strictly prohibited.
*
* THIS SOFTWARE IS PROVIDED BY THE AUTHOR AS IS AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING,
* BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
* PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
* INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
* PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
* INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
* LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
* SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package ack.me.truconnectandroid.truconnect;

public enum TruconnectGPIOFunction
{
    ACTIVITY("activity"),
    BLE_BLINK("ble_blink"),
    CONN_GPIO("conn_gpio"),
    FACTORY("factory"),
    MODE_SEL("mode_sel"),
    NONE("none"),
    PWM("pwm"),
    SHUTDOWN("shutdown"),
    SLEEPWAKE("sleepwake"),
    SPEAKER("speaker"),
    STATUS_LED("status_led"),
    STREAM_GPIO("stream_gpio"),
    STDIO("stdio");

    private String mFuncString;

    TruconnectGPIOFunction(String funcString)
    {
        mFuncString = funcString;
    }

    @Override
    public String toString()
    {
        return mFuncString;
    }
}