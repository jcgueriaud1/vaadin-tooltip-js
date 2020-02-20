
import 'ion-rangeslider/js/ion.rangeSlider.js';

window.initIon = function() {
        jQuery('#ion').ionRangeSlider({
            type: "double",
            min: 0,
            max: 1000,
            from: 200,
            to: 500,
            grid: true
        });
};


