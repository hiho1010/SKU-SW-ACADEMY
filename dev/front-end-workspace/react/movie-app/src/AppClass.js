import React from "react";


class AppClass extends React.Component {
    state = {
        count : 0,

    };

    add = ()=> {
        this.setState({count : this.state.count + 1});
        console.log('add' + this.state.count)
    };

    minus = () => {
        this.setState({count : this.state.count - 1});
        console.log('minus')
    }

    render() {
        return (
            <div>
                <h1> The number is : {this.state.count} </h1>
                <button onClick={this.add} id={'add'} >Add</button>
                <button onClick={this.minus} id={'minus'} >Minus</button>
            </div>
        );
    }
}

export default AppClass;