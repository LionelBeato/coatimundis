const assert = require('assert')

let x = 1


describe('Array', function(){
    describe('#indexOf()', function(){
        it('should return -1 when the value is not present', function(){
            assert.equal([1,2,3,].indexOf(3),2)
        })
    })
})

describe('Variable', function(){
    it('should be the same value', function(){
        assert.equal(x, 1)
    })
})


describe('String', function(){
    it('should be an equal string type', function(){
        assert.deepEqual('my string', 'mystring')
    })
})